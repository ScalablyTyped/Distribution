package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XpnResourceId extends js.Object {
  /** The ID of the service resource. In the case of projects, this field matches the project ID (e.g., my-project), not the project number (e.g., 12345678). */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The type of the service resource. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object XpnResourceId {
  @scala.inline
  def apply(id: java.lang.String = null, `type`: java.lang.String = null): XpnResourceId = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[XpnResourceId]
  }
}

