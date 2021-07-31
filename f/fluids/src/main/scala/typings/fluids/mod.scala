package typings.fluids

import org.scalablytyped.runtime.TopLevel
import typings.fluids.fluidsStrings.change
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fluids", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fluids", "FluidValue")
  @js.native
  abstract class FluidValue[T, Event /* <: FluidEvent[T] */] ()
    extends StObject
       with FluidConfig[T, Event] {
    
    /* CompleteClass */
    override def addChild(child: FluidObserver[Event]): Unit = js.native
    
    /* CompleteClass */
    override def get(): T = js.native
    
    /* CompleteClass */
    override def removeChild(child: FluidObserver[Event]): Unit = js.native
  }
  
  @scala.inline
  def addFluidObserver(target: js.Object, observer: FluidObserver[js.Any]): js.UndefOr[js.Function0[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("addFluidObserver")(target.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Function0[Unit]]]
  /** Add an observer to a fluid object. Returns an unsubscribe function if the target is a fluid object, otherwise undefined. */
  @scala.inline
  def addFluidObserver[E /* <: FluidEvent[js.Any] */](target: FluidValue[js.Any, E], observer: FluidObserver[E]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("addFluidObserver")(target.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  /** Get the methods for observing the given object. Returns undefined if not a fluid object. */
  @scala.inline
  def getFluidConfig[T](arg: T): GetFluidConfig_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFluidConfig")(arg.asInstanceOf[js.Any]).asInstanceOf[GetFluidConfig_[T]]
  
  /** Get the current value of a fluid object. Returns the first argument when it's not a fluid object. */
  @scala.inline
  def getFluidValue[T, U](target: T): (Exclude[T, FluidValue[js.Any, js.Any]]) | U = ^.asInstanceOf[js.Dynamic].applyDynamic("getFluidValue")(target.asInstanceOf[js.Any]).asInstanceOf[(Exclude[T, FluidValue[js.Any, js.Any]]) | U]
  @scala.inline
  def getFluidValue[T, U](target: FluidValue[U, js.Any]): (Exclude[T, FluidValue[js.Any, js.Any]]) | U = ^.asInstanceOf[js.Dynamic].applyDynamic("getFluidValue")(target.asInstanceOf[js.Any]).asInstanceOf[(Exclude[T, FluidValue[js.Any, js.Any]]) | U]
  
  /** Does the given value have a `FluidConfig` object? */
  @scala.inline
  def hasFluidValue(arg: js.Any): /* is fluids.fluids.FluidValue<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasFluidValue")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is fluids.fluids.FluidValue<any, any> */ Boolean]
  
  /** Set the methods for observing the given object. */
  @scala.inline
  def setFluidConfig(target: js.Object, config: FluidConfig[js.Any, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFluidConfig")(target.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ChangeEvent[T] extends StObject {
    
    var parent: FluidValue[T, js.Any]
    
    var `type`: change
    
    var value: T
  }
  object ChangeEvent {
    
    @scala.inline
    def apply[T](parent: FluidValue[T, js.Any], value: T): ChangeEvent[T] = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("change")
      __obj.asInstanceOf[ChangeEvent[T]]
    }
    
    @scala.inline
    implicit class ChangeEventMutableBuilder[Self <: ChangeEvent[?], T] (val x: Self & ChangeEvent[T]) extends AnyVal {
      
      @scala.inline
      def setParent(value: FluidValue[T, js.Any]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: change): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait FluidConfig[T, Event /* <: FluidEvent[T] */] extends StObject {
    
    def addChild(child: FluidObserver[Event]): Unit
    
    def get(): T
    
    def removeChild(child: FluidObserver[Event]): Unit
  }
  object FluidConfig {
    
    @scala.inline
    def apply[T, Event /* <: FluidEvent[T] */](addChild: FluidObserver[Event] => Unit, get: () => T, removeChild: FluidObserver[Event] => Unit): FluidConfig[T, Event] = {
      val __obj = js.Dynamic.literal(addChild = js.Any.fromFunction1(addChild), get = js.Any.fromFunction0(get), removeChild = js.Any.fromFunction1(removeChild))
      __obj.asInstanceOf[FluidConfig[T, Event]]
    }
    
    @scala.inline
    implicit class FluidConfigMutableBuilder[Self <: FluidConfig[?, ?], T, Event /* <: FluidEvent[T] */] (val x: Self & (FluidConfig[T, Event])) extends AnyVal {
      
      @scala.inline
      def setAddChild(value: FluidObserver[Event] => Unit): Self = StObject.set(x, "addChild", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveChild(value: FluidObserver[Event] => Unit): Self = StObject.set(x, "removeChild", js.Any.fromFunction1(value))
    }
  }
  
  trait FluidEvent[T] extends StObject {
    
    var parent: FluidValue[T, js.Any]
    
    var `type`: String
  }
  object FluidEvent {
    
    @scala.inline
    def apply[T](parent: FluidValue[T, js.Any], `type`: String): FluidEvent[T] = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FluidEvent[T]]
    }
    
    @scala.inline
    implicit class FluidEventMutableBuilder[Self <: FluidEvent[?], T] (val x: Self & FluidEvent[T]) extends AnyVal {
      
      @scala.inline
      def setParent(value: FluidValue[T, js.Any]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FluidObserver[Event /* <: FluidEvent[js.Any] */] extends StObject {
    
    def onParentChange(event: Event): Unit = js.native
    def onParentChange(event: ChangeEvent[js.Any]): Unit = js.native
  }
  
  type FluidProps[T] = js.Any | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] | fluids.fluids.FluidValue<std.Exclude<T[P], void>, any>}
    */ typings.fluids.fluidsStrings.FluidProps & TopLevel[js.Any])
  
  type GetFluidConfig_[T] = js.UndefOr[FluidConfig[js.Any, js.Any]]
}
