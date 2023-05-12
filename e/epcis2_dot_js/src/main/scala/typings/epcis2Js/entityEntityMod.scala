package typings.epcis2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityEntityMod {
  
  @JSImport("epcis2.js/entity/Entity", JSImport.Default)
  @js.native
  /**
    * You can either create an empty Entity or provide an already existing Entity via Object
    * @param [entity] - The object that will be used to create the entity
    */
  open class default ()
    extends StObject
       with Entity {
    def this(entity: Any) = this()
  }
  
  @js.native
  trait Entity extends StObject {
    
    /**
      * @param key - the key of the extension (e.g 'vendor:example')
      * @param value - the value of the extension
      * @return the entity instance
      */
    def addExtension(key: String, value: String): Entity = js.native
    
    /**
      * Generate an add item to a list function that throws if the item type
      * is different from the expected one(s).
      * @param listFieldName - the field name of the original list
      * @param item - the item you want to add to the list
      * @param expectedTypes - The list of authorized types.
      * @return the Entity instance
      */
    def generateAddItemToListFunction(listFieldName: String, item: Any): Entity = js.native
    def generateAddItemToListFunction(listFieldName: String, item: Any, expectedTypes: js.Array[Any]): Entity = js.native
    
    /**
      * Generate an add items to a list function that throws if the parameter type
      * is different from the expected one(s).
      * @param listFieldName - the field name of the original list
      * @param items - the items you want to add to the list
      * @param expectedTypes - The list of authorized types.
      * @return the Entity instance
      */
    def generateAddItemsToListFunction(listFieldName: String, items: js.Array[Any]): Entity = js.native
    def generateAddItemsToListFunction(listFieldName: String, items: js.Array[Any], expectedTypes: js.Array[Any]): Entity = js.native
    
    /**
      * Generate a setter function that throws if the parameter type is
      * different from the expected one(s).
      * @param field - the field that you want to set
      * @param param - the variable you want to set to the field
      * @param expectedTypes - The list of authorized types.
      * @return the Entity instance
      */
    def generateSetterFunction(field: String, param: Any): Entity = js.native
    def generateSetterFunction(field: String, param: Any, expectedTypes: js.Array[Any]): Entity = js.native
    
    /**
      * Getter for extensions
      * @param key - the key of the extension (e.g 'vendor:example')
      * @return the extension
      */
    def getExtension(key: String): Any = js.native
    
    /**
      * @param key - the key of the extension (e.g 'vendor:example')
      * @return the entity instance
      */
    def removeExtension(key: String): Entity = js.native
    
    /**
      * @return an object corresponding to the Entity object
      */
    def toObject(): Any = js.native
  }
}
