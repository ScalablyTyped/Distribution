package typings.filepond.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessServerChunkTransferOptions extends StObject {
  
  /**
    * Forcing use of chunk uploads even for files smaller than chunk size
    */
  var chunkForce: Boolean
  
  /**
    * Amount of times to retry upload of a chunk when it fails
    */
  var chunkRetryDelays: js.Array[Double]
  
  var chunkServer: ServerUrl
  
  /**
    * Size of chunks
    */
  var chunkSize: Double
  
  var chunkTransferId: String
  
  /**
    * Chunk uploads enabled
    */
  var chunkUploads: Boolean
}
object ProcessServerChunkTransferOptions {
  
  inline def apply(
    chunkForce: Boolean,
    chunkRetryDelays: js.Array[Double],
    chunkServer: ServerUrl,
    chunkSize: Double,
    chunkTransferId: String,
    chunkUploads: Boolean
  ): ProcessServerChunkTransferOptions = {
    val __obj = js.Dynamic.literal(chunkForce = chunkForce.asInstanceOf[js.Any], chunkRetryDelays = chunkRetryDelays.asInstanceOf[js.Any], chunkServer = chunkServer.asInstanceOf[js.Any], chunkSize = chunkSize.asInstanceOf[js.Any], chunkTransferId = chunkTransferId.asInstanceOf[js.Any], chunkUploads = chunkUploads.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessServerChunkTransferOptions]
  }
  
  extension [Self <: ProcessServerChunkTransferOptions](x: Self) {
    
    inline def setChunkForce(value: Boolean): Self = StObject.set(x, "chunkForce", value.asInstanceOf[js.Any])
    
    inline def setChunkRetryDelays(value: js.Array[Double]): Self = StObject.set(x, "chunkRetryDelays", value.asInstanceOf[js.Any])
    
    inline def setChunkRetryDelaysVarargs(value: Double*): Self = StObject.set(x, "chunkRetryDelays", js.Array(value*))
    
    inline def setChunkServer(value: ServerUrl): Self = StObject.set(x, "chunkServer", value.asInstanceOf[js.Any])
    
    inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    inline def setChunkTransferId(value: String): Self = StObject.set(x, "chunkTransferId", value.asInstanceOf[js.Any])
    
    inline def setChunkUploads(value: Boolean): Self = StObject.set(x, "chunkUploads", value.asInstanceOf[js.Any])
  }
}
