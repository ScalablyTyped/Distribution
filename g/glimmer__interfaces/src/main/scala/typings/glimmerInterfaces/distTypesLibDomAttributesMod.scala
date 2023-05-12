package typings.glimmerInterfaces

import typings.glimmerInterfaces.distTypesLibCoreMod.Maybe
import typings.glimmerInterfaces.distTypesLibCoreMod.Option
import typings.glimmerInterfaces.distTypesLibDomBoundsMod.Bounds
import typings.glimmerInterfaces.distTypesLibDomBoundsMod.Cursor
import typings.glimmerInterfaces.distTypesLibDomChangesMod.GlimmerTreeChanges
import typings.glimmerInterfaces.distTypesLibDomChangesMod.GlimmerTreeConstruction
import typings.glimmerInterfaces.distTypesLibRuntimeElementMod.ElementOperations
import typings.glimmerInterfaces.distTypesLibRuntimeEnvironmentMod.Environment
import typings.glimmerInterfaces.distTypesLibRuntimeModifierMod.ModifierInstance
import typings.simpleDomInterface.mod.AttrNamespace
import typings.simpleDomInterface.mod.SimpleComment
import typings.simpleDomInterface.mod.SimpleDocumentFragment
import typings.simpleDomInterface.mod.SimpleElement
import typings.simpleDomInterface.mod.SimpleNode
import typings.simpleDomInterface.mod.SimpleText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibDomAttributesMod {
  
  @JSImport("@glimmer/interfaces/dist/types/lib/dom/attributes", "CURSOR_STACK")
  @js.native
  val CURSOR_STACK: js.Symbol = js.native
  
  trait AttributeCursor extends StObject {
    
    var element: SimpleElement
    
    var name: String
    
    var namespace: Option[AttrNamespace]
  }
  object AttributeCursor {
    
    inline def apply(element: SimpleElement, name: String): AttributeCursor = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = null)
      __obj.asInstanceOf[AttributeCursor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AttributeCursor] (val x: Self) extends AnyVal {
      
      inline def setElement(value: SimpleElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: Option[AttrNamespace]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceNull: Self = StObject.set(x, "namespace", null)
    }
  }
  
  trait AttributeOperation extends StObject {
    
    var attribute: AttributeCursor
    
    def set(dom: ElementBuilder, value: Any, env: Environment): Unit
    
    def update(value: Any, env: Environment): Unit
  }
  object AttributeOperation {
    
    inline def apply(
      attribute: AttributeCursor,
      set: (ElementBuilder, Any, Environment) => Unit,
      update: (Any, Environment) => Unit
    ): AttributeOperation = {
      val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], set = js.Any.fromFunction3(set), update = js.Any.fromFunction2(update))
      __obj.asInstanceOf[AttributeOperation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AttributeOperation] (val x: Self) extends AnyVal {
      
      inline def setAttribute(value: AttributeCursor): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setSet(value: (ElementBuilder, Any, Environment) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
      
      inline def setUpdate(value: (Any, Environment) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    }
  }
  
  type CursorStackSymbol = js.Symbol
  
  @js.native
  trait DOMStack extends StObject {
    
    def appendComment(string: String): SimpleComment = js.native
    
    def appendDynamicFragment(value: SimpleDocumentFragment): Unit = js.native
    
    def appendDynamicHTML(value: String): Unit = js.native
    
    def appendDynamicNode(value: SimpleNode): Unit = js.native
    
    def appendDynamicText(value: String): SimpleText = js.native
    
    def appendText(string: String): SimpleText = js.native
    
    def closeElement(): Option[js.Array[ModifierInstance]] = js.native
    
    def flushElement(modifiers: Option[js.Array[ModifierInstance]]): Unit = js.native
    
    def openElement(tag: String): SimpleElement = js.native
    def openElement(tag: String, _operations: ElementOperations): SimpleElement = js.native
    
    def popElement(): Unit = js.native
    
    def popRemoteElement(): Unit = js.native
    
    def pushRemoteElement(element: SimpleElement, guid: String, insertBefore: Maybe[SimpleNode]): Option[RemoteLiveBlock] = js.native
    
    def setDynamicAttribute(name: String, value: Any, isTrusting: Boolean, namespace: Option[String]): AttributeOperation = js.native
    
    def setStaticAttribute(name: String, value: String, namespace: Option[String]): Unit = js.native
  }
  
  @js.native
  trait ElementBuilder
    extends StObject
       with Cursor
       with DOMStack
       with TreeOperations {
    
    var constructing: Option[SimpleElement] = js.native
    
    def debugBlocks(): js.Array[LiveBlock] = js.native
    
    def didAppendBounds(bounds: Bounds): Unit = js.native
    
    var dom: GlimmerTreeConstruction = js.native
    
    var hasBlocks: Boolean = js.native
    
    def popBlock(): LiveBlock = js.native
    
    def pushBlockList(list: js.Array[Bounds]): LiveBlock = js.native
    
    def pushSimpleBlock(): LiveBlock = js.native
    
    def pushUpdatableBlock(): UpdatableBlock = js.native
    
    var updateOperations: GlimmerTreeChanges = js.native
  }
  
  trait LiveBlock
    extends StObject
       with Bounds {
    
    def closeElement(): Unit
    
    def didAppendBounds(bounds: Bounds): Unit
    
    def didAppendNode(node: SimpleNode): Unit
    
    def finalize(stack: ElementBuilder): Unit
    
    def openElement(element: SimpleElement): Unit
  }
  object LiveBlock {
    
    inline def apply(
      closeElement: () => Unit,
      didAppendBounds: Bounds => Unit,
      didAppendNode: SimpleNode => Unit,
      finalize_ : ElementBuilder => Unit,
      firstNode: () => SimpleNode,
      lastNode: () => SimpleNode,
      openElement: SimpleElement => Unit,
      parentElement: () => SimpleElement
    ): LiveBlock = {
      val __obj = js.Dynamic.literal(closeElement = js.Any.fromFunction0(closeElement), didAppendBounds = js.Any.fromFunction1(didAppendBounds), didAppendNode = js.Any.fromFunction1(didAppendNode), firstNode = js.Any.fromFunction0(firstNode), lastNode = js.Any.fromFunction0(lastNode), openElement = js.Any.fromFunction1(openElement), parentElement = js.Any.fromFunction0(parentElement))
      __obj.updateDynamic("finalize")(js.Any.fromFunction1(finalize_))
      __obj.asInstanceOf[LiveBlock]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LiveBlock] (val x: Self) extends AnyVal {
      
      inline def setCloseElement(value: () => Unit): Self = StObject.set(x, "closeElement", js.Any.fromFunction0(value))
      
      inline def setDidAppendBounds(value: Bounds => Unit): Self = StObject.set(x, "didAppendBounds", js.Any.fromFunction1(value))
      
      inline def setDidAppendNode(value: SimpleNode => Unit): Self = StObject.set(x, "didAppendNode", js.Any.fromFunction1(value))
      
      inline def setFinalize_(value: ElementBuilder => Unit): Self = StObject.set(x, "finalize", js.Any.fromFunction1(value))
      
      inline def setOpenElement(value: SimpleElement => Unit): Self = StObject.set(x, "openElement", js.Any.fromFunction1(value))
    }
  }
  
  type RemoteLiveBlock = SimpleLiveBlock
  
  trait SimpleLiveBlock
    extends StObject
       with LiveBlock
  object SimpleLiveBlock {
    
    inline def apply(
      closeElement: () => Unit,
      didAppendBounds: Bounds => Unit,
      didAppendNode: SimpleNode => Unit,
      finalize_ : ElementBuilder => Unit,
      firstNode: () => SimpleNode,
      lastNode: () => SimpleNode,
      openElement: SimpleElement => Unit,
      parentElement: () => SimpleElement
    ): SimpleLiveBlock = {
      val __obj = js.Dynamic.literal(closeElement = js.Any.fromFunction0(closeElement), didAppendBounds = js.Any.fromFunction1(didAppendBounds), didAppendNode = js.Any.fromFunction1(didAppendNode), firstNode = js.Any.fromFunction0(firstNode), lastNode = js.Any.fromFunction0(lastNode), openElement = js.Any.fromFunction1(openElement), parentElement = js.Any.fromFunction0(parentElement))
      __obj.updateDynamic("finalize")(js.Any.fromFunction1(finalize_))
      __obj.asInstanceOf[SimpleLiveBlock]
    }
  }
  
  trait TreeOperations extends StObject {
    
    def __appendComment(string: String): SimpleComment
    
    def __appendHTML(html: String): Bounds
    
    def __appendNode(node: SimpleNode): SimpleNode
    
    def __appendText(text: String): SimpleText
    
    def __closeBlock(): Unit
    
    def __flushElement(parent: SimpleElement, constructing: SimpleElement): Unit
    
    def __openBlock(): Unit
    
    def __openElement(tag: String): SimpleElement
    
    def __setAttribute(name: String, value: String, namespace: Option[String]): Unit
    
    def __setProperty(name: String, value: Any): Unit
  }
  object TreeOperations {
    
    inline def apply(
      __appendComment: String => SimpleComment,
      __appendHTML: String => Bounds,
      __appendNode: SimpleNode => SimpleNode,
      __appendText: String => SimpleText,
      __closeBlock: () => Unit,
      __flushElement: (SimpleElement, SimpleElement) => Unit,
      __openBlock: () => Unit,
      __openElement: String => SimpleElement,
      __setAttribute: (String, String, Option[String]) => Unit,
      __setProperty: (String, Any) => Unit
    ): TreeOperations = {
      val __obj = js.Dynamic.literal(__appendComment = js.Any.fromFunction1(__appendComment), __appendHTML = js.Any.fromFunction1(__appendHTML), __appendNode = js.Any.fromFunction1(__appendNode), __appendText = js.Any.fromFunction1(__appendText), __closeBlock = js.Any.fromFunction0(__closeBlock), __flushElement = js.Any.fromFunction2(__flushElement), __openBlock = js.Any.fromFunction0(__openBlock), __openElement = js.Any.fromFunction1(__openElement), __setAttribute = js.Any.fromFunction3(__setAttribute), __setProperty = js.Any.fromFunction2(__setProperty))
      __obj.asInstanceOf[TreeOperations]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeOperations] (val x: Self) extends AnyVal {
      
      inline def set__appendComment(value: String => SimpleComment): Self = StObject.set(x, "__appendComment", js.Any.fromFunction1(value))
      
      inline def set__appendHTML(value: String => Bounds): Self = StObject.set(x, "__appendHTML", js.Any.fromFunction1(value))
      
      inline def set__appendNode(value: SimpleNode => SimpleNode): Self = StObject.set(x, "__appendNode", js.Any.fromFunction1(value))
      
      inline def set__appendText(value: String => SimpleText): Self = StObject.set(x, "__appendText", js.Any.fromFunction1(value))
      
      inline def set__closeBlock(value: () => Unit): Self = StObject.set(x, "__closeBlock", js.Any.fromFunction0(value))
      
      inline def set__flushElement(value: (SimpleElement, SimpleElement) => Unit): Self = StObject.set(x, "__flushElement", js.Any.fromFunction2(value))
      
      inline def set__openBlock(value: () => Unit): Self = StObject.set(x, "__openBlock", js.Any.fromFunction0(value))
      
      inline def set__openElement(value: String => SimpleElement): Self = StObject.set(x, "__openElement", js.Any.fromFunction1(value))
      
      inline def set__setAttribute(value: (String, String, Option[String]) => Unit): Self = StObject.set(x, "__setAttribute", js.Any.fromFunction3(value))
      
      inline def set__setProperty(value: (String, Any) => Unit): Self = StObject.set(x, "__setProperty", js.Any.fromFunction2(value))
    }
  }
  
  trait UpdatableBlock
    extends StObject
       with SimpleLiveBlock {
    
    def reset(env: Environment): Option[SimpleNode]
  }
  object UpdatableBlock {
    
    inline def apply(
      closeElement: () => Unit,
      didAppendBounds: Bounds => Unit,
      didAppendNode: SimpleNode => Unit,
      finalize_ : ElementBuilder => Unit,
      firstNode: () => SimpleNode,
      lastNode: () => SimpleNode,
      openElement: SimpleElement => Unit,
      parentElement: () => SimpleElement,
      reset: Environment => Option[SimpleNode]
    ): UpdatableBlock = {
      val __obj = js.Dynamic.literal(closeElement = js.Any.fromFunction0(closeElement), didAppendBounds = js.Any.fromFunction1(didAppendBounds), didAppendNode = js.Any.fromFunction1(didAppendNode), firstNode = js.Any.fromFunction0(firstNode), lastNode = js.Any.fromFunction0(lastNode), openElement = js.Any.fromFunction1(openElement), parentElement = js.Any.fromFunction0(parentElement), reset = js.Any.fromFunction1(reset))
      __obj.updateDynamic("finalize")(js.Any.fromFunction1(finalize_))
      __obj.asInstanceOf[UpdatableBlock]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdatableBlock] (val x: Self) extends AnyVal {
      
      inline def setReset(value: Environment => Option[SimpleNode]): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
    }
  }
}
