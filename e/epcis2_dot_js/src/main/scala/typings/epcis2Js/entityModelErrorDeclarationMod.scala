package typings.epcis2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityModelErrorDeclarationMod {
  
  @JSImport("epcis2.js/entity/model/ErrorDeclaration", JSImport.Default)
  @js.native
  open class default () extends ErrorDeclaration
  
  @js.native
  trait ErrorDeclaration
    extends typings.epcis2Js.entityEntityMod.default {
    
    /**
      * Add the correctiveEventID to the "correctiveEventIDs" field
      * @param correctiveEventID - the correctiveEventID to add
      * (e.g urn:uuid:404d95fc-9457-4a51-bd6a-0bba133845a8)
      * @return the errorDeclaration instance
      */
    def addCorrectiveEventID(correctiveEventID: String): ErrorDeclaration = js.native
    
    /**
      * Add each correctiveEventID to the "correctiveEventIDs" field
      * @param correctiveEventIDList - the correctiveEventIDs to add
      * (e.g [urn:uuid:404d95fc-9457-4a51-bd6a-0bba133845a8,
      * urn:uuid:404d95fc-9457-4a51-bd6a-0bba133845a7])
      * @return the errorDeclaration instance
      */
    def addCorrectiveEventIDList(correctiveEventIDList: js.Array[String]): ErrorDeclaration = js.native
    
    /**
      * Clear the correctiveEventID list
      * @return the errorDeclaration instance
      */
    def clearCorrectiveEventIDList(): ErrorDeclaration = js.native
    
    var correctiveEventIDs: Any = js.native
    
    /**
      * Getter for the correctiveEventIDs property
      * @return - the correctiveEventIDs
      */
    def getCorrectiveEventIDs(): js.Array[String] = js.native
    
    /**
      * Getter for the declarationTime property
      * @return - the declarationTime
      */
    def getDeclarationTime(): String = js.native
    
    /**
      * Getter for the reason property
      * @return - the reason
      */
    def getReason(): String = js.native
    
    /**
      * Remove a correctiveEventID from the "correctiveEventIDs" field
      * @param correctiveEventID - the correctiveEventID to remove
      * (e.g urn:uuid:404d95fc-9457-4a51-bd6a-0bba133845a8)
      * @return the errorDeclaration instance
      */
    def removeCorrectiveEventID(correctiveEventID: String): ErrorDeclaration = js.native
    
    /**
      * Remove each correctiveEventID from the "correctiveEventIDs" field
      * @param correctiveEventIDList - the correctiveEventIDs to remove
      * (e.g [urn:uuid:404d95fc-9457-4a51-bd6a-0bba133845a8,
      * urn:uuid:404d95fc-9457-4a51-bd6a-0bba133845a7])
      * @return the errorDeclaration instance
      */
    def removeCorrectiveEventIDList(correctiveEventIDList: js.Array[String]): ErrorDeclaration = js.native
    
    /**
      * Set the declarationTime property
      * @param time - a string corresponding to the time
      * @return the errorDeclaration instance
      */
    def setDeclarationTime(time: String): ErrorDeclaration = js.native
    
    /**
      * Set the reason property
      * @param reason - the reason (e.g 'incorrect_data')
      * @return the errorDeclaration instance
      */
    def setReason(reason: String): ErrorDeclaration = js.native
  }
}
