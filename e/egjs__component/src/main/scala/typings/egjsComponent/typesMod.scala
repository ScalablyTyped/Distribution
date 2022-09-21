package typings.egjsComponent

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.egjsComponent.componentEventMod.ComponentEvent
import typings.std.Parameters
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
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
    
    extension [Self <: DefaultProps[?, ?], TYPE /* <: String */, THIS](x: Self & (DefaultProps[TYPE, THIS])) {
      
      inline def setCurrentTarget(value: THIS): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setEventType(value: TYPE): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      inline def setIsCanceled(value: () => Boolean): Self = StObject.set(x, "isCanceled", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  type EventCallback[T /* <: EventMap */, K /* <: EventKey[T] */, THIS] = (js.Function1[
    (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* event */ js.Any) | (/* event */ ComponentEvent[Any, K, THIS]), 
    Any
  ]) | (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any) | js.Function0[Any]
  
  type EventHash[T /* <: EventMap */, THIS] = Partial[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in @egjs/component.@egjs/component/declaration/types.EventKey<T> ]: @egjs/component.@egjs/component/declaration/types.EventCallback<T, K, THIS>}
    */ typings.egjsComponent.egjsComponentStrings.EventHash & TopLevel[Any]
  ]
  
  type EventKey[T /* <: EventMap */] = String
  
  type EventMap = Record[String, Any]
  
  type EventTriggerParams[T, K /* <: EventKey[T] */] = (js.Array[
    (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any) | Unit
  ]) | (Parameters[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ])
  
  type NoArguments = js.UndefOr[Null | Unit]
}
