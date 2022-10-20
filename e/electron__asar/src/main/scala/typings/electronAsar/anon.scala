package typings.electronAsar

import typings.electronAsar.electronAsarStrings.SHA256
import typings.electronAsar.mod.InputMetadataType
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Algorithm extends StObject {
    
    var algorithm: SHA256
    
    var blockSize: Double
    
    var blocks: js.Array[String]
    
    var hash: String
  }
  object Algorithm {
    
    inline def apply(blockSize: Double, blocks: js.Array[String], hash: String): Algorithm = {
      val __obj = js.Dynamic.literal(algorithm = "SHA256", blockSize = blockSize.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any])
      __obj.asInstanceOf[Algorithm]
    }
    
    extension [Self <: Algorithm](x: Self) {
      
      inline def setAlgorithm(value: SHA256): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      inline def setBlocks(value: js.Array[String]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setBlocksVarargs(value: String*): Self = StObject.set(x, "blocks", js.Array(value*))
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    }
  }
  
  trait Stat extends StObject {
    
    var stat: Stats
    
    var `type`: InputMetadataType
  }
  object Stat {
    
    inline def apply(stat: Stats, `type`: InputMetadataType): Stat = {
      val __obj = js.Dynamic.literal(stat = stat.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stat]
    }
    
    extension [Self <: Stat](x: Self) {
      
      inline def setStat(value: Stats): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      inline def setType(value: InputMetadataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
