package typings
package gapiDotClientDotFusiontablesLib.gapiNs.clientNs.fusiontablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  /** List of columns from which the template is to be automatically constructed. Only one of body or automaticColumns can be specified. */
  var automaticColumnNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Body of the template. It contains HTML with {column_name} to insert values from a particular column. The body is sanitized to remove certain tags,
    * e.g., script. Only one of body or automaticColumns can be specified.
    */
  var body: js.UndefOr[java.lang.String] = js.undefined
  /** The kind of item this is. For a template, this is always fusiontables#template. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Optional name assigned to a template. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Identifier for the table for which the template is defined. */
  var tableId: js.UndefOr[java.lang.String] = js.undefined
  /** Identifier for the template, unique within the context of a particular table. */
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

