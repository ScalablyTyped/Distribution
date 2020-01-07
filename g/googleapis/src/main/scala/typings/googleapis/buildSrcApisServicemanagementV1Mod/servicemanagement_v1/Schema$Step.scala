package typings.googleapis.buildSrcApisServicemanagementV1Mod.servicemanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the status of one operation step.
  */
@js.native
trait Schema$Step extends js.Object {
  /**
    * The short description of the step.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The status code.
    */
  var status: js.UndefOr[String] = js.native
}

object Schema$Step {
  @scala.inline
  def apply(description: String = null, status: String = null): Schema$Step = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Step]
  }
}

