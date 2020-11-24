package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecretSpec extends Annotations {
  
  var Data: js.UndefOr[String] = js.native
  
  var Driver: js.UndefOr[typings.dockerode.mod.Driver] = js.native
  
  var Templating: js.UndefOr[Driver] = js.native
}
object SecretSpec {
  
  @scala.inline
  def apply(): SecretSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretSpec]
  }
  
  @scala.inline
  implicit class SecretSpecOps[Self <: SecretSpec] (val x: Self) extends AnyVal {
    
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
    def setData(value: String): Self = this.set("Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("Data", js.undefined)
    
    @scala.inline
    def setDriver(value: Driver): Self = this.set("Driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriver: Self = this.set("Driver", js.undefined)
    
    @scala.inline
    def setTemplating(value: Driver): Self = this.set("Templating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplating: Self = this.set("Templating", js.undefined)
  }
}
