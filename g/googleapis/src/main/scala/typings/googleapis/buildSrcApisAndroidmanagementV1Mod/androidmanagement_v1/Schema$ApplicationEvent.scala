package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An app-related event.
  */
@js.native
trait Schema$ApplicationEvent extends js.Object {
  /**
    * The creation time of the event.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * App event type.
    */
  var eventType: js.UndefOr[String] = js.native
}

object Schema$ApplicationEvent {
  @scala.inline
  def apply(createTime: String = null, eventType: String = null): Schema$ApplicationEvent = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (eventType != null) __obj.updateDynamic("eventType")(eventType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ApplicationEvent]
  }
}

