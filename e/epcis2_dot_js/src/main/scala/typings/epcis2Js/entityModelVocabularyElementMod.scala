package typings.epcis2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityModelVocabularyElementMod {
  
  @JSImport("epcis2.js/entity/model/VocabularyElement", JSImport.Default)
  @js.native
  open class default () extends VocabularyElement
  
  @js.native
  trait VocabularyElement
    extends typings.epcis2Js.entityEntityMod.default {
    
    /**
      * Add the attribute to the "attributeList" field
      * @param attribute
      * @return the vocabularyElement instance
      */
    def addAttribute(attribute: typings.epcis2Js.entityModelAttributeElementMod.default): VocabularyElement = js.native
    
    /**
      * Add each attribute to the "attributes" field
      * @param attributeList - the attributes to add
      * @return the vocabularyElement instance
      */
    def addAttributeList(attributeList: js.Array[typings.epcis2Js.entityModelAttributeElementMod.default]): VocabularyElement = js.native
    
    /**
      * Add the child to the "children" field
      * @param child
      * @return the vocabularyElement instance
      */
    def addChild(child: String): VocabularyElement = js.native
    
    /**
      * Add each attribute to the "children" field
      * @param childList - the children to add
      * @return the vocabularyElement instance
      */
    def addChildList(childList: js.Array[String]): VocabularyElement = js.native
    
    var attributes: Any = js.native
    
    var children: Any = js.native
    
    /**
      * Clear the attribute list
      * @return the vocabularyElement instance
      */
    def clearAttributeList(): VocabularyElement = js.native
    
    /**
      * Clear the child list
      * @return the vocabularyElement instance
      */
    def clearChildren(): VocabularyElement = js.native
    
    /**
      * Getter for the attributes property
      * @return the attributes
      */
    def getAttributes(): js.Array[typings.epcis2Js.entityModelAttributeElementMod.default] = js.native
    
    /**
      * Getter for the children property
      * @return the children
      */
    def getChildren(): js.Array[String] = js.native
    
    /**
      * Getter for the id property
      * @return the id
      */
    def getId(): String = js.native
    
    /**
      * Remove an attribute from the "attributes" field
      * @param attribute - the attribute to remove
      * @return the vocabularyElement instance
      */
    def removeAttribute(attribute: typings.epcis2Js.entityModelAttributeElementMod.default): VocabularyElement = js.native
    
    /**
      * Remove each attribute from the "attributes" field
      * @param attributeList - the attributes to remove
      * @return the vocabularyElement instance
      */
    def removeAttributeList(attributeList: js.Array[typings.epcis2Js.entityModelAttributeElementMod.default]): VocabularyElement = js.native
    
    /**
      * Remove a child from the "children" field
      * @param child - the child to remove
      * @return the vocabularyElement instance
      */
    def removeChild(child: String): VocabularyElement = js.native
    
    /**
      * Remove each child from the "children" field
      * @param childList - the children to remove
      * @return the vocabularyElement instance
      */
    def removeChildList(childList: js.Array[String]): VocabularyElement = js.native
    
    /**
      * Set the id property
      * @param id
      * @return the vocabularyElement instance
      */
    def setId(id: String): VocabularyElement = js.native
  }
}
