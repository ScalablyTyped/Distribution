package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Table/Table.TableProps> */
trait WeakValidationMapTablePro extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var customStyles: js.UndefOr[Validator[js.UndefOr[Null | StringDictionary[_]]]] = js.undefined
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var headers: js.UndefOr[Validator[js.UndefOr[(js.Array[ReactNode | String]) | Null]]] = js.undefined
  var tableBodyClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var tableBodyProps: js.UndefOr[Validator[js.UndefOr[Null | StringDictionary[_]]]] = js.undefined
  var tableBodyRowProps: js.UndefOr[
    Validator[
      js.UndefOr[
        (js.Function2[/* rowData */ js.Array[String], /* index */ Double, Unit]) | Null | StringDictionary[_]
      ]
    ]
  ] = js.undefined
  var tableCellClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var tableData: js.UndefOr[Validator[js.UndefOr[js.Array[AnonRowData] | Null]]] = js.undefined
  var tableHeaderClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var tableHeaderProps: js.UndefOr[Validator[js.UndefOr[Null | StringDictionary[_]]]] = js.undefined
  var tableHeaderRowClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var tableHeaderRowProps: js.UndefOr[Validator[js.UndefOr[Null | StringDictionary[_]]]] = js.undefined
  var tableRowClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
}

object WeakValidationMapTablePro {
  @scala.inline
  def apply(
    className: Validator[js.UndefOr[Null | String]] = null,
    customStyles: Validator[js.UndefOr[Null | StringDictionary[_]]] = null,
    disableStyles: Validator[js.UndefOr[Boolean | Null]] = null,
    headers: Validator[js.UndefOr[(js.Array[ReactNode | String]) | Null]] = null,
    tableBodyClassName: Validator[js.UndefOr[Null | String]] = null,
    tableBodyProps: Validator[js.UndefOr[Null | StringDictionary[_]]] = null,
    tableBodyRowProps: Validator[
      js.UndefOr[
        (js.Function2[/* rowData */ js.Array[String], /* index */ Double, Unit]) | Null | StringDictionary[_]
      ]
    ] = null,
    tableCellClassName: Validator[js.UndefOr[Null | String]] = null,
    tableData: Validator[js.UndefOr[js.Array[AnonRowData] | Null]] = null,
    tableHeaderClassName: Validator[js.UndefOr[Null | String]] = null,
    tableHeaderProps: Validator[js.UndefOr[Null | StringDictionary[_]]] = null,
    tableHeaderRowClassName: Validator[js.UndefOr[Null | String]] = null,
    tableHeaderRowProps: Validator[js.UndefOr[Null | StringDictionary[_]]] = null,
    tableRowClassName: Validator[js.UndefOr[Null | String]] = null
  ): WeakValidationMapTablePro = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (disableStyles != null) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[WeakValidationMapTablePro]
  }
}

