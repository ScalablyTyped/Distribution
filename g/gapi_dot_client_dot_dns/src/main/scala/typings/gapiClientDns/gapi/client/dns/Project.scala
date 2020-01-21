package typings.gapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Project extends js.Object {
  /** User assigned unique identifier for the resource (output only). */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dns#project". */
  var kind: js.UndefOr[String] = js.undefined
  /** Unique numeric identifier for the resource; defined by the server (output only). */
  var number: js.UndefOr[String] = js.undefined
  /** Quotas assigned to this project (output only). */
  var quota: js.UndefOr[Quota] = js.undefined
}

object Project {
  @scala.inline
  def apply(id: String = null, kind: String = null, number: String = null, quota: Quota = null): Project = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (quota != null) __obj.updateDynamic("quota")(quota.asInstanceOf[js.Any])
    __obj.asInstanceOf[Project]
  }
}

