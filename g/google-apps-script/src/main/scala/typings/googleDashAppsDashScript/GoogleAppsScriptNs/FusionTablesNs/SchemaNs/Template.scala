package typings.googleDashAppsDashScript.GoogleAppsScriptNs.FusionTablesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  var automaticColumnNames: js.UndefOr[js.Array[String]] = js.undefined
  var body: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var tableId: js.UndefOr[String] = js.undefined
  var templateId: js.UndefOr[Double] = js.undefined
}

object Template {
  @scala.inline
  def apply(
    automaticColumnNames: js.Array[String] = null,
    body: String = null,
    kind: String = null,
    name: String = null,
    tableId: String = null,
    templateId: Int | Double = null
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

