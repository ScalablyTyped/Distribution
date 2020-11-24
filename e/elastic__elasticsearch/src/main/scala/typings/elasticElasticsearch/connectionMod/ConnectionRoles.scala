package typings.elasticElasticsearch.connectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionRoles extends js.Object {
  
  var data: js.UndefOr[Boolean] = js.native
  
  var ingest: js.UndefOr[Boolean] = js.native
  
  var master: js.UndefOr[Boolean] = js.native
  
  var ml: js.UndefOr[Boolean] = js.native
}
object ConnectionRoles {
  
  @scala.inline
  def apply(): ConnectionRoles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionRoles]
  }
  
  @scala.inline
  implicit class ConnectionRolesOps[Self <: ConnectionRoles] (val x: Self) extends AnyVal {
    
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
    def setData(value: Boolean): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setIngest(value: Boolean): Self = this.set("ingest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIngest: Self = this.set("ingest", js.undefined)
    
    @scala.inline
    def setMaster(value: Boolean): Self = this.set("master", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaster: Self = this.set("master", js.undefined)
    
    @scala.inline
    def setMl(value: Boolean): Self = this.set("ml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMl: Self = this.set("ml", js.undefined)
  }
}
