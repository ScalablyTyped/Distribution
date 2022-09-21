package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSavedqueriesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the project/folder/organization where this saved_query should be created in. It can only be an organization number (such as "organizations/123"), a folder number (such as "folders/123"), a project ID (such as "projects/my-project-id")", or a project number (such as "projects/12345").
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSavedQuery] = js.undefined
  
  /**
    * Required. The ID to use for the saved query, which must be unique in the specified parent. It will become the final component of the saved query's resource name. This value should be 4-63 characters, and valid characters are /a-z-/. Notice that this field is required in the saved query creation, and the `name` field of the `saved_query` will be ignored.
    */
  var savedQueryId: js.UndefOr[String] = js.undefined
}
object ParamsResourceSavedqueriesCreate {
  
  inline def apply(): ParamsResourceSavedqueriesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSavedqueriesCreate]
  }
  
  extension [Self <: ParamsResourceSavedqueriesCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaSavedQuery): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSavedQueryId(value: String): Self = StObject.set(x, "savedQueryId", value.asInstanceOf[js.Any])
    
    inline def setSavedQueryIdUndefined: Self = StObject.set(x, "savedQueryId", js.undefined)
  }
}
