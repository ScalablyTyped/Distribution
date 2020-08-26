package typings.extjs.Ext.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRadioGroup extends ICheckboxGroup {
  /** [Method] Checks whether the value of the field has changed since the last time it was checked  */
  @JSName("checkChange")
  var checkChange_IRadioGroup: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets the value of the radio group
    * @param value Object The map from names to values to be set.
    * @returns Ext.form.CheckboxGroup this
    */
  @JSName("setValue")
  var setValue_IRadioGroup: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], ICheckboxGroup]] = js.native
}

object IRadioGroup {
  @scala.inline
  def apply(): IRadioGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRadioGroup]
  }
  @scala.inline
  implicit class IRadioGroupOps[Self <: IRadioGroup] (val x: Self) extends AnyVal {
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
    def setCheckChange(value: () => Unit): Self = this.set("checkChange", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCheckChange: Self = this.set("checkChange", js.undefined)
    @scala.inline
    def setSetValue(value: /* value */ js.UndefOr[js.Any] => ICheckboxGroup): Self = this.set("setValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
  }
  
}

