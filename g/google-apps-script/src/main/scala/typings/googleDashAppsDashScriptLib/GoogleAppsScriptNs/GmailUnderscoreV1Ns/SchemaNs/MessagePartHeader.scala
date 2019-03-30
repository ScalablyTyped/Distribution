package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagePartHeader extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object MessagePartHeader {
  @scala.inline
  def apply(name: java.lang.String = null, value: java.lang.String = null): MessagePartHeader = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[MessagePartHeader]
  }
}

