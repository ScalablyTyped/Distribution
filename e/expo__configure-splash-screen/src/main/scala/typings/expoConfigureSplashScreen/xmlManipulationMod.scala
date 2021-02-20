package typings.expoConfigureSplashScreen

import typings.expoConfigureSplashScreen.anon.DeletionFlag
import typings.expoConfigureSplashScreen.anon.DisregardComments
import typings.expoConfigureSplashScreen.anon.Idx
import typings.std.Record
import typings.xmlJs.mod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlManipulationMod {
  
  @JSImport("@expo/configure-splash-screen/build/xml-manipulation", "mergeXmlElements")
  @js.native
  def mergeXmlElements(current: Element, expected: ExpectedElement): Element = js.native
  
  @JSImport("@expo/configure-splash-screen/build/xml-manipulation", "readXmlFile")
  @js.native
  def readXmlFile(filePath: String): js.Promise[Element] = js.native
  @JSImport("@expo/configure-splash-screen/build/xml-manipulation", "readXmlFile")
  @js.native
  def readXmlFile(filePath: String, fallbackContent: String): js.Promise[Element] = js.native
  @JSImport("@expo/configure-splash-screen/build/xml-manipulation", "readXmlFile")
  @js.native
  def readXmlFile(filePath: String, fallbackContent: Element): js.Promise[Element] = js.native
  
  @JSImport("@expo/configure-splash-screen/build/xml-manipulation", "writeXmlFile")
  @js.native
  def writeXmlFile(filePath: String, xml: Element): js.Promise[Unit] = js.native
  
  @JSImport("@expo/configure-splash-screen/build/xml-manipulation", "writeXmlFileOrRemoveFileUponNoResources")
  @js.native
  def writeXmlFileOrRemoveFileUponNoResources(filePath: String, element: Element): js.Promise[Unit] = js.native
  @JSImport("@expo/configure-splash-screen/build/xml-manipulation", "writeXmlFileOrRemoveFileUponNoResources")
  @js.native
  def writeXmlFileOrRemoveFileUponNoResources(filePath: String, element: Element, hasDisregardComments: DisregardComments): js.Promise[Unit] = js.native
  
  @JSImport("@expo/configure-splash-screen/build/xml-manipulation", "xmlElementsEqual")
  @js.native
  def xmlElementsEqual(a: Element, b: Element): Boolean = js.native
  @JSImport("@expo/configure-splash-screen/build/xml-manipulation", "xmlElementsEqual")
  @js.native
  def xmlElementsEqual(a: Element, b: Element, hasDisregardComments: DisregardComments): Boolean = js.native
  
  @js.native
  trait ExpectedCommentType extends ExpectedElement {
    
    var comment: String = js.native
  }
  object ExpectedCommentType {
    
    @scala.inline
    def apply(comment: String): ExpectedCommentType = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpectedCommentType]
    }
    
    @scala.inline
    implicit class ExpectedCommentTypeMutableBuilder[Self <: ExpectedCommentType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.expoConfigureSplashScreen.xmlManipulationMod.ExpectedElementType
    - typings.expoConfigureSplashScreen.xmlManipulationMod.ExpectedElementsType
    - typings.expoConfigureSplashScreen.xmlManipulationMod.ExpectedCommentType
    - typings.expoConfigureSplashScreen.xmlManipulationMod.ExpectedTextType
  */
  trait ExpectedElement extends StObject
  object ExpectedElement {
    
    @scala.inline
    def ExpectedCommentType(comment: String): typings.expoConfigureSplashScreen.xmlManipulationMod.ExpectedCommentType = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.expoConfigureSplashScreen.xmlManipulationMod.ExpectedCommentType]
    }
    
    @scala.inline
    def ExpectedElementType(name: String): typings.expoConfigureSplashScreen.xmlManipulationMod.ExpectedElementType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.expoConfigureSplashScreen.xmlManipulationMod.ExpectedElementType]
    }
    
    @scala.inline
    def ExpectedElementsType(elements: ExpectedElements): typings.expoConfigureSplashScreen.xmlManipulationMod.ExpectedElementsType = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.expoConfigureSplashScreen.xmlManipulationMod.ExpectedElementsType]
    }
    
    @scala.inline
    def ExpectedTextType(text: String | Double | Boolean): typings.expoConfigureSplashScreen.xmlManipulationMod.ExpectedTextType = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.expoConfigureSplashScreen.xmlManipulationMod.ExpectedTextType]
    }
  }
  
  type ExpectedElementAttributes = Record[String, WithExplicitNewValue[js.UndefOr[String | Double]]]
  
  @js.native
  trait ExpectedElementType extends ExpectedElement {
    
    var attributes: js.UndefOr[ExpectedElementAttributes] = js.native
    
    var elements: js.UndefOr[ExpectedElements] = js.native
    
    var name: String = js.native
  }
  object ExpectedElementType {
    
    @scala.inline
    def apply(name: String): ExpectedElementType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpectedElementType]
    }
    
    @scala.inline
    implicit class ExpectedElementTypeMutableBuilder[Self <: ExpectedElementType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: ExpectedElementAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setElements(value: ExpectedElements): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
      
      @scala.inline
      def setElementsVarargs(value: WithExplicitIndex[WithDeletionFlag[ExpectedElement]]*): Self = StObject.set(x, "elements", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type ExpectedElements = WithExplicitNewValue[js.Array[WithExplicitIndex[WithDeletionFlag[ExpectedElement]]]]
  
  @js.native
  trait ExpectedElementsType extends ExpectedElement {
    
    var elements: ExpectedElements = js.native
  }
  object ExpectedElementsType {
    
    @scala.inline
    def apply(elements: ExpectedElements): ExpectedElementsType = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpectedElementsType]
    }
    
    @scala.inline
    implicit class ExpectedElementsTypeMutableBuilder[Self <: ExpectedElementsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElements(value: ExpectedElements): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementsVarargs(value: WithExplicitIndex[WithDeletionFlag[ExpectedElement]]*): Self = StObject.set(x, "elements", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ExpectedTextType extends ExpectedElement {
    
    var text: String | Double | Boolean = js.native
  }
  object ExpectedTextType {
    
    @scala.inline
    def apply(text: String | Double | Boolean): ExpectedTextType = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpectedTextType]
    }
    
    @scala.inline
    implicit class ExpectedTextTypeMutableBuilder[Self <: ExpectedTextType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String | Double | Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExplicitNewValue[T] extends StObject {
    
    var newValue: T = js.native
  }
  object ExplicitNewValue {
    
    @scala.inline
    def apply[T](newValue: T): ExplicitNewValue[T] = {
      val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExplicitNewValue[T]]
    }
    
    @scala.inline
    implicit class ExplicitNewValueMutableBuilder[Self <: ExplicitNewValue[_], T] (val x: Self with ExplicitNewValue[T]) extends AnyVal {
      
      @scala.inline
      def setNewValue(value: T): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    }
  }
  
  type WithDeletionFlag[T] = T with DeletionFlag
  
  type WithExplicitIndex[T] = T with Idx
  
  type WithExplicitNewValue[T] = T | ExplicitNewValue[T]
}
