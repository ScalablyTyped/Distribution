package typings.gapiDotClientDotPartners.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogUserEventRequest extends js.Object {
  /** The action that occurred. */
  var eventAction: js.UndefOr[String] = js.undefined
  /** The category the action belongs to. */
  var eventCategory: js.UndefOr[String] = js.undefined
  /** List of event data for the event. */
  var eventDatas: js.UndefOr[js.Array[EventData]] = js.undefined
  /** The scope of the event. */
  var eventScope: js.UndefOr[String] = js.undefined
  /** Advertiser lead information. */
  var lead: js.UndefOr[Lead] = js.undefined
  /** Current request metadata. */
  var requestMetadata: js.UndefOr[RequestMetadata] = js.undefined
  /** The URL where the event occurred. */
  var url: js.UndefOr[String] = js.undefined
}

object LogUserEventRequest {
  @scala.inline
  def apply(
    eventAction: String = null,
    eventCategory: String = null,
    eventDatas: js.Array[EventData] = null,
    eventScope: String = null,
    lead: Lead = null,
    requestMetadata: RequestMetadata = null,
    url: String = null
  ): LogUserEventRequest = {
    val __obj = js.Dynamic.literal()
    if (eventAction != null) __obj.updateDynamic("eventAction")(eventAction)
    if (eventCategory != null) __obj.updateDynamic("eventCategory")(eventCategory)
    if (eventDatas != null) __obj.updateDynamic("eventDatas")(eventDatas)
    if (eventScope != null) __obj.updateDynamic("eventScope")(eventScope)
    if (lead != null) __obj.updateDynamic("lead")(lead)
    if (requestMetadata != null) __obj.updateDynamic("requestMetadata")(requestMetadata)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[LogUserEventRequest]
  }
}

