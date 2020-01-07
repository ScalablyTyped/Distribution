package typings.googleapis.buildSrcApisServicecontrolV1Mod.servicecontrol_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `ConsumerInfo` provides information about the consumer.
  */
@js.native
trait Schema$ConsumerInfo extends js.Object {
  /**
    * The consumer identity number, can be Google cloud project number, folder
    * number or organization number e.g. 1234567890. A value of 0 indicates no
    * consumer number is found.
    */
  var consumerNumber: js.UndefOr[String] = js.native
  /**
    * The Google cloud project number, e.g. 1234567890. A value of 0 indicates
    * no project number is found.  NOTE: This field is deprecated after Chemist
    * support flexible consumer id. New code should not depend on this field
    * anymore.
    */
  var projectNumber: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Schema$ConsumerInfo {
  @scala.inline
  def apply(consumerNumber: String = null, projectNumber: String = null, `type`: String = null): Schema$ConsumerInfo = {
    val __obj = js.Dynamic.literal()
    if (consumerNumber != null) __obj.updateDynamic("consumerNumber")(consumerNumber.asInstanceOf[js.Any])
    if (projectNumber != null) __obj.updateDynamic("projectNumber")(projectNumber.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ConsumerInfo]
  }
}

