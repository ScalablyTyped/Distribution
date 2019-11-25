package typings.gapiDotClientDotCloudtrace.gapi.client.cloudtrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends js.Object {
  /**
    * A set of attributes on the link. There is a limit of 32 attributes per
    * link.
    */
  var attributes: js.UndefOr[Attributes] = js.undefined
  /** `SPAN_ID` identifies a span within a trace. */
  var spanId: js.UndefOr[String] = js.undefined
  /** `TRACE_ID` identifies a trace within a project. */
  var traceId: js.UndefOr[String] = js.undefined
  /** The relationship of the current span relative to the linked span. */
  var `type`: js.UndefOr[String] = js.undefined
}

object Link {
  @scala.inline
  def apply(
    attributes: Attributes = null,
    spanId: String = null,
    traceId: String = null,
    `type`: String = null
  ): Link = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (spanId != null) __obj.updateDynamic("spanId")(spanId.asInstanceOf[js.Any])
    if (traceId != null) __obj.updateDynamic("traceId")(traceId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
}

