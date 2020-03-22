package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxHtmlEditorVariables extends js.Object {
  /** Specifies a collection of variables available for a user. */
  var dataSource: js.UndefOr[String | js.Array[String] | DataSource | DataSourceOptions] = js.undefined
  /** Specifies the special character(s) that should surround the variables. */
  var escapeChar: js.UndefOr[String | js.Array[String]] = js.undefined
}

object dxHtmlEditorVariables {
  @scala.inline
  def apply(
    dataSource: String | js.Array[String] | DataSource | DataSourceOptions = null,
    escapeChar: String | js.Array[String] = null
  ): dxHtmlEditorVariables = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (escapeChar != null) __obj.updateDynamic("escapeChar")(escapeChar.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxHtmlEditorVariables]
  }
}

