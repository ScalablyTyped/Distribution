package typings.epcis2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityEpcisEpcismasterdataMod {
  
  @JSImport("epcis2.js/entity/epcis/EPCISMasterData", JSImport.Default)
  @js.native
  open class default () extends EPCISMasterData
  
  @js.native
  trait EPCISMasterData
    extends typings.epcis2Js.entityEntityMod.default {
    
    /**
      * Add the vocabulary to the "vocabularyList" field
      * @param vocabulary - the vocabulary to add
      * @return the epcis master data instance
      */
    def addVocabulary(vocabulary: typings.epcis2Js.entityModelVocabularyMod.default): EPCISMasterData = js.native
    
    /**
      * Add each vocabulary to the "vocabularyList" field
      * @param vocabularyList - the vocabularies to add
      * @return the epcis master data instance
      */
    def addVocabularyList(vocabularyList: js.Array[typings.epcis2Js.entityModelVocabularyMod.default]): EPCISMasterData = js.native
    
    /**
      * Clear the vocabularyList list
      * @return the epcis master data instance
      */
    def clearVocabularyList(): EPCISMasterData = js.native
    
    /**
      * Getter for the vocabularyList property
      */
    def getVocabularyList(): js.Array[typings.epcis2Js.entityModelVocabularyMod.default] = js.native
    
    /**
      * Remove a vocabulary from the "vocabularyList" field
      * @param vocabulary - the vocabularyList to remove
      * @return the epcis master data instance
      */
    def removeVocabulary(vocabulary: typings.epcis2Js.entityModelVocabularyMod.default): EPCISMasterData = js.native
    
    /**
      * Remove each vocabulary from the "vocabularyList" field
      * @param vocabularyList - the vocabularies to remove
      * @return the epcis master data instance
      */
    def removeVocabularyList(vocabularyList: js.Array[typings.epcis2Js.entityModelVocabularyMod.default]): EPCISMasterData = js.native
    
    var vocabularyList: Any = js.native
  }
}
