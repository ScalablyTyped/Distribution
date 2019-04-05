package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteControl extends js.Object {
  var requiredRevisionId: js.UndefOr[java.lang.String] = js.undefined
  var targetRevisionId: js.UndefOr[java.lang.String] = js.undefined
}

object WriteControl {
  @scala.inline
  def apply(requiredRevisionId: java.lang.String = null, targetRevisionId: java.lang.String = null): WriteControl = {
    val __obj = js.Dynamic.literal()
    if (requiredRevisionId != null) __obj.updateDynamic("requiredRevisionId")(requiredRevisionId)
    if (targetRevisionId != null) __obj.updateDynamic("targetRevisionId")(targetRevisionId)
    __obj.asInstanceOf[WriteControl]
  }
}

