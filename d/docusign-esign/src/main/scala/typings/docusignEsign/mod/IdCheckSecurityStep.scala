package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdCheckSecurityStep extends StObject {
  
  /**
    * Type of authorization used for the security check.
    */
  var authType: js.UndefOr[String] = js.native
}
object IdCheckSecurityStep {
  
  @scala.inline
  def apply(): IdCheckSecurityStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdCheckSecurityStep]
  }
  
  @scala.inline
  implicit class IdCheckSecurityStepMutableBuilder[Self <: IdCheckSecurityStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthType(value: String): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthTypeUndefined: Self = StObject.set(x, "authType", js.undefined)
  }
}
