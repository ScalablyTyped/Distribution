package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AllowClearing
import typings.devextreme.anon.Value
import typings.devextreme.mod.DevExpress.common.DataType
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.dxFilterBuilder.FieldEditorTemplate
import typings.devextreme.mod.DevExpress.ui.dxFilterBuilder.FilterBuilderOperation
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxFilterBuilderField extends StObject {
  
  /**
    * Specifies the field&apos;s custom rules to filter data.
    */
  var calculateFilterExpression: js.UndefOr[
    js.Function2[
      /* filterValue */ Any, 
      /* selectedFilterOperation */ String, 
      String | js.Array[Any] | js.Function
    ]
  ] = js.undefined
  
  /**
    * Specifies the data field&apos;s caption.
    */
  var caption: js.UndefOr[String] = js.undefined
  
  /**
    * Customizes the input value&apos;s display text.
    */
  var customizeText: js.UndefOr[js.Function1[/* fieldInfo */ Value, String]] = js.undefined
  
  /**
    * Specifies the name of a field to be filtered.
    */
  var dataField: js.UndefOr[String] = js.undefined
  
  /**
    * Casts field values to a specific data type.
    */
  var dataType: js.UndefOr[DataType] = js.undefined
  
  /**
    * Configures the UI component used to edit the field value.
    */
  var editorOptions: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies the editor&apos;s custom template.
    */
  var editorTemplate: js.UndefOr[
    template | (js.Function2[
      /* conditionInfo */ FieldEditorTemplate, 
      /* container */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies the false value text. Applies only if dataType is &apos;boolean&apos;.
    */
  var falseText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a set of available filter operations.
    */
  var filterOperations: js.UndefOr[js.Array[FilterBuilderOperation | String]] = js.undefined
  
  /**
    * Formats a value before it is displayed.
    */
  var format: js.UndefOr[Format] = js.undefined
  
  /**
    * Configures the lookup field.
    */
  var lookup: js.UndefOr[AllowClearing] = js.undefined
  
  /**
    * Specifies the field&apos;s name. Use it to distinguish the field from other fields when they have identical dataField values.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the true value text. Applies only if dataType is &apos;boolean&apos;.
    */
  var trueText: js.UndefOr[String] = js.undefined
}
object dxFilterBuilderField {
  
  inline def apply(): dxFilterBuilderField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFilterBuilderField]
  }
  
  extension [Self <: dxFilterBuilderField](x: Self) {
    
    inline def setCalculateFilterExpression(
      value: (/* filterValue */ Any, /* selectedFilterOperation */ String) => String | js.Array[Any] | js.Function
    ): Self = StObject.set(x, "calculateFilterExpression", js.Any.fromFunction2(value))
    
    inline def setCalculateFilterExpressionUndefined: Self = StObject.set(x, "calculateFilterExpression", js.undefined)
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setCustomizeText(value: /* fieldInfo */ Value => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
    
    inline def setDataType(value: DataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setEditorOptions(value: Any): Self = StObject.set(x, "editorOptions", value.asInstanceOf[js.Any])
    
    inline def setEditorOptionsUndefined: Self = StObject.set(x, "editorOptions", js.undefined)
    
    inline def setEditorTemplate(
      value: template | (js.Function2[
          /* conditionInfo */ FieldEditorTemplate, 
          /* container */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "editorTemplate", value.asInstanceOf[js.Any])
    
    inline def setEditorTemplateFunction2(
      value: (/* conditionInfo */ FieldEditorTemplate, /* container */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "editorTemplate", js.Any.fromFunction2(value))
    
    inline def setEditorTemplateUndefined: Self = StObject.set(x, "editorTemplate", js.undefined)
    
    inline def setFalseText(value: String): Self = StObject.set(x, "falseText", value.asInstanceOf[js.Any])
    
    inline def setFalseTextUndefined: Self = StObject.set(x, "falseText", js.undefined)
    
    inline def setFilterOperations(value: js.Array[FilterBuilderOperation | String]): Self = StObject.set(x, "filterOperations", value.asInstanceOf[js.Any])
    
    inline def setFilterOperationsUndefined: Self = StObject.set(x, "filterOperations", js.undefined)
    
    inline def setFilterOperationsVarargs(value: (FilterBuilderOperation | String)*): Self = StObject.set(x, "filterOperations", js.Array(value*))
    
    inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLookup(value: AllowClearing): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
    
    inline def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTrueText(value: String): Self = StObject.set(x, "trueText", value.asInstanceOf[js.Any])
    
    inline def setTrueTextUndefined: Self = StObject.set(x, "trueText", js.undefined)
  }
}
