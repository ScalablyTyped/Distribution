package typings.glimmerInterfaces

import typings.glimmerInterfaces.anon.FirstNode
import typings.glimmerInterfaces.distTypesLibDomBoundsMod.Bounds
import typings.glimmerInterfaces.distTypesLibRuntimeArgumentsMod.Arguments
import typings.glimmerInterfaces.distTypesLibRuntimeArgumentsMod.CapturedArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibRuntimeDebugRenderTreeMod {
  
  trait CapturedRenderNode extends StObject {
    
    var args: Arguments
    
    var bounds: Null | FirstNode
    
    var children: js.Array[CapturedRenderNode]
    
    var id: String
    
    var instance: Any
    
    var name: String
    
    var template: String | Null
    
    var `type`: RenderNodeType
  }
  object CapturedRenderNode {
    
    inline def apply(
      args: Arguments,
      children: js.Array[CapturedRenderNode],
      id: String,
      instance: Any,
      name: String,
      `type`: RenderNodeType
    ): CapturedRenderNode = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], bounds = null, template = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CapturedRenderNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CapturedRenderNode] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: Arguments): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setBounds(value: FirstNode): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsNull: Self = StObject.set(x, "bounds", null)
      
      inline def setChildren(value: js.Array[CapturedRenderNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: CapturedRenderNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInstance(value: Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateNull: Self = StObject.set(x, "template", null)
      
      inline def setType(value: RenderNodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DebugRenderTree[Bucket /* <: js.Object */] extends StObject {
    
    def begin(): Unit
    
    def capture(): js.Array[CapturedRenderNode]
    
    def commit(): Unit
    
    def create(state: Bucket, node: RenderNode): Unit
    
    def didRender(state: Bucket, bounds: Bounds): Unit
    
    def update(state: Bucket): Unit
    
    def willDestroy(state: Bucket): Unit
  }
  object DebugRenderTree {
    
    inline def apply[Bucket /* <: js.Object */](
      begin: () => Unit,
      capture: () => js.Array[CapturedRenderNode],
      commit: () => Unit,
      create: (Bucket, RenderNode) => Unit,
      didRender: (Bucket, Bounds) => Unit,
      update: Bucket => Unit,
      willDestroy: Bucket => Unit
    ): DebugRenderTree[Bucket] = {
      val __obj = js.Dynamic.literal(begin = js.Any.fromFunction0(begin), capture = js.Any.fromFunction0(capture), commit = js.Any.fromFunction0(commit), create = js.Any.fromFunction2(create), didRender = js.Any.fromFunction2(didRender), update = js.Any.fromFunction1(update), willDestroy = js.Any.fromFunction1(willDestroy))
      __obj.asInstanceOf[DebugRenderTree[Bucket]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DebugRenderTree[?], Bucket /* <: js.Object */] (val x: Self & DebugRenderTree[Bucket]) extends AnyVal {
      
      inline def setBegin(value: () => Unit): Self = StObject.set(x, "begin", js.Any.fromFunction0(value))
      
      inline def setCapture(value: () => js.Array[CapturedRenderNode]): Self = StObject.set(x, "capture", js.Any.fromFunction0(value))
      
      inline def setCommit(value: () => Unit): Self = StObject.set(x, "commit", js.Any.fromFunction0(value))
      
      inline def setCreate(value: (Bucket, RenderNode) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      inline def setDidRender(value: (Bucket, Bounds) => Unit): Self = StObject.set(x, "didRender", js.Any.fromFunction2(value))
      
      inline def setUpdate(value: Bucket => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
      
      inline def setWillDestroy(value: Bucket => Unit): Self = StObject.set(x, "willDestroy", js.Any.fromFunction1(value))
    }
  }
  
  trait RenderNode extends StObject {
    
    var args: CapturedArguments
    
    var instance: Any
    
    var name: String
    
    var template: js.UndefOr[String] = js.undefined
    
    var `type`: RenderNodeType
  }
  object RenderNode {
    
    inline def apply(args: CapturedArguments, instance: Any, name: String, `type`: RenderNodeType): RenderNode = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderNode] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: CapturedArguments): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setInstance(value: Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setType(value: RenderNodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.glimmerInterfaces.glimmerInterfacesStrings.outlet
    - typings.glimmerInterfaces.glimmerInterfacesStrings.engine
    - typings.glimmerInterfaces.glimmerInterfacesStrings.`route-template`
    - typings.glimmerInterfaces.glimmerInterfacesStrings.component
  */
  trait RenderNodeType extends StObject
  object RenderNodeType {
    
    inline def component: typings.glimmerInterfaces.glimmerInterfacesStrings.component = "component".asInstanceOf[typings.glimmerInterfaces.glimmerInterfacesStrings.component]
    
    inline def engine: typings.glimmerInterfaces.glimmerInterfacesStrings.engine = "engine".asInstanceOf[typings.glimmerInterfaces.glimmerInterfacesStrings.engine]
    
    inline def outlet: typings.glimmerInterfaces.glimmerInterfacesStrings.outlet = "outlet".asInstanceOf[typings.glimmerInterfaces.glimmerInterfacesStrings.outlet]
    
    inline def `route-template`: typings.glimmerInterfaces.glimmerInterfacesStrings.`route-template` = "route-template".asInstanceOf[typings.glimmerInterfaces.glimmerInterfacesStrings.`route-template`]
  }
}
