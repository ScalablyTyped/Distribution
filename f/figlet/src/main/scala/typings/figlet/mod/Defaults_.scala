package typings.figlet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Defaults_ extends js.Object {
  
  var font: Fonts_ = js.native
  
  var fontPath: String = js.native
}
object Defaults_ {
  
  @scala.inline
  def apply(font: Fonts_, fontPath: String): Defaults_ = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], fontPath = fontPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Defaults_]
  }
  
  @scala.inline
  implicit class Defaults_Ops[Self <: Defaults_] (val x: Self) extends AnyVal {
    
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
    def setFont(value: Fonts_): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontPath(value: String): Self = this.set("fontPath", value.asInstanceOf[js.Any])
  }
}
