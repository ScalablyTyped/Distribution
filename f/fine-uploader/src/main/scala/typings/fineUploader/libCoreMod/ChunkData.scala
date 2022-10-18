package typings.fineUploader.libCoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkData extends StObject {
  
  /**
    * the last byte of the current chunk
    */
  var endByte: Double
  
  /**
    * the 0-based index of the associated partition
    */
  var partIndex: Double
  
  /**
    * the byte offset of the current chunk
    */
  var startByte: Double
  
  /**
    * the total number of partitions associated with the `File` or `Blob`
    */
  var totalParts: Double
}
object ChunkData {
  
  inline def apply(endByte: Double, partIndex: Double, startByte: Double, totalParts: Double): ChunkData = {
    val __obj = js.Dynamic.literal(endByte = endByte.asInstanceOf[js.Any], partIndex = partIndex.asInstanceOf[js.Any], startByte = startByte.asInstanceOf[js.Any], totalParts = totalParts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkData]
  }
  
  extension [Self <: ChunkData](x: Self) {
    
    inline def setEndByte(value: Double): Self = StObject.set(x, "endByte", value.asInstanceOf[js.Any])
    
    inline def setPartIndex(value: Double): Self = StObject.set(x, "partIndex", value.asInstanceOf[js.Any])
    
    inline def setStartByte(value: Double): Self = StObject.set(x, "startByte", value.asInstanceOf[js.Any])
    
    inline def setTotalParts(value: Double): Self = StObject.set(x, "totalParts", value.asInstanceOf[js.Any])
  }
}
