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

