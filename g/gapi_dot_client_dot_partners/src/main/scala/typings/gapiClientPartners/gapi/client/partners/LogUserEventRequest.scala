package typings.gapiClientPartners.gapi.client.partners

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
    if (eventAction != null) __obj.updateDynamic("eventAction")(eventAction.asInstanceOf[js.Any])
    if (eventCategory != null) __obj.updateDynamic("eventCategory")(eventCategory.asInstanceOf[js.Any])
    if (eventDatas != null) __obj.updateDynamic("eventDatas")(eventDatas.asInstanceOf[js.Any])
    if (eventScope != null) __obj.updateDynamic("eventScope")(eventScope.asInstanceOf[js.Any])
    if (lead != null) __obj.updateDynamic("lead")(lead.asInstanceOf[js.Any])
    if (requestMetadata != null) __obj.updateDynamic("requestMetadata")(requestMetadata.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogUserEventRequest]
  }
}

