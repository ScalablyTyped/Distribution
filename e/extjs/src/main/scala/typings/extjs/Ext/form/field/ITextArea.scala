package typings.extjs.Ext.form.field

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITextArea extends IText {
  
  /** [Config Option] (Number) */
  var cols: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean) */
  var enterIsSpecial: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns the current data value of the field
    * @returns Object value The field value
    */
  @JSName("getValue")
  var getValue_ITextArea: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Config Option] (Boolean) */
  var preventScrollbars: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var rows: js.UndefOr[Double] = js.native
  
  /** [Method] Allows for any necessary modifications before the original value is set
    * @param value Object
    * @returns Object The modified initial value
    */
  @JSName("transformOriginalValue")
  var transformOriginalValue_ITextArea: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.native
}
object ITextArea {
  
  @scala.inline
  def apply(): ITextArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextArea]
  }
  
  @scala.inline
  implicit class ITextAreaMutableBuilder[Self <: ITextArea] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    @scala.inline
    def setEnterIsSpecial(value: Boolean): Self = StObject.set(x, "enterIsSpecial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterIsSpecialUndefined: Self = StObject.set(x, "enterIsSpecial", js.undefined)
    
    @scala.inline
    def setGetValue(value: () => _): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    @scala.inline
    def setPreventScrollbars(value: Boolean): Self = StObject.set(x, "preventScrollbars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventScrollbarsUndefined: Self = StObject.set(x, "preventScrollbars", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setTransformOriginalValue(value: /* value */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "transformOriginalValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransformOriginalValueUndefined: Self = StObject.set(x, "transformOriginalValue", js.undefined)
  }
}
