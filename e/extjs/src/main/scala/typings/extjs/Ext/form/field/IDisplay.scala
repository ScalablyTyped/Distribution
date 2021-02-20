package typings.extjs.Ext.form.field

import org.scalablytyped.runtime.StObject
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
  implicit class IDisplayMutableBuilder[Self <: IDisplay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetRawValue(value: () => String): Self = StObject.set(x, "getRawValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRawValueUndefined: Self = StObject.set(x, "getRawValue", js.undefined)
    
    @scala.inline
    def setHtmlEncode(value: Boolean): Self = StObject.set(x, "htmlEncode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlEncodeUndefined: Self = StObject.set(x, "htmlEncode", js.undefined)
    
    @scala.inline
    def setIsDirty(value: () => Boolean): Self = StObject.set(x, "isDirty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDirtyUndefined: Self = StObject.set(x, "isDirty", js.undefined)
    
    @scala.inline
    def setIsValid(value: () => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    @scala.inline
    def setRenderer(value: js.Any): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    @scala.inline
    def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setValidate(value: () => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
