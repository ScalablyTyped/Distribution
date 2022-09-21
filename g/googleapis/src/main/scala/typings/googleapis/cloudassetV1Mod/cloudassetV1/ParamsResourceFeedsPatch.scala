package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFeedsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The format will be projects/{project_number\}/feeds/{client-assigned_feed_identifier\} or folders/{folder_number\}/feeds/{client-assigned_feed_identifier\} or organizations/{organization_number\}/feeds/{client-assigned_feed_identifier\} The client-assigned feed identifier must be unique within the parent project/folder/organization.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUpdateFeedRequest] = js.undefined
}
object ParamsResourceFeedsPatch {
  
  inline def apply(): ParamsResourceFeedsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFeedsPatch]
  }
  
  extension [Self <: ParamsResourceFeedsPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaUpdateFeedRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
