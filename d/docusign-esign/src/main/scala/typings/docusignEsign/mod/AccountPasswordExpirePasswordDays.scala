package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountPasswordExpirePasswordDays extends StObject {
  
  var maximumDays: js.UndefOr[String] = js.undefined
  
  var minimumDays: js.UndefOr[String] = js.undefined
}
object AccountPasswordExpirePasswordDays {
  
  inline def apply(): AccountPasswordExpirePasswordDays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPasswordExpirePasswordDays]
  }
  
  extension [Self <: AccountPasswordExpirePasswordDays](x: Self) {
    
    inline def setMaximumDays(value: String): Self = StObject.set(x, "maximumDays", value.asInstanceOf[js.Any])
    
    inline def setMaximumDaysUndefined: Self = StObject.set(x, "maximumDays", js.undefined)
    
    inline def setMinimumDays(value: String): Self = StObject.set(x, "minimumDays", value.asInstanceOf[js.Any])
    
    inline def setMinimumDaysUndefined: Self = StObject.set(x, "minimumDays", js.undefined)
  }
}
