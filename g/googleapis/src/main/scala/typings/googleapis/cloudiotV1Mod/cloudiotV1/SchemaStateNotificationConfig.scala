package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStateNotificationConfig extends StObject {
  
  /**
    * A Cloud Pub/Sub topic name. For example, `projects/myProject/topics/deviceEvents`.
    */
  var pubsubTopicName: js.UndefOr[String | Null] = js.undefined
}
object SchemaStateNotificationConfig {
  
  inline def apply(): SchemaStateNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStateNotificationConfig]
  }
  
  extension [Self <: SchemaStateNotificationConfig](x: Self) {
    
    inline def setPubsubTopicName(value: String): Self = StObject.set(x, "pubsubTopicName", value.asInstanceOf[js.Any])
    
    inline def setPubsubTopicNameNull: Self = StObject.set(x, "pubsubTopicName", null)
    
    inline def setPubsubTopicNameUndefined: Self = StObject.set(x, "pubsubTopicName", js.undefined)
  }
}
