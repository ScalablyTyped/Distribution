package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateFeedRequest extends StObject {
  
  /**
    * Required. The feed details. The field `name` must be empty and it will be generated in the format of: projects/project_number/feeds/feed_id folders/folder_number/feeds/feed_id organizations/organization_number/feeds/feed_id
    */
  var feed: js.UndefOr[SchemaFeed] = js.undefined
  
  /**
    * Required. This is the client-assigned asset feed identifier and it needs to be unique under a specific parent project/folder/organization.
    */
  var feedId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreateFeedRequest {
  
  inline def apply(): SchemaCreateFeedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateFeedRequest]
  }
  
  extension [Self <: SchemaCreateFeedRequest](x: Self) {
    
    inline def setFeed(value: SchemaFeed): Self = StObject.set(x, "feed", value.asInstanceOf[js.Any])
    
    inline def setFeedId(value: String): Self = StObject.set(x, "feedId", value.asInstanceOf[js.Any])
    
    inline def setFeedIdNull: Self = StObject.set(x, "feedId", null)
    
    inline def setFeedIdUndefined: Self = StObject.set(x, "feedId", js.undefined)
    
    inline def setFeedUndefined: Self = StObject.set(x, "feed", js.undefined)
  }
}
