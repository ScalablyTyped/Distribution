package typings.googleapis.buildSrcApisCloudtraceV2Mod.cloudtrace_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A span represents a single operation within a trace. Spans can be nested to
  * form a trace tree. Often, a trace contains a root span that describes the
  * end-to-end latency, and one or more subspans for its sub-operations. A
  * trace can also contain multiple root spans, or none at all. Spans do not
  * need to be contiguous&amp;mdash;there may be gaps or overlaps between spans
  * in a trace.
  */
@js.native
trait Schema$Span extends js.Object {
  /**
    * A set of attributes on the span. You can have up to 32 attributes per
    * span.
    */
  var attributes: js.UndefOr[Schema$Attributes] = js.native
  /**
    * An optional number of child spans that were generated while this span was
    * active. If set, allows implementation to detect missing child spans.
    */
  var childSpanCount: js.UndefOr[Double] = js.native
  /**
    * A description of the span&#39;s operation (up to 128 bytes). Stackdriver
    * Trace displays the description in the Google Cloud Platform Console. For
    * example, the display name can be a qualified method name or a file name
    * and a line number where the operation is called. A best practice is to
    * use the same display name within an application and at the same call
    * point. This makes it easier to correlate spans in different traces.
    */
  var displayName: js.UndefOr[Schema$TruncatableString] = js.native
  /**
    * The end time of the span. On the client side, this is the time kept by
    * the local machine where the span execution ends. On the server side, this
    * is the time when the server application handler stops running.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Links associated with the span. You can have up to 128 links per Span.
    */
  var links: js.UndefOr[Schema$Links] = js.native
  /**
    * The resource name of the span in the following format:
    * projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/SPAN_ID is a unique
    * identifier for a trace within a project; it is a 32-character hexadecimal
    * encoding of a 16-byte array.  [SPAN_ID] is a unique identifier for a span
    * within a trace; it is a 16-character hexadecimal encoding of an 8-byte
    * array.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The [SPAN_ID] of this span&#39;s parent span. If this is a root span,
    * then this field must be empty.
    */
  var parentSpanId: js.UndefOr[String] = js.native
  /**
    * (Optional) Set this parameter to indicate whether this span is in the
    * same process as its parent. If you do not set this parameter, Stackdriver
    * Trace is unable to take advantage of this helpful information.
    */
  var sameProcessAsParentSpan: js.UndefOr[Boolean] = js.native
  /**
    * The [SPAN_ID] portion of the span&#39;s resource name.
    */
  var spanId: js.UndefOr[String] = js.native
  /**
    * Stack trace captured at the start of the span.
    */
  var stackTrace: js.UndefOr[Schema$StackTrace] = js.native
  /**
    * The start time of the span. On the client side, this is the time kept by
    * the local machine where the span execution starts. On the server side,
    * this is the time when the server&#39;s application handler starts
    * running.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * An optional final status for this span.
    */
  var status: js.UndefOr[Schema$Status] = js.native
  /**
    * A set of time events. You can have up to 32 annotations and 128 message
    * events per span.
    */
  var timeEvents: js.UndefOr[Schema$TimeEvents] = js.native
}

object Schema$Span {
  @scala.inline
  def apply(
    attributes: Schema$Attributes = null,
    childSpanCount: Int | Double = null,
    displayName: Schema$TruncatableString = null,
    endTime: String = null,
    links: Schema$Links = null,
    name: String = null,
    parentSpanId: String = null,
    sameProcessAsParentSpan: js.UndefOr[Boolean] = js.undefined,
    spanId: String = null,
    stackTrace: Schema$StackTrace = null,
    startTime: String = null,
    status: Schema$Status = null,
    timeEvents: Schema$TimeEvents = null
  ): Schema$Span = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (childSpanCount != null) __obj.updateDynamic("childSpanCount")(childSpanCount.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentSpanId != null) __obj.updateDynamic("parentSpanId")(parentSpanId.asInstanceOf[js.Any])
    if (!js.isUndefined(sameProcessAsParentSpan)) __obj.updateDynamic("sameProcessAsParentSpan")(sameProcessAsParentSpan.asInstanceOf[js.Any])
    if (spanId != null) __obj.updateDynamic("spanId")(spanId.asInstanceOf[js.Any])
    if (stackTrace != null) __obj.updateDynamic("stackTrace")(stackTrace.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (timeEvents != null) __obj.updateDynamic("timeEvents")(timeEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Span]
  }
}

