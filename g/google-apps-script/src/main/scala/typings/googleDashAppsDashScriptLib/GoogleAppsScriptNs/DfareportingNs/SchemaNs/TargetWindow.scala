package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetWindow extends js.Object {
  var customHtml: js.UndefOr[java.lang.String] = js.undefined
  var targetWindowOption: js.UndefOr[java.lang.String] = js.undefined
}

object TargetWindow {
  @scala.inline
  def apply(customHtml: java.lang.String = null, targetWindowOption: java.lang.String = null): TargetWindow = {
    val __obj = js.Dynamic.literal()
    if (customHtml != null) __obj.updateDynamic("customHtml")(customHtml)
    if (targetWindowOption != null) __obj.updateDynamic("targetWindowOption")(targetWindowOption)
    __obj.asInstanceOf[TargetWindow]
  }
}

