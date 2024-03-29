package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdCheckSecurityStep extends StObject {
  
  /**
    * Type of authorization used for the security check.
    */
  var authType: js.UndefOr[String] = js.undefined
}
object IdCheckSecurityStep {
  
  inline def apply(): IdCheckSecurityStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdCheckSecurityStep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdCheckSecurityStep] (val x: Self) extends AnyVal {
    
    inline def setAuthType(value: String): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
    
    inline def setAuthTypeUndefined: Self = StObject.set(x, "authType", js.undefined)
  }
}
