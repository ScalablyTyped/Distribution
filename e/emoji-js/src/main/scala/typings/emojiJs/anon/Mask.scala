package typings.emojiJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mask extends js.Object {
  
  var mask: Double = js.native
  
  var path: String = js.native
  
  var sheet: String = js.native
  
  var sheet_size: Double = js.native
}
object Mask {
  
  @scala.inline
  def apply(mask: Double, path: String, sheet: String, sheet_size: Double): Mask = {
    val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sheet = sheet.asInstanceOf[js.Any], sheet_size = sheet_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mask]
  }
  
  @scala.inline
  implicit class MaskOps[Self <: Mask] (val x: Self) extends AnyVal {
    
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
    def setMask(value: Double): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheet(value: String): Self = this.set("sheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheet_size(value: Double): Self = this.set("sheet_size", value.asInstanceOf[js.Any])
  }
}
