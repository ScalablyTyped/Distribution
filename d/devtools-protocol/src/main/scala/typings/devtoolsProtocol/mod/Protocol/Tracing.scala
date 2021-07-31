package typings.devtoolsProtocol.mod.Protocol

import org.scalablytyped.runtime.StringDictionary
import typings.devtoolsProtocol.devtoolsProtocolStrings.ReportEvents
import typings.devtoolsProtocol.devtoolsProtocolStrings.ReturnAsStream
import typings.devtoolsProtocol.devtoolsProtocolStrings.echoToConsole
import typings.devtoolsProtocol.devtoolsProtocolStrings.none_
import typings.devtoolsProtocol.devtoolsProtocolStrings.recordAsMuchAsPossible
import typings.devtoolsProtocol.devtoolsProtocolStrings.recordContinuously
import typings.devtoolsProtocol.devtoolsProtocolStrings.recordUntilFull
import typings.devtoolsProtocol.mod.Protocol.IO.StreamHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tracing {
  
  trait BufferUsageEvent extends StObject {
    
    /**
      * An approximate number of events in the trace log.
      */
    var eventCount: js.UndefOr[Double] = js.undefined
    
    /**
      * A number in range [0..1] that indicates the used size of event buffer as a fraction of its
      * total size.
      */
    var percentFull: js.UndefOr[Double] = js.undefined
    
    /**
      * A number in range [0..1] that indicates the used size of event buffer as a fraction of its
      * total size.
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object BufferUsageEvent {
    
    @scala.inline
    def apply(): BufferUsageEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BufferUsageEvent]
    }
    
    @scala.inline
    implicit class BufferUsageEventMutableBuilder[Self <: BufferUsageEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventCount(value: Double): Self = StObject.set(x, "eventCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventCountUndefined: Self = StObject.set(x, "eventCount", js.undefined)
      
      @scala.inline
      def setPercentFull(value: Double): Self = StObject.set(x, "percentFull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentFullUndefined: Self = StObject.set(x, "percentFull", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait DataCollectedEvent extends StObject {
    
    var value: js.Array[js.Any]
  }
  object DataCollectedEvent {
    
    @scala.inline
    def apply(value: js.Array[js.Any]): DataCollectedEvent = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataCollectedEvent]
    }
    
    @scala.inline
    implicit class DataCollectedEventMutableBuilder[Self <: DataCollectedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: js.Array[js.Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  trait GetCategoriesResponse extends StObject {
    
    /**
      * A list of supported tracing categories.
      */
    var categories: js.Array[String]
  }
  object GetCategoriesResponse {
    
    @scala.inline
    def apply(categories: js.Array[String]): GetCategoriesResponse = {
      val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCategoriesResponse]
    }
    
    @scala.inline
    implicit class GetCategoriesResponseMutableBuilder[Self <: GetCategoriesResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    }
  }
  
  type MemoryDumpConfig = StringDictionary[String]
  
  trait RecordClockSyncMarkerRequest extends StObject {
    
    /**
      * The ID of this clock sync marker
      */
    var syncId: String
  }
  object RecordClockSyncMarkerRequest {
    
    @scala.inline
    def apply(syncId: String): RecordClockSyncMarkerRequest = {
      val __obj = js.Dynamic.literal(syncId = syncId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordClockSyncMarkerRequest]
    }
    
    @scala.inline
    implicit class RecordClockSyncMarkerRequestMutableBuilder[Self <: RecordClockSyncMarkerRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSyncId(value: String): Self = StObject.set(x, "syncId", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestMemoryDumpRequest extends StObject {
    
    /**
      * Enables more deterministic results by forcing garbage collection
      */
    var deterministic: js.UndefOr[Boolean] = js.undefined
  }
  object RequestMemoryDumpRequest {
    
    @scala.inline
    def apply(): RequestMemoryDumpRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestMemoryDumpRequest]
    }
    
    @scala.inline
    implicit class RequestMemoryDumpRequestMutableBuilder[Self <: RequestMemoryDumpRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeterministic(value: Boolean): Self = StObject.set(x, "deterministic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeterministicUndefined: Self = StObject.set(x, "deterministic", js.undefined)
    }
  }
  
  trait RequestMemoryDumpResponse extends StObject {
    
    /**
      * GUID of the resulting global memory dump.
      */
    var dumpGuid: String
    
    /**
      * True iff the global memory dump succeeded.
      */
    var success: Boolean
  }
  object RequestMemoryDumpResponse {
    
    @scala.inline
    def apply(dumpGuid: String, success: Boolean): RequestMemoryDumpResponse = {
      val __obj = js.Dynamic.literal(dumpGuid = dumpGuid.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestMemoryDumpResponse]
    }
    
    @scala.inline
    implicit class RequestMemoryDumpResponseMutableBuilder[Self <: RequestMemoryDumpResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDumpGuid(value: String): Self = StObject.set(x, "dumpGuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  trait StartRequest extends StObject {
    
    /**
      * If set, the agent will issue bufferUsage events at this interval, specified in milliseconds
      */
    var bufferUsageReportingInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * Category/tag filter
      */
    var categories: js.UndefOr[String] = js.undefined
    
    /**
      * Tracing options
      */
    var options: js.UndefOr[String] = js.undefined
    
    /**
      * Compression format to use. This only applies when using `ReturnAsStream`
      * transfer mode (defaults to `none`)
      */
    var streamCompression: js.UndefOr[StreamCompression] = js.undefined
    
    /**
      * Trace data format to use. This only applies when using `ReturnAsStream`
      * transfer mode (defaults to `json`).
      */
    var streamFormat: js.UndefOr[StreamFormat] = js.undefined
    
    var traceConfig: js.UndefOr[TraceConfig] = js.undefined
    
    /**
      * Whether to report trace events as series of dataCollected events or to save trace to a
      * stream (defaults to `ReportEvents`). (StartRequestTransferMode enum)
      */
    var transferMode: js.UndefOr[ReportEvents | ReturnAsStream] = js.undefined
  }
  object StartRequest {
    
    @scala.inline
    def apply(): StartRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartRequest]
    }
    
    @scala.inline
    implicit class StartRequestMutableBuilder[Self <: StartRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBufferUsageReportingInterval(value: Double): Self = StObject.set(x, "bufferUsageReportingInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUsageReportingIntervalUndefined: Self = StObject.set(x, "bufferUsageReportingInterval", js.undefined)
      
      @scala.inline
      def setCategories(value: String): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
      
      @scala.inline
      def setOptions(value: String): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setStreamCompression(value: StreamCompression): Self = StObject.set(x, "streamCompression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamCompressionUndefined: Self = StObject.set(x, "streamCompression", js.undefined)
      
      @scala.inline
      def setStreamFormat(value: StreamFormat): Self = StObject.set(x, "streamFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamFormatUndefined: Self = StObject.set(x, "streamFormat", js.undefined)
      
      @scala.inline
      def setTraceConfig(value: TraceConfig): Self = StObject.set(x, "traceConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceConfigUndefined: Self = StObject.set(x, "traceConfig", js.undefined)
      
      @scala.inline
      def setTransferMode(value: ReportEvents | ReturnAsStream): Self = StObject.set(x, "transferMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransferModeUndefined: Self = StObject.set(x, "transferMode", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsProtocol.devtoolsProtocolStrings.ReportEvents
    - typings.devtoolsProtocol.devtoolsProtocolStrings.ReturnAsStream
  */
  trait StartRequestTransferMode extends StObject
  object StartRequestTransferMode {
    
    @scala.inline
    def ReportEvents: typings.devtoolsProtocol.devtoolsProtocolStrings.ReportEvents = "ReportEvents".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ReportEvents]
    
    @scala.inline
    def ReturnAsStream: typings.devtoolsProtocol.devtoolsProtocolStrings.ReturnAsStream = "ReturnAsStream".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ReturnAsStream]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsProtocol.devtoolsProtocolStrings.none_
    - typings.devtoolsProtocol.devtoolsProtocolStrings.gzip
  */
  trait StreamCompression extends StObject
  object StreamCompression {
    
    @scala.inline
    def gzip: typings.devtoolsProtocol.devtoolsProtocolStrings.gzip = "gzip".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.gzip]
    
    @scala.inline
    def none: none_ = "none".asInstanceOf[none_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsProtocol.devtoolsProtocolStrings.json
    - typings.devtoolsProtocol.devtoolsProtocolStrings.proto
  */
  trait StreamFormat extends StObject
  object StreamFormat {
    
    @scala.inline
    def json: typings.devtoolsProtocol.devtoolsProtocolStrings.json = "json".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.json]
    
    @scala.inline
    def proto: typings.devtoolsProtocol.devtoolsProtocolStrings.proto = "proto".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.proto]
  }
  
  trait TraceConfig extends StObject {
    
    /**
      * Turns on argument filter.
      */
    var enableArgumentFilter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Turns on JavaScript stack sampling.
      */
    var enableSampling: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Turns on system tracing.
      */
    var enableSystrace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Excluded category filters.
      */
    var excludedCategories: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Included category filters.
      */
    var includedCategories: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Configuration for memory dump triggers. Used only when "memory-infra" category is enabled.
      */
    var memoryDumpConfig: js.UndefOr[MemoryDumpConfig] = js.undefined
    
    /**
      * Controls how the trace buffer stores data. (TraceConfigRecordMode enum)
      */
    var recordMode: js.UndefOr[recordUntilFull | recordContinuously | recordAsMuchAsPossible | echoToConsole] = js.undefined
    
    /**
      * Configuration to synthesize the delays in tracing.
      */
    var syntheticDelays: js.UndefOr[js.Array[String]] = js.undefined
  }
  object TraceConfig {
    
    @scala.inline
    def apply(): TraceConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TraceConfig]
    }
    
    @scala.inline
    implicit class TraceConfigMutableBuilder[Self <: TraceConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableArgumentFilter(value: Boolean): Self = StObject.set(x, "enableArgumentFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableArgumentFilterUndefined: Self = StObject.set(x, "enableArgumentFilter", js.undefined)
      
      @scala.inline
      def setEnableSampling(value: Boolean): Self = StObject.set(x, "enableSampling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSamplingUndefined: Self = StObject.set(x, "enableSampling", js.undefined)
      
      @scala.inline
      def setEnableSystrace(value: Boolean): Self = StObject.set(x, "enableSystrace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSystraceUndefined: Self = StObject.set(x, "enableSystrace", js.undefined)
      
      @scala.inline
      def setExcludedCategories(value: js.Array[String]): Self = StObject.set(x, "excludedCategories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludedCategoriesUndefined: Self = StObject.set(x, "excludedCategories", js.undefined)
      
      @scala.inline
      def setExcludedCategoriesVarargs(value: String*): Self = StObject.set(x, "excludedCategories", js.Array(value :_*))
      
      @scala.inline
      def setIncludedCategories(value: js.Array[String]): Self = StObject.set(x, "includedCategories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludedCategoriesUndefined: Self = StObject.set(x, "includedCategories", js.undefined)
      
      @scala.inline
      def setIncludedCategoriesVarargs(value: String*): Self = StObject.set(x, "includedCategories", js.Array(value :_*))
      
      @scala.inline
      def setMemoryDumpConfig(value: MemoryDumpConfig): Self = StObject.set(x, "memoryDumpConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoryDumpConfigUndefined: Self = StObject.set(x, "memoryDumpConfig", js.undefined)
      
      @scala.inline
      def setRecordMode(value: recordUntilFull | recordContinuously | recordAsMuchAsPossible | echoToConsole): Self = StObject.set(x, "recordMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordModeUndefined: Self = StObject.set(x, "recordMode", js.undefined)
      
      @scala.inline
      def setSyntheticDelays(value: js.Array[String]): Self = StObject.set(x, "syntheticDelays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyntheticDelaysUndefined: Self = StObject.set(x, "syntheticDelays", js.undefined)
      
      @scala.inline
      def setSyntheticDelaysVarargs(value: String*): Self = StObject.set(x, "syntheticDelays", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsProtocol.devtoolsProtocolStrings.recordUntilFull
    - typings.devtoolsProtocol.devtoolsProtocolStrings.recordContinuously
    - typings.devtoolsProtocol.devtoolsProtocolStrings.recordAsMuchAsPossible
    - typings.devtoolsProtocol.devtoolsProtocolStrings.echoToConsole
  */
  trait TraceConfigRecordMode extends StObject
  object TraceConfigRecordMode {
    
    @scala.inline
    def EchoToConsole: echoToConsole = "echoToConsole".asInstanceOf[echoToConsole]
    
    @scala.inline
    def RecordAsMuchAsPossible: recordAsMuchAsPossible = "recordAsMuchAsPossible".asInstanceOf[recordAsMuchAsPossible]
    
    @scala.inline
    def RecordContinuously: recordContinuously = "recordContinuously".asInstanceOf[recordContinuously]
    
    @scala.inline
    def RecordUntilFull: recordUntilFull = "recordUntilFull".asInstanceOf[recordUntilFull]
  }
  
  trait TracingCompleteEvent extends StObject {
    
    /**
      * Indicates whether some trace data is known to have been lost, e.g. because the trace ring
      * buffer wrapped around.
      */
    var dataLossOccurred: Boolean
    
    /**
      * A handle of the stream that holds resulting trace data.
      */
    var stream: js.UndefOr[StreamHandle] = js.undefined
    
    /**
      * Compression format of returned stream.
      */
    var streamCompression: js.UndefOr[StreamCompression] = js.undefined
    
    /**
      * Trace data format of returned stream.
      */
    var traceFormat: js.UndefOr[StreamFormat] = js.undefined
  }
  object TracingCompleteEvent {
    
    @scala.inline
    def apply(dataLossOccurred: Boolean): TracingCompleteEvent = {
      val __obj = js.Dynamic.literal(dataLossOccurred = dataLossOccurred.asInstanceOf[js.Any])
      __obj.asInstanceOf[TracingCompleteEvent]
    }
    
    @scala.inline
    implicit class TracingCompleteEventMutableBuilder[Self <: TracingCompleteEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataLossOccurred(value: Boolean): Self = StObject.set(x, "dataLossOccurred", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStream(value: StreamHandle): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamCompression(value: StreamCompression): Self = StObject.set(x, "streamCompression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamCompressionUndefined: Self = StObject.set(x, "streamCompression", js.undefined)
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setTraceFormat(value: StreamFormat): Self = StObject.set(x, "traceFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceFormatUndefined: Self = StObject.set(x, "traceFormat", js.undefined)
    }
  }
}
