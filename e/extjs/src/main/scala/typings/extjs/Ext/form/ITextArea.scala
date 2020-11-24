package typings.extjs.Ext.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITextArea
  extends typings.extjs.Ext.form.field.IText {
  
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
  implicit class ITextAreaOps[Self <: ITextArea] (val x: Self) extends AnyVal {
    
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
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    
    @scala.inline
    def setEnterIsSpecial(value: Boolean): Self = this.set("enterIsSpecial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterIsSpecial: Self = this.set("enterIsSpecial", js.undefined)
    
    @scala.inline
    def setGetValue(value: () => _): Self = this.set("getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetValue: Self = this.set("getValue", js.undefined)
    
    @scala.inline
    def setPreventScrollbars(value: Boolean): Self = this.set("preventScrollbars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventScrollbars: Self = this.set("preventScrollbars", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setTransformOriginalValue(value: /* value */ js.UndefOr[js.Any] => _): Self = this.set("transformOriginalValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTransformOriginalValue: Self = this.set("transformOriginalValue", js.undefined)
  }
}
