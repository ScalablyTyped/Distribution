package typings.glimmerInterfaces

import typings.glimmerInterfaces.anon.AsyncLifecycleCallbacks
import typings.glimmerInterfaces.anon.Destructor
import typings.glimmerInterfaces.distTypesLibManagersCapabilitiesMod.Capabilities
import typings.glimmerInterfaces.distTypesLibRuntimeArgumentsMod.Arguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibManagersComponentMod {
  
  @js.native
  trait ComponentCapabilities
    extends StObject
       with Capabilities {
    
    var asyncLifeCycleCallbacks: Boolean = js.native
    
    var destructor: Boolean = js.native
    
    var updateHook: Boolean = js.native
  }
  
  trait ComponentCapabilitiesVersions extends StObject {
    
    @JSName("3.13")
    var `3Dot13`: Destructor
    
    @JSName("3.4")
    var `3Dot4`: AsyncLifecycleCallbacks
  }
  object ComponentCapabilitiesVersions {
    
    inline def apply(`3Dot13`: Destructor, `3Dot4`: AsyncLifecycleCallbacks): ComponentCapabilitiesVersions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("3.13")(`3Dot13`.asInstanceOf[js.Any])
      __obj.updateDynamic("3.4")(`3Dot4`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentCapabilitiesVersions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentCapabilitiesVersions] (val x: Self) extends AnyVal {
      
      inline def set3Dot13(value: Destructor): Self = StObject.set(x, "3.13", value.asInstanceOf[js.Any])
      
      inline def set3Dot4(value: AsyncLifecycleCallbacks): Self = StObject.set(x, "3.4", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComponentManager[ComponentStateBucket] extends StObject {
    
    var capabilities: ComponentCapabilities
    
    def createComponent(factory: js.Object, args: Arguments): ComponentStateBucket
    
    def getContext(instance: ComponentStateBucket): Any
  }
  object ComponentManager {
    
    inline def apply[ComponentStateBucket](
      capabilities: ComponentCapabilities,
      createComponent: (js.Object, Arguments) => ComponentStateBucket,
      getContext: ComponentStateBucket => Any
    ): ComponentManager[ComponentStateBucket] = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], createComponent = js.Any.fromFunction2(createComponent), getContext = js.Any.fromFunction1(getContext))
      __obj.asInstanceOf[ComponentManager[ComponentStateBucket]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentManager[?], ComponentStateBucket] (val x: Self & ComponentManager[ComponentStateBucket]) extends AnyVal {
      
      inline def setCapabilities(value: ComponentCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setCreateComponent(value: (js.Object, Arguments) => ComponentStateBucket): Self = StObject.set(x, "createComponent", js.Any.fromFunction2(value))
      
      inline def setGetContext(value: ComponentStateBucket => Any): Self = StObject.set(x, "getContext", js.Any.fromFunction1(value))
    }
  }
  
  trait ComponentManagerWithAsyncLifeCycleCallbacks[ComponentStateBucket]
    extends StObject
       with ComponentManager[ComponentStateBucket] {
    
    def didCreateComponent(instance: ComponentStateBucket): Unit
  }
  object ComponentManagerWithAsyncLifeCycleCallbacks {
    
    inline def apply[ComponentStateBucket](
      capabilities: ComponentCapabilities,
      createComponent: (js.Object, Arguments) => ComponentStateBucket,
      didCreateComponent: ComponentStateBucket => Unit,
      getContext: ComponentStateBucket => Any
    ): ComponentManagerWithAsyncLifeCycleCallbacks[ComponentStateBucket] = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], createComponent = js.Any.fromFunction2(createComponent), didCreateComponent = js.Any.fromFunction1(didCreateComponent), getContext = js.Any.fromFunction1(getContext))
      __obj.asInstanceOf[ComponentManagerWithAsyncLifeCycleCallbacks[ComponentStateBucket]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentManagerWithAsyncLifeCycleCallbacks[?], ComponentStateBucket] (val x: Self & ComponentManagerWithAsyncLifeCycleCallbacks[ComponentStateBucket]) extends AnyVal {
      
      inline def setDidCreateComponent(value: ComponentStateBucket => Unit): Self = StObject.set(x, "didCreateComponent", js.Any.fromFunction1(value))
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.glimmerInterfaces.distTypesLibManagersComponentMod.ComponentManager because Already inherited
  - typings.glimmerInterfaces.distTypesLibManagersComponentMod.ComponentManagerWithUpdateHook because var conflicts: capabilities. Inlined updateComponent */ trait ComponentManagerWithAsyncUpdateHook[ComponentStateBucket]
    extends StObject
       with ComponentManagerWithAsyncLifeCycleCallbacks[ComponentStateBucket] {
    
    def didUpdateComponent(instance: ComponentStateBucket): Unit
    
    def updateComponent(instance: ComponentStateBucket, args: Arguments): Unit
  }
  object ComponentManagerWithAsyncUpdateHook {
    
    inline def apply[ComponentStateBucket](
      capabilities: ComponentCapabilities,
      createComponent: (js.Object, Arguments) => ComponentStateBucket,
      didCreateComponent: ComponentStateBucket => Unit,
      didUpdateComponent: ComponentStateBucket => Unit,
      getContext: ComponentStateBucket => Any,
      updateComponent: (ComponentStateBucket, Arguments) => Unit
    ): ComponentManagerWithAsyncUpdateHook[ComponentStateBucket] = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], createComponent = js.Any.fromFunction2(createComponent), didCreateComponent = js.Any.fromFunction1(didCreateComponent), didUpdateComponent = js.Any.fromFunction1(didUpdateComponent), getContext = js.Any.fromFunction1(getContext), updateComponent = js.Any.fromFunction2(updateComponent))
      __obj.asInstanceOf[ComponentManagerWithAsyncUpdateHook[ComponentStateBucket]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentManagerWithAsyncUpdateHook[?], ComponentStateBucket] (val x: Self & ComponentManagerWithAsyncUpdateHook[ComponentStateBucket]) extends AnyVal {
      
      inline def setDidUpdateComponent(value: ComponentStateBucket => Unit): Self = StObject.set(x, "didUpdateComponent", js.Any.fromFunction1(value))
      
      inline def setUpdateComponent(value: (ComponentStateBucket, Arguments) => Unit): Self = StObject.set(x, "updateComponent", js.Any.fromFunction2(value))
    }
  }
  
  trait ComponentManagerWithDestructors[ComponentStateBucket]
    extends StObject
       with ComponentManager[ComponentStateBucket] {
    
    def destroyComponent(instance: ComponentStateBucket): Unit
  }
  object ComponentManagerWithDestructors {
    
    inline def apply[ComponentStateBucket](
      capabilities: ComponentCapabilities,
      createComponent: (js.Object, Arguments) => ComponentStateBucket,
      destroyComponent: ComponentStateBucket => Unit,
      getContext: ComponentStateBucket => Any
    ): ComponentManagerWithDestructors[ComponentStateBucket] = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], createComponent = js.Any.fromFunction2(createComponent), destroyComponent = js.Any.fromFunction1(destroyComponent), getContext = js.Any.fromFunction1(getContext))
      __obj.asInstanceOf[ComponentManagerWithDestructors[ComponentStateBucket]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentManagerWithDestructors[?], ComponentStateBucket] (val x: Self & ComponentManagerWithDestructors[ComponentStateBucket]) extends AnyVal {
      
      inline def setDestroyComponent(value: ComponentStateBucket => Unit): Self = StObject.set(x, "destroyComponent", js.Any.fromFunction1(value))
    }
  }
  
  trait ComponentManagerWithUpdateHook[ComponentStateBucket]
    extends StObject
       with ComponentManager[ComponentStateBucket] {
    
    def updateComponent(instance: ComponentStateBucket, args: Arguments): Unit
  }
  object ComponentManagerWithUpdateHook {
    
    inline def apply[ComponentStateBucket](
      capabilities: ComponentCapabilities,
      createComponent: (js.Object, Arguments) => ComponentStateBucket,
      getContext: ComponentStateBucket => Any,
      updateComponent: (ComponentStateBucket, Arguments) => Unit
    ): ComponentManagerWithUpdateHook[ComponentStateBucket] = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], createComponent = js.Any.fromFunction2(createComponent), getContext = js.Any.fromFunction1(getContext), updateComponent = js.Any.fromFunction2(updateComponent))
      __obj.asInstanceOf[ComponentManagerWithUpdateHook[ComponentStateBucket]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentManagerWithUpdateHook[?], ComponentStateBucket] (val x: Self & ComponentManagerWithUpdateHook[ComponentStateBucket]) extends AnyVal {
      
      inline def setUpdateComponent(value: (ComponentStateBucket, Arguments) => Unit): Self = StObject.set(x, "updateComponent", js.Any.fromFunction2(value))
    }
  }
}
