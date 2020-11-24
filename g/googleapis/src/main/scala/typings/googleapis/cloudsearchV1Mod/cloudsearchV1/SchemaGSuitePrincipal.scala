package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGSuitePrincipal extends js.Object {
  
  /**
    * This principal represents all users of the G Suite domain of the
    * customer.
    */
  var gsuiteDomain: js.UndefOr[Boolean] = js.native
  
  /**
    * This principal references a G Suite group account
    */
  var gsuiteGroupEmail: js.UndefOr[String] = js.native
  
  /**
    * This principal references a G Suite user account
    */
  var gsuiteUserEmail: js.UndefOr[String] = js.native
}
object SchemaGSuitePrincipal {
  
  @scala.inline
  def apply(): SchemaGSuitePrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGSuitePrincipal]
  }
  
  @scala.inline
  implicit class SchemaGSuitePrincipalOps[Self <: SchemaGSuitePrincipal] (val x: Self) extends AnyVal {
    
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
    def setGsuiteDomain(value: Boolean): Self = this.set("gsuiteDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGsuiteDomain: Self = this.set("gsuiteDomain", js.undefined)
    
    @scala.inline
    def setGsuiteGroupEmail(value: String): Self = this.set("gsuiteGroupEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGsuiteGroupEmail: Self = this.set("gsuiteGroupEmail", js.undefined)
    
    @scala.inline
    def setGsuiteUserEmail(value: String): Self = this.set("gsuiteUserEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGsuiteUserEmail: Self = this.set("gsuiteUserEmail", js.undefined)
  }
}
