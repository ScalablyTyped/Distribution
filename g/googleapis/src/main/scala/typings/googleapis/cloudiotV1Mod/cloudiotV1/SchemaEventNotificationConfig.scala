package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEventNotificationConfig extends StObject {
  
  /**
    * A Cloud Pub/Sub topic name. For example, `projects/myProject/topics/deviceEvents`.
    */
  var pubsubTopicName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If the subfolder name matches this string exactly, this configuration will be used. The string must not include the leading '/' character. If empty, all strings are matched. This field is used only for telemetry events; subfolders are not supported for state changes.
    */
  var subfolderMatches: js.UndefOr[String | Null] = js.undefined
}
object SchemaEventNotificationConfig {
  
  inline def apply(): SchemaEventNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventNotificationConfig]
  }
  
  extension [Self <: SchemaEventNotificationConfig](x: Self) {
    
    inline def setPubsubTopicName(value: String): Self = StObject.set(x, "pubsubTopicName", value.asInstanceOf[js.Any])
    
    inline def setPubsubTopicNameNull: Self = StObject.set(x, "pubsubTopicName", null)
    
    inline def setPubsubTopicNameUndefined: Self = StObject.set(x, "pubsubTopicName", js.undefined)
    
    inline def setSubfolderMatches(value: String): Self = StObject.set(x, "subfolderMatches", value.asInstanceOf[js.Any])
    
    inline def setSubfolderMatchesNull: Self = StObject.set(x, "subfolderMatches", null)
    
    inline def setSubfolderMatchesUndefined: Self = StObject.set(x, "subfolderMatches", js.undefined)
  }
}
