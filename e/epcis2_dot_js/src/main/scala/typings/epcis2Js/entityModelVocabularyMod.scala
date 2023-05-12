package typings.epcis2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityModelVocabularyMod {
  
  @JSImport("epcis2.js/entity/model/Vocabulary", JSImport.Default)
  @js.native
  open class default () extends Vocabulary
  
  @js.native
  trait Vocabulary
    extends typings.epcis2Js.entityEntityMod.default {
    
    /**
      * Add the vocabularyElement to the "vocabularyElementList" field
      * @param vocabularyElement - the vocabularyElement to add
      * @return the vocabulary instance
      */
    def addVocabularyElement(vocabularyElement: typings.epcis2Js.entityModelVocabularyElementMod.default): Vocabulary = js.native
    
    /**
      * Add each vocabularyElement to the "vocabularyElementList" field
      * @param vocabularyElementList - the vocabularyElements to add
      * @return the vocabulary instance
      */
    def addVocabularyElementList(vocabularyElementList: js.Array[typings.epcis2Js.entityModelVocabularyElementMod.default]): Vocabulary = js.native
    
    /**
      * Clear the vocabularyElementList list
      * @return the vocabulary instance
      */
    def clearVocabularyElementList(): Vocabulary = js.native
    
    /**
      * Getter for the type property
      * @return  - the type
      */
    def getType(): String = js.native
    
    /**
      * Getter for the vocabularyElementList property
      * @return - the vocabularyElementList
      */
    def getVocabularyElementList(): js.Array[typings.epcis2Js.entityModelVocabularyElementMod.default] = js.native
    
    /**
      * Remove a vocabularyElement from the "vocabularyElementList" field
      * @param vocabularyElement - the vocabularyElement to remove
      * @return the vocabulary instance
      */
    def removeVocabularyElement(vocabularyElement: typings.epcis2Js.entityModelVocabularyElementMod.default): Vocabulary = js.native
    
    /**
      * Remove each vocabularyElement from the "vocabularyElementList" field
      * @param vocabularyElementList - the vocabularyElement to remove
      * @return the vocabulary instance
      */
    def removeVocabularyElementList(vocabularyElementList: js.Array[typings.epcis2Js.entityModelVocabularyElementMod.default]): Vocabulary = js.native
    
    /**
      * Set the type property
      * @param  type
      * @return the vocabulary instance
      */
    def setType(`type`: String): Vocabulary = js.native
    
    var vocabularyElementList: Any = js.native
  }
}
