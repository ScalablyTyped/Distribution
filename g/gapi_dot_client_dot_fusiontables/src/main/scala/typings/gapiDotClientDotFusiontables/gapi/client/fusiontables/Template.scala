package typings.gapiDotClientDotFusiontables.gapi.client.fusiontables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  /** List of columns from which the template is to be automatically constructed. Only one of body or automaticColumns can be specified. */
  var automaticColumnNames: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Body of the template. It contains HTML with {column_name} to insert values from a particular column. The body is sanitized to remove certain tags,
    * e.g., script. Only one of body or automaticColumns can be specified.
    */
  var body: js.UndefOr[String] = js.undefined
  /** The kind of item this is. For a template, this is always fusiontables#template. */
  var kind: js.UndefOr[String] = js.undefined
  /** Optional name assigned to a template. */
  var name: js.UndefOr[String] = js.undefined
  /** Identifier for the table for which the template is defined. */
  var tableId: js.UndefOr[String] = js.undefined
  /** Identifier for the template, unique within the context of a particular table. */
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

