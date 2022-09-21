package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.common.DataType
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.dxFilterBuilder.CustomOperationEditorTemplate
import typings.devextreme.mod.DevExpress.ui.dxFilterBuilder.Field
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxFilterBuilderCustomOperation extends StObject {
  
  /**
    * Specifies a function that returns a filter expression for this custom operation.
    */
  var calculateFilterExpression: js.UndefOr[
    js.Function2[/* filterValue */ Any, /* field */ Field, String | js.Array[Any] | js.Function]
  ] = js.undefined
  
  /**
    * Specifies the operation&apos;s caption.
    */
  var caption: js.UndefOr[String] = js.undefined
  
  /**
    * Customizes the field value&apos;s text representation.
    */
  var customizeText: js.UndefOr[js.Function1[/* fieldInfo */ typings.devextreme.anon.Field, String]] = js.undefined
  
  /**
    * Specifies for which data types the operation is available by default.
    */
  var dataTypes: js.UndefOr[js.Array[DataType]] = js.undefined
  
  /**
    * Specifies a custom template for the UI component used to edit the field value.
    */
  var editorTemplate: js.UndefOr[
    template | (js.Function2[
      /* conditionInfo */ CustomOperationEditorTemplate, 
      /* container */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies whether the operation can have a value. If it can, the editor is displayed.
    */
  var hasValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the icon that should represent the filter operation.
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the operation&apos;s identifier.
    */
  var name: js.UndefOr[String] = js.undefined
}
object dxFilterBuilderCustomOperation {
  
  inline def apply(): dxFilterBuilderCustomOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFilterBuilderCustomOperation]
  }
  
  extension [Self <: dxFilterBuilderCustomOperation](x: Self) {
    
    inline def setCalculateFilterExpression(value: (/* filterValue */ Any, /* field */ Field) => String | js.Array[Any] | js.Function): Self = StObject.set(x, "calculateFilterExpression", js.Any.fromFunction2(value))
    
    inline def setCalculateFilterExpressionUndefined: Self = StObject.set(x, "calculateFilterExpression", js.undefined)
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setCustomizeText(value: /* fieldInfo */ typings.devextreme.anon.Field => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setDataTypes(value: js.Array[DataType]): Self = StObject.set(x, "dataTypes", value.asInstanceOf[js.Any])
    
    inline def setDataTypesUndefined: Self = StObject.set(x, "dataTypes", js.undefined)
    
    inline def setDataTypesVarargs(value: DataType*): Self = StObject.set(x, "dataTypes", js.Array(value*))
    
    inline def setEditorTemplate(
      value: template | (js.Function2[
          /* conditionInfo */ CustomOperationEditorTemplate, 
          /* container */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "editorTemplate", value.asInstanceOf[js.Any])
    
    inline def setEditorTemplateFunction2(
      value: (/* conditionInfo */ CustomOperationEditorTemplate, /* container */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "editorTemplate", js.Any.fromFunction2(value))
    
    inline def setEditorTemplateUndefined: Self = StObject.set(x, "editorTemplate", js.undefined)
    
    inline def setHasValue(value: Boolean): Self = StObject.set(x, "hasValue", value.asInstanceOf[js.Any])
    
    inline def setHasValueUndefined: Self = StObject.set(x, "hasValue", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
