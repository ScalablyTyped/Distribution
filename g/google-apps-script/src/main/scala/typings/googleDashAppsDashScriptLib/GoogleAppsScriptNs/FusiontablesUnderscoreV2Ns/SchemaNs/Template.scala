package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  var automaticColumnNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var body: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var tableId: js.UndefOr[java.lang.String] = js.undefined
  var templateId: js.UndefOr[scala.Double] = js.undefined
}

object Template {
  @scala.inline
  def apply(
    automaticColumnNames: js.Array[java.lang.String] = null,
    body: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    tableId: java.lang.String = null,
    templateId: scala.Int | scala.Double = null
  ): Template = {
    val __obj = js.Dynamic.literal()
    if (automaticColumnNames != null) __obj.updateDynamic("automaticColumnNames")(automaticColumnNames)
    if (body != null) __obj.updateDynamic("body")(body)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (tableId != null) __obj.updateDynamic("tableId")(tableId)
    if (templateId != null) __obj.updateDynamic("templateId")(templateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
}

