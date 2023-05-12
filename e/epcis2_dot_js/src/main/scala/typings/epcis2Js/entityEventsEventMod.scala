package typings.epcis2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityEventsEventMod {
  
  @JSImport("epcis2.js/entity/events/Event", JSImport.Default)
  @js.native
  open class default () extends Event
  
  object fieldToFunctions {
    
    @JSImport("epcis2.js/entity/events/Event", "fieldToFunctions.action")
    @js.native
    val action: js.Array[String] = js.native
    
    @JSImport("epcis2.js/entity/events/Event", "fieldToFunctions.bizLocation")
    @js.native
    val bizLocation: js.Array[String] = js.native
    
    @JSImport("epcis2.js/entity/events/Event", "fieldToFunctions.bizStep")
    @js.native
    val bizStep: js.Array[String] = js.native
    
    @JSImport("epcis2.js/entity/events/Event", "fieldToFunctions.bizTransactionList")
    @js.native
    val bizTransactionList: js.Array[String] = js.native
    
    @JSImport("epcis2.js/entity/events/Event", "fieldToFunctions.childEPCs")
    @js.native
    val childEPCs: js.Array[String] = js.native
    
    @JSImport("epcis2.js/entity/events/Event", "fieldToFunctions.childQuantityList")
    @js.native
    val childQuantityList: js.Array[String] = js.native
    
    @JSImport("epcis2.js/entity/events/Event", "fieldToFunctions.destinationList")
    @js.native
    val destinationList: js.Array[String] = js.native
    
    @JSImport("epcis2.js/entity/events/Event", "fieldToFunctions.disposition")
    @js.native
    val disposition: js.Array[String] = js.native
    
    @JSImport("epcis2.js/entity/events/Event", "fieldToFunctions.epcList")
    @js.native
    val epcList: js.Array[String] = js.native
    
    @JSImport("epcis2.js/entity/events/Event", "fieldToFunctions.ilmd")
    @js.native
    val ilmd: js.Array[String] = js.native
    
    @JSImport("epcis2.js/entity/events/Event", "fieldToFunctions.parentID")
    @js.native
    val parentID: js.Array[String] = js.native
    
    @JSImport("epcis2.js/entity/events/Event", "fieldToFunctions.persistentDisposition")
    @js.native
    val persistentDisposition: js.Array[String] = js.native
    
    @JSImport("epcis2.js/entity/events/Event", "fieldToFunctions.quantityList")
    @js.native
    val quantityList: js.Array[String] = js.native
    
    @JSImport("epcis2.js/entity/events/Event", "fieldToFunctions.readPoint")
    @js.native
    val readPoint: js.Array[String] = js.native
    
    @JSImport("epcis2.js/entity/events/Event", "fieldToFunctions.sensorElementList")
    @js.native
    val sensorElementList: js.Array[String] = js.native
    
    @JSImport("epcis2.js/entity/events/Event", "fieldToFunctions.sourceList")
    @js.native
    val sourceList: js.Array[String] = js.native
  }
  
  @js.native
  trait Event
    extends typings.epcis2Js.entityEntityMod.default {
    
    var `@context`: Any = js.native
    
    /**
      * Add the bizTransaction to the "bizTransactionList" field
      * @param bizTransaction - the bizTransaction to add
      * @return the event instance
      */
    def addBizTransaction(bizTransaction: typings.epcis2Js.entityModelBizTransactionElementMod.default): Event = js.native
    
    /**
      * Add each bizTransaction to the "bizTransactionList" field
      * @param bizTransactionList - the bizTransactions to add
      * @return the event instance
      */
    def addBizTransactionList(bizTransactionList: js.Array[typings.epcis2Js.entityModelBizTransactionElementMod.default]): Event = js.native
    
    /**
      * Add the epc to the "childEPCs" field
      * @param epc - the epc to add (e.g urn:epc:id:sgtin:xxxxxx.xxxxx.xxx)
      * @return the event instance
      */
    def addChildEPC(epc: String): Event = js.native
    
    /**
      * Add each epc to the "childEPCs" field
      * @param epcList - the epcs to add
      * (e.g [urn:epc:id:sgtin:xxxxxx.xxxxx.xxx, urn:epc:id:sgtin:xxxxxx.xxxxx.xxy])
      * @return the event instance
      */
    def addChildEPCList(epcList: js.Array[String]): Event = js.native
    
    /**
      * Add the quantity to the "childQuantityList" field
      * @param quantity - the quantity to add
      * @return the event instance
      */
    def addChildQuantity(quantity: typings.epcis2Js.entityModelQuantityElementMod.default): Event = js.native
    
    /**
      * Add each quantity to the "childQuantityList" field
      * @param quantityList - the quantities to add
      * @return the event instance
      */
    def addChildQuantityList(quantityList: js.Array[typings.epcis2Js.entityModelQuantityElementMod.default]): Event = js.native
    
    /**
      * Add the destination to the "destinationList" field
      * @param destination - the destination to add
      * @return the event instance
      */
    def addDestination(destination: typings.epcis2Js.entityModelDestinationElementMod.default): Event = js.native
    
    /**
      * Add each destinationElement to the "destinationList" field
      * @param destinationList - the destinationElements to add
      * @return the event instance
      */
    def addDestinationList(destinationList: js.Array[typings.epcis2Js.entityModelDestinationElementMod.default]): Event = js.native
    
    /** ************     NOT COMMON TO ALL EVENTS    ********************** */
    /**
      * Add the epc to the "epcList" field
      * @param epc - the epc to add (e.g urn:epc:id:sgtin:xxxxxx.xxxxx.xxx)
      * @return the event instance
      */
    def addEPC(epc: String): Event = js.native
    
    /**
      * Add each epc to the "epcList" field
      * @param epcList - the epcs to add
      * (e.g [urn:epc:id:sgtin:xxxxxx.xxxxx.xxx, urn:epc:id:sgtin:xxxxxx.xxxxx.xxy])
      * @return the event instance
      */
    def addEPCList(epcList: js.Array[String]): Event = js.native
    
    /**
      * Add the quantity to the "quantityList" field
      * @param quantity - the quantity to add
      * @return the event instance
      */
    def addQuantity(quantity: typings.epcis2Js.entityModelQuantityElementMod.default): Event = js.native
    
    /**
      * Add each quantity to the "quantityList" field
      * @param quantityList - the quantities to add
      * @return the event instance
      */
    def addQuantityList(quantityList: js.Array[typings.epcis2Js.entityModelQuantityElementMod.default]): Event = js.native
    
    /**
      * Add the sensorElement to the "sensorElementList" field
      * @param sensorElement - the sensorElement to add
      * @return the event instance
      */
    def addSensorElement(sensorElement: typings.epcis2Js.entityModelSensorSensorElementMod.default): Event = js.native
    
    /**
      * Add each sensorElementElement to the "sensorElementList" field
      * @param sensorElementList - the sensorElementElements to add
      * @return the event instance
      */
    def addSensorElementList(sensorElementList: js.Array[typings.epcis2Js.entityModelSensorSensorElementMod.default]): Event = js.native
    
    /**
      * Add the source to the "sourceList" field
      * @param source - the source to add
      * @return the event instance
      */
    def addSource(source: typings.epcis2Js.entityModelSourceElementMod.default): Event = js.native
    
    /**
      * Add each sourceElement to the "sourceList" field
      * @param sourceList - the sourceElements to add
      * @return the event instance
      */
    def addSourceList(sourceList: js.Array[typings.epcis2Js.entityModelSourceElementMod.default]): Event = js.native
    
    var bizLocation: typings.epcis2Js.entityModelBizLocationMod.default = js.native
    
    var bizTransactionList: Any = js.native
    
    var childEPCs: Any = js.native
    
    var childQuantityList: Any = js.native
    
    /**
      * Clear the bizTransaction list
      * @return the event instance
      */
    def clearBizTransactionList(): Event = js.native
    
    /**
      * Clear the childEPCs
      * @return the event instance
      */
    def clearChildEPCList(): Event = js.native
    
    /**
      * Clear the childQuantityList
      * @return the event instance
      */
    def clearChildQuantityList(): Event = js.native
    
    /**
      * Clear the destination list
      * @return the event instance
      */
    def clearDestinationList(): Event = js.native
    
    /**
      * Clear the epc list
      * @return the event instance
      */
    def clearEPCList(): Event = js.native
    
    /**
      * Clear the quantity list
      * @return the event instance
      */
    def clearQuantityList(): Event = js.native
    
    /**
      * Clear the sensorElement list
      * @return the event instance
      */
    def clearSensorElementList(): Event = js.native
    
    /**
      * Clear the source list
      * @return the event instance
      */
    def clearSourceList(): Event = js.native
    
    var destinationList: Any = js.native
    
    var epcList: Any = js.native
    
    var eventID: String = js.native
    
    var eventTime: String = js.native
    
    var eventTimeZoneOffset: String = js.native
    
    /**
      * Generate an event ID and set the eventID property
      * This method needs to be called once all your field are set since the hash id is generated
      * according to all your fields
      *
      * @param context - the list of context (e.g {
      *    "example": "http://ns.example.com/epcis/",
      *    "example2": "http://ns.example2.com/epcis/",
      * })
      * This param needs to contain all the contexts that are used in the event otherwise this function
      * will throw an error (if throwError is set to true)
      * @param throwError - if set to true, it will throw an error if the event misses some
      * fields for example. Otherwise, it won't throw an error and it will still return the
      * generated id
      * @return the event instance
      */
    def generateHashID(context: js.Object): Event = js.native
    def generateHashID(context: js.Object, throwError: Boolean): Event = js.native
    
    /**
      * Getter for the action property
      * @return the action
      */
    def getAction(): String = js.native
    
    /**
      * Getter for the bizLocation property
      * @return the bizLocation
      */
    def getBizLocation(): typings.epcis2Js.entityModelBizLocationMod.default = js.native
    
    /**
      * Getter for the bizStep property
      * @return the bizStep
      */
    def getBizStep(): String = js.native
    
    /**
      * Getter for the bizTransactionList property
      * @return the bizTransactionList
      */
    def getBizTransactionList(): js.Array[typings.epcis2Js.entityModelBizTransactionElementMod.default] = js.native
    
    /**
      * Getter for the certificationInfo property
      * @return the certificationInfo
      */
    def getCertificationInfo(): String | js.Array[String] = js.native
    
    /**
      * Getter for the childEPCs property
      * @return - the childEpcList
      */
    def getChildEPCList(): js.Array[String] = js.native
    
    /**
      * Getter for the childQuantityList property
      * @return the quantityList
      */
    def getChildQuantityList(): js.Array[typings.epcis2Js.entityModelQuantityElementMod.default] = js.native
    
    /**
      * Getter for the context property
      */
    def getContext(): Any = js.native
    
    /**
      * Getter for the destinationList property
      * @return - the destinationList
      */
    def getDestinationList(): js.Array[typings.epcis2Js.entityModelDestinationElementMod.default] = js.native
    
    /**
      * Getter for the disposition property
      * @return the disposition
      */
    def getDisposition(): String = js.native
    
    /**
      * Getter for the epcList property
      * @return - the epcList
      */
    def getEPCList(): js.Array[String] = js.native
    
    /**
      * Getter for the errorDeclaration property
      */
    def getErrorDeclaration(): typings.epcis2Js.entityModelErrorDeclarationMod.default = js.native
    
    /**
      * Getter for the eventID property
      * @return the eventID
      */
    def getEventID(): String = js.native
    
    /**
      * Getter for the eventTime property
      * @return the eventTime
      */
    def getEventTime(): String = js.native
    
    /**
      * Getter for the eventTimeZoneOffset property
      * @return the eventTimeZoneOffset
      */
    def getEventTimeZoneOffset(): String = js.native
    
    /**
      * Getter for the ilmd property
      * @return - the ilmd
      */
    def getIlmd(): typings.epcis2Js.entityModelIlmdMod.default = js.native
    
    /**
      * Getter for the parentID property
      * @return the parentID
      */
    def getParentId(): String = js.native
    
    /**
      * Getter for the persistentDisposition property
      * @return - the persistentDisposition
      */
    def getPersistentDisposition(): typings.epcis2Js.entityModelPersistentDispositionMod.default = js.native
    
    /**
      * Getter for the quantityList property
      */
    def getQuantityList(): js.Array[typings.epcis2Js.entityModelQuantityElementMod.default] = js.native
    
    /**
      * Getter for the readPoint property
      */
    def getReadPoint(): typings.epcis2Js.entityModelReadPointMod.default = js.native
    
    /**
      * Getter for the recordTime property
      * @return the recordTime
      */
    def getRecordTime(): String = js.native
    
    /**
      * Getter for the sensorElementList property
      * @return SensorElement[]- the sensorElementList
      */
    def getSensorElementList(): js.Array[typings.epcis2Js.entityModelSensorSensorElementMod.default] = js.native
    
    /**
      * Getter for the sourceList property
      * @return - the sourceList
      */
    def getSourceList(): js.Array[typings.epcis2Js.entityModelSourceElementMod.default] = js.native
    
    /**
      * Getter for the type property
      * @return the event type
      */
    def getType(): String = js.native
    
    /**
      * Check if the EPCIS Event respects the rules of the standard defined in
      * src/schema/${EventType}.schema.json
      * @return - true if the Event is valid
      */
    def isValid(): Boolean = js.native
    
    var parentID: String = js.native
    
    var quantityList: Any = js.native
    
    var readPoint: typings.epcis2Js.entityModelReadPointMod.default = js.native
    
    /**
      * Remove a bizTransaction from the "bizTransactionList" field
      * @param bizTransaction - the bizTransaction to remove
      * @return the event instance
      */
    def removeBizTransaction(bizTransaction: typings.epcis2Js.entityModelBizTransactionElementMod.default): Event = js.native
    
    /**
      * Remove each bizTransaction from the "bizTransactionList" field
      * @param bizTransactionList - the bizTransactions to remove
      * @return the event instance
      */
    def removeBizTransactionList(bizTransactionList: js.Array[typings.epcis2Js.entityModelBizTransactionElementMod.default]): Event = js.native
    
    /**
      * Remove an epc from the "childEPCs" field
      * @param epc - the epc to remove (e.g urn:epc:id:sgtin:xxxxxx.xxxxx.xxx)
      * @return the event instance
      */
    def removeChildEPC(epc: String): Event = js.native
    
    /**
      * Remove each epc from the "childEPCs" field
      * @param epcList - the epcs to remove
      * (e.g [urn:epc:id:sgtin:xxxxxx.xxxxx.xxx, urn:epc:id:sgtin:xxxxxx.xxxxx.xxy])
      * @return the event instance
      */
    def removeChildEPCList(epcList: js.Array[String]): Event = js.native
    
    /**
      * Remove a quantity from the "childQuantityList" field
      * @param quantity - the quantity to remove
      * @return the event instance
      */
    def removeChildQuantity(quantity: typings.epcis2Js.entityModelQuantityElementMod.default): Event = js.native
    
    /**
      * Remove each quantity from the "childQuantityList" field
      * @param quantityList - the quantities to remove
      * @return the event instance
      */
    def removeChildQuantityList(quantityList: js.Array[typings.epcis2Js.entityModelQuantityElementMod.default]): Event = js.native
    
    /**
      * Remove a destination from the "destinationList" field
      * @param destination - the destination to remove
      * @return the event instance
      */
    def removeDestination(destination: typings.epcis2Js.entityModelDestinationElementMod.default): Event = js.native
    
    /**
      * Remove each destination from the "destinationList" field
      * @param destinationList - the destinations to remove
      * @return the event instance
      */
    def removeDestinationList(destinationList: js.Array[typings.epcis2Js.entityModelDestinationElementMod.default]): Event = js.native
    
    /**
      * Remove an epc from the "epcList" field
      * @param epc - the epc to remove (e.g urn:epc:id:sgtin:xxxxxx.xxxxx.xxx)
      * @return the event instance
      */
    def removeEPC(epc: String): Event = js.native
    
    /**
      * Remove each epc from the "epcList" field
      * @param epcList - the epcs to remove
      * (e.g [urn:epc:id:sgtin:xxxxxx.xxxxx.xxx, urn:epc:id:sgtin:xxxxxx.xxxxx.xxy])
      * @return the event instance
      */
    def removeEPCList(epcList: js.Array[String]): Event = js.native
    
    /**
      * Remove a quantity from the "quantityList" field
      * @param quantity - the quantity to remove
      * @return the event instance
      */
    def removeQuantity(quantity: typings.epcis2Js.entityModelQuantityElementMod.default): Event = js.native
    
    /**
      * Remove each quantity from the "quantityList" field
      * @param quantityList - the quantities to remove
      * @return the event instance
      */
    def removeQuantityList(quantityList: js.Array[typings.epcis2Js.entityModelQuantityElementMod.default]): Event = js.native
    
    /**
      * Remove a sensorElement from the "sensorElementList" field
      * @param sensorElement - the sensorElement to remove
      * @return the event instance
      */
    def removeSensorElement(sensorElement: typings.epcis2Js.entityModelSensorSensorElementMod.default): Event = js.native
    
    /**
      * Remove each sensorElement from the "sensorElementList" field
      * @param sensorElementList - the sensorElements to remove
      * @return the event instance
      */
    def removeSensorElementList(sensorElementList: js.Array[typings.epcis2Js.entityModelSensorSensorElementMod.default]): Event = js.native
    
    /**
      * Remove a source from the "sourceList" field
      * @param source - the source to remove
      * @return the event instance
      */
    def removeSource(source: typings.epcis2Js.entityModelSourceElementMod.default): Event = js.native
    
    /**
      * Remove each source from the "sourceList" field
      * @param sourceList - the sources to remove
      * @return the event instance
      */
    def removeSourceList(sourceList: js.Array[typings.epcis2Js.entityModelSourceElementMod.default]): Event = js.native
    
    var sensorElementList: Any = js.native
    
    /**
      * Set the action property
      * @param action - string from {"OBSERVE", "ADD", "DELETE"}
      * @return the event instance
      */
    def setAction(action: String): Event = js.native
    
    /**
      * Set the bizLocation property
      * @param bizLocation instance or bizLocation id
      * @return the event instance
      */
    def setBizLocation(bizLocation: String): Event = js.native
    def setBizLocation(bizLocation: typings.epcis2Js.entityModelBizLocationMod.default): Event = js.native
    
    /**
      * Set the bizStep property
      * @param bizStep - e.g bizsteps.accepting
      * @return the event instance
      */
    def setBizStep(bizStep: String): Event = js.native
    
    /**
      * set the certificationInfo property
      * @param certificationInfo
      * @return the event instance
      */
    def setCertificationInfo(certificationInfo: String): Event = js.native
    def setCertificationInfo(certificationInfo: js.Array[String]): Event = js.native
    
    /** ************     COMMON TO ALL EVENTS    ********************** */
    /**
      * Set the context property
      * @param context
      * @return the event instance
      */
    def setContext(context: Any): Event = js.native
    
    /**
      * Set the disposition property
      * @param disposition - e.g dispositions.in_transit
      * @return the event instance
      */
    def setDisposition(disposition: String): Event = js.native
    
    /**
      * Set the errorDeclaration property
      * @return the event instance
      */
    def setErrorDeclaration(errorDeclaration: typings.epcis2Js.entityModelErrorDeclarationMod.default): Event = js.native
    
    /**
      * Set the eventID property
      * @return the event instance
      */
    def setEventID(id: String): Event = js.native
    
    /**
      * Set the eventTime property
      * @param time - a string corresponding to the time
      *      If a timezone offset is provided in the string (e.g '2005-04-03T20:33:31.116-06:00')
      *      and overrideTimeZoneOffset is set to true, the timeZoneOffset field will be set with
      *      the extracted offset (here: '-06:00')
      * @param [overrideTimeZoneOffset = true] - if set to true, the eventTimeZoneOffset
      * field will be overridden with the offset of the given time. Otherwise, it doesn't update it.
      * @return the event instance
      */
    def setEventTime(time: String): Event = js.native
    def setEventTime(time: String, overrideTimeZoneOffset: Boolean): Event = js.native
    
    def setEventTimeZoneOffset(offset: String): Event = js.native
    /**
      * @param offset - the time zone offset
      * (e.g "+02:30" or "-06:00" if it is a string)
      * (e.g -6 or 2.5 if it is a number)
      * @return the event instance
      */
    def setEventTimeZoneOffset(offset: Double): Event = js.native
    
    /**
      * Set the ilmd property
      * @param ilmd object
      * @return the event instance
      */
    def setIlmd(ilmd: typings.epcis2Js.entityModelIlmdMod.default): Event = js.native
    
    /**
      * Set the parentID property
      * @return the event instance
      */
    def setParentId(parentID: String): Event = js.native
    
    /**
      * Set the persistentDisposition property
      * @param persistentDisposition
      * @return the event instance
      */
    def setPersistentDisposition(persistentDisposition: typings.epcis2Js.entityModelPersistentDispositionMod.default): Event = js.native
    
    /**
      * Set the readPoint property
      * @param readPoint id or readPoint instance
      * @return the event instance
      */
    def setReadPoint(readPoint: String): Event = js.native
    def setReadPoint(readPoint: typings.epcis2Js.entityModelReadPointMod.default): Event = js.native
    
    /**
      * Set the recordTime property
      * @param time - a string corresponding to the time
      * @return the event instance
      */
    def setRecordTime(time: String): Event = js.native
    
    var sourceList: Any = js.native
  }
}
