package typings.googleCloudPubsub

import typings.opentelemetryApi.buildSrcTraceAttributesMod.SpanAttributes
import typings.opentelemetryApi.buildSrcTraceSpanContextMod.SpanContext
import typings.opentelemetryApi.buildSrcTraceSpanKindMod.SpanKind
import typings.opentelemetryApi.buildSrcTraceSpanMod.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcOpentelemetryTracingMod {
  
  @JSImport("@google-cloud/pubsub/build/src/opentelemetry-tracing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSpan(spanName: String, kind: SpanKind): Span = (^.asInstanceOf[js.Dynamic].applyDynamic("createSpan")(spanName.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[Span]
  inline def createSpan(spanName: String, kind: SpanKind, attributes: Unit, parent: SpanContext): Span = (^.asInstanceOf[js.Dynamic].applyDynamic("createSpan")(spanName.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Span]
  inline def createSpan(spanName: String, kind: SpanKind, attributes: SpanAttributes): Span = (^.asInstanceOf[js.Dynamic].applyDynamic("createSpan")(spanName.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Span]
  inline def createSpan(spanName: String, kind: SpanKind, attributes: SpanAttributes, parent: SpanContext): Span = (^.asInstanceOf[js.Dynamic].applyDynamic("createSpan")(spanName.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Span]
}
