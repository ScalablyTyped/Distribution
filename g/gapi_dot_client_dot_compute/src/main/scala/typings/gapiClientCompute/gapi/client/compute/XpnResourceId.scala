package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XpnResourceId extends js.Object {
  /** The ID of the service resource. In the case of projects, this field matches the project ID (e.g., my-project), not the project number (e.g., 12345678). */
  var id: js.UndefOr[String] = js.undefined
  /** The type of the service resource. */
  var `type`: js.UndefOr[String] = js.undefined
}

object XpnResourceId {
  @scala.inline
  def apply(id: String = null, `type`: String = null): XpnResourceId = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpnResourceId]
  }
}

