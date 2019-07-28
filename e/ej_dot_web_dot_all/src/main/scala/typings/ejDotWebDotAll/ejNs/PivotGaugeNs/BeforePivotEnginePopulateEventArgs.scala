package typings.ejDotWebDotAll.ejNs.PivotGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforePivotEnginePopulateEventArgs extends js.Object {
  /** returns the current instance of PivotGauge control.
    */
  var gaugeObject: js.UndefOr[js.Any] = js.undefined
}

object BeforePivotEnginePopulateEventArgs {
  @scala.inline
  def apply(gaugeObject: js.Any = null): BeforePivotEnginePopulateEventArgs = {
    val __obj = js.Dynamic.literal()
    if (gaugeObject != null) __obj.updateDynamic("gaugeObject")(gaugeObject)
    __obj.asInstanceOf[BeforePivotEnginePopulateEventArgs]
  }
}

