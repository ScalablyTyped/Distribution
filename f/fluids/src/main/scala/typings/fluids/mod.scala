package typings.fluids

import org.scalablytyped.runtime.TopLevel
import typings.fluids.fluidsStrings.change
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fluids", "FluidValue")
  @js.native
  abstract class FluidValue[T, Event /* <: FluidEvent[T] */] () extends FluidConfig[T, Event]
  
  @JSImport("fluids", "addFluidObserver")
  @js.native
  def addFluidObserver(target: js.Object, observer: FluidObserver[_]): js.UndefOr[js.Function0[Unit]] = js.native
  /** Add an observer to a fluid object. Returns an unsubscribe function if the target is a fluid object, otherwise undefined. */
  @JSImport("fluids", "addFluidObserver")
  @js.native
  def addFluidObserver[E /* <: FluidEvent[_] */](target: FluidValue[_, E], observer: FluidObserver[E]): js.Function0[Unit] = js.native
  
  /** Get the methods for observing the given object. Returns undefined if not a fluid object. */
  @JSImport("fluids", "getFluidConfig")
  @js.native
  def getFluidConfig[T](arg: T): GetFluidConfig_[T] = js.native
  
  /** Get the current value of a fluid object. Returns the first argument when it's not a fluid object. */
  @JSImport("fluids", "getFluidValue")
  @js.native
  def getFluidValue[T, U](target: T): (Exclude[T, FluidValue[_, _]]) | U = js.native
  @JSImport("fluids", "getFluidValue")
  @js.native
  def getFluidValue[T, U](target: FluidValue[U, _]): (Exclude[T, FluidValue[_, _]]) | U = js.native
  
  /** Does the given value have a `FluidConfig` object? */
  @JSImport("fluids", "hasFluidValue")
  @js.native
  def hasFluidValue(arg: js.Any): /* is fluids.fluids.FluidValue<any, any> */ Boolean = js.native
  
  /** Set the methods for observing the given object. */
  @JSImport("fluids", "setFluidConfig")
  @js.native
  def setFluidConfig(target: js.Object, config: FluidConfig[_, _]): Unit = js.native
  
  @js.native
  trait ChangeEvent[T] extends StObject {
    
    var parent: FluidValue[T, _] = js.native
    
    var `type`: change = js.native
    
    var value: T = js.native
  }
  object ChangeEvent {
    
    @scala.inline
    def apply[T](parent: FluidValue[T, _], `type`: change, value: T): ChangeEvent[T] = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeEvent[T]]
    }
    
    @scala.inline
    implicit class ChangeEventMutableBuilder[Self <: ChangeEvent[_], T] (val x: Self with ChangeEvent[T]) extends AnyVal {
      
      @scala.inline
      def setParent(value: FluidValue[T, _]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: change): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FluidConfig[T, Event /* <: FluidEvent[T] */] extends StObject {
    
    def addChild(child: FluidObserver[Event]): Unit = js.native
    
    def get(): T = js.native
    
    def removeChild(child: FluidObserver[Event]): Unit = js.native
  }
  object FluidConfig {
    
    @scala.inline
    def apply[T, Event /* <: FluidEvent[T] */](addChild: FluidObserver[Event] => Unit, get: () => T, removeChild: FluidObserver[Event] => Unit): FluidConfig[T, Event] = {
      val __obj = js.Dynamic.literal(addChild = js.Any.fromFunction1(addChild), get = js.Any.fromFunction0(get), removeChild = js.Any.fromFunction1(removeChild))
      __obj.asInstanceOf[FluidConfig[T, Event]]
    }
    
    @scala.inline
    implicit class FluidConfigMutableBuilder[Self <: FluidConfig[_, _], T, Event /* <: FluidEvent[T] */] (val x: Self with (FluidConfig[T, Event])) extends AnyVal {
      
      @scala.inline
      def setAddChild(value: FluidObserver[Event] => Unit): Self = StObject.set(x, "addChild", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveChild(value: FluidObserver[Event] => Unit): Self = StObject.set(x, "removeChild", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait FluidEvent[T] extends StObject {
    
    var parent: FluidValue[T, _] = js.native
    
    var `type`: String = js.native
  }
  object FluidEvent {
    
    @scala.inline
    def apply[T](parent: FluidValue[T, _], `type`: String): FluidEvent[T] = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FluidEvent[T]]
    }
    
    @scala.inline
    implicit class FluidEventMutableBuilder[Self <: FluidEvent[_], T] (val x: Self with FluidEvent[T]) extends AnyVal {
      
      @scala.inline
      def setParent(value: FluidValue[T, _]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FluidObserver[Event /* <: FluidEvent[_] */] extends StObject {
    
    def onParentChange(event: Event): Unit = js.native
    def onParentChange(event: ChangeEvent[_]): Unit = js.native
  }
  
  type FluidProps[T] = js.Any | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] | fluids.fluids.FluidValue<std.Exclude<T[P], void>, any>}
    */ typings.fluids.fluidsStrings.FluidProps with TopLevel[js.Any])
  
  type GetFluidConfig_[T] = js.UndefOr[FluidConfig[js.Any, js.Any]]
}
