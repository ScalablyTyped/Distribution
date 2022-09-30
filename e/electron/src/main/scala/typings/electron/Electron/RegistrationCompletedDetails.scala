package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegistrationCompletedDetails extends StObject {
  
  /**
    * The base URL that a service worker is registered for
    */
  var scope: String
}
object RegistrationCompletedDetails {
  
  inline def apply(scope: String): RegistrationCompletedDetails = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegistrationCompletedDetails]
  }
  
  extension [Self <: RegistrationCompletedDetails](x: Self) {
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
