package typings
package gapiDotClientDotCloudtraceLib.gapiNs.clientNs.cloudtraceNs

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
  var spanId: js.UndefOr[java.lang.String] = js.undefined
  /** `TRACE_ID` identifies a trace within a project. */
  var traceId: js.UndefOr[java.lang.String] = js.undefined
  /** The relationship of the current span relative to the linked span. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Link {
  @scala.inline
  def apply(
    attributes: Attributes = null,
    spanId: java.lang.String = null,
    traceId: java.lang.String = null,
    `type`: java.lang.String = null
  ): Link = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (spanId != null) __obj.updateDynamic("spanId")(spanId)
    if (traceId != null) __obj.updateDynamic("traceId")(traceId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Link]
  }
}

