package typings.googleapis.buildSrcApisFusiontablesV2Mod.fusiontables_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the contents of InfoWindow templates.
  */
@js.native
trait Schema$Template extends js.Object {
  /**
    * List of columns from which the template is to be automatically
    * constructed. Only one of body or automaticColumns can be specified.
    */
  var automaticColumnNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Body of the template. It contains HTML with {column_name} to insert
    * values from a particular column. The body is sanitized to remove certain
    * tags, e.g., script. Only one of body or automaticColumns can be
    * specified.
    */
  var body: js.UndefOr[String] = js.native
  /**
    * The kind of item this is. For a template, this is always
    * fusiontables#template.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Optional name assigned to a template.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Identifier for the table for which the template is defined.
    */
  var tableId: js.UndefOr[String] = js.native
  /**
    * Identifier for the template, unique within the context of a particular
    * table.
    */
  var templateId: js.UndefOr[Double] = js.native
}

object Schema$Template {
  @scala.inline
  def apply(
    automaticColumnNames: js.Array[String] = null,
    body: String = null,
    kind: String = null,
    name: String = null,
    tableId: String = null,
    templateId: Int | Double = null
  ): Schema$Template = {
    val __obj = js.Dynamic.literal()
    if (automaticColumnNames != null) __obj.updateDynamic("automaticColumnNames")(automaticColumnNames.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tableId != null) __obj.updateDynamic("tableId")(tableId.asInstanceOf[js.Any])
    if (templateId != null) __obj.updateDynamic("templateId")(templateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Template]
  }
}

