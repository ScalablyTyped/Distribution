package typings.epcis2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityModelAttributeElementMod {
  
  @JSImport("epcis2.js/entity/model/AttributeElement", JSImport.Default)
  @js.native
  open class default () extends AttributeElement
  
  @js.native
  trait AttributeElement
    extends typings.epcis2Js.entityEntityMod.default {
    
    /**
      * Getter for the attribute property
      * @return - the attribute
      */
    def getAttribute(): String = js.native
    
    /**
      * Getter for the id property
      * @return - the id
      */
    def getId(): String = js.native
    
    /**
      * Set the attribute property
      * @param attribute
      * @return the attributeElement instance
      */
    def setAttribute(attribute: String): AttributeElement = js.native
    
    /**
      * Set the id property
      * @param id
      * @return the attributeElement instance
      */
    def setId(id: String): AttributeElement = js.native
  }
}
