package typings.extjs.Ext.form.field

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRadio extends ICheckbox {
  /** [Method] If this radio is part of a group it will return the selected value
    * @returns String
    */
  var getGroupValue: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value s that should be saved to the Ext data Model instance for this field when Ext form Basic updateRe
    * @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
    */
  @JSName("getModelData")
  var getModelData_IRadio: js.UndefOr[js.Function0[_]] = js.native
  /** [Property] (Boolean) */
  var isRadio: js.UndefOr[Boolean] = js.native
  /** [Method] Method to manage awareness of when components are removed from their respective Container firing a removed event  */
  @JSName("onRemoved")
  var onRemoved_IRadio: js.UndefOr[js.Function0[Unit]] = js.native
}

object IRadio {
  @scala.inline
  def apply(): IRadio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRadio]
  }
  @scala.inline
  implicit class IRadioOps[Self <: IRadio] (val x: Self) extends AnyVal {
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
    def setGetGroupValue(value: () => String): Self = this.set("getGroupValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetGroupValue: Self = this.set("getGroupValue", js.undefined)
    @scala.inline
    def setGetModelData(value: () => _): Self = this.set("getModelData", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetModelData: Self = this.set("getModelData", js.undefined)
    @scala.inline
    def setIsRadio(value: Boolean): Self = this.set("isRadio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRadio: Self = this.set("isRadio", js.undefined)
    @scala.inline
    def setOnRemoved(value: () => Unit): Self = this.set("onRemoved", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnRemoved: Self = this.set("onRemoved", js.undefined)
  }
  
}

