package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactsListResponse extends js.Object {
  var items: js.UndefOr[js.Array[Contact]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object ContactsListResponse {
  @scala.inline
  def apply(items: js.Array[Contact] = null, kind: java.lang.String = null): ContactsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ContactsListResponse]
  }
}

