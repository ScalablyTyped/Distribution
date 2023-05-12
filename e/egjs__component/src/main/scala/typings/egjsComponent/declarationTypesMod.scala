package typings.egjsComponent

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationTypesMod {
  
  @js.native
  trait AnyFunction extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  @js.native
  trait ComponentEventConstructor
    extends StObject
       with Instantiable1[/* eventType */ String, DefaultProps[String, js.Object]]
       with Instantiable2[
          /* eventType */ String, 
          /* props */ Record[String, Any], 
          (DefaultProps[String, js.Object]) & (Record[String, Any])
        ]
  
  trait DefaultProps[TYPE /* <: String */, THIS] extends StObject {
    
    var currentTarget: THIS
    
    var eventType: TYPE
    
    def isCanceled(): Boolean
    
    def stop(): Unit
  }
  object DefaultProps {
    
    inline def apply[TYPE /* <: String */, THIS](currentTarget: THIS, eventType: TYPE, isCanceled: () => Boolean, stop: () => Unit): DefaultProps[TYPE, THIS] = {
      val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], isCanceled = js.Any.fromFunction0(isCanceled), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[DefaultProps[TYPE, THIS]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultProps[?, ?], TYPE /* <: String */, THIS] (val x: Self & (DefaultProps[TYPE, THIS])) extends AnyVal {
      
      inline def setCurrentTarget(value: THIS): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setEventType(value: TYPE): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      inline def setIsCanceled(value: () => Boolean): Self = StObject.set(x, "isCanceled", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T[K] extends @egjs/component.@egjs/component/declaration/types.NoArguments ? (): any : T[K] extends @egjs/component.@egjs/component/declaration/types.AnyFunction ? T[K] : T[K] extends @egjs/component.@egjs/component/declaration/ComponentEvent.ComponentEvent<infer PROPS, string, any> ? (event : @egjs/component.@egjs/component/declaration/ComponentEvent.ComponentEvent<PROPS, K, THIS>): any : (event : T[K]): any
    }}}
    */
  type EventCallback[T /* <: EventMap */, K /* <: EventKey[T] */, THIS] = js.Function0[Any]
  
  type EventHash[T /* <: EventMap */, THIS] = Partial[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in @egjs/component.@egjs/component/declaration/types.EventKey<T> ]: @egjs/component.@egjs/component/declaration/types.EventCallback<T, K, THIS>} */ js.Any
  ]
  
  type EventKey[T] = String
  
  type EventMap = Record[String, Any]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T[K] extends @egjs/component.@egjs/component/declaration/types.NoArguments ? std.Array<void> : T[K] extends @egjs/component.@egjs/component/declaration/types.AnyFunction ? std.Parameters<T[K]> : [T[K]]
    }}}
    */
  type EventTriggerParams[T, K /* <: EventKey[T] */] = js.Array[Unit]
  
  type NoArguments = js.UndefOr[Null | Unit]
}
