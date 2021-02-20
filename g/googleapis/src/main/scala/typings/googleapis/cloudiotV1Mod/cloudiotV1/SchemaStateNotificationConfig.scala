package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration for notification of new states received from the device.
  */
@js.native
trait SchemaStateNotificationConfig extends StObject {
  
  /**
    * A Cloud Pub/Sub topic name. For example,
    * `projects/myProject/topics/deviceEvents`.
    */
  var pubsubTopicName: js.UndefOr[String] = js.native
}
object SchemaStateNotificationConfig {
  
  @scala.inline
  def apply(): SchemaStateNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStateNotificationConfig]
  }
  
  @scala.inline
  implicit class SchemaStateNotificationConfigMutableBuilder[Self <: SchemaStateNotificationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPubsubTopicName(value: String): Self = StObject.set(x, "pubsubTopicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubsubTopicNameUndefined: Self = StObject.set(x, "pubsubTopicName", js.undefined)
  }
}
