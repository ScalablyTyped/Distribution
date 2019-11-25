package typings.gapiDotClientDotCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceGroupReference extends js.Object {
  /** A URI referencing one of the instance groups listed in the backend service. */
  var group: js.UndefOr[String] = js.undefined
}

object ResourceGroupReference {
  @scala.inline
  def apply(group: String = null): ResourceGroupReference = {
    val __obj = js.Dynamic.literal()
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceGroupReference]
  }
}

