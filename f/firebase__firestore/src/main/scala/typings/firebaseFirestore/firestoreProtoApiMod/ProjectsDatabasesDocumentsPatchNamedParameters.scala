package typings.firebaseFirestore.firestoreProtoApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsDatabasesDocumentsPatchNamedParameters extends StObject {
  
  @JSName("$Xgafv")
  var $Xgafv: js.UndefOr[ProjectsDatabasesDocumentsApiClientXgafv] = js.undefined
  
  var access_token: js.UndefOr[String] = js.undefined
  
  var alt: js.UndefOr[ProjectsDatabasesDocumentsApiClientAlt] = js.undefined
  
  var bearer_token: js.UndefOr[String] = js.undefined
  
  var callback: js.UndefOr[String] = js.undefined
  
  var currentDocumentExists: js.UndefOr[Boolean] = js.undefined
  
  var currentDocumentUpdateTime: js.UndefOr[String] = js.undefined
  
  var fields: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var maskFieldPaths: js.UndefOr[js.Array[String]] = js.undefined
  
  var oauth_token: js.UndefOr[String] = js.undefined
  
  var pp: js.UndefOr[Boolean] = js.undefined
  
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  
  var quotaUser: js.UndefOr[String] = js.undefined
  
  var updateMaskFieldPaths: js.UndefOr[js.Array[String]] = js.undefined
  
  var uploadType: js.UndefOr[String] = js.undefined
  
  var upload_protocol: js.UndefOr[String] = js.undefined
}
object ProjectsDatabasesDocumentsPatchNamedParameters {
  
  inline def apply(): ProjectsDatabasesDocumentsPatchNamedParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectsDatabasesDocumentsPatchNamedParameters]
  }
  
  extension [Self <: ProjectsDatabasesDocumentsPatchNamedParameters](x: Self) {
    
    inline def set$Xgafv(value: ProjectsDatabasesDocumentsApiClientXgafv): Self = StObject.set(x, "$Xgafv", value.asInstanceOf[js.Any])
    
    inline def set$XgafvUndefined: Self = StObject.set(x, "$Xgafv", js.undefined)
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    inline def setAlt(value: ProjectsDatabasesDocumentsApiClientAlt): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setBearer_token(value: String): Self = StObject.set(x, "bearer_token", value.asInstanceOf[js.Any])
    
    inline def setBearer_tokenUndefined: Self = StObject.set(x, "bearer_token", js.undefined)
    
    inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setCurrentDocumentExists(value: Boolean): Self = StObject.set(x, "currentDocumentExists", value.asInstanceOf[js.Any])
    
    inline def setCurrentDocumentExistsUndefined: Self = StObject.set(x, "currentDocumentExists", js.undefined)
    
    inline def setCurrentDocumentUpdateTime(value: String): Self = StObject.set(x, "currentDocumentUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setCurrentDocumentUpdateTimeUndefined: Self = StObject.set(x, "currentDocumentUpdateTime", js.undefined)
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMaskFieldPaths(value: js.Array[String]): Self = StObject.set(x, "maskFieldPaths", value.asInstanceOf[js.Any])
    
    inline def setMaskFieldPathsUndefined: Self = StObject.set(x, "maskFieldPaths", js.undefined)
    
    inline def setMaskFieldPathsVarargs(value: String*): Self = StObject.set(x, "maskFieldPaths", js.Array(value*))
    
    inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    inline def setPp(value: Boolean): Self = StObject.set(x, "pp", value.asInstanceOf[js.Any])
    
    inline def setPpUndefined: Self = StObject.set(x, "pp", js.undefined)
    
    inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    inline def setUpdateMaskFieldPaths(value: js.Array[String]): Self = StObject.set(x, "updateMaskFieldPaths", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskFieldPathsUndefined: Self = StObject.set(x, "updateMaskFieldPaths", js.undefined)
    
    inline def setUpdateMaskFieldPathsVarargs(value: String*): Self = StObject.set(x, "updateMaskFieldPaths", js.Array(value*))
    
    inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
    
    inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
    
    inline def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
    
    inline def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
  }
}
