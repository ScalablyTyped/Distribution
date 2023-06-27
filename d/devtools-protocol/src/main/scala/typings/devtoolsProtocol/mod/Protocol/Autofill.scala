package typings.devtoolsProtocol.mod.Protocol

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Autofill {
  
  trait Address extends StObject {
    
    /**
      * fields and values defining a test address.
      */
    var fields: js.Array[AddressField]
  }
  object Address {
    
    inline def apply(fields: js.Array[AddressField]): Address = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      inline def setFields(value: js.Array[AddressField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: AddressField*): Self = StObject.set(x, "fields", js.Array(value*))
    }
  }
  
  trait AddressField extends StObject {
    
    /**
      * address field name, for example GIVEN_NAME.
      */
    var name: String
    
    /**
      * address field name, for example Jon Doe.
      */
    var value: String
  }
  object AddressField {
    
    inline def apply(name: String, value: String): AddressField = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressField]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddressField] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
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
  
  trait SetAddressesRequest extends StObject {
    
    var addresses: js.Array[Address]
  }
  object SetAddressesRequest {
    
    inline def apply(addresses: js.Array[Address]): SetAddressesRequest = {
      val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetAddressesRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetAddressesRequest] (val x: Self) extends AnyVal {
      
      inline def setAddresses(value: js.Array[Address]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesVarargs(value: Address*): Self = StObject.set(x, "addresses", js.Array(value*))
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
    
    /**
      * Identifies the frame that field belongs to.
      */
    var frameId: js.UndefOr[FrameId] = js.undefined
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
      
      inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
      
      inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
    }
  }
}
