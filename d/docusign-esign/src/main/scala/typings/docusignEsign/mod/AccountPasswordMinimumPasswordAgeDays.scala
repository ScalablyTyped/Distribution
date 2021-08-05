package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountPasswordMinimumPasswordAgeDays extends StObject {
  
  var maximumAge: js.UndefOr[String] = js.undefined
  
  var minimumAge: js.UndefOr[String] = js.undefined
}
object AccountPasswordMinimumPasswordAgeDays {
  
  inline def apply(): AccountPasswordMinimumPasswordAgeDays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPasswordMinimumPasswordAgeDays]
  }
  
  extension [Self <: AccountPasswordMinimumPasswordAgeDays](x: Self) {
    
    inline def setMaximumAge(value: String): Self = StObject.set(x, "maximumAge", value.asInstanceOf[js.Any])
    
    inline def setMaximumAgeUndefined: Self = StObject.set(x, "maximumAge", js.undefined)
    
    inline def setMinimumAge(value: String): Self = StObject.set(x, "minimumAge", value.asInstanceOf[js.Any])
    
    inline def setMinimumAgeUndefined: Self = StObject.set(x, "minimumAge", js.undefined)
  }
}
