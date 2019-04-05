package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExplainQueryStep extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var substeps: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ExplainQueryStep {
  @scala.inline
  def apply(kind: java.lang.String = null, substeps: js.Array[java.lang.String] = null): ExplainQueryStep = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (substeps != null) __obj.updateDynamic("substeps")(substeps)
    __obj.asInstanceOf[ExplainQueryStep]
  }
}

