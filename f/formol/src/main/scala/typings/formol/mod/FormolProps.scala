package typings.formol.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ReactNode
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormolProps[V] extends js.Object {
  
  var allowUnmodifiedSubmit: js.UndefOr[js.Any] = js.native
  
  var cancelText: js.UndefOr[js.Any] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var classes: js.UndefOr[js.Any] = js.native
  
  var extra: js.UndefOr[ReactNode] = js.native
  
  var i18n: js.UndefOr[js.Any] = js.native
  
  var item: js.UndefOr[V] = js.native
  
  var noCancel: js.UndefOr[js.Any] = js.native
  
  var onSubmit: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var submitText: js.UndefOr[js.Any] = js.native
  
  var types: js.UndefOr[js.Array[String]] = js.native
  
  var validator: js.UndefOr[
    js.Function1[
      /* v */ V, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]:? string | null}
    */ typings.formol.formolStrings.FormolProps with TopLevel[js.Any]
    ]
  ] = js.native
}
object FormolProps {
  
  @scala.inline
  def apply[V](): FormolProps[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormolProps[V]]
  }
  
  @scala.inline
  implicit class FormolPropsOps[Self <: FormolProps[_], V] (val x: Self with FormolProps[V]) extends AnyVal {
    
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
    def setAllowUnmodifiedSubmit(value: js.Any): Self = this.set("allowUnmodifiedSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUnmodifiedSubmit: Self = this.set("allowUnmodifiedSubmit", js.undefined)
    
    @scala.inline
    def setCancelText(value: js.Any): Self = this.set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelText: Self = this.set("cancelText", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClasses(value: js.Any): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setExtra(value: ReactNode): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    
    @scala.inline
    def setI18n(value: js.Any): Self = this.set("i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteI18n: Self = this.set("i18n", js.undefined)
    
    @scala.inline
    def setItem(value: V): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setNoCancel(value: js.Any): Self = this.set("noCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoCancel: Self = this.set("noCancel", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: /* e */ Event => Unit): Self = this.set("onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setSubmitText(value: js.Any): Self = this.set("submitText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitText: Self = this.set("submitText", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[String]): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
    
    @scala.inline
    def setValidator(
      value: /* v */ V => /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]:? string | null}
      */ typings.formol.formolStrings.FormolProps with TopLevel[js.Any]
    ): Self = this.set("validator", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValidator: Self = this.set("validator", js.undefined)
  }
}
