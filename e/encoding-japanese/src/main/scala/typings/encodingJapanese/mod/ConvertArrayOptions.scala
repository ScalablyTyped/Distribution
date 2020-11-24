package typings.encodingJapanese.mod

import typings.encodingJapanese.encodingJapaneseStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConvertArrayOptions extends ConvertOptions {
  
  var bom: js.UndefOr[Boolean | String] = js.native
  
  var from: js.UndefOr[Encoding] = js.native
  
  var to: Encoding = js.native
  
  var `type`: array = js.native
}
object ConvertArrayOptions {
  
  @scala.inline
  def apply(to: Encoding, `type`: array): ConvertArrayOptions = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertArrayOptions]
  }
  
  @scala.inline
  implicit class ConvertArrayOptionsOps[Self <: ConvertArrayOptions] (val x: Self) extends AnyVal {
    
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
    def setTo(value: Encoding): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: array): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBom(value: Boolean | String): Self = this.set("bom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBom: Self = this.set("bom", js.undefined)
    
    @scala.inline
    def setFrom(value: Encoding): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
  }
}
