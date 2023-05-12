package typings.epcis2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityEventsTransformationEventMod {
  
  @JSImport("epcis2.js/entity/events/TransformationEvent", JSImport.Default)
  @js.native
  open class default () extends TransformationEvent
  
  @js.native
  trait TransformationEvent
    extends typings.epcis2Js.entityEventsEventMod.default {
    
    /**
      * Add the epc to the "inputEPCList" field
      * @param epc - the epc to add (e.g urn:epc:id:sgtin:xxxxxx.xxxxx.xxx)
      * @return the transformation event instance
      */
    def addInputEPC(epc: String): TransformationEvent = js.native
    
    /**
      * Add each epc to the "inputEPCList" field
      * @param epcList - the epcs to add
      * (e.g [urn:epc:id:sgtin:xxxxxx.xxxxx.xxx, urn:epc:id:sgtin:xxxxxx.xxxxx.xxy])
      * @return the transformation event instance
      */
    def addInputEPCList(epcList: js.Array[String]): TransformationEvent = js.native
    
    /**
      * Add the quantity to the "inputQuantityList" field
      * @param quantity - the quantity to add
      * @return the transformation event instance
      */
    def addInputQuantity(quantity: typings.epcis2Js.entityModelQuantityElementMod.default): TransformationEvent = js.native
    
    /**
      * Add each quantity to the "inputQuantityList" field
      * @param quantityList - the quantities to add
      * @return the transformation event instance
      */
    def addInputQuantityList(quantityList: js.Array[typings.epcis2Js.entityModelQuantityElementMod.default]): TransformationEvent = js.native
    
    /**
      * Add the epc to the "inputEPCList" field
      * @param epc - the epc to add (e.g urn:epc:id:sgtin:xxxxxx.xxxxx.xxx)
      * @return the transformation event instance
      */
    def addOutputEPC(epc: String): TransformationEvent = js.native
    
    /**
      * Add each epc to the "outputEPCList" field
      * @param epcList - the epcs to add
      * (e.g [urn:epc:id:sgtin:xxxxxx.xxxxx.xxx, urn:epc:id:sgtin:xxxxxx.xxxxx.xxy])
      * @return the transformation event instance
      */
    def addOutputEPCList(epcList: js.Array[String]): TransformationEvent = js.native
    
    /**
      * Add the quantity to the "outputQuantityList" field
      * @param quantity - the quantity to add
      * @return the transformation event instance
      */
    def addOutputQuantity(quantity: typings.epcis2Js.entityModelQuantityElementMod.default): TransformationEvent = js.native
    
    /**
      * Add each quantity to the "outputQuantityList" field
      * @param quantityList - the quantities to add
      * @return the transformation event instance
      */
    def addOutputQuantityList(quantityList: js.Array[typings.epcis2Js.entityModelQuantityElementMod.default]): TransformationEvent = js.native
    
    /**
      * Clear the inputEPCList list
      * @return the transformation event instance
      */
    def clearInputEPCList(): TransformationEvent = js.native
    
    /**
      * Clear the inputQuantityList
      * @return the transformation event instance
      */
    def clearInputQuantityList(): TransformationEvent = js.native
    
    /**
      * Clear the outputEPCList list
      * @return the transformation event instance
      */
    def clearOutputEPCList(): TransformationEvent = js.native
    
    /**
      * Clear the outputQuantityList
      * @return the transformation event instance
      */
    def clearOutputQuantityList(): TransformationEvent = js.native
    
    /**
      * Getter for the inputEPCList property
      * @return - the epcList
      */
    def getInputEPCList(): js.Array[String] = js.native
    
    /**
      * Getter for the inputQuantityList property
      * @return the transformation event instance
      */
    def getInputQuantityList(): TransformationEvent = js.native
    
    /**
      * Getter for the outputEPCList property
      * @return - the epcList
      */
    def getOutputEPCList(): js.Array[String] = js.native
    
    /**
      * Getter for the outputQuantityList property
      * @return the transformation event instance
      */
    def getOutputQuantityList(): TransformationEvent = js.native
    
    /**
      * Getter for the transformationID property
      * @return - the transformationID
      */
    def getTransformationID(): String = js.native
    
    var inputEPCList: Any = js.native
    
    var inputQuantityList: Any = js.native
    
    var outputEPCList: Any = js.native
    
    var outputQuantityList: Any = js.native
    
    /**
      * Remove an epc from the "inputEPCList" field
      * @param epc - the epc to remove (e.g urn:epc:id:sgtin:xxxxxx.xxxxx.xxx)
      * @return the transformation event instance
      */
    def removeInputEPC(epc: String): TransformationEvent = js.native
    
    /**
      * Remove each epc from the "inputEPCList" field
      * @param epcList - the epcs to remove
      * (e.g [urn:epc:id:sgtin:xxxxxx.xxxxx.xxx, urn:epc:id:sgtin:xxxxxx.xxxxx.xxy])
      * @return the transformation event instance
      */
    def removeInputEPCList(epcList: js.Array[String]): TransformationEvent = js.native
    
    /**
      * Remove a quantity from the "inputQuantityList" field
      * @param quantity - the quantity to remove
      * @return the transformation event instance
      */
    def removeInputQuantity(quantity: typings.epcis2Js.entityModelQuantityElementMod.default): TransformationEvent = js.native
    
    /**
      * Remove each quantity from the "inputQuantityList" field
      * @param quantityList - the quantities to remove
      * @return the transformation event instance
      */
    def removeInputQuantityList(quantityList: js.Array[typings.epcis2Js.entityModelQuantityElementMod.default]): TransformationEvent = js.native
    
    /**
      * Remove an epc from the "outputEPCList" field
      * @param epc - the epc to remove (e.g urn:epc:id:sgtin:xxxxxx.xxxxx.xxx)
      * @return the transformation event instance
      */
    def removeOutputEPC(epc: String): TransformationEvent = js.native
    
    /**
      * Remove each epc from the "outputEPCList" field
      * @param epcList - the epcs to remove
      * (e.g [urn:epc:id:sgtin:xxxxxx.xxxxx.xxx, urn:epc:id:sgtin:xxxxxx.xxxxx.xxy])
      * @return the transformation event instance
      */
    def removeOutputEPCList(epcList: js.Array[String]): TransformationEvent = js.native
    
    /**
      * Remove a quantity from the "outputQuantityList" field
      * @param quantity - the quantity to remove
      * @return the transformation event instance
      */
    def removeOutputQuantity(quantity: typings.epcis2Js.entityModelQuantityElementMod.default): TransformationEvent = js.native
    
    /**
      * Remove each quantity from the "outputQuantityList" field
      * @param quantityList - the quantities to remove
      * @return the transformation event instance
      */
    def removeOutputQuantityList(quantityList: js.Array[typings.epcis2Js.entityModelQuantityElementMod.default]): TransformationEvent = js.native
    
    /**
      * Set the transformationID property
      * @param id
      * @return the event instance
      */
    def setTransformationID(id: String): TransformationEvent = js.native
    
    var `type`: String = js.native
  }
}
