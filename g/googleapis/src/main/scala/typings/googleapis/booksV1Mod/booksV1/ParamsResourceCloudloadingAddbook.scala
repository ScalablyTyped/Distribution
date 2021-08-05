package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCloudloadingAddbook
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * A drive document id. The upload_client_token must not be set.
    */
  var drive_document_id: js.UndefOr[String] = js.undefined
  
  /**
    * The document MIME type. It can be set only if the drive_document_id is
    * set.
    */
  var mime_type: js.UndefOr[String] = js.undefined
  
  /**
    * The document name. It can be set only if the drive_document_id is set.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var upload_client_token: js.UndefOr[String] = js.undefined
}
object ParamsResourceCloudloadingAddbook {
  
  inline def apply(): ParamsResourceCloudloadingAddbook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCloudloadingAddbook]
  }
  
  extension [Self <: ParamsResourceCloudloadingAddbook](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setDrive_document_id(value: String): Self = StObject.set(x, "drive_document_id", value.asInstanceOf[js.Any])
    
    inline def setDrive_document_idUndefined: Self = StObject.set(x, "drive_document_id", js.undefined)
    
    inline def setMime_type(value: String): Self = StObject.set(x, "mime_type", value.asInstanceOf[js.Any])
    
    inline def setMime_typeUndefined: Self = StObject.set(x, "mime_type", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpload_client_token(value: String): Self = StObject.set(x, "upload_client_token", value.asInstanceOf[js.Any])
    
    inline def setUpload_client_tokenUndefined: Self = StObject.set(x, "upload_client_token", js.undefined)
  }
}
