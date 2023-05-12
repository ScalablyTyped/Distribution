package typings.epcis2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityModelQuantityElementMod {
  
  @JSImport("epcis2.js/entity/model/QuantityElement", JSImport.Default)
  @js.native
  open class default () extends QuantityElement
  
  @js.native
  trait QuantityElement
    extends typings.epcis2Js.entityEntityMod.default {
    
    def addExtension(): scala.Nothing = js.native
    
    /**
      * Getter for the epcClass property
      */
    def getEpcClass(): String = js.native
    
    /**
      * Getter for the quantity property
      */
    def getQuantity(): Double = js.native
    
    /**
      * Getter for the uom property
      */
    def getUom(): String = js.native
    
    def removeExtension(): scala.Nothing = js.native
    
    /**
      * Set the epcClass property
      */
    def setEpcClass(epcClass: String): QuantityElement = js.native
    
    /**
      * Set the quantity property
      * @param quantity (pattern: "^[A-Z0-9]{2,3}$")
      */
    def setQuantity(quantity: Double): QuantityElement = js.native
    
    /**
      * Set the uom property
      * @param uom (pattern: "^[A-Z0-9]{2,3}$")
      */
    def setUom(uom: String): QuantityElement = js.native
  }
}
