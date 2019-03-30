package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Draft extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[Message] = js.undefined
}

object Draft {
  @scala.inline
  def apply(id: java.lang.String = null, message: Message = null): Draft = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Draft]
  }
}

