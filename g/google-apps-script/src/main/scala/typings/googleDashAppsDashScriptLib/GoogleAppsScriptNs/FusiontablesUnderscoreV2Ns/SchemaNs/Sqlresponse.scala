package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sqlresponse extends js.Object {
  var columns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var rows: js.UndefOr[js.Array[js.Array[js.Object]]] = js.undefined
}

object Sqlresponse {
  @scala.inline
  def apply(
    columns: js.Array[java.lang.String] = null,
    kind: java.lang.String = null,
    rows: js.Array[js.Array[js.Object]] = null
  ): Sqlresponse = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    __obj.asInstanceOf[Sqlresponse]
  }
}

