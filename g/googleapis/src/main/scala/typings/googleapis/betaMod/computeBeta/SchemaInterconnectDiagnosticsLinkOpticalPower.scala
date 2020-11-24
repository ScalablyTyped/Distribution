package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInterconnectDiagnosticsLinkOpticalPower extends js.Object {
  
  /**
    * The status of the current value when compared to the warning and alarm
    * levels for the receiving or transmitting transceiver. Possible states
    * include:   - OK: The value has not crossed a warning threshold.  -
    * LOW_WARNING: The value has crossed below the low warning threshold.  -
    * HIGH_WARNING: The value has crossed above the high warning threshold.  -
    * LOW_ALARM: The value has crossed below the low alarm threshold.  -
    * HIGH_ALARM: The value has crossed above the high alarm threshold.
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * Value of the current receiving or transmitting optical power, read in
    * dBm. Take a known good optical value, give it a 10% margin and trigger
    * warnings relative to that value. In general, a -7dBm warning and a -11dBm
    * alarm are good optical value estimates for most links.
    */
  var value: js.UndefOr[Double] = js.native
}
object SchemaInterconnectDiagnosticsLinkOpticalPower {
  
  @scala.inline
  def apply(): SchemaInterconnectDiagnosticsLinkOpticalPower = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectDiagnosticsLinkOpticalPower]
  }
  
  @scala.inline
  implicit class SchemaInterconnectDiagnosticsLinkOpticalPowerOps[Self <: SchemaInterconnectDiagnosticsLinkOpticalPower] (val x: Self) extends AnyVal {
    
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
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
