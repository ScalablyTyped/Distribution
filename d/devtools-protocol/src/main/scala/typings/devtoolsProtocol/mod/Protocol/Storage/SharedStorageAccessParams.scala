package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedStorageAccessParams extends StObject {
  
  /**
    * Whether or not to set an entry for a key if that key is already present.
    * Present only for SharedStorageAccessType.documentSet and
    * SharedStorageAccessType.workletSet.
    */
  var ignoreIfPresent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Key for a specific entry in an origin's shared storage.
    * Present only for SharedStorageAccessType.documentSet,
    * SharedStorageAccessType.documentAppend,
    * SharedStorageAccessType.documentDelete,
    * SharedStorageAccessType.workletSet,
    * SharedStorageAccessType.workletAppend,
    * SharedStorageAccessType.workletDelete, and
    * SharedStorageAccessType.workletGet.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the registered operation to be run.
    * Present only for SharedStorageAccessType.documentRun and
    * SharedStorageAccessType.documentSelectURL.
    */
  var operationName: js.UndefOr[String] = js.undefined
  
  /**
    * Spec of the module script URL.
    * Present only for SharedStorageAccessType.documentAddModule.
    */
  var scriptSourceUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The operation's serialized data in bytes (converted to a string).
    * Present only for SharedStorageAccessType.documentRun and
    * SharedStorageAccessType.documentSelectURL.
    */
  var serializedData: js.UndefOr[String] = js.undefined
  
  /**
    * Array of candidate URLs' specs, along with any associated metadata.
    * Present only for SharedStorageAccessType.documentSelectURL.
    */
  var urlsWithMetadata: js.UndefOr[js.Array[SharedStorageUrlWithMetadata]] = js.undefined
  
  /**
    * Value for a specific entry in an origin's shared storage.
    * Present only for SharedStorageAccessType.documentSet,
    * SharedStorageAccessType.documentAppend,
    * SharedStorageAccessType.workletSet, and
    * SharedStorageAccessType.workletAppend.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SharedStorageAccessParams {
  
  inline def apply(): SharedStorageAccessParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedStorageAccessParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharedStorageAccessParams] (val x: Self) extends AnyVal {
    
    inline def setIgnoreIfPresent(value: Boolean): Self = StObject.set(x, "ignoreIfPresent", value.asInstanceOf[js.Any])
    
    inline def setIgnoreIfPresentUndefined: Self = StObject.set(x, "ignoreIfPresent", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOperationName(value: String): Self = StObject.set(x, "operationName", value.asInstanceOf[js.Any])
    
    inline def setOperationNameUndefined: Self = StObject.set(x, "operationName", js.undefined)
    
    inline def setScriptSourceUrl(value: String): Self = StObject.set(x, "scriptSourceUrl", value.asInstanceOf[js.Any])
    
    inline def setScriptSourceUrlUndefined: Self = StObject.set(x, "scriptSourceUrl", js.undefined)
    
    inline def setSerializedData(value: String): Self = StObject.set(x, "serializedData", value.asInstanceOf[js.Any])
    
    inline def setSerializedDataUndefined: Self = StObject.set(x, "serializedData", js.undefined)
    
    inline def setUrlsWithMetadata(value: js.Array[SharedStorageUrlWithMetadata]): Self = StObject.set(x, "urlsWithMetadata", value.asInstanceOf[js.Any])
    
    inline def setUrlsWithMetadataUndefined: Self = StObject.set(x, "urlsWithMetadata", js.undefined)
    
    inline def setUrlsWithMetadataVarargs(value: SharedStorageUrlWithMetadata*): Self = StObject.set(x, "urlsWithMetadata", js.Array(value*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
