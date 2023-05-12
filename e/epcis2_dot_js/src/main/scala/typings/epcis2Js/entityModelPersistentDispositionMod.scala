package typings.epcis2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityModelPersistentDispositionMod {
  
  @JSImport("epcis2.js/entity/model/PersistentDisposition", JSImport.Default)
  @js.native
  open class default () extends PersistentDisposition
  
  @js.native
  trait PersistentDisposition
    extends typings.epcis2Js.entityEntityMod.default {
    
    def addExtension(): scala.Nothing = js.native
    
    /**
      * Add the set to the "set" field
      * @param set - the set to add
      * @return the persistentDisposition instance
      */
    def addSet(set: String): PersistentDisposition = js.native
    
    /**
      * Add each set to the "set" field
      * @param setList - the sets to add
      * @return the persistentDisposition instance
      */
    def addSetList(setList: js.Array[String]): PersistentDisposition = js.native
    
    /**
      * Add the unset to the "unset" field
      * @param unset - the unset to add
      * @return the persistentDisposition instance
      */
    def addUnset(unset: String): PersistentDisposition = js.native
    
    /**
      * Add each unset to the "unset" field
      * @param unsetList - the unsets to add
      * @return the persistentDisposition instance
      */
    def addUnsetList(unsetList: js.Array[String]): PersistentDisposition = js.native
    
    /**
      * Clear the set list
      * @return the persistentDisposition instance
      */
    def clearSetList(): PersistentDisposition = js.native
    
    /**
      * Clear the unset list
      * @return the persistentDisposition instance
      */
    def clearUnsetList(): PersistentDisposition = js.native
    
    /**
      * Getter for the set property
      * @return - the set
      */
    def getSet(): js.Array[String] = js.native
    
    /**
      * Getter for the unset property
      * @return - the unset
      */
    def getUnset(): js.Array[String] = js.native
    
    def removeExtension(): scala.Nothing = js.native
    
    /**
      * Remove a set from the "set" field
      * @param set - the set to remove
      * @return the persistentDisposition instance
      */
    def removeSet(set: String): PersistentDisposition = js.native
    
    /**
      * Remove each set from the "set" field
      * @param setList - the sets to remove
      * @return the persistentDisposition instance
      */
    def removeSetList(setList: js.Array[String]): PersistentDisposition = js.native
    
    /**
      * Remove an unset from the "unset" field
      * @param unset - the unset to remove
      * @return the persistentDisposition instance
      */
    def removeUnset(unset: String): PersistentDisposition = js.native
    
    /**
      * Remove each unset from the "unset" field
      * @param unsetList - the unsets to remove
      * @return the persistentDisposition instance
      */
    def removeUnsetList(unsetList: js.Array[String]): PersistentDisposition = js.native
    
    var set: Any = js.native
    
    var unset: Any = js.native
  }
}
