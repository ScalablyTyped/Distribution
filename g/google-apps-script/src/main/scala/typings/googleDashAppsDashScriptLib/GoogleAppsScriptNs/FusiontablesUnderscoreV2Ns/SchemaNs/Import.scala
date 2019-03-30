package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Import extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var numRowsReceived: js.UndefOr[java.lang.String] = js.undefined
}

object Import {
  @scala.inline
  def apply(kind: java.lang.String = null, numRowsReceived: java.lang.String = null): Import = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (numRowsReceived != null) __obj.updateDynamic("numRowsReceived")(numRowsReceived)
    __obj.asInstanceOf[Import]
  }
}

