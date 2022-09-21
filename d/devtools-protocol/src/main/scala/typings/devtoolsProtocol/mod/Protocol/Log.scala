package typings.devtoolsProtocol.mod.Protocol

import typings.devtoolsProtocol.devtoolsProtocolStrings.appcache
import typings.devtoolsProtocol.devtoolsProtocolStrings.blockedEvent
import typings.devtoolsProtocol.devtoolsProtocolStrings.blockedParser
import typings.devtoolsProtocol.devtoolsProtocolStrings.cors
import typings.devtoolsProtocol.devtoolsProtocolStrings.deprecation
import typings.devtoolsProtocol.devtoolsProtocolStrings.discouragedAPIUse
import typings.devtoolsProtocol.devtoolsProtocolStrings.error
import typings.devtoolsProtocol.devtoolsProtocolStrings.handler
import typings.devtoolsProtocol.devtoolsProtocolStrings.info
import typings.devtoolsProtocol.devtoolsProtocolStrings.intervention
import typings.devtoolsProtocol.devtoolsProtocolStrings.javascript_
import typings.devtoolsProtocol.devtoolsProtocolStrings.longLayout
import typings.devtoolsProtocol.devtoolsProtocolStrings.longTask
import typings.devtoolsProtocol.devtoolsProtocolStrings.network
import typings.devtoolsProtocol.devtoolsProtocolStrings.other_
import typings.devtoolsProtocol.devtoolsProtocolStrings.recommendation
import typings.devtoolsProtocol.devtoolsProtocolStrings.recurringHandler
import typings.devtoolsProtocol.devtoolsProtocolStrings.rendering
import typings.devtoolsProtocol.devtoolsProtocolStrings.security
import typings.devtoolsProtocol.devtoolsProtocolStrings.storage
import typings.devtoolsProtocol.devtoolsProtocolStrings.verbose
import typings.devtoolsProtocol.devtoolsProtocolStrings.violation
import typings.devtoolsProtocol.devtoolsProtocolStrings.warning
import typings.devtoolsProtocol.devtoolsProtocolStrings.worker_
import typings.devtoolsProtocol.devtoolsProtocolStrings.xml
import typings.devtoolsProtocol.mod.Protocol.Network.RequestId
import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import typings.devtoolsProtocol.mod.Protocol.Runtime.StackTrace
import typings.devtoolsProtocol.mod.Protocol.Runtime.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Log {
  
  trait EntryAddedEvent extends StObject {
    
    /**
      * The entry.
      */
    var entry: LogEntry
  }
  object EntryAddedEvent {
    
    inline def apply(entry: LogEntry): EntryAddedEvent = {
      val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryAddedEvent]
    }
    
    extension [Self <: EntryAddedEvent](x: Self) {
      
      inline def setEntry(value: LogEntry): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogEntry extends StObject {
    
    /**
      * Call arguments.
      */
    var args: js.UndefOr[js.Array[RemoteObject]] = js.undefined
    
    /**
      *  (LogEntryCategory enum)
      */
    var category: js.UndefOr[cors] = js.undefined
    
    /**
      * Log entry severity. (LogEntryLevel enum)
      */
    var level: verbose | info | warning | error
    
    /**
      * Line number in the resource.
      */
    var lineNumber: js.UndefOr[integer] = js.undefined
    
    /**
      * Identifier of the network request associated with this entry.
      */
    var networkRequestId: js.UndefOr[RequestId] = js.undefined
    
    /**
      * Log entry source. (LogEntrySource enum)
      */
    var source: xml | javascript_ | network | storage | appcache | rendering | security | deprecation | worker_ | violation | intervention | recommendation | other_
    
    /**
      * JavaScript stack trace.
      */
    var stackTrace: js.UndefOr[StackTrace] = js.undefined
    
    /**
      * Logged text.
      */
    var text: String
    
    /**
      * Timestamp when this entry was added.
      */
    var timestamp: Timestamp
    
    /**
      * URL of the resource if known.
      */
    var url: js.UndefOr[String] = js.undefined
    
    /**
      * Identifier of the worker associated with this entry.
      */
    var workerId: js.UndefOr[String] = js.undefined
  }
  object LogEntry {
    
    inline def apply(
      level: verbose | info | warning | error,
      source: xml | javascript_ | network | storage | appcache | rendering | security | deprecation | worker_ | violation | intervention | recommendation | other_,
      text: String,
      timestamp: Timestamp
    ): LogEntry = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogEntry]
    }
    
    extension [Self <: LogEntry](x: Self) {
      
      inline def setArgs(value: js.Array[RemoteObject]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: RemoteObject*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setCategory(value: cors): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setLevel(value: verbose | info | warning | error): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLineNumber(value: integer): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      inline def setNetworkRequestId(value: RequestId): Self = StObject.set(x, "networkRequestId", value.asInstanceOf[js.Any])
      
      inline def setNetworkRequestIdUndefined: Self = StObject.set(x, "networkRequestId", js.undefined)
      
      inline def setSource(
        value: xml | javascript_ | network | storage | appcache | rendering | security | deprecation | worker_ | violation | intervention | recommendation | other_
      ): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStackTrace(value: StackTrace): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
      
      inline def setStackTraceUndefined: Self = StObject.set(x, "stackTrace", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Timestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWorkerId(value: String): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
      
      inline def setWorkerIdUndefined: Self = StObject.set(x, "workerId", js.undefined)
    }
  }
  
  object LogEntryCategory {
    
    inline def Cors: cors = "cors".asInstanceOf[cors]
  }
  type LogEntryCategory = cors
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsProtocol.devtoolsProtocolStrings.verbose
    - typings.devtoolsProtocol.devtoolsProtocolStrings.info
    - typings.devtoolsProtocol.devtoolsProtocolStrings.warning
    - typings.devtoolsProtocol.devtoolsProtocolStrings.error
  */
  trait LogEntryLevel extends StObject
  object LogEntryLevel {
    
    inline def Error: error = "error".asInstanceOf[error]
    
    inline def Info: info = "info".asInstanceOf[info]
    
    inline def Verbose: verbose = "verbose".asInstanceOf[verbose]
    
    inline def Warning: warning = "warning".asInstanceOf[warning]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsProtocol.devtoolsProtocolStrings.xml
    - typings.devtoolsProtocol.devtoolsProtocolStrings.javascript_
    - typings.devtoolsProtocol.devtoolsProtocolStrings.network
    - typings.devtoolsProtocol.devtoolsProtocolStrings.storage
    - typings.devtoolsProtocol.devtoolsProtocolStrings.appcache
    - typings.devtoolsProtocol.devtoolsProtocolStrings.rendering
    - typings.devtoolsProtocol.devtoolsProtocolStrings.security
    - typings.devtoolsProtocol.devtoolsProtocolStrings.deprecation
    - typings.devtoolsProtocol.devtoolsProtocolStrings.worker_
    - typings.devtoolsProtocol.devtoolsProtocolStrings.violation
    - typings.devtoolsProtocol.devtoolsProtocolStrings.intervention
    - typings.devtoolsProtocol.devtoolsProtocolStrings.recommendation
    - typings.devtoolsProtocol.devtoolsProtocolStrings.other_
  */
  trait LogEntrySource extends StObject
  object LogEntrySource {
    
    inline def Appcache: appcache = "appcache".asInstanceOf[appcache]
    
    inline def Deprecation: deprecation = "deprecation".asInstanceOf[deprecation]
    
    inline def Intervention: intervention = "intervention".asInstanceOf[intervention]
    
    inline def Javascript: javascript_ = "javascript".asInstanceOf[javascript_]
    
    inline def Network: network = "network".asInstanceOf[network]
    
    inline def Other: other_ = "other".asInstanceOf[other_]
    
    inline def Recommendation: recommendation = "recommendation".asInstanceOf[recommendation]
    
    inline def Rendering: rendering = "rendering".asInstanceOf[rendering]
    
    inline def Security: security = "security".asInstanceOf[security]
    
    inline def Storage: storage = "storage".asInstanceOf[storage]
    
    inline def Violation: violation = "violation".asInstanceOf[violation]
    
    inline def Worker: worker_ = "worker".asInstanceOf[worker_]
    
    inline def XML: xml = "xml".asInstanceOf[xml]
  }
  
  trait StartViolationsReportRequest extends StObject {
    
    /**
      * Configuration for violations.
      */
    var config: js.Array[ViolationSetting]
  }
  object StartViolationsReportRequest {
    
    inline def apply(config: js.Array[ViolationSetting]): StartViolationsReportRequest = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartViolationsReportRequest]
    }
    
    extension [Self <: StartViolationsReportRequest](x: Self) {
      
      inline def setConfig(value: js.Array[ViolationSetting]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigVarargs(value: ViolationSetting*): Self = StObject.set(x, "config", js.Array(value*))
    }
  }
  
  trait ViolationSetting extends StObject {
    
    /**
      * Violation type. (ViolationSettingName enum)
      */
    var name: longTask | longLayout | blockedEvent | blockedParser | discouragedAPIUse | handler | recurringHandler
    
    /**
      * Time threshold to trigger upon.
      */
    var threshold: Double
  }
  object ViolationSetting {
    
    inline def apply(
      name: longTask | longLayout | blockedEvent | blockedParser | discouragedAPIUse | handler | recurringHandler,
      threshold: Double
    ): ViolationSetting = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViolationSetting]
    }
    
    extension [Self <: ViolationSetting](x: Self) {
      
      inline def setName(
        value: longTask | longLayout | blockedEvent | blockedParser | discouragedAPIUse | handler | recurringHandler
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsProtocol.devtoolsProtocolStrings.longTask
    - typings.devtoolsProtocol.devtoolsProtocolStrings.longLayout
    - typings.devtoolsProtocol.devtoolsProtocolStrings.blockedEvent
    - typings.devtoolsProtocol.devtoolsProtocolStrings.blockedParser
    - typings.devtoolsProtocol.devtoolsProtocolStrings.discouragedAPIUse
    - typings.devtoolsProtocol.devtoolsProtocolStrings.handler
    - typings.devtoolsProtocol.devtoolsProtocolStrings.recurringHandler
  */
  trait ViolationSettingName extends StObject
  object ViolationSettingName {
    
    inline def BlockedEvent: blockedEvent = "blockedEvent".asInstanceOf[blockedEvent]
    
    inline def BlockedParser: blockedParser = "blockedParser".asInstanceOf[blockedParser]
    
    inline def DiscouragedAPIUse: discouragedAPIUse = "discouragedAPIUse".asInstanceOf[discouragedAPIUse]
    
    inline def Handler: handler = "handler".asInstanceOf[handler]
    
    inline def LongLayout: longLayout = "longLayout".asInstanceOf[longLayout]
    
    inline def LongTask: longTask = "longTask".asInstanceOf[longTask]
    
    inline def RecurringHandler: recurringHandler = "recurringHandler".asInstanceOf[recurringHandler]
  }
}
