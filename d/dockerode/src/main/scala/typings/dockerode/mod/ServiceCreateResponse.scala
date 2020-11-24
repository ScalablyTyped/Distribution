package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceCreateResponse extends js.Object {
  
  var ID: String = js.native
  
  var Warnings: js.UndefOr[js.Array[String]] = js.native
}
object ServiceCreateResponse {
  
  @scala.inline
  def apply(ID: String): ServiceCreateResponse = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceCreateResponse]
  }
  
  @scala.inline
  implicit class ServiceCreateResponseOps[Self <: ServiceCreateResponse] (val x: Self) extends AnyVal {
    
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
    def setID(value: String): Self = this.set("ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = this.set("Warnings", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = this.set("Warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnings: Self = this.set("Warnings", js.undefined)
  }
}
