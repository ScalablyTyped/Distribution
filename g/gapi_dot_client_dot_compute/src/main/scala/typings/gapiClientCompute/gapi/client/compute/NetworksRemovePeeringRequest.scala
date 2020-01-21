package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworksRemovePeeringRequest extends js.Object {
  /** Name of the peering, which should conform to RFC1035. */
  var name: js.UndefOr[String] = js.undefined
}

object NetworksRemovePeeringRequest {
  @scala.inline
  def apply(name: String = null): NetworksRemovePeeringRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworksRemovePeeringRequest]
  }
}

