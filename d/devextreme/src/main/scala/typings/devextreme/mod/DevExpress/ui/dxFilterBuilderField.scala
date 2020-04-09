package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonDisplayExpr
import typings.devextreme.AnonFilterOperation
import typings.devextreme.AnonValue
import typings.devextreme.devextremeStrings.Equalssign
import typings.devextreme.devextremeStrings.Greaterthansign
import typings.devextreme.devextremeStrings.GreaterthansignEqualssign
import typings.devextreme.devextremeStrings.Lessthansign
import typings.devextreme.devextremeStrings.LessthansignEqualssign
import typings.devextreme.devextremeStrings.LessthansignGreaterthansign
import typings.devextreme.devextremeStrings.`object`
import typings.devextreme.devextremeStrings.between
import typings.devextreme.devextremeStrings.boolean_
import typings.devextreme.devextremeStrings.contains
import typings.devextreme.devextremeStrings.date
import typings.devextreme.devextremeStrings.datetime
import typings.devextreme.devextremeStrings.endswith
import typings.devextreme.devextremeStrings.isblank
import typings.devextreme.devextremeStrings.isnotblank
import typings.devextreme.devextremeStrings.notcontains
import typings.devextreme.devextremeStrings.number
import typings.devextreme.devextremeStrings.startswith
import typings.devextreme.devextremeStrings.string_
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFilterBuilderField extends js.Object {
  /** @name dxFilterBuilderField.calculateFilterExpression */
  var calculateFilterExpression: js.UndefOr[
    js.Function2[
      /* filterValue */ js.Any, 
      /* selectedFilterOperation */ String, 
      String | js.Array[_] | js.Function
    ]
  ] = js.undefined
  /** @name dxFilterBuilderField.caption */
  var caption: js.UndefOr[String] = js.undefined
  /** @name dxFilterBuilderField.customizeText */
  var customizeText: js.UndefOr[js.Function1[/* fieldInfo */ AnonValue, String]] = js.undefined
  /** @name dxFilterBuilderField.dataField */
  var dataField: js.UndefOr[String] = js.undefined
  /** @name dxFilterBuilderField.dataType */
  var dataType: js.UndefOr[string_ | number | date | boolean_ | `object` | datetime] = js.undefined
  /** @name dxFilterBuilderField.editorOptions */
  var editorOptions: js.UndefOr[js.Any] = js.undefined
  /** @name dxFilterBuilderField.editorTemplate */
  var editorTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* conditionInfo */ AnonFilterOperation, 
      /* container */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** @name dxFilterBuilderField.falseText */
  var falseText: js.UndefOr[String] = js.undefined
  /** @name dxFilterBuilderField.filterOperations */
  var filterOperations: js.UndefOr[
    js.Array[
      Equalssign | LessthansignGreaterthansign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | contains | endswith | isblank | isnotblank | notcontains | startswith | between | String
    ]
  ] = js.undefined
  /** @name dxFilterBuilderField.format */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
  /** @name dxFilterBuilderField.lookup */
  var lookup: js.UndefOr[AnonDisplayExpr] = js.undefined
  /** @name dxFilterBuilderField.name */
  var name: js.UndefOr[String] = js.undefined
  /** @name dxFilterBuilderField.trueText */
  var trueText: js.UndefOr[String] = js.undefined
}

object dxFilterBuilderField {
  @scala.inline
  def apply(
    calculateFilterExpression: (/* filterValue */ js.Any, /* selectedFilterOperation */ String) => String | js.Array[_] | js.Function = null,
    caption: String = null,
    customizeText: /* fieldInfo */ AnonValue => String = null,
    dataField: String = null,
    dataType: string_ | number | date | boolean_ | `object` | datetime = null,
    editorOptions: js.Any = null,
    editorTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* conditionInfo */ AnonFilterOperation, 
      /* container */ dxElement, 
      String | Element | JQuery
    ]) = null,
    falseText: String = null,
    filterOperations: js.Array[
      Equalssign | LessthansignGreaterthansign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | contains | endswith | isblank | isnotblank | notcontains | startswith | between | String
    ] = null,
    format: format = null,
    lookup: AnonDisplayExpr = null,
    name: String = null,
    trueText: String = null
  ): dxFilterBuilderField = {
    val __obj = js.Dynamic.literal()
    if (calculateFilterExpression != null) __obj.updateDynamic("calculateFilterExpression")(js.Any.fromFunction2(calculateFilterExpression))
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (dataField != null) __obj.updateDynamic("dataField")(dataField.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (editorOptions != null) __obj.updateDynamic("editorOptions")(editorOptions.asInstanceOf[js.Any])
    if (editorTemplate != null) __obj.updateDynamic("editorTemplate")(editorTemplate.asInstanceOf[js.Any])
    if (falseText != null) __obj.updateDynamic("falseText")(falseText.asInstanceOf[js.Any])
    if (filterOperations != null) __obj.updateDynamic("filterOperations")(filterOperations.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(lookup.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (trueText != null) __obj.updateDynamic("trueText")(trueText.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFilterBuilderField]
  }
}

