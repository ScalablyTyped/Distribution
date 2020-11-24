package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.Field
import typings.devextreme.anon.SetValue
import typings.devextreme.devextremeStrings.`object`
import typings.devextreme.devextremeStrings.boolean_
import typings.devextreme.devextremeStrings.date
import typings.devextreme.devextremeStrings.datetime
import typings.devextreme.devextremeStrings.number
import typings.devextreme.devextremeStrings.string_
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxFilterBuilderCustomOperation extends js.Object {
  
  /**
    * [descr:dxFilterBuilderCustomOperation.calculateFilterExpression]
    */
  var calculateFilterExpression: js.UndefOr[
    js.Function2[
      /* filterValue */ js.Any, 
      /* field */ dxFilterBuilderField, 
      String | js.Array[_] | js.Function
    ]
  ] = js.native
  
  /**
    * [descr:dxFilterBuilderCustomOperation.caption]
    */
  var caption: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxFilterBuilderCustomOperation.customizeText]
    */
  var customizeText: js.UndefOr[js.Function1[/* fieldInfo */ Field, String]] = js.native
  
  /**
    * [descr:dxFilterBuilderCustomOperation.dataTypes]
    */
  var dataTypes: js.UndefOr[js.Array[string_ | number | date | boolean_ | `object` | datetime]] = js.native
  
  /**
    * [descr:dxFilterBuilderCustomOperation.editorTemplate]
    */
  var editorTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* conditionInfo */ SetValue, /* container */ dxElement, String | Element | JQuery])
  ] = js.native
  
  /**
    * [descr:dxFilterBuilderCustomOperation.hasValue]
    */
  var hasValue: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxFilterBuilderCustomOperation.icon]
    */
  var icon: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxFilterBuilderCustomOperation.name]
    */
  var name: js.UndefOr[String] = js.native
}
object dxFilterBuilderCustomOperation {
  
  @scala.inline
  def apply(): dxFilterBuilderCustomOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFilterBuilderCustomOperation]
  }
  
  @scala.inline
  implicit class dxFilterBuilderCustomOperationOps[Self <: dxFilterBuilderCustomOperation] (val x: Self) extends AnyVal {
    
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
    def setCalculateFilterExpression(
      value: (/* filterValue */ js.Any, /* field */ dxFilterBuilderField) => String | js.Array[_] | js.Function
    ): Self = this.set("calculateFilterExpression", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCalculateFilterExpression: Self = this.set("calculateFilterExpression", js.undefined)
    
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setCustomizeText(value: /* fieldInfo */ Field => String): Self = this.set("customizeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeText: Self = this.set("customizeText", js.undefined)
    
    @scala.inline
    def setDataTypesVarargs(value: (string_ | number | date | boolean_ | `object` | datetime)*): Self = this.set("dataTypes", js.Array(value :_*))
    
    @scala.inline
    def setDataTypes(value: js.Array[string_ | number | date | boolean_ | `object` | datetime]): Self = this.set("dataTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataTypes: Self = this.set("dataTypes", js.undefined)
    
    @scala.inline
    def setEditorTemplateFunction2(value: (/* conditionInfo */ SetValue, /* container */ dxElement) => String | Element | JQuery): Self = this.set("editorTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEditorTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* conditionInfo */ SetValue, /* container */ dxElement, String | Element | JQuery])
    ): Self = this.set("editorTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorTemplate: Self = this.set("editorTemplate", js.undefined)
    
    @scala.inline
    def setHasValue(value: Boolean): Self = this.set("hasValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasValue: Self = this.set("hasValue", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
