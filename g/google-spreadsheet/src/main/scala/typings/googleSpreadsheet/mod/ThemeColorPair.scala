package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeColorPair extends js.Object {
  
  var color: ColorStyle = js.native
  
  var colorType: ThemeColorType = js.native
}
object ThemeColorPair {
  
  @scala.inline
  def apply(color: ColorStyle, colorType: ThemeColorType): ThemeColorPair = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], colorType = colorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeColorPair]
  }
  
  @scala.inline
  implicit class ThemeColorPairOps[Self <: ThemeColorPair] (val x: Self) extends AnyVal {
    
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
    def setColor(value: ColorStyle): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorType(value: ThemeColorType): Self = this.set("colorType", value.asInstanceOf[js.Any])
  }
}
