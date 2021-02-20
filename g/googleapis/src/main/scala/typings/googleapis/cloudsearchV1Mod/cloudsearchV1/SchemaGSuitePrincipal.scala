package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGSuitePrincipal extends StObject {
  
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
  implicit class SchemaGSuitePrincipalMutableBuilder[Self <: SchemaGSuitePrincipal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGsuiteDomain(value: Boolean): Self = StObject.set(x, "gsuiteDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGsuiteDomainUndefined: Self = StObject.set(x, "gsuiteDomain", js.undefined)
    
    @scala.inline
    def setGsuiteGroupEmail(value: String): Self = StObject.set(x, "gsuiteGroupEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGsuiteGroupEmailUndefined: Self = StObject.set(x, "gsuiteGroupEmail", js.undefined)
    
    @scala.inline
    def setGsuiteUserEmail(value: String): Self = StObject.set(x, "gsuiteUserEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGsuiteUserEmailUndefined: Self = StObject.set(x, "gsuiteUserEmail", js.undefined)
  }
}
