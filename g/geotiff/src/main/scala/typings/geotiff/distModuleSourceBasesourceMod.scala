package typings.geotiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModuleSourceBasesourceMod {
  
  @JSImport("geotiff/dist-module/source/basesource", "BaseSource")
  @js.native
  open class BaseSource () extends StObject {
    
    def close(): js.Promise[Unit] = js.native
    
    /**
      *
      * @param {Slice[]} slices
      * @returns {ArrayBuffer[]}
      */
    def fetch(slices: js.Array[Slice], signal: Unit): js.Array[js.typedarray.ArrayBuffer] = js.native
    
    /**
      *
      * @param {Slice} slice
      * @returns {ArrayBuffer}
      */
    def fetchSlice(slice: Slice): js.typedarray.ArrayBuffer = js.native
    
    /**
      * Returns the filesize if already determined and null otherwise
      */
    def fileSize: Null = js.native
  }
  
  trait Slice extends StObject {
    
    var length: Double
    
    var offset: Double
  }
  object Slice {
    
    inline def apply(length: Double, offset: Double): Slice = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Slice]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Slice] (val x: Self) extends AnyVal {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
}
