package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreditCardTypes extends StObject {
  
  /**
    * An array containing supported credit card types.
    */
  var cardTypes: js.UndefOr[js.Array[String]] = js.undefined
}
object CreditCardTypes {
  
  inline def apply(): CreditCardTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreditCardTypes]
  }
  
  extension [Self <: CreditCardTypes](x: Self) {
    
    inline def setCardTypes(value: js.Array[String]): Self = StObject.set(x, "cardTypes", value.asInstanceOf[js.Any])
    
    inline def setCardTypesUndefined: Self = StObject.set(x, "cardTypes", js.undefined)
    
    inline def setCardTypesVarargs(value: String*): Self = StObject.set(x, "cardTypes", js.Array(value :_*))
  }
}
