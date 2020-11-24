package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ulimit extends js.Object {
  
  var Hard: js.UndefOr[Double] = js.native
  
  var Name: js.UndefOr[String] = js.native
  
  var Soft: js.UndefOr[Double] = js.native
}
object Ulimit {
  
  @scala.inline
  def apply(): Ulimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ulimit]
  }
  
  @scala.inline
  implicit class UlimitOps[Self <: Ulimit] (val x: Self) extends AnyVal {
    
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
    def setHard(value: Double): Self = this.set("Hard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHard: Self = this.set("Hard", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setSoft(value: Double): Self = this.set("Soft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoft: Self = this.set("Soft", js.undefined)
  }
}
