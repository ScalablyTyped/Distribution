package typings.gapiDotClientDotServicecontrol.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceInfo extends js.Object {
  /**
    * The identifier of the parent of this resource instance.
    * Must be in one of the following formats:
    * - “projects/<project-id or project-number>”
    * - “folders/<folder-id>”
    * - “organizations/<organization-id>”
    */
  var resourceContainer: js.UndefOr[String] = js.undefined
  /** Name of the resource. This is used for auditing purposes. */
  var resourceName: js.UndefOr[String] = js.undefined
}

object ResourceInfo {
  @scala.inline
  def apply(resourceContainer: String = null, resourceName: String = null): ResourceInfo = {
    val __obj = js.Dynamic.literal()
    if (resourceContainer != null) __obj.updateDynamic("resourceContainer")(resourceContainer)
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName)
    __obj.asInstanceOf[ResourceInfo]
  }
}

