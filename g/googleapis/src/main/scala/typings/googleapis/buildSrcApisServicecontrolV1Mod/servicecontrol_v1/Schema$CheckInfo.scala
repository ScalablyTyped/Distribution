package typings.googleapis.buildSrcApisServicecontrolV1Mod.servicecontrol_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains additional information about the check operation.
  */
@js.native
trait Schema$CheckInfo extends js.Object {
  /**
    * Consumer info of this check.
    */
  var consumerInfo: js.UndefOr[Schema$ConsumerInfo] = js.native
  /**
    * A list of fields and label keys that are ignored by the server. The
    * client doesn&#39;t need to send them for following requests to improve
    * performance and allow better aggregation.
    */
  var unusedArguments: js.UndefOr[js.Array[String]] = js.native
}

object Schema$CheckInfo {
  @scala.inline
  def apply(consumerInfo: Schema$ConsumerInfo = null, unusedArguments: js.Array[String] = null): Schema$CheckInfo = {
    val __obj = js.Dynamic.literal()
    if (consumerInfo != null) __obj.updateDynamic("consumerInfo")(consumerInfo.asInstanceOf[js.Any])
    if (unusedArguments != null) __obj.updateDynamic("unusedArguments")(unusedArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CheckInfo]
  }
}

