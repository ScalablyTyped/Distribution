package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * If this describes a specific package/container of the substance
  */
trait SubstanceInstance
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'expiry'.
    */
  var _expiry: js.UndefOr[Element] = js.undefined
  
  /**
    * When no longer valid to use
    */
  var expiry: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Identifier of the package/container
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Amount of substance in the package
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
}
object SubstanceInstance {
  
  @scala.inline
  def apply(): SubstanceInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceInstance]
  }
  
  @scala.inline
  implicit class SubstanceInstanceMutableBuilder[Self <: SubstanceInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpiry(value: dateTime): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    @scala.inline
    def set_expiry(value: Element): Self = StObject.set(x, "_expiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_expiryUndefined: Self = StObject.set(x, "_expiry", js.undefined)
  }
}
