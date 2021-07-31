package typings.diagnosticChannel

import typings.diagnosticChannel.patchRequireMod.IModulePatchMap
import typings.diagnosticChannel.patchRequireMod.IModulePatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("diagnostic-channel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("diagnostic-channel", "channel")
  @js.native
  val channel: IChannel = js.native
  
  @scala.inline
  def makePatchingRequire(knownPatches: IModulePatchMap): js.Function1[/* moduleId */ String, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makePatchingRequire")(knownPatches.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* moduleId */ String, js.Any]]
  
  @js.native
  trait IChannel extends StObject {
    
    def addContextPreservation[T /* <: js.Function */](preserver: js.Function1[/* cb */ T, T]): Unit = js.native
    
    def bindToContext[T /* <: js.Function */](cb: T): T = js.native
    
    def publish[T](name: String, event: T): Unit = js.native
    
    def registerMonkeyPatch(packageName: String, patcher: IModulePatcher): Unit = js.native
    
    def shouldPublish(name: String): Boolean = js.native
    
    var spanContextPropagator: ScopeManager = js.native
    
    def subscribe[T](name: String, listener: ISubscriber[T]): Unit = js.native
    def subscribe[T](name: String, listener: ISubscriber[T], filter: IFilter): Unit = js.native
    
    def unsubscribe[T](name: String, listener: ISubscriber[T]): Unit = js.native
    def unsubscribe[T](name: String, listener: ISubscriber[T], filter: IFilter): Unit = js.native
  }
  
  type IFilter = js.Function1[/* publishing */ Boolean, Boolean]
  
  trait ISpanContext extends StObject {
    
    var spanId: String
    
    var traceFlags: js.UndefOr[String] = js.undefined
    
    var traceId: String
    
    var tracestate: js.UndefOr[String] = js.undefined
  }
  object ISpanContext {
    
    @scala.inline
    def apply(spanId: String, traceId: String): ISpanContext = {
      val __obj = js.Dynamic.literal(spanId = spanId.asInstanceOf[js.Any], traceId = traceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISpanContext]
    }
    
    @scala.inline
    implicit class ISpanContextMutableBuilder[Self <: ISpanContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSpanId(value: String): Self = StObject.set(x, "spanId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceFlags(value: String): Self = StObject.set(x, "traceFlags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceFlagsUndefined: Self = StObject.set(x, "traceFlags", js.undefined)
      
      @scala.inline
      def setTraceId(value: String): Self = StObject.set(x, "traceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTracestate(value: String): Self = StObject.set(x, "tracestate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTracestateUndefined: Self = StObject.set(x, "tracestate", js.undefined)
    }
  }
  
  trait IStandardEvent[T] extends StObject {
    
    var data: T
    
    var timestamp: Double
  }
  object IStandardEvent {
    
    @scala.inline
    def apply[T](data: T, timestamp: Double): IStandardEvent[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStandardEvent[T]]
    }
    
    @scala.inline
    implicit class IStandardEventMutableBuilder[Self <: IStandardEvent[?], T] (val x: Self & IStandardEvent[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  type ISubscriber[T] = js.Function1[/* event */ IStandardEvent[T], Unit]
  
  type ScopeManager = js.Any
}
