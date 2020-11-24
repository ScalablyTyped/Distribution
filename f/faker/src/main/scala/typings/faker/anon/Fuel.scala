package typings.faker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fuel extends js.Object {
  
  def color(): String = js.native
  
  def fuel(): String = js.native
  
  def manufacturer(): String = js.native
  
  def model(): String = js.native
  
  def `type`(): String = js.native
  
  def vehicle(): String = js.native
  
  def vin(): String = js.native
}
object Fuel {
  
  @scala.inline
  def apply(
    color: () => String,
    fuel: () => String,
    manufacturer: () => String,
    model: () => String,
    `type`: () => String,
    vehicle: () => String,
    vin: () => String
  ): Fuel = {
    val __obj = js.Dynamic.literal(color = js.Any.fromFunction0(color), fuel = js.Any.fromFunction0(fuel), manufacturer = js.Any.fromFunction0(manufacturer), model = js.Any.fromFunction0(model), vehicle = js.Any.fromFunction0(vehicle), vin = js.Any.fromFunction0(vin))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[Fuel]
  }
  
  @scala.inline
  implicit class FuelOps[Self <: Fuel] (val x: Self) extends AnyVal {
    
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
    def setColor(value: () => String): Self = this.set("color", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFuel(value: () => String): Self = this.set("fuel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setManufacturer(value: () => String): Self = this.set("manufacturer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setModel(value: () => String): Self = this.set("model", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: () => String): Self = this.set("type", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVehicle(value: () => String): Self = this.set("vehicle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVin(value: () => String): Self = this.set("vin", js.Any.fromFunction0(value))
  }
}
