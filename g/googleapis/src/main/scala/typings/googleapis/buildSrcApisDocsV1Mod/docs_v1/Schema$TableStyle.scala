package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Styles that apply to a table.
  */
@js.native
trait Schema$TableStyle extends js.Object {
  /**
    * The properties of each column.  Note that in Docs, tables contain rows
    * and rows contain cells, similar to HTML. So the properties for a row can
    * be found on the row&#39;s table_row_style.
    */
  var tableColumnProperties: js.UndefOr[js.Array[Schema$TableColumnProperties]] = js.native
}

object Schema$TableStyle {
  @scala.inline
  def apply(tableColumnProperties: js.Array[Schema$TableColumnProperties] = null): Schema$TableStyle = {
    val __obj = js.Dynamic.literal()
    if (tableColumnProperties != null) __obj.updateDynamic("tableColumnProperties")(tableColumnProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TableStyle]
  }
}

