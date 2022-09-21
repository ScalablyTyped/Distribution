package typings.devtoolsProtocol.mod.Protocol

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typings.devtoolsProtocol.mod.Protocol.DOM.Rect
import typings.devtoolsProtocol.mod.Protocol.Network.TimeSinceEpoch
import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PerformanceTimeline {
  
  trait EnableRequest extends StObject {
    
    /**
      * The types of event to report, as specified in
      * https://w3c.github.io/performance-timeline/#dom-performanceentry-entrytype
      * The specified filter overrides any previous filters, passing empty
      * filter disables recording.
      * Note that not all types exposed to the web platform are currently supported.
      */
    var eventTypes: js.Array[String]
  }
  object EnableRequest {
    
    inline def apply(eventTypes: js.Array[String]): EnableRequest = {
      val __obj = js.Dynamic.literal(eventTypes = eventTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnableRequest]
    }
    
    extension [Self <: EnableRequest](x: Self) {
      
      inline def setEventTypes(value: js.Array[String]): Self = StObject.set(x, "eventTypes", value.asInstanceOf[js.Any])
      
      inline def setEventTypesVarargs(value: String*): Self = StObject.set(x, "eventTypes", js.Array(value*))
    }
  }
  
  trait LargestContentfulPaint extends StObject {
    
    /**
      * The id attribute of the element, if available.
      */
    var elementId: js.UndefOr[String] = js.undefined
    
    var loadTime: TimeSinceEpoch
    
    var nodeId: js.UndefOr[BackendNodeId] = js.undefined
    
    var renderTime: TimeSinceEpoch
    
    /**
      * The number of pixels being painted.
      */
    var size: Double
    
    /**
      * The URL of the image (may be trimmed).
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object LargestContentfulPaint {
    
    inline def apply(loadTime: TimeSinceEpoch, renderTime: TimeSinceEpoch, size: Double): LargestContentfulPaint = {
      val __obj = js.Dynamic.literal(loadTime = loadTime.asInstanceOf[js.Any], renderTime = renderTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[LargestContentfulPaint]
    }
    
    extension [Self <: LargestContentfulPaint](x: Self) {
      
      inline def setElementId(value: String): Self = StObject.set(x, "elementId", value.asInstanceOf[js.Any])
      
      inline def setElementIdUndefined: Self = StObject.set(x, "elementId", js.undefined)
      
      inline def setLoadTime(value: TimeSinceEpoch): Self = StObject.set(x, "loadTime", value.asInstanceOf[js.Any])
      
      inline def setNodeId(value: BackendNodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
      
      inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
      
      inline def setRenderTime(value: TimeSinceEpoch): Self = StObject.set(x, "renderTime", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait LayoutShift extends StObject {
    
    var hadRecentInput: Boolean
    
    var lastInputTime: TimeSinceEpoch
    
    var sources: js.Array[LayoutShiftAttribution]
    
    /**
      * Score increment produced by this event.
      */
    var value: Double
  }
  object LayoutShift {
    
    inline def apply(
      hadRecentInput: Boolean,
      lastInputTime: TimeSinceEpoch,
      sources: js.Array[LayoutShiftAttribution],
      value: Double
    ): LayoutShift = {
      val __obj = js.Dynamic.literal(hadRecentInput = hadRecentInput.asInstanceOf[js.Any], lastInputTime = lastInputTime.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutShift]
    }
    
    extension [Self <: LayoutShift](x: Self) {
      
      inline def setHadRecentInput(value: Boolean): Self = StObject.set(x, "hadRecentInput", value.asInstanceOf[js.Any])
      
      inline def setLastInputTime(value: TimeSinceEpoch): Self = StObject.set(x, "lastInputTime", value.asInstanceOf[js.Any])
      
      inline def setSources(value: js.Array[LayoutShiftAttribution]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesVarargs(value: LayoutShiftAttribution*): Self = StObject.set(x, "sources", js.Array(value*))
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait LayoutShiftAttribution extends StObject {
    
    var currentRect: Rect
    
    var nodeId: js.UndefOr[BackendNodeId] = js.undefined
    
    var previousRect: Rect
  }
  object LayoutShiftAttribution {
    
    inline def apply(currentRect: Rect, previousRect: Rect): LayoutShiftAttribution = {
      val __obj = js.Dynamic.literal(currentRect = currentRect.asInstanceOf[js.Any], previousRect = previousRect.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutShiftAttribution]
    }
    
    extension [Self <: LayoutShiftAttribution](x: Self) {
      
      inline def setCurrentRect(value: Rect): Self = StObject.set(x, "currentRect", value.asInstanceOf[js.Any])
      
      inline def setNodeId(value: BackendNodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
      
      inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
      
      inline def setPreviousRect(value: Rect): Self = StObject.set(x, "previousRect", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimelineEvent extends StObject {
    
    /**
      * Event duration, if applicable.
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * Identifies the frame that this event is related to. Empty for non-frame targets.
      */
    var frameId: FrameId
    
    var layoutShiftDetails: js.UndefOr[LayoutShift] = js.undefined
    
    var lcpDetails: js.UndefOr[LargestContentfulPaint] = js.undefined
    
    /**
      * Name may be empty depending on the type.
      */
    var name: String
    
    /**
      * Time in seconds since Epoch, monotonically increasing within document lifetime.
      */
    var time: TimeSinceEpoch
    
    /**
      * The event type, as specified in https://w3c.github.io/performance-timeline/#dom-performanceentry-entrytype
      * This determines which of the optional "details" fiedls is present.
      */
    var `type`: String
  }
  object TimelineEvent {
    
    inline def apply(frameId: FrameId, name: String, time: TimeSinceEpoch, `type`: String): TimelineEvent = {
      val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimelineEvent]
    }
    
    extension [Self <: TimelineEvent](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
      
      inline def setLayoutShiftDetails(value: LayoutShift): Self = StObject.set(x, "layoutShiftDetails", value.asInstanceOf[js.Any])
      
      inline def setLayoutShiftDetailsUndefined: Self = StObject.set(x, "layoutShiftDetails", js.undefined)
      
      inline def setLcpDetails(value: LargestContentfulPaint): Self = StObject.set(x, "lcpDetails", value.asInstanceOf[js.Any])
      
      inline def setLcpDetailsUndefined: Self = StObject.set(x, "lcpDetails", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTime(value: TimeSinceEpoch): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimelineEventAddedEvent extends StObject {
    
    var event: TimelineEvent
  }
  object TimelineEventAddedEvent {
    
    inline def apply(event: TimelineEvent): TimelineEventAddedEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimelineEventAddedEvent]
    }
    
    extension [Self <: TimelineEventAddedEvent](x: Self) {
      
      inline def setEvent(value: TimelineEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
}
