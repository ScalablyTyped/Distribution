package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.Alignment
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.dxForm.FormItemComponent
import typings.devextreme.mod.DevExpress.ui.dxForm.FormItemType
import typings.devextreme.mod.DevExpress.ui.dxForm.SimpleItemTemplateData
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxFormSimpleItem extends StObject {
  
  /**
    * Specifies the number of columns spanned by the item.
    */
  var colSpan: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a CSS class to be applied to the form item.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the path to the formData object field bound to the current form item.
    */
  var dataField: js.UndefOr[String] = js.undefined
  
  /**
    * Configures the form item&apos;s editor.
    */
  var editorOptions: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies which editor UI component is used to display and edit the form item value.
    */
  var editorType: js.UndefOr[FormItemComponent] = js.undefined
  
  /**
    * Specifies the help text displayed for the current form item.
    */
  var helpText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the current form item is required.
    */
  var isRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the item&apos;s type. Set it to &apos;simple&apos; to create a simple item.
    */
  var itemType: js.UndefOr[FormItemType] = js.undefined
  
  /**
    * Specifies properties for the form item label.
    */
  var label: js.UndefOr[Alignment] = js.undefined
  
  /**
    * Specifies a name that identifies the form item.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A template that can be used to replace the default editor with custom content.
    */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* data */ SimpleItemTemplateData, 
      /* itemElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * An array of validation rules to be checked for the form item editor.
    */
  var validationRules: js.UndefOr[
    js.Array[
      typings.devextreme.mod.DevExpress.common.RequiredRule | typings.devextreme.mod.DevExpress.common.NumericRule | typings.devextreme.mod.DevExpress.common.RangeRule | typings.devextreme.mod.DevExpress.common.StringLengthRule | typings.devextreme.mod.DevExpress.common.CustomRule | typings.devextreme.mod.DevExpress.common.CompareRule | typings.devextreme.mod.DevExpress.common.PatternRule | typings.devextreme.mod.DevExpress.common.EmailRule | typings.devextreme.mod.DevExpress.common.AsyncRule
    ]
  ] = js.undefined
  
  /**
    * Specifies whether or not the current form item is visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the sequence number of the item in a form, group or tab.
    */
  var visibleIndex: js.UndefOr[Double] = js.undefined
}
object dxFormSimpleItem {
  
  inline def apply(): dxFormSimpleItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFormSimpleItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxFormSimpleItem] (val x: Self) extends AnyVal {
    
    inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
    
    inline def setEditorOptions(value: Any): Self = StObject.set(x, "editorOptions", value.asInstanceOf[js.Any])
    
    inline def setEditorOptionsUndefined: Self = StObject.set(x, "editorOptions", js.undefined)
    
    inline def setEditorType(value: FormItemComponent): Self = StObject.set(x, "editorType", value.asInstanceOf[js.Any])
    
    inline def setEditorTypeUndefined: Self = StObject.set(x, "editorType", js.undefined)
    
    inline def setHelpText(value: String): Self = StObject.set(x, "helpText", value.asInstanceOf[js.Any])
    
    inline def setHelpTextUndefined: Self = StObject.set(x, "helpText", js.undefined)
    
    inline def setIsRequired(value: Boolean): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
    
    inline def setIsRequiredUndefined: Self = StObject.set(x, "isRequired", js.undefined)
    
    inline def setItemType(value: FormItemType): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
    
    inline def setLabel(value: Alignment): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTemplate(
      value: template | (js.Function2[
          /* data */ SimpleItemTemplateData, 
          /* itemElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateFunction2(
      value: (/* data */ SimpleItemTemplateData, /* itemElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "template", js.Any.fromFunction2(value))
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setValidationRules(
      value: js.Array[
          typings.devextreme.mod.DevExpress.common.RequiredRule | typings.devextreme.mod.DevExpress.common.NumericRule | typings.devextreme.mod.DevExpress.common.RangeRule | typings.devextreme.mod.DevExpress.common.StringLengthRule | typings.devextreme.mod.DevExpress.common.CustomRule | typings.devextreme.mod.DevExpress.common.CompareRule | typings.devextreme.mod.DevExpress.common.PatternRule | typings.devextreme.mod.DevExpress.common.EmailRule | typings.devextreme.mod.DevExpress.common.AsyncRule
        ]
    ): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
    
    inline def setValidationRulesUndefined: Self = StObject.set(x, "validationRules", js.undefined)
    
    inline def setValidationRulesVarargs(
      value: (typings.devextreme.mod.DevExpress.common.RequiredRule | typings.devextreme.mod.DevExpress.common.NumericRule | typings.devextreme.mod.DevExpress.common.RangeRule | typings.devextreme.mod.DevExpress.common.StringLengthRule | typings.devextreme.mod.DevExpress.common.CustomRule | typings.devextreme.mod.DevExpress.common.CompareRule | typings.devextreme.mod.DevExpress.common.PatternRule | typings.devextreme.mod.DevExpress.common.EmailRule | typings.devextreme.mod.DevExpress.common.AsyncRule)*
    ): Self = StObject.set(x, "validationRules", js.Array(value*))
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndexUndefined: Self = StObject.set(x, "visibleIndex", js.undefined)
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
