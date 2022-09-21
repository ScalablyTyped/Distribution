package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityUpdateEligible extends StObject {
  
  var securityUpdateEligible: js.UndefOr[Boolean] = js.undefined
  
  var securityUpdateEnabled: js.UndefOr[Boolean] = js.undefined
}
object SecurityUpdateEligible {
  
  inline def apply(): SecurityUpdateEligible = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityUpdateEligible]
  }
  
  extension [Self <: SecurityUpdateEligible](x: Self) {
    
    inline def setSecurityUpdateEligible(value: Boolean): Self = StObject.set(x, "securityUpdateEligible", value.asInstanceOf[js.Any])
    
    inline def setSecurityUpdateEligibleUndefined: Self = StObject.set(x, "securityUpdateEligible", js.undefined)
    
    inline def setSecurityUpdateEnabled(value: Boolean): Self = StObject.set(x, "securityUpdateEnabled", value.asInstanceOf[js.Any])
    
    inline def setSecurityUpdateEnabledUndefined: Self = StObject.set(x, "securityUpdateEnabled", js.undefined)
  }
}
