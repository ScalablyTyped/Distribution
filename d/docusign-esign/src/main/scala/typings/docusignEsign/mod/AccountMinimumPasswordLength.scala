package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountMinimumPasswordLength extends StObject {
  
  var maximumLength: js.UndefOr[String] = js.undefined
  
  /**
    * Minimum length of the access code string.
    */
  var minimumLength: js.UndefOr[String] = js.undefined
}
object AccountMinimumPasswordLength {
  
  inline def apply(): AccountMinimumPasswordLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountMinimumPasswordLength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountMinimumPasswordLength] (val x: Self) extends AnyVal {
    
    inline def setMaximumLength(value: String): Self = StObject.set(x, "maximumLength", value.asInstanceOf[js.Any])
    
    inline def setMaximumLengthUndefined: Self = StObject.set(x, "maximumLength", js.undefined)
    
    inline def setMinimumLength(value: String): Self = StObject.set(x, "minimumLength", value.asInstanceOf[js.Any])
    
    inline def setMinimumLengthUndefined: Self = StObject.set(x, "minimumLength", js.undefined)
  }
}
