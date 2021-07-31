package typings.googleCloudPubsub

import typings.opentelemetryApi.attributesMod.Attributes
import typings.opentelemetryApi.spanContextMod.SpanContext
import typings.opentelemetryApi.spanMod.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object opentelemetryTracingMod {
  
  @JSImport("@google-cloud/pubsub/build/src/opentelemetry-tracing", "OpenTelemetryTracer")
  @js.native
  class OpenTelemetryTracer () extends StObject {
    
    /**
      * Creates a new span with the given properties
      *
      * @param {string} spanName the name for the span
      * @param {Attributes?} attributes an object containing the attributes to be set for the span
      * @param {SpanContext?} parent the context of the parent span to link to the span
      */
    def createSpan(spanName: String): Span = js.native
    def createSpan(spanName: String, attributes: Unit, parent: SpanContext): Span = js.native
    def createSpan(spanName: String, attributes: Attributes): Span = js.native
    def createSpan(spanName: String, attributes: Attributes, parent: SpanContext): Span = js.native
  }
}
