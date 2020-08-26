package typings.extjs.Ext.picker

import typings.extjs.Ext.view.IBoundList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITime extends IBoundList {
  /** [Method] Focuses a node in the view
    * @param rec Object
    */
  @JSName("focusNode")
  var focusNode_ITime: js.UndefOr[js.Function1[/* rec */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String) */
  var format: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var increment: js.UndefOr[Double] = js.native
  /** [Config Option] (Date) */
  var maxValue: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Date) */
  var minValue: js.UndefOr[js.Any] = js.native
  /** [Method] Set the maxValue and update the list of available times
    * @param value Date
    */
  var setMaxValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Set the minValue and update the list of available times
    * @param value Date
    */
  var setMinValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Update the list of available times in the list to be constrained within the minValue and maxValue  */
  var updateList: js.UndefOr[js.Function0[Unit]] = js.native
}

object ITime {
  @scala.inline
  def apply(): ITime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITime]
  }
  @scala.inline
  implicit class ITimeOps[Self <: ITime] (val x: Self) extends AnyVal {
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
    def setFocusNode(value: /* rec */ js.UndefOr[js.Any] => Unit): Self = this.set("focusNode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFocusNode: Self = this.set("focusNode", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setIncrement(value: Double): Self = this.set("increment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncrement: Self = this.set("increment", js.undefined)
    @scala.inline
    def setMaxValue(value: js.Any): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    @scala.inline
    def setMinValue(value: js.Any): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    @scala.inline
    def setSetMaxValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = this.set("setMaxValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMaxValue: Self = this.set("setMaxValue", js.undefined)
    @scala.inline
    def setSetMinValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = this.set("setMinValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMinValue: Self = this.set("setMinValue", js.undefined)
    @scala.inline
    def setUpdateList(value: () => Unit): Self = this.set("updateList", js.Any.fromFunction0(value))
    @scala.inline
    def deleteUpdateList: Self = this.set("updateList", js.undefined)
  }
  
}

