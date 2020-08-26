package typings.ejWebAll.ej.PivotGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeforePivotEnginePopulateEventArgs extends js.Object {
  /** returns the current instance of PivotGauge control.
    */
  var gaugeObject: js.UndefOr[js.Any] = js.native
}

object BeforePivotEnginePopulateEventArgs {
  @scala.inline
  def apply(): BeforePivotEnginePopulateEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforePivotEnginePopulateEventArgs]
  }
  @scala.inline
  implicit class BeforePivotEnginePopulateEventArgsOps[Self <: BeforePivotEnginePopulateEventArgs] (val x: Self) extends AnyVal {
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
    def setGaugeObject(value: js.Any): Self = this.set("gaugeObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGaugeObject: Self = this.set("gaugeObject", js.undefined)
  }
  
}

