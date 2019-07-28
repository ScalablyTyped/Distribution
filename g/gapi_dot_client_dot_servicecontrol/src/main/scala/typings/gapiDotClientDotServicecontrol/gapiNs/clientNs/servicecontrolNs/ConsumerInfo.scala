package typings.gapiDotClientDotServicecontrol.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerInfo extends js.Object {
  /**
    * The Google cloud project number, e.g. 1234567890. A value of 0 indicates
    * no project number is found.
    */
  var projectNumber: js.UndefOr[String] = js.undefined
}

object ConsumerInfo {
  @scala.inline
  def apply(projectNumber: String = null): ConsumerInfo = {
    val __obj = js.Dynamic.literal()
    if (projectNumber != null) __obj.updateDynamic("projectNumber")(projectNumber)
    __obj.asInstanceOf[ConsumerInfo]
  }
}

