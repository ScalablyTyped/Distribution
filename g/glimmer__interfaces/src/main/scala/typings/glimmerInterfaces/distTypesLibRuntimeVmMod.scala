package typings.glimmerInterfaces

import typings.glimmerInterfaces.distTypesLibCoreMod.Destroyable
import typings.glimmerInterfaces.distTypesLibDomChangesMod.GlimmerTreeChanges
import typings.glimmerInterfaces.distTypesLibRuntimeEnvironmentMod.Environment
import typings.glimmerInterfaces.distTypesLibRuntimeOwnerMod.Owner
import typings.glimmerInterfaces.distTypesLibRuntimeRenderMod.ExceptionHandler
import typings.glimmerInterfaces.distTypesLibRuntimeScopeMod.DynamicScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibRuntimeVmMod {
  
  trait UpdatingOpcode extends StObject {
    
    def evaluate(vm: UpdatingVM): Unit
  }
  object UpdatingOpcode {
    
    inline def apply(evaluate: UpdatingVM => Unit): UpdatingOpcode = {
      val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction1(evaluate))
      __obj.asInstanceOf[UpdatingOpcode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdatingOpcode] (val x: Self) extends AnyVal {
      
      inline def setEvaluate(value: UpdatingVM => Unit): Self = StObject.set(x, "evaluate", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait UpdatingVM extends StObject {
    
    var alwaysRevalidate: Boolean = js.native
    
    var dom: GlimmerTreeChanges = js.native
    
    var env: Environment = js.native
    
    def execute(opcodes: js.Array[UpdatingOpcode], handler: ExceptionHandler): Unit = js.native
    
    def goto(index: Double): Unit = js.native
    
    def `throw`(): Unit = js.native
    
    def `try`(ops: js.Array[UpdatingOpcode]): Unit = js.native
    def `try`(ops: js.Array[UpdatingOpcode], handler: ExceptionHandler): Unit = js.native
  }
  
  trait VM[O /* <: Owner */] extends StObject {
    
    def associateDestroyable(child: Destroyable): Unit
    
    def dynamicScope(): DynamicScope
    
    var env: Environment
    
    def getOwner(): O
    
    def getSelf(): Any
  }
  object VM {
    
    inline def apply[O /* <: Owner */](
      associateDestroyable: Destroyable => Unit,
      dynamicScope: () => DynamicScope,
      env: Environment,
      getOwner: () => O,
      getSelf: () => Any
    ): VM[O] = {
      val __obj = js.Dynamic.literal(associateDestroyable = js.Any.fromFunction1(associateDestroyable), dynamicScope = js.Any.fromFunction0(dynamicScope), env = env.asInstanceOf[js.Any], getOwner = js.Any.fromFunction0(getOwner), getSelf = js.Any.fromFunction0(getSelf))
      __obj.asInstanceOf[VM[O]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VM[?], O /* <: Owner */] (val x: Self & VM[O]) extends AnyVal {
      
      inline def setAssociateDestroyable(value: Destroyable => Unit): Self = StObject.set(x, "associateDestroyable", js.Any.fromFunction1(value))
      
      inline def setDynamicScope(value: () => DynamicScope): Self = StObject.set(x, "dynamicScope", js.Any.fromFunction0(value))
      
      inline def setEnv(value: Environment): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setGetOwner(value: () => O): Self = StObject.set(x, "getOwner", js.Any.fromFunction0(value))
      
      inline def setGetSelf(value: () => Any): Self = StObject.set(x, "getSelf", js.Any.fromFunction0(value))
    }
  }
}
