package typings.glimmerInterfaces

import typings.glimmerInterfaces.distTypesLibCoreMod.Destroyable
import typings.glimmerInterfaces.distTypesLibRuntimeArgumentsMod.CapturedArguments
import typings.glimmerInterfaces.distTypesLibRuntimeModifierMod.ModifierDefinitionState
import typings.glimmerInterfaces.distTypesLibRuntimeOwnerMod.Owner
import typings.simpleDomInterface.mod.SimpleElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibManagersInternalModifierMod {
  
  trait InternalModifierManager[TModifierInstanceState, TModifierDefinitionState /* <: ModifierDefinitionState */] extends StObject {
    
    // Create is meant to only produce the state bucket
    def create(owner: Owner, element: SimpleElement, state: TModifierDefinitionState, args: CapturedArguments): TModifierInstanceState
    
    def getDebugName(Modifier: TModifierDefinitionState): String
    
    // Convert the opaque token into an object that implements Destroyable.
    // If it returns null, the modifier will not be destroyed.
    def getDestroyable(modifier: TModifierInstanceState): Destroyable | Null
    
    // Convert the opaque modifier into a `RevisionTag` that determins when
    // the modifier's update hooks need to be called (if at all).
    def getTag(modifier: TModifierInstanceState): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdatableTag */ Any) | Null
    
    // At initial render, the modifier gets a chance to install itself on the
    // element it is managing. It can also return a bucket of state that
    // it could use at update time. From the perspective of Glimmer, this
    // is an opaque token.
    def install(modifier: TModifierInstanceState): Unit
    
    // When the modifier's tag has invalidated, the manager's `update` hook is
    // called.
    def update(modifier: TModifierInstanceState): Unit
  }
  object InternalModifierManager {
    
    inline def apply[TModifierInstanceState, TModifierDefinitionState /* <: ModifierDefinitionState */](
      create: (Owner, SimpleElement, TModifierDefinitionState, CapturedArguments) => TModifierInstanceState,
      getDebugName: TModifierDefinitionState => String,
      getDestroyable: TModifierInstanceState => Destroyable | Null,
      getTag: TModifierInstanceState => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdatableTag */ Any) | Null,
      install: TModifierInstanceState => Unit,
      update: TModifierInstanceState => Unit
    ): InternalModifierManager[TModifierInstanceState, TModifierDefinitionState] = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction4(create), getDebugName = js.Any.fromFunction1(getDebugName), getDestroyable = js.Any.fromFunction1(getDestroyable), getTag = js.Any.fromFunction1(getTag), install = js.Any.fromFunction1(install), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[InternalModifierManager[TModifierInstanceState, TModifierDefinitionState]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalModifierManager[?, ?], TModifierInstanceState, TModifierDefinitionState /* <: ModifierDefinitionState */] (val x: Self & (InternalModifierManager[TModifierInstanceState, TModifierDefinitionState])) extends AnyVal {
      
      inline def setCreate(
        value: (Owner, SimpleElement, TModifierDefinitionState, CapturedArguments) => TModifierInstanceState
      ): Self = StObject.set(x, "create", js.Any.fromFunction4(value))
      
      inline def setGetDebugName(value: TModifierDefinitionState => String): Self = StObject.set(x, "getDebugName", js.Any.fromFunction1(value))
      
      inline def setGetDestroyable(value: TModifierInstanceState => Destroyable | Null): Self = StObject.set(x, "getDestroyable", js.Any.fromFunction1(value))
      
      inline def setGetTag(
        value: TModifierInstanceState => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdatableTag */ Any) | Null
      ): Self = StObject.set(x, "getTag", js.Any.fromFunction1(value))
      
      inline def setInstall(value: TModifierInstanceState => Unit): Self = StObject.set(x, "install", js.Any.fromFunction1(value))
      
      inline def setUpdate(value: TModifierInstanceState => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
}
