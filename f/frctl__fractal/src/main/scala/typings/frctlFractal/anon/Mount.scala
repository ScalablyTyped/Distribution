package typings.frctlFractal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mount extends js.Object {
  
  var mount: js.UndefOr[String] = js.native
}
object Mount {
  
  @scala.inline
  def apply(): Mount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mount]
  }
  
  @scala.inline
  implicit class MountOps[Self <: Mount] (val x: Self) extends AnyVal {
    
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
    def setMount(value: String): Self = this.set("mount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMount: Self = this.set("mount", js.undefined)
  }
}
