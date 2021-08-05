package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountPasswordLockoutDurationMinutes extends StObject {
  
  var maximumMinutes: js.UndefOr[String] = js.undefined
  
  var minimumMinutes: js.UndefOr[String] = js.undefined
}
object AccountPasswordLockoutDurationMinutes {
  
  inline def apply(): AccountPasswordLockoutDurationMinutes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPasswordLockoutDurationMinutes]
  }
  
  extension [Self <: AccountPasswordLockoutDurationMinutes](x: Self) {
    
    inline def setMaximumMinutes(value: String): Self = StObject.set(x, "maximumMinutes", value.asInstanceOf[js.Any])
    
    inline def setMaximumMinutesUndefined: Self = StObject.set(x, "maximumMinutes", js.undefined)
    
    inline def setMinimumMinutes(value: String): Self = StObject.set(x, "minimumMinutes", value.asInstanceOf[js.Any])
    
    inline def setMinimumMinutesUndefined: Self = StObject.set(x, "minimumMinutes", js.undefined)
  }
}
