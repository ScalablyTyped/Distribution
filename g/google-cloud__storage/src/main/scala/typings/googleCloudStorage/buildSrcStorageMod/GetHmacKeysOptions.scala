package typings.googleCloudStorage.buildSrcStorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHmacKeysOptions extends StObject {
  
  var autoPaginate: js.UndefOr[Boolean] = js.undefined
  
  var maxApiCalls: js.UndefOr[Double] = js.undefined
  
  var maxResults: js.UndefOr[Double] = js.undefined
  
  var pageToken: js.UndefOr[String] = js.undefined
  
  var projectId: js.UndefOr[String] = js.undefined
  
  var serviceAccountEmail: js.UndefOr[String] = js.undefined
  
  var showDeletedKeys: js.UndefOr[Boolean] = js.undefined
  
  var userProject: js.UndefOr[String] = js.undefined
}
object GetHmacKeysOptions {
  
  inline def apply(): GetHmacKeysOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHmacKeysOptions]
  }
  
  extension [Self <: GetHmacKeysOptions](x: Self) {
    
    inline def setAutoPaginate(value: Boolean): Self = StObject.set(x, "autoPaginate", value.asInstanceOf[js.Any])
    
    inline def setAutoPaginateUndefined: Self = StObject.set(x, "autoPaginate", js.undefined)
    
    inline def setMaxApiCalls(value: Double): Self = StObject.set(x, "maxApiCalls", value.asInstanceOf[js.Any])
    
    inline def setMaxApiCallsUndefined: Self = StObject.set(x, "maxApiCalls", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
    
    inline def setShowDeletedKeys(value: Boolean): Self = StObject.set(x, "showDeletedKeys", value.asInstanceOf[js.Any])
    
    inline def setShowDeletedKeysUndefined: Self = StObject.set(x, "showDeletedKeys", js.undefined)
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
