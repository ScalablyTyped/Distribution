package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Architecture extends js.Object {
  
  var Architecture: String = js.native
  
  var OS: String = js.native
}
object Architecture {
  
  @scala.inline
  def apply(Architecture: String, OS: String): Architecture = {
    val __obj = js.Dynamic.literal(Architecture = Architecture.asInstanceOf[js.Any], OS = OS.asInstanceOf[js.Any])
    __obj.asInstanceOf[Architecture]
  }
  
  @scala.inline
  implicit class ArchitectureOps[Self <: Architecture] (val x: Self) extends AnyVal {
    
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
    def setArchitecture(value: String): Self = this.set("Architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOS(value: String): Self = this.set("OS", value.asInstanceOf[js.Any])
  }
}
