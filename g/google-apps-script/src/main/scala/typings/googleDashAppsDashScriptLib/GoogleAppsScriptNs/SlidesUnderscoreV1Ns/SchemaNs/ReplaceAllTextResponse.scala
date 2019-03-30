package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceAllTextResponse extends js.Object {
  var occurrencesChanged: js.UndefOr[scala.Double] = js.undefined
}

object ReplaceAllTextResponse {
  @scala.inline
  def apply(occurrencesChanged: scala.Int | scala.Double = null): ReplaceAllTextResponse = {
    val __obj = js.Dynamic.literal()
    if (occurrencesChanged != null) __obj.updateDynamic("occurrencesChanged")(occurrencesChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceAllTextResponse]
  }
}

