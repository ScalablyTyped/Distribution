package typings.expoPlist

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ChunkSize extends StObject {
    
    var chunkSize: Double
    
    var chunkType: Double
    
    var headerSize: Double
    
    var startOffset: Double
  }
  object ChunkSize {
    
    inline def apply(chunkSize: Double, chunkType: Double, headerSize: Double, startOffset: Double): ChunkSize = {
      val __obj = js.Dynamic.literal(chunkSize = chunkSize.asInstanceOf[js.Any], chunkType = chunkType.asInstanceOf[js.Any], headerSize = headerSize.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChunkSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChunkSize] (val x: Self) extends AnyVal {
      
      inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setChunkType(value: Double): Self = StObject.set(x, "chunkType", value.asInstanceOf[js.Any])
      
      inline def setHeaderSize(value: Double): Self = StObject.set(x, "headerSize", value.asInstanceOf[js.Any])
      
      inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    }
  }
}
