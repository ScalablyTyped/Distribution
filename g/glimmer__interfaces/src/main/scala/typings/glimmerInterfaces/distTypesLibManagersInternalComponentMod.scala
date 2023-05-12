package typings.glimmerInterfaces

import typings.glimmerInterfaces.distTypesLibComponentsMod.PreparedArguments
import typings.glimmerInterfaces.distTypesLibCoreMod.Destroyable
import typings.glimmerInterfaces.distTypesLibCoreMod.Option
import typings.glimmerInterfaces.distTypesLibDomBoundsMod.Bounds
import typings.glimmerInterfaces.distTypesLibRuntimeArgumentsMod.CapturedArguments
import typings.glimmerInterfaces.distTypesLibRuntimeArgumentsMod.VMArguments
import typings.glimmerInterfaces.distTypesLibRuntimeDebugRenderTreeMod.RenderNode
import typings.glimmerInterfaces.distTypesLibRuntimeDebugRenderTreeMod.RenderNodeType
import typings.glimmerInterfaces.distTypesLibRuntimeElementMod.ElementOperations
import typings.glimmerInterfaces.distTypesLibRuntimeEnvironmentMod.Environment
import typings.glimmerInterfaces.distTypesLibRuntimeOwnerMod.Owner
import typings.glimmerInterfaces.distTypesLibRuntimeScopeMod.DynamicScope
import typings.glimmerInterfaces.distTypesLibSerializeMod.RuntimeResolver
import typings.glimmerInterfaces.distTypesLibTemplateMod.CompilableProgram
import typings.glimmerInterfaces.distTypesLibTier1SymbolTableMod.ProgramSymbolTable
import typings.simpleDomInterface.mod.SimpleElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibManagersInternalComponentMod {
  
  trait CustomRenderNode
    extends StObject
       with RenderNode {
    
    var bucket: js.Object
  }
  object CustomRenderNode {
    
    inline def apply(args: CapturedArguments, bucket: js.Object, instance: Any, name: String, `type`: RenderNodeType): CustomRenderNode = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], bucket = bucket.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomRenderNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomRenderNode] (val x: Self) extends AnyVal {
      
      inline def setBucket(value: js.Object): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    }
  }
  
  trait InternalComponentCapabilities extends StObject {
    
    /**
      * Whether to call the `didSplatAttributes` hook on the component manager.
      */
    var attributeHook: Boolean
    
    /**
      * Whether a reified `Arguments` object will get passed to the component
      * manager's `create` hook. If a particular component does not access passed
      * arguments from JavaScript (via the `this.args` property in Glimmer.js, for
      * example), this flag can be set to `false` to avoid the work of
      * instantiating extra data structures to expose the arguments to JavaScript.
      */
    var createArgs: Boolean
    
    /**
      * Whether the component needs the caller component
      */
    var createCaller: Boolean
    
    /**
      * Whether there is a component instance to create. If this is false,
      * the component is a "template only component"
      */
    var createInstance: Boolean
    
    /**
      * Whether a component's template is static across all instances of that
      * component, or can vary per instance. This should usually be `false` except
      * for cases of backwards-compatibility.
      */
    var dynamicLayout: Boolean
    
    /**
      * Whether the component needs an additional dynamic scope frame.
      */
    var dynamicScope: Boolean
    
    /**
      * Whether a "wrapped" component's root element can change after being
      * rendered. This flag is only used by the WrappedBuilder and should be
      * `false` except for cases of backwards-compatibility.
      */
    var dynamicTag: Boolean
    
    /**
      * Whether to call the `didCreateElement` hook on the component manager.
      */
    var elementHook: Boolean
    
    /**
      * Whether or not the component pushes an owner onto the owner stack. This is
      * used for engines.
      */
    var hasSubOwner: Boolean
    
    /**
      * Setting the `prepareArgs` flag to true enables the `prepareArgs` hook on
      * the component manager, which would otherwise not be called.
      *
      * The component manager's `prepareArgs` hook allows it to programmatically
      * add or remove positional and named arguments for a component before the
      * component is invoked. This flag should usually be `false` except for cases
      * of backwards-compatibility.
      */
    var prepareArgs: Boolean
    
    /**
      * Whether the component manager has an update hook.
      */
    var updateHook: Boolean
    
    /**
      * Whether or not the component has a `willDestroy` hook that should fire
      * prior to the component being removed from the DOM.
      */
    var willDestroy: Boolean
    
    var wrapped: Boolean
  }
  object InternalComponentCapabilities {
    
    inline def apply(
      attributeHook: Boolean,
      createArgs: Boolean,
      createCaller: Boolean,
      createInstance: Boolean,
      dynamicLayout: Boolean,
      dynamicScope: Boolean,
      dynamicTag: Boolean,
      elementHook: Boolean,
      hasSubOwner: Boolean,
      prepareArgs: Boolean,
      updateHook: Boolean,
      willDestroy: Boolean,
      wrapped: Boolean
    ): InternalComponentCapabilities = {
      val __obj = js.Dynamic.literal(attributeHook = attributeHook.asInstanceOf[js.Any], createArgs = createArgs.asInstanceOf[js.Any], createCaller = createCaller.asInstanceOf[js.Any], createInstance = createInstance.asInstanceOf[js.Any], dynamicLayout = dynamicLayout.asInstanceOf[js.Any], dynamicScope = dynamicScope.asInstanceOf[js.Any], dynamicTag = dynamicTag.asInstanceOf[js.Any], elementHook = elementHook.asInstanceOf[js.Any], hasSubOwner = hasSubOwner.asInstanceOf[js.Any], prepareArgs = prepareArgs.asInstanceOf[js.Any], updateHook = updateHook.asInstanceOf[js.Any], willDestroy = willDestroy.asInstanceOf[js.Any], wrapped = wrapped.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalComponentCapabilities]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalComponentCapabilities] (val x: Self) extends AnyVal {
      
      inline def setAttributeHook(value: Boolean): Self = StObject.set(x, "attributeHook", value.asInstanceOf[js.Any])
      
      inline def setCreateArgs(value: Boolean): Self = StObject.set(x, "createArgs", value.asInstanceOf[js.Any])
      
      inline def setCreateCaller(value: Boolean): Self = StObject.set(x, "createCaller", value.asInstanceOf[js.Any])
      
      inline def setCreateInstance(value: Boolean): Self = StObject.set(x, "createInstance", value.asInstanceOf[js.Any])
      
      inline def setDynamicLayout(value: Boolean): Self = StObject.set(x, "dynamicLayout", value.asInstanceOf[js.Any])
      
      inline def setDynamicScope(value: Boolean): Self = StObject.set(x, "dynamicScope", value.asInstanceOf[js.Any])
      
      inline def setDynamicTag(value: Boolean): Self = StObject.set(x, "dynamicTag", value.asInstanceOf[js.Any])
      
      inline def setElementHook(value: Boolean): Self = StObject.set(x, "elementHook", value.asInstanceOf[js.Any])
      
      inline def setHasSubOwner(value: Boolean): Self = StObject.set(x, "hasSubOwner", value.asInstanceOf[js.Any])
      
      inline def setPrepareArgs(value: Boolean): Self = StObject.set(x, "prepareArgs", value.asInstanceOf[js.Any])
      
      inline def setUpdateHook(value: Boolean): Self = StObject.set(x, "updateHook", value.asInstanceOf[js.Any])
      
      inline def setWillDestroy(value: Boolean): Self = StObject.set(x, "willDestroy", value.asInstanceOf[js.Any])
      
      inline def setWrapped(value: Boolean): Self = StObject.set(x, "wrapped", value.asInstanceOf[js.Any])
    }
  }
  
  object InternalComponentCapability {
    
    inline def AttributeHook: /* 0b0000000010000 */ Double = Double.asInstanceOf[/* 0b0000000010000 */ Double]
    
    inline def CreateArgs: /* 0b0000000001000 */ Double = Double.asInstanceOf[/* 0b0000000001000 */ Double]
    
    inline def CreateCaller: /* 0b0000010000000 */ Double = Double.asInstanceOf[/* 0b0000010000000 */ Double]
    
    inline def CreateInstance: /* 0b0001000000000 */ Double = Double.asInstanceOf[/* 0b0001000000000 */ Double]
    
    inline def DynamicLayout: /* 0b0000000000001 */ Double = Double.asInstanceOf[/* 0b0000000000001 */ Double]
    
    inline def DynamicScope: /* 0b0000001000000 */ Double = Double.asInstanceOf[/* 0b0000001000000 */ Double]
    
    inline def DynamicTag: /* 0b0000000000010 */ Double = Double.asInstanceOf[/* 0b0000000000010 */ Double]
    
    inline def ElementHook: /* 0b0000000100000 */ Double = Double.asInstanceOf[/* 0b0000000100000 */ Double]
    
    inline def HasSubOwner: /* 0b1000000000000 */ Double = Double.asInstanceOf[/* 0b1000000000000 */ Double]
    
    inline def PrepareArgs: /* 0b0000000000100 */ Double = Double.asInstanceOf[/* 0b0000000000100 */ Double]
    
    inline def UpdateHook: /* 0b0000100000000 */ Double = Double.asInstanceOf[/* 0b0000100000000 */ Double]
    
    inline def WillDestroy: /* 0b0100000000000 */ Double = Double.asInstanceOf[/* 0b0100000000000 */ Double]
    
    inline def Wrapped: /* 0b0010000000000 */ Double = Double.asInstanceOf[/* 0b0010000000000 */ Double]
  }
  type InternalComponentCapability = /* 0b0000000000001 */ Double
  
  trait InternalComponentManager[TComponentStateBucket, TComponentDefinition] extends StObject {
    
    def getCapabilities(state: TComponentDefinition): InternalComponentCapabilities
    
    def getDebugName(state: TComponentDefinition): String
    
    def getDestroyable(state: TComponentStateBucket): Option[Destroyable]
    
    def getSelf(state: TComponentStateBucket): Any
  }
  object InternalComponentManager {
    
    inline def apply[TComponentStateBucket, TComponentDefinition](
      getCapabilities: TComponentDefinition => InternalComponentCapabilities,
      getDebugName: TComponentDefinition => String,
      getDestroyable: TComponentStateBucket => Option[Destroyable],
      getSelf: TComponentStateBucket => Any
    ): InternalComponentManager[TComponentStateBucket, TComponentDefinition] = {
      val __obj = js.Dynamic.literal(getCapabilities = js.Any.fromFunction1(getCapabilities), getDebugName = js.Any.fromFunction1(getDebugName), getDestroyable = js.Any.fromFunction1(getDestroyable), getSelf = js.Any.fromFunction1(getSelf))
      __obj.asInstanceOf[InternalComponentManager[TComponentStateBucket, TComponentDefinition]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalComponentManager[?, ?], TComponentStateBucket, TComponentDefinition] (val x: Self & (InternalComponentManager[TComponentStateBucket, TComponentDefinition])) extends AnyVal {
      
      inline def setGetCapabilities(value: TComponentDefinition => InternalComponentCapabilities): Self = StObject.set(x, "getCapabilities", js.Any.fromFunction1(value))
      
      inline def setGetDebugName(value: TComponentDefinition => String): Self = StObject.set(x, "getDebugName", js.Any.fromFunction1(value))
      
      inline def setGetDestroyable(value: TComponentStateBucket => Option[Destroyable]): Self = StObject.set(x, "getDestroyable", js.Any.fromFunction1(value))
      
      inline def setGetSelf(value: TComponentStateBucket => Any): Self = StObject.set(x, "getSelf", js.Any.fromFunction1(value))
    }
  }
  
  trait Invocation extends StObject {
    
    var handle: Double
    
    var symbolTable: ProgramSymbolTable
  }
  object Invocation {
    
    inline def apply(handle: Double, symbolTable: ProgramSymbolTable): Invocation = {
      val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], symbolTable = symbolTable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Invocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Invocation] (val x: Self) extends AnyVal {
      
      inline def setHandle(value: Double): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setSymbolTable(value: ProgramSymbolTable): Self = StObject.set(x, "symbolTable", value.asInstanceOf[js.Any])
    }
  }
  
  trait WithAttributeHook[ComponentInstanceState]
    extends StObject
       with InternalComponentManager[ComponentInstanceState, js.Object] {
    
    def didSplatAttributes(component: ComponentInstanceState, element: ComponentInstanceState, operations: ElementOperations): Unit
  }
  object WithAttributeHook {
    
    inline def apply[ComponentInstanceState](
      didSplatAttributes: (ComponentInstanceState, ComponentInstanceState, ElementOperations) => Unit,
      getCapabilities: js.Object => InternalComponentCapabilities,
      getDebugName: js.Object => String,
      getDestroyable: ComponentInstanceState => Option[Destroyable],
      getSelf: ComponentInstanceState => Any
    ): WithAttributeHook[ComponentInstanceState] = {
      val __obj = js.Dynamic.literal(didSplatAttributes = js.Any.fromFunction3(didSplatAttributes), getCapabilities = js.Any.fromFunction1(getCapabilities), getDebugName = js.Any.fromFunction1(getDebugName), getDestroyable = js.Any.fromFunction1(getDestroyable), getSelf = js.Any.fromFunction1(getSelf))
      __obj.asInstanceOf[WithAttributeHook[ComponentInstanceState]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithAttributeHook[?], ComponentInstanceState] (val x: Self & WithAttributeHook[ComponentInstanceState]) extends AnyVal {
      
      inline def setDidSplatAttributes(value: (ComponentInstanceState, ComponentInstanceState, ElementOperations) => Unit): Self = StObject.set(x, "didSplatAttributes", js.Any.fromFunction3(value))
    }
  }
  
  trait WithCreateInstance[ComponentInstanceState, ComponentDefinitionState, O /* <: Owner */]
    extends StObject
       with InternalComponentManager[ComponentInstanceState, ComponentDefinitionState] {
    
    // The component manager is asked to create a bucket of state for
    // the supplied arguments. From the perspective of Glimmer, this is
    // an opaque token, but in practice it is probably a component object.
    def create(
      owner: O,
      state: ComponentDefinitionState,
      args: Option[VMArguments],
      env: Environment,
      dynamicScope: Option[DynamicScope],
      caller: Option[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any
        ],
      hasDefaultBlock: Boolean
    ): ComponentInstanceState
    
    // Once the whole top-down rendering process is complete, Glimmer invokes
    // the `didCreate` callbacks.
    def didCreate(state: ComponentInstanceState): Unit
    
    // This hook is run after the entire layout has been rendered.
    //
    // Hosts should use `didCreate`, which runs asynchronously after the rendering
    // process, to provide hooks for user code.
    def didRenderLayout(state: ComponentInstanceState, bounds: Bounds): Unit
    
    // Finally, once top-down revalidation has completed, Glimmer invokes
    // the `didUpdate` callbacks on components that changed.
    def didUpdate(state: ComponentInstanceState): Unit
    
    // This hook is run after the entire layout has been updated.
    //
    // Hosts should use `didUpdate`, which runs asynchronously after the rendering
    // process, to provide hooks for user code.
    def didUpdateLayout(state: ComponentInstanceState, bounds: Bounds): Unit
  }
  object WithCreateInstance {
    
    inline def apply[ComponentInstanceState, ComponentDefinitionState, O /* <: Owner */](
      create: (O, ComponentDefinitionState, Option[VMArguments], Environment, Option[DynamicScope], Option[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any
        ], Boolean) => ComponentInstanceState,
      didCreate: ComponentInstanceState => Unit,
      didRenderLayout: (ComponentInstanceState, Bounds) => Unit,
      didUpdate: ComponentInstanceState => Unit,
      didUpdateLayout: (ComponentInstanceState, Bounds) => Unit,
      getCapabilities: ComponentDefinitionState => InternalComponentCapabilities,
      getDebugName: ComponentDefinitionState => String,
      getDestroyable: ComponentInstanceState => Option[Destroyable],
      getSelf: ComponentInstanceState => Any
    ): WithCreateInstance[ComponentInstanceState, ComponentDefinitionState, O] = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction7(create), didCreate = js.Any.fromFunction1(didCreate), didRenderLayout = js.Any.fromFunction2(didRenderLayout), didUpdate = js.Any.fromFunction1(didUpdate), didUpdateLayout = js.Any.fromFunction2(didUpdateLayout), getCapabilities = js.Any.fromFunction1(getCapabilities), getDebugName = js.Any.fromFunction1(getDebugName), getDestroyable = js.Any.fromFunction1(getDestroyable), getSelf = js.Any.fromFunction1(getSelf))
      __obj.asInstanceOf[WithCreateInstance[ComponentInstanceState, ComponentDefinitionState, O]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithCreateInstance[?, ?, ?], ComponentInstanceState, ComponentDefinitionState, O /* <: Owner */] (val x: Self & (WithCreateInstance[ComponentInstanceState, ComponentDefinitionState, O])) extends AnyVal {
      
      inline def setCreate(
        value: (O, ComponentDefinitionState, Option[VMArguments], Environment, Option[DynamicScope], Option[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any
            ], Boolean) => ComponentInstanceState
      ): Self = StObject.set(x, "create", js.Any.fromFunction7(value))
      
      inline def setDidCreate(value: ComponentInstanceState => Unit): Self = StObject.set(x, "didCreate", js.Any.fromFunction1(value))
      
      inline def setDidRenderLayout(value: (ComponentInstanceState, Bounds) => Unit): Self = StObject.set(x, "didRenderLayout", js.Any.fromFunction2(value))
      
      inline def setDidUpdate(value: ComponentInstanceState => Unit): Self = StObject.set(x, "didUpdate", js.Any.fromFunction1(value))
      
      inline def setDidUpdateLayout(value: (ComponentInstanceState, Bounds) => Unit): Self = StObject.set(x, "didUpdateLayout", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait WithCustomDebugRenderTree[ComponentInstanceState, ComponentDefinitionState]
    extends StObject
       with InternalComponentManager[ComponentInstanceState, ComponentDefinitionState] {
    
    // APIs for hooking into the debug render tree, used by components that
    // represent multiple logical components. Specifically, {{mount}} and {{outlet}}
    def getDebugCustomRenderTree(definition: ComponentDefinitionState, state: ComponentInstanceState, args: CapturedArguments): js.Array[CustomRenderNode] = js.native
    def getDebugCustomRenderTree(
      definition: ComponentDefinitionState,
      state: ComponentInstanceState,
      args: CapturedArguments,
      template: String
    ): js.Array[CustomRenderNode] = js.native
  }
  
  trait WithDynamicLayout[I, R /* <: RuntimeResolver[Owner] */]
    extends StObject
       with InternalComponentManager[I, js.Object] {
    
    // Return the compiled layout to use for this component. This is called
    // *after* the component instance has been created, because you might
    // want to return a different layout per-instance for optimization reasons
    // or to implement features like Ember's "late-bound" layouts.
    def getDynamicLayout(component: I, resolver: R): CompilableProgram | Null
  }
  object WithDynamicLayout {
    
    inline def apply[I, R /* <: RuntimeResolver[Owner] */](
      getCapabilities: js.Object => InternalComponentCapabilities,
      getDebugName: js.Object => String,
      getDestroyable: I => Option[Destroyable],
      getDynamicLayout: (I, R) => CompilableProgram | Null,
      getSelf: I => Any
    ): WithDynamicLayout[I, R] = {
      val __obj = js.Dynamic.literal(getCapabilities = js.Any.fromFunction1(getCapabilities), getDebugName = js.Any.fromFunction1(getDebugName), getDestroyable = js.Any.fromFunction1(getDestroyable), getDynamicLayout = js.Any.fromFunction2(getDynamicLayout), getSelf = js.Any.fromFunction1(getSelf))
      __obj.asInstanceOf[WithDynamicLayout[I, R]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithDynamicLayout[?, ?], I, R /* <: RuntimeResolver[Owner] */] (val x: Self & (WithDynamicLayout[I, R])) extends AnyVal {
      
      inline def setGetDynamicLayout(value: (I, R) => CompilableProgram | Null): Self = StObject.set(x, "getDynamicLayout", js.Any.fromFunction2(value))
    }
  }
  
  trait WithDynamicTagName[ComponentInstanceState]
    extends StObject
       with InternalComponentManager[ComponentInstanceState, js.Object] {
    
    // If the component asks for the dynamic tag name capability, ask for
    // the tag name to use. (Only used in the "WrappedBuilder".)
    def getTagName(component: ComponentInstanceState): Option[String]
  }
  object WithDynamicTagName {
    
    inline def apply[ComponentInstanceState](
      getCapabilities: js.Object => InternalComponentCapabilities,
      getDebugName: js.Object => String,
      getDestroyable: ComponentInstanceState => Option[Destroyable],
      getSelf: ComponentInstanceState => Any,
      getTagName: ComponentInstanceState => Option[String]
    ): WithDynamicTagName[ComponentInstanceState] = {
      val __obj = js.Dynamic.literal(getCapabilities = js.Any.fromFunction1(getCapabilities), getDebugName = js.Any.fromFunction1(getDebugName), getDestroyable = js.Any.fromFunction1(getDestroyable), getSelf = js.Any.fromFunction1(getSelf), getTagName = js.Any.fromFunction1(getTagName))
      __obj.asInstanceOf[WithDynamicTagName[ComponentInstanceState]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithDynamicTagName[?], ComponentInstanceState] (val x: Self & WithDynamicTagName[ComponentInstanceState]) extends AnyVal {
      
      inline def setGetTagName(value: ComponentInstanceState => Option[String]): Self = StObject.set(x, "getTagName", js.Any.fromFunction1(value))
    }
  }
  
  trait WithElementHook[ComponentInstanceState]
    extends StObject
       with InternalComponentManager[ComponentInstanceState, js.Object] {
    
    // The `didCreateElement` hook is run for non-tagless components after the
    // element as been created, but before it has been appended ("flushed") to
    // the DOM. This hook allows the manager to save off the element, as well as
    // install other dynamic attributes via the ElementOperations object.
    //
    // Hosts should use `didCreate`, which runs asynchronously after the rendering
    // process, to provide hooks for user code.
    def didCreateElement(component: ComponentInstanceState, element: SimpleElement, operations: ElementOperations): Unit
  }
  object WithElementHook {
    
    inline def apply[ComponentInstanceState](
      didCreateElement: (ComponentInstanceState, SimpleElement, ElementOperations) => Unit,
      getCapabilities: js.Object => InternalComponentCapabilities,
      getDebugName: js.Object => String,
      getDestroyable: ComponentInstanceState => Option[Destroyable],
      getSelf: ComponentInstanceState => Any
    ): WithElementHook[ComponentInstanceState] = {
      val __obj = js.Dynamic.literal(didCreateElement = js.Any.fromFunction3(didCreateElement), getCapabilities = js.Any.fromFunction1(getCapabilities), getDebugName = js.Any.fromFunction1(getDebugName), getDestroyable = js.Any.fromFunction1(getDestroyable), getSelf = js.Any.fromFunction1(getSelf))
      __obj.asInstanceOf[WithElementHook[ComponentInstanceState]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithElementHook[?], ComponentInstanceState] (val x: Self & WithElementHook[ComponentInstanceState]) extends AnyVal {
      
      inline def setDidCreateElement(value: (ComponentInstanceState, SimpleElement, ElementOperations) => Unit): Self = StObject.set(x, "didCreateElement", js.Any.fromFunction3(value))
    }
  }
  
  trait WithPrepareArgs[ComponentInstanceState, ComponentDefinitionState]
    extends StObject
       with InternalComponentManager[ComponentInstanceState, ComponentDefinitionState] {
    
    // The component manager is asked to prepare the arguments needed
    // for `create`. This allows for things like closure> components where the
    // args need to be curried before constructing the instance of the state
    // bucket.
    def prepareArgs(state: ComponentDefinitionState, args: VMArguments): Option[PreparedArguments]
  }
  object WithPrepareArgs {
    
    inline def apply[ComponentInstanceState, ComponentDefinitionState](
      getCapabilities: ComponentDefinitionState => InternalComponentCapabilities,
      getDebugName: ComponentDefinitionState => String,
      getDestroyable: ComponentInstanceState => Option[Destroyable],
      getSelf: ComponentInstanceState => Any,
      prepareArgs: (ComponentDefinitionState, VMArguments) => Option[PreparedArguments]
    ): WithPrepareArgs[ComponentInstanceState, ComponentDefinitionState] = {
      val __obj = js.Dynamic.literal(getCapabilities = js.Any.fromFunction1(getCapabilities), getDebugName = js.Any.fromFunction1(getDebugName), getDestroyable = js.Any.fromFunction1(getDestroyable), getSelf = js.Any.fromFunction1(getSelf), prepareArgs = js.Any.fromFunction2(prepareArgs))
      __obj.asInstanceOf[WithPrepareArgs[ComponentInstanceState, ComponentDefinitionState]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithPrepareArgs[?, ?], ComponentInstanceState, ComponentDefinitionState] (val x: Self & (WithPrepareArgs[ComponentInstanceState, ComponentDefinitionState])) extends AnyVal {
      
      inline def setPrepareArgs(value: (ComponentDefinitionState, VMArguments) => Option[PreparedArguments]): Self = StObject.set(x, "prepareArgs", js.Any.fromFunction2(value))
    }
  }
  
  trait WithSubOwner[ComponentInstanceState, ComponentDefinitionState]
    extends StObject
       with InternalComponentManager[ComponentInstanceState, ComponentDefinitionState] {
    
    def getOwner(state: ComponentInstanceState): Owner
  }
  object WithSubOwner {
    
    inline def apply[ComponentInstanceState, ComponentDefinitionState](
      getCapabilities: ComponentDefinitionState => InternalComponentCapabilities,
      getDebugName: ComponentDefinitionState => String,
      getDestroyable: ComponentInstanceState => Option[Destroyable],
      getOwner: ComponentInstanceState => Owner,
      getSelf: ComponentInstanceState => Any
    ): WithSubOwner[ComponentInstanceState, ComponentDefinitionState] = {
      val __obj = js.Dynamic.literal(getCapabilities = js.Any.fromFunction1(getCapabilities), getDebugName = js.Any.fromFunction1(getDebugName), getDestroyable = js.Any.fromFunction1(getDestroyable), getOwner = js.Any.fromFunction1(getOwner), getSelf = js.Any.fromFunction1(getSelf))
      __obj.asInstanceOf[WithSubOwner[ComponentInstanceState, ComponentDefinitionState]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithSubOwner[?, ?], ComponentInstanceState, ComponentDefinitionState] (val x: Self & (WithSubOwner[ComponentInstanceState, ComponentDefinitionState])) extends AnyVal {
      
      inline def setGetOwner(value: ComponentInstanceState => Owner): Self = StObject.set(x, "getOwner", js.Any.fromFunction1(value))
    }
  }
  
  trait WithUpdateHook[ComponentInstanceState]
    extends StObject
       with InternalComponentManager[ComponentInstanceState, js.Object] {
    
    // When the component's tag has invalidated, the manager's `update` hook is
    // called.
    def update(state: ComponentInstanceState, dynamicScope: Option[DynamicScope]): Unit
  }
  object WithUpdateHook {
    
    inline def apply[ComponentInstanceState](
      getCapabilities: js.Object => InternalComponentCapabilities,
      getDebugName: js.Object => String,
      getDestroyable: ComponentInstanceState => Option[Destroyable],
      getSelf: ComponentInstanceState => Any,
      update: (ComponentInstanceState, Option[DynamicScope]) => Unit
    ): WithUpdateHook[ComponentInstanceState] = {
      val __obj = js.Dynamic.literal(getCapabilities = js.Any.fromFunction1(getCapabilities), getDebugName = js.Any.fromFunction1(getDebugName), getDestroyable = js.Any.fromFunction1(getDestroyable), getSelf = js.Any.fromFunction1(getSelf), update = js.Any.fromFunction2(update))
      __obj.asInstanceOf[WithUpdateHook[ComponentInstanceState]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithUpdateHook[?], ComponentInstanceState] (val x: Self & WithUpdateHook[ComponentInstanceState]) extends AnyVal {
      
      inline def setUpdate(value: (ComponentInstanceState, Option[DynamicScope]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    }
  }
}
