package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPProtocol extends js.Object {
  
  var IPProtocol: js.UndefOr[String] = js.native
  
  var ports: js.UndefOr[js.Array[String]] = js.native
}
object IPProtocol {
  
  @scala.inline
  def apply(): IPProtocol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPProtocol]
  }
  
  @scala.inline
  implicit class IPProtocolOps[Self <: IPProtocol] (val x: Self) extends AnyVal {
    
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
    def setIPProtocol(value: String): Self = this.set("IPProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIPProtocol: Self = this.set("IPProtocol", js.undefined)
    
    @scala.inline
    def setPortsVarargs(value: String*): Self = this.set("ports", js.Array(value :_*))
    
    @scala.inline
    def setPorts(value: js.Array[String]): Self = this.set("ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePorts: Self = this.set("ports", js.undefined)
  }
}
