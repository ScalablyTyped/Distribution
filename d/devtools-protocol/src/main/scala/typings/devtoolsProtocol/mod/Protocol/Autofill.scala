package typings.devtoolsProtocol.mod.Protocol

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Autofill {
  
  trait CreditCard extends StObject {
    
    /**
      * 3-digit card verification code.
      */
    var cvc: String
    
    /**
      * 2-digit expiry month.
      */
    var expiryMonth: String
    
    /**
      * 4-digit expiry year.
      */
    var expiryYear: String
    
    /**
      * Name of the credit card owner.
      */
    var name: String
    
    /**
      * 16-digit credit card number.
      */
    var number: String
  }
  object CreditCard {
    
    inline def apply(cvc: String, expiryMonth: String, expiryYear: String, name: String, number: String): CreditCard = {
      val __obj = js.Dynamic.literal(cvc = cvc.asInstanceOf[js.Any], expiryMonth = expiryMonth.asInstanceOf[js.Any], expiryYear = expiryYear.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreditCard]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreditCard] (val x: Self) extends AnyVal {
      
      inline def setCvc(value: String): Self = StObject.set(x, "cvc", value.asInstanceOf[js.Any])
      
      inline def setExpiryMonth(value: String): Self = StObject.set(x, "expiryMonth", value.asInstanceOf[js.Any])
      
      inline def setExpiryYear(value: String): Self = StObject.set(x, "expiryYear", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    }
  }
  
  trait TriggerRequest extends StObject {
    
    /**
      * Credit card information to fill out the form. Credit card data is not saved.
      */
    var card: CreditCard
    
    /**
      * Identifies a field that serves as an anchor for autofill.
      */
    var fieldId: BackendNodeId
  }
  object TriggerRequest {
    
    inline def apply(card: CreditCard, fieldId: BackendNodeId): TriggerRequest = {
      val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], fieldId = fieldId.asInstanceOf[js.Any])
      __obj.asInstanceOf[TriggerRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TriggerRequest] (val x: Self) extends AnyVal {
      
      inline def setCard(value: CreditCard): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      inline def setFieldId(value: BackendNodeId): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
    }
  }
}
