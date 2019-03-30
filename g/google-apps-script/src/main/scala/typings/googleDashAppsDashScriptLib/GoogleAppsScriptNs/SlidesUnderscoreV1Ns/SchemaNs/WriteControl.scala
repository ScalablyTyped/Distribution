package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteControl extends js.Object {
  var requiredRevisionId: js.UndefOr[java.lang.String] = js.undefined
}

object WriteControl {
  @scala.inline
  def apply(requiredRevisionId: java.lang.String = null): WriteControl = {
    val __obj = js.Dynamic.literal()
    if (requiredRevisionId != null) __obj.updateDynamic("requiredRevisionId")(requiredRevisionId)
    __obj.asInstanceOf[WriteControl]
  }
}

