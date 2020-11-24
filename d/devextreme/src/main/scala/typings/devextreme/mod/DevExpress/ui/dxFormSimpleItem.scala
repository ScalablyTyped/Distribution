package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.Location
import typings.devextreme.devextremeStrings.button
import typings.devextreme.devextremeStrings.empty
import typings.devextreme.devextremeStrings.group
import typings.devextreme.devextremeStrings.simple
import typings.devextreme.devextremeStrings.tabbed
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxFormSimpleItem extends js.Object {
  
  /**
    * [descr:dxFormSimpleItem.colSpan]
    */
  var colSpan: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxFormSimpleItem.cssClass]
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxFormSimpleItem.dataField]
    */
  var dataField: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxFormSimpleItem.editorOptions]
    */
  var editorOptions: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxFormSimpleItem.editorType]
    */
  var editorType: js.UndefOr[
    typings.devextreme.devextremeStrings.dxAutocomplete | typings.devextreme.devextremeStrings.dxCalendar | typings.devextreme.devextremeStrings.dxCheckBox | typings.devextreme.devextremeStrings.dxColorBox | typings.devextreme.devextremeStrings.dxDateBox | typings.devextreme.devextremeStrings.dxDropDownBox | typings.devextreme.devextremeStrings.dxHtmlEditor | typings.devextreme.devextremeStrings.dxLookup | typings.devextreme.devextremeStrings.dxNumberBox | typings.devextreme.devextremeStrings.dxRadioGroup | typings.devextreme.devextremeStrings.dxRangeSlider | typings.devextreme.devextremeStrings.dxSelectBox | typings.devextreme.devextremeStrings.dxSlider | typings.devextreme.devextremeStrings.dxSwitch | typings.devextreme.devextremeStrings.dxTagBox | typings.devextreme.devextremeStrings.dxTextArea | typings.devextreme.devextremeStrings.dxTextBox
  ] = js.native
  
  /**
    * [descr:dxFormSimpleItem.helpText]
    */
  var helpText: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxFormSimpleItem.isRequired]
    */
  var isRequired: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxFormSimpleItem.itemType]
    */
  var itemType: js.UndefOr[empty | group | simple | tabbed | button] = js.native
  
  /**
    * [descr:dxFormSimpleItem.label]
    */
  var label: js.UndefOr[Location] = js.native
  
  /**
    * [descr:dxFormSimpleItem.name]
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxFormSimpleItem.template]
    */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* data */ typings.devextreme.anon.EditorOptions, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  
  /**
    * [descr:dxFormSimpleItem.validationRules]
    */
  var validationRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.native
  
  /**
    * [descr:dxFormSimpleItem.visible]
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxFormSimpleItem.visibleIndex]
    */
  var visibleIndex: js.UndefOr[Double] = js.native
}
object dxFormSimpleItem {
  
  @scala.inline
  def apply(): dxFormSimpleItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFormSimpleItem]
  }
  
  @scala.inline
  implicit class dxFormSimpleItemOps[Self <: dxFormSimpleItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColSpan(value: Double): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColSpan: Self = this.set("colSpan", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setDataField(value: String): Self = this.set("dataField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataField: Self = this.set("dataField", js.undefined)
    
    @scala.inline
    def setEditorOptions(value: js.Any): Self = this.set("editorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorOptions: Self = this.set("editorOptions", js.undefined)
    
    @scala.inline
    def setEditorType(
      value: typings.devextreme.devextremeStrings.dxAutocomplete | typings.devextreme.devextremeStrings.dxCalendar | typings.devextreme.devextremeStrings.dxCheckBox | typings.devextreme.devextremeStrings.dxColorBox | typings.devextreme.devextremeStrings.dxDateBox | typings.devextreme.devextremeStrings.dxDropDownBox | typings.devextreme.devextremeStrings.dxHtmlEditor | typings.devextreme.devextremeStrings.dxLookup | typings.devextreme.devextremeStrings.dxNumberBox | typings.devextreme.devextremeStrings.dxRadioGroup | typings.devextreme.devextremeStrings.dxRangeSlider | typings.devextreme.devextremeStrings.dxSelectBox | typings.devextreme.devextremeStrings.dxSlider | typings.devextreme.devextremeStrings.dxSwitch | typings.devextreme.devextremeStrings.dxTagBox | typings.devextreme.devextremeStrings.dxTextArea | typings.devextreme.devextremeStrings.dxTextBox
    ): Self = this.set("editorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorType: Self = this.set("editorType", js.undefined)
    
    @scala.inline
    def setHelpText(value: String): Self = this.set("helpText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelpText: Self = this.set("helpText", js.undefined)
    
    @scala.inline
    def setIsRequired(value: Boolean): Self = this.set("isRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRequired: Self = this.set("isRequired", js.undefined)
    
    @scala.inline
    def setItemType(value: empty | group | simple | tabbed | button): Self = this.set("itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemType: Self = this.set("itemType", js.undefined)
    
    @scala.inline
    def setLabel(value: Location): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTemplateFunction2(
      value: (/* data */ typings.devextreme.anon.EditorOptions, /* itemElement */ dxElement) => String | Element | JQuery
    ): Self = this.set("template", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function2[
          /* data */ typings.devextreme.anon.EditorOptions, 
          /* itemElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setValidationRulesVarargs(
      value: (RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule)*
    ): Self = this.set("validationRules", js.Array(value :_*))
    
    @scala.inline
    def setValidationRules(
      value: js.Array[
          RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
        ]
    ): Self = this.set("validationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationRules: Self = this.set("validationRules", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = this.set("visibleIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleIndex: Self = this.set("visibleIndex", js.undefined)
  }
}
