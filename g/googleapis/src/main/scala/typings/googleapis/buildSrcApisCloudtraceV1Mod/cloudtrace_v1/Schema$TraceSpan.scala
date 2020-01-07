package typings.googleapis.buildSrcApisCloudtraceV1Mod.cloudtrace_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A span represents a single timed event within a trace. Spans can be nested
  * and form a trace tree. Often, a trace contains a root span that describes
  * the end-to-end latency of an operation and, optionally, one or more
  * subspans for its suboperations. Spans do not need to be contiguous. There
  * may be gaps between spans in a trace.
  */
@js.native
trait Schema$TraceSpan extends js.Object {
  /**
    * End time of the span in nanoseconds from the UNIX epoch.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Distinguishes between spans generated in a particular context. For
    * example, two spans with the same name may be distinguished using
    * `RPC_CLIENT` and `RPC_SERVER` to identify queueing latency associated
    * with the span.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Collection of labels associated with the span. Label keys must be less
    * than 128 bytes. Label values must be less than 16 kilobytes (10MB for
    * `/stacktrace` values).  Some predefined label keys exist, or you may
    * create your own. When creating your own, we recommend the following
    * formats:  * `/category/product/key` for agents of well-known products
    * (e.g.   `/db/mongodb/read_size`). * `short_host/path/key` for
    * domain-specific keys (e.g.   `foo.com/myproduct/bar`)  Predefined labels
    * include:  *   `/agent` *   `/component` *   `/error/message` *
    * `/error/name` *   `/http/client_city` *   `/http/client_country` *
    * `/http/client_protocol` *   `/http/client_region` *   `/http/host` *
    * `/http/method` *   `/http/path` *   `/http/redirected_url` *
    * `/http/request/size` *   `/http/response/size` *   `/http/route` *
    * `/http/status_code` *   `/http/url` *   `/http/user_agent` *   `/pid` *
    * `/stacktrace` *   `/tid`
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Name of the span. Must be less than 128 bytes. The span name is sanitized
    * and displayed in the Stackdriver Trace tool in the Google Cloud Platform
    * Console. The name may be a method name or some other per-call site name.
    * For the same executable and the same call point, a best practice is to
    * use a consistent name, which makes it easier to correlate cross-trace
    * spans.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * ID of the parent span, if any. Optional.
    */
  var parentSpanId: js.UndefOr[String] = js.native
  /**
    * Identifier for the span. Must be a 64-bit integer other than 0 and unique
    * within a trace. For example, `2205310701640571284`.
    */
  var spanId: js.UndefOr[String] = js.native
  /**
    * Start time of the span in nanoseconds from the UNIX epoch.
    */
  var startTime: js.UndefOr[String] = js.native
}

object Schema$TraceSpan {
  @scala.inline
  def apply(
    endTime: String = null,
    kind: String = null,
    labels: StringDictionary[String] = null,
    name: String = null,
    parentSpanId: String = null,
    spanId: String = null,
    startTime: String = null
  ): Schema$TraceSpan = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentSpanId != null) __obj.updateDynamic("parentSpanId")(parentSpanId.asInstanceOf[js.Any])
    if (spanId != null) __obj.updateDynamic("spanId")(spanId.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TraceSpan]
  }
}

