package typings.glimmerInterfaces

import typings.glimmerInterfaces.distTypesLibCoreMod.RichIteratorResult
import typings.glimmerInterfaces.distTypesLibSerializeMod.CompileTimeComponent
import typings.glimmerInterfaces.glimmerInterfacesBooleans.`false`
import typings.glimmerInterfaces.glimmerInterfacesBooleans.`true`
import typings.simpleDomInterface.mod.SimpleElement
import typings.simpleDomInterface.mod.SimpleNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AlwaysRevalidate extends StObject {
    
    var alwaysRevalidate: `false`
  }
  object AlwaysRevalidate {
    
    inline def apply(): AlwaysRevalidate = {
      val __obj = js.Dynamic.literal(alwaysRevalidate = false)
      __obj.asInstanceOf[AlwaysRevalidate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AlwaysRevalidate] (val x: Self) extends AnyVal {
      
      inline def setAlwaysRevalidate(value: `false`): Self = StObject.set(x, "alwaysRevalidate", value.asInstanceOf[js.Any])
    }
  }
  
  trait AsyncLifecycleCallbacks extends StObject {
    
    var asyncLifecycleCallbacks: js.UndefOr[Boolean] = js.undefined
    
    var destructor: js.UndefOr[Boolean] = js.undefined
  }
  object AsyncLifecycleCallbacks {
    
    inline def apply(): AsyncLifecycleCallbacks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncLifecycleCallbacks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncLifecycleCallbacks] (val x: Self) extends AnyVal {
      
      inline def setAsyncLifecycleCallbacks(value: Boolean): Self = StObject.set(x, "asyncLifecycleCallbacks", value.asInstanceOf[js.Any])
      
      inline def setAsyncLifecycleCallbacksUndefined: Self = StObject.set(x, "asyncLifecycleCallbacks", js.undefined)
      
      inline def setDestructor(value: Boolean): Self = StObject.set(x, "destructor", value.asInstanceOf[js.Any])
      
      inline def setDestructorUndefined: Self = StObject.set(x, "destructor", js.undefined)
    }
  }
  
  trait Destructor extends StObject {
    
    var asyncLifecycleCallbacks: js.UndefOr[Boolean] = js.undefined
    
    var destructor: js.UndefOr[Boolean] = js.undefined
    
    var updateHook: js.UndefOr[Boolean] = js.undefined
  }
  object Destructor {
    
    inline def apply(): Destructor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Destructor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Destructor] (val x: Self) extends AnyVal {
      
      inline def setAsyncLifecycleCallbacks(value: Boolean): Self = StObject.set(x, "asyncLifecycleCallbacks", value.asInstanceOf[js.Any])
      
      inline def setAsyncLifecycleCallbacksUndefined: Self = StObject.set(x, "asyncLifecycleCallbacks", js.undefined)
      
      inline def setDestructor(value: Boolean): Self = StObject.set(x, "destructor", value.asInstanceOf[js.Any])
      
      inline def setDestructorUndefined: Self = StObject.set(x, "destructor", js.undefined)
      
      inline def setUpdateHook(value: Boolean): Self = StObject.set(x, "updateHook", value.asInstanceOf[js.Any])
      
      inline def setUpdateHookUndefined: Self = StObject.set(x, "updateHook", js.undefined)
    }
  }
  
  trait DisableAutoTracking extends StObject {
    
    var disableAutoTracking: js.UndefOr[Boolean] = js.undefined
  }
  object DisableAutoTracking {
    
    inline def apply(): DisableAutoTracking = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisableAutoTracking]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DisableAutoTracking] (val x: Self) extends AnyVal {
      
      inline def setDisableAutoTracking(value: Boolean): Self = StObject.set(x, "disableAutoTracking", value.asInstanceOf[js.Any])
      
      inline def setDisableAutoTrackingUndefined: Self = StObject.set(x, "disableAutoTracking", js.undefined)
    }
  }
  
  trait Done[Tick]
    extends StObject
       with RichIteratorResult[Tick, Any] {
    
    var done: `false`
    
    var value: Tick
  }
  object Done {
    
    inline def apply[Tick](value: Tick): Done[Tick] = {
      val __obj = js.Dynamic.literal(done = false, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Done[Tick]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Done[?], Tick] (val x: Self & Done[Tick]) extends AnyVal {
      
      inline def setDone(value: `false`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Tick): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait End extends StObject {
    
    var end: Double
    
    var start: Double
  }
  object End {
    
    inline def apply(end: Double, start: Double): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait FirstNode extends StObject {
    
    var firstNode: SimpleNode
    
    var lastNode: SimpleNode
    
    var parentElement: SimpleElement
  }
  object FirstNode {
    
    inline def apply(firstNode: SimpleNode, lastNode: SimpleNode, parentElement: SimpleElement): FirstNode = {
      val __obj = js.Dynamic.literal(firstNode = firstNode.asInstanceOf[js.Any], lastNode = lastNode.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirstNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FirstNode] (val x: Self) extends AnyVal {
      
      inline def setFirstNode(value: SimpleNode): Self = StObject.set(x, "firstNode", value.asInstanceOf[js.Any])
      
      inline def setLastNode(value: SimpleNode): Self = StObject.set(x, "lastNode", value.asInstanceOf[js.Any])
      
      inline def setParentElement(value: SimpleElement): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait HasDestroyable extends StObject {
    
    var hasDestroyable: js.UndefOr[Boolean] = js.undefined
    
    var hasValue: js.UndefOr[Boolean] = js.undefined
  }
  object HasDestroyable {
    
    inline def apply(): HasDestroyable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HasDestroyable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HasDestroyable] (val x: Self) extends AnyVal {
      
      inline def setHasDestroyable(value: Boolean): Self = StObject.set(x, "hasDestroyable", value.asInstanceOf[js.Any])
      
      inline def setHasDestroyableUndefined: Self = StObject.set(x, "hasDestroyable", js.undefined)
      
      inline def setHasValue(value: Boolean): Self = StObject.set(x, "hasValue", value.asInstanceOf[js.Any])
      
      inline def setHasValueUndefined: Self = StObject.set(x, "hasValue", js.undefined)
    }
  }
  
  trait IfComponent extends StObject {
    
    def ifComponent(component: CompileTimeComponent): Unit
    
    def ifHelper(handle: Double): Unit
  }
  object IfComponent {
    
    inline def apply(ifComponent: CompileTimeComponent => Unit, ifHelper: Double => Unit): IfComponent = {
      val __obj = js.Dynamic.literal(ifComponent = js.Any.fromFunction1(ifComponent), ifHelper = js.Any.fromFunction1(ifHelper))
      __obj.asInstanceOf[IfComponent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IfComponent] (val x: Self) extends AnyVal {
      
      inline def setIfComponent(value: CompileTimeComponent => Unit): Self = StObject.set(x, "ifComponent", js.Any.fromFunction1(value))
      
      inline def setIfHelper(value: Double => Unit): Self = StObject.set(x, "ifHelper", js.Any.fromFunction1(value))
    }
  }
  
  trait IfHelper extends StObject {
    
    def ifHelper(handle: Double, name: String, moduleName: String): Unit
  }
  object IfHelper {
    
    inline def apply(ifHelper: (Double, String, String) => Unit): IfHelper = {
      val __obj = js.Dynamic.literal(ifHelper = js.Any.fromFunction3(ifHelper))
      __obj.asInstanceOf[IfHelper]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IfHelper] (val x: Self) extends AnyVal {
      
      inline def setIfHelper(value: (Double, String, String) => Unit): Self = StObject.set(x, "ifHelper", js.Any.fromFunction3(value))
    }
  }
  
  trait IfValue extends StObject {
    
    def ifComponent(component: CompileTimeComponent): Unit
    
    def ifHelper(handle: Double): Unit
    
    def ifValue(handle: Double): Unit
  }
  object IfValue {
    
    inline def apply(ifComponent: CompileTimeComponent => Unit, ifHelper: Double => Unit, ifValue: Double => Unit): IfValue = {
      val __obj = js.Dynamic.literal(ifComponent = js.Any.fromFunction1(ifComponent), ifHelper = js.Any.fromFunction1(ifHelper), ifValue = js.Any.fromFunction1(ifValue))
      __obj.asInstanceOf[IfValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IfValue] (val x: Self) extends AnyVal {
      
      inline def setIfComponent(value: CompileTimeComponent => Unit): Self = StObject.set(x, "ifComponent", js.Any.fromFunction1(value))
      
      inline def setIfHelper(value: Double => Unit): Self = StObject.set(x, "ifHelper", js.Any.fromFunction1(value))
      
      inline def setIfValue(value: Double => Unit): Self = StObject.set(x, "ifValue", js.Any.fromFunction1(value))
    }
  }
  
  trait Value[Return]
    extends StObject
       with RichIteratorResult[Any, Return] {
    
    var done: `true`
    
    var value: Return
  }
  object Value {
    
    inline def apply[Return](value: Return): Value[Return] = {
      val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value[Return]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value[?], Return] (val x: Self & Value[Return]) extends AnyVal {
      
      inline def setDone(value: `true`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Return): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
