package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateFeedRequest extends StObject {
  
  /**
    * Required. The new values of feed details. It must match an existing feed and the field `name` must be in the format of: projects/project_number/feeds/feed_id or folders/folder_number/feeds/feed_id or organizations/organization_number/feeds/feed_id.
    */
  var feed: js.UndefOr[SchemaFeed] = js.undefined
  
  /**
    * Required. Only updates the `feed` fields indicated by this mask. The field mask must not be empty, and it must not contain fields that are immutable or only set by the server.
    */
  var updateMask: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpdateFeedRequest {
  
  inline def apply(): SchemaUpdateFeedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateFeedRequest]
  }
  
  extension [Self <: SchemaUpdateFeedRequest](x: Self) {
    
    inline def setFeed(value: SchemaFeed): Self = StObject.set(x, "feed", value.asInstanceOf[js.Any])
    
    inline def setFeedUndefined: Self = StObject.set(x, "feed", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
