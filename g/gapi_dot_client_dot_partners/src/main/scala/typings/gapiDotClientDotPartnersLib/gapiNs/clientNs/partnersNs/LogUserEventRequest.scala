package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LogUserEventRequest extends js.Object {
  /** The action that occurred. */
  var eventAction: js.UndefOr[java.lang.String] = js.undefined
  /** The category the action belongs to. */
  var eventCategory: js.UndefOr[java.lang.String] = js.undefined
  /** List of event data for the event. */
  var eventDatas: js.UndefOr[js.Array[EventData]] = js.undefined
  /** The scope of the event. */
  var eventScope: js.UndefOr[java.lang.String] = js.undefined
  /** Advertiser lead information. */
  var lead: js.UndefOr[Lead] = js.undefined
  /** Current request metadata. */
  var requestMetadata: js.UndefOr[RequestMetadata] = js.undefined
  /** The URL where the event occurred. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

