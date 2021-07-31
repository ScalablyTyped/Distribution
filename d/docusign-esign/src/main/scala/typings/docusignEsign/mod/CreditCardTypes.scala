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
  
  @scala.inline
  def apply(): CreditCardTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreditCardTypes]
  }
  
  @scala.inline
  implicit class CreditCardTypesMutableBuilder[Self <: CreditCardTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardTypes(value: js.Array[String]): Self = StObject.set(x, "cardTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardTypesUndefined: Self = StObject.set(x, "cardTypes", js.undefined)
    
    @scala.inline
    def setCardTypesVarargs(value: String*): Self = StObject.set(x, "cardTypes", js.Array(value :_*))
  }
}
