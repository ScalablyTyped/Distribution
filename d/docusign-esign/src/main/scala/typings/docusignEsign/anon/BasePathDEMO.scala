package typings.docusignEsign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasePathDEMO extends js.Object {
  
  var BasePath: DEMO = js.native
}
object BasePathDEMO {
  
  @scala.inline
  def apply(BasePath: DEMO): BasePathDEMO = {
    val __obj = js.Dynamic.literal(BasePath = BasePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePathDEMO]
  }
  
  @scala.inline
  implicit class BasePathDEMOOps[Self <: BasePathDEMO] (val x: Self) extends AnyVal {
    
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
    def setBasePath(value: DEMO): Self = this.set("BasePath", value.asInstanceOf[js.Any])
  }
}
