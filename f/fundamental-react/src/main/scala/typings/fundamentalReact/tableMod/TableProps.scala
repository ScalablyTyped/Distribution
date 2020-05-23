package typings.fundamentalReact.tableMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.RowData
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var headers: js.Array[String | ReactNode]
  var tableBodyClassName: js.UndefOr[String] = js.undefined
  var tableBodyProps: js.UndefOr[js.Any] = js.undefined
  var tableBodyRowProps: js.UndefOr[
    StringDictionary[js.Any] | (js.Function2[/* rowData */ js.Array[String], /* index */ Double, Unit])
  ] = js.undefined
  var tableCellClassName: js.UndefOr[String] = js.undefined
  var tableData: js.UndefOr[js.Array[RowData]] = js.undefined
  var tableHeaderClassName: js.UndefOr[String] = js.undefined
  var tableHeaderProps: js.UndefOr[js.Any] = js.undefined
  var tableHeaderRowClassName: js.UndefOr[String] = js.undefined
  var tableHeaderRowProps: js.UndefOr[js.Any] = js.undefined
  var tableRowClassName: js.UndefOr[String] = js.undefined
}

object TableProps {
  @scala.inline
  def apply(
    headers: js.Array[String | ReactNode],
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    className: String = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    tableBodyClassName: String = null,
    tableBodyProps: js.Any = null,
    tableBodyRowProps: StringDictionary[js.Any] | (js.Function2[/* rowData */ js.Array[String], /* index */ Double, Unit]) = null,
    tableCellClassName: String = null,
    tableData: js.Array[RowData] = null,
    tableHeaderClassName: String = null,
    tableHeaderProps: js.Any = null,
    tableHeaderRowClassName: String = null,
    tableHeaderRowProps: js.Any = null,
    tableRowClassName: String = null
  ): TableProps = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.get.asInstanceOf[js.Any])
    if (tableBodyClassName != null) __obj.updateDynamic("tableBodyClassName")(tableBodyClassName.asInstanceOf[js.Any])
    if (tableBodyProps != null) __obj.updateDynamic("tableBodyProps")(tableBodyProps.asInstanceOf[js.Any])
    if (tableBodyRowProps != null) __obj.updateDynamic("tableBodyRowProps")(tableBodyRowProps.asInstanceOf[js.Any])
    if (tableCellClassName != null) __obj.updateDynamic("tableCellClassName")(tableCellClassName.asInstanceOf[js.Any])
    if (tableData != null) __obj.updateDynamic("tableData")(tableData.asInstanceOf[js.Any])
    if (tableHeaderClassName != null) __obj.updateDynamic("tableHeaderClassName")(tableHeaderClassName.asInstanceOf[js.Any])
    if (tableHeaderProps != null) __obj.updateDynamic("tableHeaderProps")(tableHeaderProps.asInstanceOf[js.Any])
    if (tableHeaderRowClassName != null) __obj.updateDynamic("tableHeaderRowClassName")(tableHeaderRowClassName.asInstanceOf[js.Any])
    if (tableHeaderRowProps != null) __obj.updateDynamic("tableHeaderRowProps")(tableHeaderRowProps.asInstanceOf[js.Any])
    if (tableRowClassName != null) __obj.updateDynamic("tableRowClassName")(tableRowClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableProps]
  }
}

