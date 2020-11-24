package typings.extjs.Ext.picker

import typings.extjs.Ext.Array
import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMonth extends IComponent {
  
  /** [Method] Modify the year display by passing an offset
    * @param offset Number The offset to move by.
    */
  var adjustYear: js.UndefOr[js.Function1[/* offset */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Config Option] (String) */
  var cancelText: js.UndefOr[String] = js.native
  
  /** [Method] Gets the selected value
    * @returns Number[] The selected value
    */
  var getValue: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Checks whether the picker has a selection
    * @returns Boolean Returns true if both a month and year have been selected
    */
  var hasSelection: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Config Option] (String) */
  var okText: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var selectedCls: js.UndefOr[String] = js.native
  
  /** [Method] Set the value for the picker
    * @param value Date/Number[] The value to set. It can be a Date object, where the month/year will be extracted, or it can be an array, with the month as the first index and the year as the second.
    * @returns Ext.picker.Month this
    */
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], this.type]] = js.native
  
  /** [Config Option] (Boolean) */
  var showButtons: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Date/Number[]) */
  var value: js.UndefOr[js.Any] = js.native
}
object IMonth {
  
  @scala.inline
  def apply(): IMonth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMonth]
  }
  
  @scala.inline
  implicit class IMonthOps[Self <: IMonth] (val x: Self) extends AnyVal {
    
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
    def setAdjustYear(value: /* offset */ js.UndefOr[Double] => Unit): Self = this.set("adjustYear", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAdjustYear: Self = this.set("adjustYear", js.undefined)
    
    @scala.inline
    def setCancelText(value: String): Self = this.set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelText: Self = this.set("cancelText", js.undefined)
    
    @scala.inline
    def setGetValue(value: () => Array): Self = this.set("getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetValue: Self = this.set("getValue", js.undefined)
    
    @scala.inline
    def setHasSelection(value: () => Boolean): Self = this.set("hasSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHasSelection: Self = this.set("hasSelection", js.undefined)
    
    @scala.inline
    def setOkText(value: String): Self = this.set("okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOkText: Self = this.set("okText", js.undefined)
    
    @scala.inline
    def setSelectedCls(value: String): Self = this.set("selectedCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedCls: Self = this.set("selectedCls", js.undefined)
    
    @scala.inline
    def setSetValue(value: /* value */ js.UndefOr[js.Any] => IMonth): Self = this.set("setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
    
    @scala.inline
    def setShowButtons(value: Boolean): Self = this.set("showButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowButtons: Self = this.set("showButtons", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
