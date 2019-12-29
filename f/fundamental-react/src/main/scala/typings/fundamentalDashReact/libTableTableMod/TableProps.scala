package typings.fundamentalDashReact.libTableTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalDashReact.Anon_RowData
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  /* Array of localized text strings for the column headers. */
  var headers: js.Array[String | ReactNode]
  /* Additional classes to be added to the `<tbody>` element. */
  var tableBodyClassName: js.UndefOr[String] = js.undefined
  /* Additional props to be spread to the `<tbody>` element. */
  var tableBodyProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the `<tr>` elements within `<tbody>`. If using a function, the parameters passed will be an object representing the row (from `tableData`) and the row index. */
  var tableBodyRowProps: js.UndefOr[
    StringDictionary[js.Any] | (js.Function2[/* rowData */ js.Array[String], /* index */ Double, Unit])
  ] = js.undefined
  /* Additional classes to be added to the `<td>` elements. */
  var tableCellClassName: js.UndefOr[String] = js.undefined
  /* Array of objects that contain one property: `rowData` (an array of strings containing data for each column in the row). */
  var tableData: js.UndefOr[js.Array[Anon_RowData]] = js.undefined
  /* Additional classes to be added to the `<thead>` elements. */
  var tableHeaderClassName: js.UndefOr[String] = js.undefined
  /* Additional props to be spread to the `<thead>` element. */
  var tableHeaderProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional classes to the `<tr>` element within `<thead>`. */
  var tableHeaderRowClassName: js.UndefOr[String] = js.undefined
  /* Additional props to be spread to the `<tr>` element within `<thead>`. */
  var tableHeaderRowProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional classes to be added to the `<tr>` elements. */
  var tableRowClassName: js.UndefOr[String] = js.undefined
}

object TableProps {
  @scala.inline
  def apply(
    headers: js.Array[String | ReactNode],
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    tableBodyClassName: String = null,
    tableBodyProps: StringDictionary[js.Any] = null,
    tableBodyRowProps: StringDictionary[js.Any] | (js.Function2[/* rowData */ js.Array[String], /* index */ Double, Unit]) = null,
    tableCellClassName: String = null,
    tableData: js.Array[Anon_RowData] = null,
    tableHeaderClassName: String = null,
    tableHeaderProps: StringDictionary[js.Any] = null,
    tableHeaderRowClassName: String = null,
    tableHeaderRowProps: StringDictionary[js.Any] = null,
    tableRowClassName: String = null
  ): TableProps = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
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

