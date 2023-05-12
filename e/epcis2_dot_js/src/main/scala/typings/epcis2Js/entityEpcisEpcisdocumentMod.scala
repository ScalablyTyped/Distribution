package typings.epcis2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityEpcisEpcisdocumentMod {
  
  @JSImport("epcis2.js/entity/epcis/EPCISDocument", JSImport.Default)
  @js.native
  open class default () extends EPCISDocument
  
  @js.native
  trait EPCISDocument
    extends typings.epcis2Js.entityEntityMod.default {
    
    var `@context`: Any = js.native
    
    /**
      * Add the event to the "eventList" field
      * @param event - the event to add
      * @return the epcisDocument instance
      */
    def addEvent(event: typings.epcis2Js.entityEventsEventMod.default): EPCISDocument = js.native
    
    /**
      * Add each event to the "eventList" field
      * @param eventList - the events to add
      * @return the epcisDocument instance
      */
    def addEventList(eventList: js.Array[typings.epcis2Js.entityEventsEventMod.default]): EPCISDocument = js.native
    
    /**
      * Clear the vocabularyList list
      * @return the epcisDocument instance
      */
    def clearEventList(): EPCISDocument = js.native
    
    var eventList: Any = js.native
    
    /**
      * Getter for the context property
      */
    def getContext(): Any = js.native
    
    /**
      * Getter for the creationDate property
      */
    def getCreationDate(): String = js.native
    
    /**
      * Getter for the epcisHeader property
      * @return the epcisHeader
      */
    def getEPCISHeader(): typings.epcis2Js.entityEpcisEpcisheaderMod.default = js.native
    
    /**
      * Getter for the eventList property
      * @return the eventList
      */
    def getEventList(): js.Array[typings.epcis2Js.entityEventsEventMod.default] = js.native
    
    /**
      * Getter for the id property
      */
    def getId(): String = js.native
    
    /**
      * Getter for the instanceIdentifier property
      * @return the instanceIdentifier
      */
    def getInstanceIdentifier(): String = js.native
    
    /**
      * Getter for the receiver property
      */
    def getReceiver(): String = js.native
    
    /**
      * Getter for the schemaVersion property
      */
    def getSchemaVersion(): String = js.native
    
    /**
      * Getter for the sender property
      */
    def getSender(): String = js.native
    
    /**
      * Getter for the type property
      * @return the type property
      */
    def getType(): String = js.native
    
    /**
      * Check if the EPCISDocument respects the rules of the standard defined in
      * src/schema/EPCISDocument.schema.json
      * @return true if the EPCIS document is valid
      */
    def isValid(): Boolean = js.native
    
    /**
      * Remove the event from the "eventList" field
      * @param event - the events to remove
      * @return the epcisDocument instance
      */
    def removeEvent(event: typings.epcis2Js.entityEventsEventMod.default): EPCISDocument = js.native
    
    /**
      * Remove each event from the "eventList" field
      * @param eventList - the events to remove
      * @return the epcisDocument instance
      */
    def removeEventList(eventList: js.Array[typings.epcis2Js.entityEventsEventMod.default]): EPCISDocument = js.native
    
    /**
      * Set the context property, and add the default context if it is not provided
      * @return the epcisDocument instance
      */
    def setContext(context: Any): EPCISDocument = js.native
    
    /**
      * Set the creationDate property
      * @return the epcisDocument instance
      */
    def setCreationDate(creationDate: String): EPCISDocument = js.native
    
    /**
      * Set the epcisHeader property
      * @param epcisHeader
      * @return the epcisDocument instance
      */
    def setEPCISHeader(epcisHeader: typings.epcis2Js.entityEpcisEpcisheaderMod.default): EPCISDocument = js.native
    
    /**
      * Set the id property
      * @return the epcisDocument instance
      */
    def setId(id: String): EPCISDocument = js.native
    
    /**
      * Set the instanceIdentifier property
      * @return the epcisDocument instance
      */
    def setInstanceIdentifier(instanceIdentifier: String): EPCISDocument = js.native
    
    /**
      * Set the receiver property
      * @return the epcisDocument instance
      */
    def setReceiver(receiver: String): EPCISDocument = js.native
    
    /**
      * Set the schemaVersion property
      * @return the epcisDocument instance
      */
    def setSchemaVersion(schemaVersion: String): EPCISDocument = js.native
    
    /**
      * Set the sender property
      * @return the epcisDocument instance
      */
    def setSender(sender: String): EPCISDocument = js.native
    
    /**
      * Set the type property
      * @return the epcisDocument instance
      */
    def setType(`type`: String): EPCISDocument = js.native
    
    var `type`: String = js.native
  }
}
