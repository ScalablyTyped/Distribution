package typings.geotiff

import typings.geotiff.anon.BlockSize
import typings.geotiff.distModuleSourceBasesourceMod.BaseSource
import typings.geotiff.distModuleSourceBasesourceMod.Slice
import typings.quickLru.mod.default
import typings.std.AbortSignal
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModuleSourceBlockedsourceMod {
  
  @JSImport("geotiff/dist-module/source/blockedsource", "BlockedSource")
  @js.native
  open class BlockedSource protected () extends BaseSource {
    /**
      *
      * @param {BaseSource} source The underlying source that shall be blocked and cached
      * @param {object} options
      * @param {number} [options.blockSize]
      * @param {number} [options.cacheSize]
      */
    def this(source: BaseSource) = this()
    def this(source: BaseSource, param1: BlockSize) = this()
    
    var abortedBlockIds: Set[Any] = js.native
    
    var blockCache: default[Any, Any] = js.native
    
    var blockIdsToFetch: Set[Any] = js.native
    
    var blockRequests: Map[Any, Any] = js.native
    
    var blockSize: Double = js.native
    
    /** @type {Map<number, Block>} */
    var evictedBlocks: Map[Double, Block] = js.native
    
    /**
      *
      * @param {AbortSignal} signal
      */
    def fetchBlocks(signal: AbortSignal): Unit = js.native
    
    /**
      *
      * @param {Set} blockIds
      * @returns {BlockGroup[]}
      */
    def groupBlocks(blockIds: Set[Any]): js.Array[BlockGroup] = js.native
    
    /**
      *
      * @param {import("./basesource").Slice[]} slices
      * @param {Map} blocks
      */
    def readSliceData(slices: js.Array[Slice], blocks: Map[Any, Any]): js.Array[js.typedarray.ArrayBuffer] = js.native
    
    var source: BaseSource = js.native
  }
  
  @js.native
  trait Block extends StObject {
    
    var data: js.typedarray.ArrayBuffer = js.native
    
    var length: Double = js.native
    
    var offset: Double = js.native
    
    /**
      * @returns {number} the top byte border
      */
    def top: Double = js.native
  }
  
  trait BlockGroup extends StObject {
    
    var blockIds: js.Array[Double]
    
    var length: Double
    
    var offset: Double
  }
  object BlockGroup {
    
    inline def apply(blockIds: js.Array[Double], length: Double, offset: Double): BlockGroup = {
      val __obj = js.Dynamic.literal(blockIds = blockIds.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockGroup]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlockGroup] (val x: Self) extends AnyVal {
      
      inline def setBlockIds(value: js.Array[Double]): Self = StObject.set(x, "blockIds", value.asInstanceOf[js.Any])
      
      inline def setBlockIdsVarargs(value: Double*): Self = StObject.set(x, "blockIds", js.Array(value*))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
}
