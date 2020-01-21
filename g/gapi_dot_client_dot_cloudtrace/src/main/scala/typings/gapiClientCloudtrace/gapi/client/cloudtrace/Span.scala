package typings.gapiClientCloudtrace.gapi.client.cloudtrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Span extends js.Object {
  /**
    * A set of attributes on the span. There is a limit of 32 attributes per
    * span.
    */
  var attributes: js.UndefOr[Attributes] = js.undefined
  /**
    * An optional number of child spans that were generated while this span
    * was active. If set, allows implementation to detect missing child spans.
    */
  var childSpanCount: js.UndefOr[Double] = js.undefined
  /**
    * A description of the span's operation (up to 128 bytes).
    * Stackdriver Trace displays the description in the
    * {% dynamic print site_values.console_name %}.
    * For example, the display name can be a qualified method name or a file name
    * and a line number where the operation is called. A best practice is to use
    * the same display name within an application and at the same call point.
    * This makes it easier to correlate spans in different traces.
    */
  var displayName: js.UndefOr[TruncatableString] = js.undefined
  /**
    * The end time of the span. On the client side, this is the time kept by
    * the local machine where the span execution ends. On the server side, this
    * is the time when the server application handler stops running.
    */
  var endTime: js.UndefOr[String] = js.undefined
  /** A maximum of 128 links are allowed per Span. */
  var links: js.UndefOr[Links] = js.undefined
  /**
    * The resource name of the span in the following format:
    *
    * projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/SPAN_ID is a unique identifier for a trace within a project.
    * [SPAN_ID] is a unique identifier for a span within a trace,
    * assigned when the span is created.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The [SPAN_ID] of this span's parent span. If this is a root span,
    * then this field must be empty.
    */
  var parentSpanId: js.UndefOr[String] = js.undefined
  /**
    * A highly recommended but not required flag that identifies when a trace
    * crosses a process boundary. True when the parent_span belongs to the
    * same process as the current span.
    */
  var sameProcessAsParentSpan: js.UndefOr[Boolean] = js.undefined
  /** The [SPAN_ID] portion of the span's resource name. */
  var spanId: js.UndefOr[String] = js.undefined
  /** Stack trace captured at the start of the span. */
  var stackTrace: js.UndefOr[StackTrace] = js.undefined
  /**
    * The start time of the span. On the client side, this is the time kept by
    * the local machine where the span execution starts. On the server side, this
    * is the time when the server's application handler starts running.
    */
  var startTime: js.UndefOr[String] = js.undefined
  /** An optional final status for this span. */
  var status: js.UndefOr[Status] = js.undefined
  /**
    * The included time events. There can be up to 32 annotations and 128 network
    * events per span.
    */
  var timeEvents: js.UndefOr[TimeEvents] = js.undefined
}

object Span {
  @scala.inline
  def apply(
    attributes: Attributes = null,
    childSpanCount: Int | Double = null,
    displayName: TruncatableString = null,
    endTime: String = null,
    links: Links = null,
    name: String = null,
    parentSpanId: String = null,
    sameProcessAsParentSpan: js.UndefOr[Boolean] = js.undefined,
    spanId: String = null,
    stackTrace: StackTrace = null,
    startTime: String = null,
    status: Status = null,
    timeEvents: TimeEvents = null
  ): Span = {
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
    __obj.asInstanceOf[Span]
  }
}

