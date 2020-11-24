package typings.firmata.anon

import typings.firmata.mod.STEPPER_TYPE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DRIVER extends js.Object {
  
  var DRIVER: STEPPER_TYPE = js.native
  
  var FOUR_WIRE: STEPPER_TYPE = js.native
  
  var TWO_WIRE: STEPPER_TYPE = js.native
}
object DRIVER {
  
  @scala.inline
  def apply(DRIVER: STEPPER_TYPE, FOUR_WIRE: STEPPER_TYPE, TWO_WIRE: STEPPER_TYPE): DRIVER = {
    val __obj = js.Dynamic.literal(DRIVER = DRIVER.asInstanceOf[js.Any], FOUR_WIRE = FOUR_WIRE.asInstanceOf[js.Any], TWO_WIRE = TWO_WIRE.asInstanceOf[js.Any])
    __obj.asInstanceOf[DRIVER]
  }
  
  @scala.inline
  implicit class DRIVEROps[Self <: DRIVER] (val x: Self) extends AnyVal {
    
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
    def setDRIVER(value: STEPPER_TYPE): Self = this.set("DRIVER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFOUR_WIRE(value: STEPPER_TYPE): Self = this.set("FOUR_WIRE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTWO_WIRE(value: STEPPER_TYPE): Self = this.set("TWO_WIRE", value.asInstanceOf[js.Any])
  }
}
