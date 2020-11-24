package typings.extjs.Ext.form

import typings.extjs.Ext.form.field.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDisplay extends IBase {
  
  /** [Method] Returns the raw value of the field without performing any normalization conversion or validation
    * @returns String value The raw String value of the field
    */
  @JSName("getRawValue")
  var getRawValue_IDisplay: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Config Option] (Boolean) */
  var htmlEncode: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns true if the value of this Field has been changed from its originalValue
    * @returns Boolean True if this field has been changed from its original value (and is not disabled), false otherwise.
    */
  @JSName("isDirty")
  var isDirty_IDisplay: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns whether or not the field value is currently valid by validating the processed raw value of the field
    * @returns Boolean True if the value is valid, else false
    */
  @JSName("isValid")
  var isValid_IDisplay: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value and fires the vali
    * @returns Boolean True if the value is valid, else false
    */
  @JSName("validate")
  var validate_IDisplay: js.UndefOr[js.Function0[Boolean]] = js.native
}
object IDisplay {
  
  @scala.inline
  def apply(): IDisplay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDisplay]
  }
  
  @scala.inline
  implicit class IDisplayOps[Self <: IDisplay] (val x: Self) extends AnyVal {
    
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
    def setGetRawValue(value: () => String): Self = this.set("getRawValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRawValue: Self = this.set("getRawValue", js.undefined)
    
    @scala.inline
    def setHtmlEncode(value: Boolean): Self = this.set("htmlEncode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlEncode: Self = this.set("htmlEncode", js.undefined)
    
    @scala.inline
    def setIsDirty(value: () => Boolean): Self = this.set("isDirty", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsDirty: Self = this.set("isDirty", js.undefined)
    
    @scala.inline
    def setIsValid(value: () => Boolean): Self = this.set("isValid", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsValid: Self = this.set("isValid", js.undefined)
    
    @scala.inline
    def setRenderer(value: js.Any): Self = this.set("renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    
    @scala.inline
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setValidate(value: () => Boolean): Self = this.set("validate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
}
