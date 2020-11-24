package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetFontFamiliesRequest extends js.Object {
  
  /**
    * Specifies font families to set. If a font family is not specified, it won't be changed.
    */
  var fontFamilies: FontFamilies = js.native
}
object SetFontFamiliesRequest {
  
  @scala.inline
  def apply(fontFamilies: FontFamilies): SetFontFamiliesRequest = {
    val __obj = js.Dynamic.literal(fontFamilies = fontFamilies.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetFontFamiliesRequest]
  }
  
  @scala.inline
  implicit class SetFontFamiliesRequestOps[Self <: SetFontFamiliesRequest] (val x: Self) extends AnyVal {
    
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
    def setFontFamilies(value: FontFamilies): Self = this.set("fontFamilies", value.asInstanceOf[js.Any])
  }
}
