package typings.electronNotarize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransporterOptions extends js.Object {
  
  var ascProvider: js.UndefOr[String] = js.native
}
object TransporterOptions {
  
  @scala.inline
  def apply(): TransporterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransporterOptions]
  }
  
  @scala.inline
  implicit class TransporterOptionsOps[Self <: TransporterOptions] (val x: Self) extends AnyVal {
    
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
    def setAscProvider(value: String): Self = this.set("ascProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAscProvider: Self = this.set("ascProvider", js.undefined)
  }
}
