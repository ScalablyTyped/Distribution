package typings.epcis2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityModelDestinationElementMod {
  
  @JSImport("epcis2.js/entity/model/DestinationElement", JSImport.Default)
  @js.native
  open class default () extends DestinationElement
  
  @js.native
  trait DestinationElement
    extends typings.epcis2Js.entityEntityMod.default {
    
    def addExtension(): scala.Nothing = js.native
    
    /**
      * Getter for the destination property
      * @return - the destination
      */
    def getDestination(): String = js.native
    
    /**
      * Getter for the type property
      * @return - the type
      */
    def getType(): String = js.native
    
    def removeExtension(): scala.Nothing = js.native
    
    /**
      * Set the destination property
      * @param destination
      * @return the destination instance
      */
    def setDestination(destination: String): DestinationElement = js.native
    
    /**
      * Set the type property
      * @param type
      * @return the destination instance
      */
    def setType(`type`: String): DestinationElement = js.native
  }
}
