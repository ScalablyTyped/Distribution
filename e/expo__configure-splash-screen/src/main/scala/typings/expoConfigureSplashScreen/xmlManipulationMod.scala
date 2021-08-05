package typings.expoConfigureSplashScreen

import typings.expoConfigureSplashScreen.anon.DeletionFlag
import typings.expoConfigureSplashScreen.anon.DisregardComments
import typings.expoConfigureSplashScreen.anon.Idx
import typings.std.Record
import typings.xmlJs.mod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlManipulationMod {
  
  @JSImport("@expo/configure-splash-screen/build/xml-manipulation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeXmlElements(current: Element, expected: ExpectedElement): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeXmlElements")(current.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def readXmlFile(filePath: String): js.Promise[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("readXmlFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Element]]
  inline def readXmlFile(filePath: String, fallbackContent: String): js.Promise[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("readXmlFile")(filePath.asInstanceOf[js.Any], fallbackContent.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Element]]
  inline def readXmlFile(filePath: String, fallbackContent: Element): js.Promise[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("readXmlFile")(filePath.asInstanceOf[js.Any], fallbackContent.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Element]]
  
  inline def writeXmlFile(filePath: String, xml: Element): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeXmlFile")(filePath.asInstanceOf[js.Any], xml.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def writeXmlFileOrRemoveFileUponNoResources(filePath: String, element: Element): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeXmlFileOrRemoveFileUponNoResources")(filePath.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeXmlFileOrRemoveFileUponNoResources(filePath: String, element: Element, hasDisregardComments: DisregardComments): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeXmlFileOrRemoveFileUponNoResources")(filePath.asInstanceOf[js.Any], element.asInstanceOf[js.Any], hasDisregardComments.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def xmlElementsEqual(a: Element, b: Element): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElementsEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def xmlElementsEqual(a: Element, b: Element, hasDisregardComments: DisregardComments): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElementsEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], hasDisregardComments.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait ExpectedCommentType
    extends StObject
       with ExpectedElement {
    
    var comment: String
  }
  object ExpectedCommentType {
    
    inline def apply(comment: String): ExpectedCommentType = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpectedCommentType]
    }
    
    extension [Self <: ExpectedCommentType](x: Self) {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
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
    
    inline def ExpectedCommentType(comment: String): typings.expoConfigureSplashScreen.xmlManipulationMod.ExpectedCommentType = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.expoConfigureSplashScreen.xmlManipulationMod.ExpectedCommentType]
    }
    
    inline def ExpectedElementType(name: String): typings.expoConfigureSplashScreen.xmlManipulationMod.ExpectedElementType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.expoConfigureSplashScreen.xmlManipulationMod.ExpectedElementType]
    }
    
    inline def ExpectedElementsType(elements: ExpectedElements): typings.expoConfigureSplashScreen.xmlManipulationMod.ExpectedElementsType = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.expoConfigureSplashScreen.xmlManipulationMod.ExpectedElementsType]
    }
    
    inline def ExpectedTextType(text: String | Double | Boolean): typings.expoConfigureSplashScreen.xmlManipulationMod.ExpectedTextType = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.expoConfigureSplashScreen.xmlManipulationMod.ExpectedTextType]
    }
  }
  
  type ExpectedElementAttributes = Record[String, WithExplicitNewValue[js.UndefOr[String | Double]]]
  
  trait ExpectedElementType
    extends StObject
       with ExpectedElement {
    
    var attributes: js.UndefOr[ExpectedElementAttributes] = js.undefined
    
    var elements: js.UndefOr[ExpectedElements] = js.undefined
    
    var name: String
  }
  object ExpectedElementType {
    
    inline def apply(name: String): ExpectedElementType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpectedElementType]
    }
    
    extension [Self <: ExpectedElementType](x: Self) {
      
      inline def setAttributes(value: ExpectedElementAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setElements(value: ExpectedElements): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
      
      inline def setElementsVarargs(value: WithExplicitIndex[WithDeletionFlag[ExpectedElement]]*): Self = StObject.set(x, "elements", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type ExpectedElements = WithExplicitNewValue[js.Array[WithExplicitIndex[WithDeletionFlag[ExpectedElement]]]]
  
  trait ExpectedElementsType
    extends StObject
       with ExpectedElement {
    
    var elements: ExpectedElements
  }
  object ExpectedElementsType {
    
    inline def apply(elements: ExpectedElements): ExpectedElementsType = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpectedElementsType]
    }
    
    extension [Self <: ExpectedElementsType](x: Self) {
      
      inline def setElements(value: ExpectedElements): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsVarargs(value: WithExplicitIndex[WithDeletionFlag[ExpectedElement]]*): Self = StObject.set(x, "elements", js.Array(value :_*))
    }
  }
  
  trait ExpectedTextType
    extends StObject
       with ExpectedElement {
    
    var text: String | Double | Boolean
  }
  object ExpectedTextType {
    
    inline def apply(text: String | Double | Boolean): ExpectedTextType = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpectedTextType]
    }
    
    extension [Self <: ExpectedTextType](x: Self) {
      
      inline def setText(value: String | Double | Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExplicitNewValue[T] extends StObject {
    
    var newValue: T
  }
  object ExplicitNewValue {
    
    inline def apply[T](newValue: T): ExplicitNewValue[T] = {
      val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExplicitNewValue[T]]
    }
    
    extension [Self <: ExplicitNewValue[?], T](x: Self & ExplicitNewValue[T]) {
      
      inline def setNewValue(value: T): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    }
  }
  
  type WithDeletionFlag[T] = T & DeletionFlag
  
  type WithExplicitIndex[T] = T & Idx
  
  type WithExplicitNewValue[T] = T | ExplicitNewValue[T]
}
