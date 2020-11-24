package typings.flatpickr.instanceMod

import typings.flatpickr.formattingMod.Formats_
import typings.flatpickr.formattingMod.RevFormat_
import typings.flatpickr.formattingMod.TokenRegex_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Formatting extends js.Object {
  
  var formats: Formats_ = js.native
  
  var revFormat: RevFormat_ = js.native
  
  var tokenRegex: TokenRegex_ = js.native
}
object Formatting {
  
  @scala.inline
  def apply(formats: Formats_, revFormat: RevFormat_, tokenRegex: TokenRegex_): Formatting = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], revFormat = revFormat.asInstanceOf[js.Any], tokenRegex = tokenRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formatting]
  }
  
  @scala.inline
  implicit class FormattingOps[Self <: Formatting] (val x: Self) extends AnyVal {
    
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
    def setFormats(value: Formats_): Self = this.set("formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevFormat(value: RevFormat_): Self = this.set("revFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenRegex(value: TokenRegex_): Self = this.set("tokenRegex", value.asInstanceOf[js.Any])
  }
}
