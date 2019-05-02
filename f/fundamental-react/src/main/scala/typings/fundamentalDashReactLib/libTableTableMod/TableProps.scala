package typings
package fundamentalDashReactLib.libTableTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  /* Array of localized text strings for the column headers. */
  var headers: js.Array[java.lang.String | reactLib.reactMod.ReactNode]
  /* Additional props to be spread to the `<tbody>` element. */
  var tableBodyProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the `<tr>` elements within `<tbody>`. If using a function, the parameters passed will be an object representing the row (from `tableData`) and the row index. */
  var tableBodyRowProps: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[js.Any] | (js.Function2[/* rowData */ js.Array[java.lang.String], /* index */ scala.Double, scala.Unit])
  ] = js.undefined
  /* Array of objects that contain one property: `rowData` (an array of strings containing data for each column in the row). */
  var tableData: js.UndefOr[js.Array[fundamentalDashReactLib.Anon_RowData]] = js.undefined
  /* Additional props to be spread to the `<thead>` element. */
  var tableHeaderProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the `<tr>` element within `<thead>`. */
  var tableHeaderRowProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object TableProps {
  @scala.inline
  def apply(
    headers: js.Array[java.lang.String | reactLib.reactMod.ReactNode],
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    tableBodyProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    tableBodyRowProps: org.scalablytyped.runtime.StringDictionary[js.Any] | (js.Function2[/* rowData */ js.Array[java.lang.String], /* index */ scala.Double, scala.Unit]) = null,
    tableData: js.Array[fundamentalDashReactLib.Anon_RowData] = null,
    tableHeaderProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    tableHeaderRowProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): TableProps = {
    val __obj = js.Dynamic.literal(headers = headers)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (tableBodyProps != null) __obj.updateDynamic("tableBodyProps")(tableBodyProps)
    if (tableBodyRowProps != null) __obj.updateDynamic("tableBodyRowProps")(tableBodyRowProps.asInstanceOf[js.Any])
    if (tableData != null) __obj.updateDynamic("tableData")(tableData)
    if (tableHeaderProps != null) __obj.updateDynamic("tableHeaderProps")(tableHeaderProps)
    if (tableHeaderRowProps != null) __obj.updateDynamic("tableHeaderRowProps")(tableHeaderRowProps)
    __obj.asInstanceOf[TableProps]
  }
}

