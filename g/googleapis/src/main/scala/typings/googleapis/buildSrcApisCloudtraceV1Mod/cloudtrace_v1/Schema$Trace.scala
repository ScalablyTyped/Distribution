package typings.googleapis.buildSrcApisCloudtraceV1Mod.cloudtrace_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A trace describes how long it takes for an application to perform an
  * operation. It consists of a set of spans, each of which represent a single
  * timed event within the operation.
  */
@js.native
trait Schema$Trace extends js.Object {
  /**
    * Project ID of the Cloud project where the trace data is stored.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Collection of spans in the trace.
    */
  var spans: js.UndefOr[js.Array[Schema$TraceSpan]] = js.native
  /**
    * Globally unique identifier for the trace. This identifier is a 128-bit
    * numeric value formatted as a 32-byte hex string. For example,
    * `382d4f4c6b7bb2f4a972559d9085001d`.
    */
  var traceId: js.UndefOr[String] = js.native
}

object Schema$Trace {
  @scala.inline
  def apply(projectId: String = null, spans: js.Array[Schema$TraceSpan] = null, traceId: String = null): Schema$Trace = {
    val __obj = js.Dynamic.literal()
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (spans != null) __obj.updateDynamic("spans")(spans.asInstanceOf[js.Any])
    if (traceId != null) __obj.updateDynamic("traceId")(traceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Trace]
  }
}

