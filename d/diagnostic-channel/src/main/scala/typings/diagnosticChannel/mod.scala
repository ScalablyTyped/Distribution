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
  
  @JSImport("diagnostic-channel", "ContextPreservingEventEmitter")
  @js.native
  open class ContextPreservingEventEmitter ()
    extends StObject
       with IChannel {
    
    /* private */ var checkIfModuleIsAlreadyPatched: Any = js.native
    
    /* private */ var contextPreservationFunction: Any = js.native
    
    /* private */ var currentlyPublishing: Any = js.native
    
    /* private */ var knownPatches: Any = js.native
    
    var modulesPatched: js.Array[IPatchedModule] = js.native
    
    def reset(): Unit = js.native
    
    var spanContextPropagator: ScopeManager = js.native
    
    /* private */ var subscribers: Any = js.native
    
    var version: String = js.native
  }
  
  @JSImport("diagnostic-channel", "channel")
  @js.native
  val channel: IChannel = js.native
  
  inline def makePatchingRequire(knownPatches: IModulePatchMap): js.Function1[/* moduleId */ String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makePatchingRequire")(knownPatches.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* moduleId */ String, Any]]
  
  inline def trueFilter(publishing: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("trueFilter")(publishing.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @js.native
  trait IChannel extends StObject {
    
    def addContextPreservation[T /* <: js.Function */](preserver: js.Function1[/* cb */ T, T]): Unit = js.native
    
    def addPatchedModule(moduleName: String, version: String): Unit = js.native
    
    def bindToContext[T /* <: js.Function */](cb: T): T = js.native
    
    def getPatchesObject(): IModulePatchMap = js.native
    
    def publish[T](name: String, event: T): Unit = js.native
    
    def registerMonkeyPatch(packageName: String, patcher: IModulePatcher): Unit = js.native
    
    def shouldPublish(name: String): Boolean = js.native
    
    def subscribe[T](name: String, listener: ISubscriber[T]): Unit = js.native
    def subscribe[T](name: String, listener: ISubscriber[T], filter: Unit, patchCallback: IPatchedCallback): Unit = js.native
    def subscribe[T](name: String, listener: ISubscriber[T], filter: IFilter): Unit = js.native
    def subscribe[T](name: String, listener: ISubscriber[T], filter: IFilter, patchCallback: IPatchedCallback): Unit = js.native
    
    def unsubscribe[T](name: String, listener: ISubscriber[T]): Unit = js.native
    def unsubscribe[T](name: String, listener: ISubscriber[T], filter: IFilter): Unit = js.native
  }
  
  type IFilter = js.Function1[/* publishing */ Boolean, Boolean]
  
  type IPatchedCallback = js.Function2[/* moduleName */ String, /* version */ String, Unit]
  
  trait IPatchedModule extends StObject {
    
    var name: String
    
    var version: String
  }
  object IPatchedModule {
    
    inline def apply(name: String, version: String): IPatchedModule = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPatchedModule]
    }
    
    extension [Self <: IPatchedModule](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISpanContext extends StObject {
    
    var spanId: String
    
    var traceFlags: js.UndefOr[String] = js.undefined
    
    var traceId: String
    
    var tracestate: js.UndefOr[String] = js.undefined
  }
  object ISpanContext {
    
    inline def apply(spanId: String, traceId: String): ISpanContext = {
      val __obj = js.Dynamic.literal(spanId = spanId.asInstanceOf[js.Any], traceId = traceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISpanContext]
    }
    
    extension [Self <: ISpanContext](x: Self) {
      
      inline def setSpanId(value: String): Self = StObject.set(x, "spanId", value.asInstanceOf[js.Any])
      
      inline def setTraceFlags(value: String): Self = StObject.set(x, "traceFlags", value.asInstanceOf[js.Any])
      
      inline def setTraceFlagsUndefined: Self = StObject.set(x, "traceFlags", js.undefined)
      
      inline def setTraceId(value: String): Self = StObject.set(x, "traceId", value.asInstanceOf[js.Any])
      
      inline def setTracestate(value: String): Self = StObject.set(x, "tracestate", value.asInstanceOf[js.Any])
      
      inline def setTracestateUndefined: Self = StObject.set(x, "tracestate", js.undefined)
    }
  }
  
  trait IStandardEvent[T] extends StObject {
    
    var data: T
    
    var timestamp: Double
  }
  object IStandardEvent {
    
    inline def apply[T](data: T, timestamp: Double): IStandardEvent[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStandardEvent[T]]
    }
    
    extension [Self <: IStandardEvent[?], T](x: Self & IStandardEvent[T]) {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  type ISubscriber[T] = js.Function1[/* event */ IStandardEvent[T], Unit]
  
  type ScopeManager = Any
}
