package typings.ds18b20.mod

import typings.ds18b20.ds18b20Strings.decimal
import typings.ds18b20.ds18b20Strings.default
import typings.ds18b20.ds18b20Strings.hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemperatureOptions extends js.Object {
  
  var parser: decimal | default | hex = js.native
}
object TemperatureOptions {
  
  @scala.inline
  def apply(parser: decimal | default | hex): TemperatureOptions = {
    val __obj = js.Dynamic.literal(parser = parser.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemperatureOptions]
  }
  
  @scala.inline
  implicit class TemperatureOptionsOps[Self <: TemperatureOptions] (val x: Self) extends AnyVal {
    
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
    def setParser(value: decimal | default | hex): Self = this.set("parser", value.asInstanceOf[js.Any])
  }
}
