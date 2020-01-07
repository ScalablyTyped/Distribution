package typings.googleapis.buildSrcApisResellerV1Mod.reseller_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for resellernotify response.
  */
@js.native
trait Schema$ResellernotifyResource extends js.Object {
  /**
    * Topic name of the PubSub
    */
  var topicName: js.UndefOr[String] = js.native
}

object Schema$ResellernotifyResource {
  @scala.inline
  def apply(topicName: String = null): Schema$ResellernotifyResource = {
    val __obj = js.Dynamic.literal()
    if (topicName != null) __obj.updateDynamic("topicName")(topicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResellernotifyResource]
  }
}

