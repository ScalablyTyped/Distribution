package typings.encodingJapanese.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConvertUnknownOptions extends ConvertOptions {
  
  var bom: js.UndefOr[Boolean | String] = js.native
  
  var from: js.UndefOr[Encoding] = js.native
  
  var to: Encoding = js.native
}
object ConvertUnknownOptions {
  
  @scala.inline
  def apply(to: Encoding): ConvertUnknownOptions = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertUnknownOptions]
  }
  
  @scala.inline
  implicit class ConvertUnknownOptionsOps[Self <: ConvertUnknownOptions] (val x: Self) extends AnyVal {
    
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
    def setBom(value: Boolean | String): Self = this.set("bom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBom: Self = this.set("bom", js.undefined)
    
    @scala.inline
    def setFrom(value: Encoding): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
  }
}
