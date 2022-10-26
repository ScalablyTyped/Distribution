package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSharedStorageMetadataResponse extends StObject {
  
  var metadata: SharedStorageMetadata
}
object GetSharedStorageMetadataResponse {
  
  inline def apply(metadata: SharedStorageMetadata): GetSharedStorageMetadataResponse = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSharedStorageMetadataResponse]
  }
  
  extension [Self <: GetSharedStorageMetadataResponse](x: Self) {
    
    inline def setMetadata(value: SharedStorageMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
