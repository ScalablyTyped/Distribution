package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreativeCustomEvent extends js.Object {
  /** Unique ID of this event used by DDM Reporting and Data Transfer. This is a read-only field. */
  var advertiserCustomEventId: js.UndefOr[java.lang.String] = js.undefined
  /** User-entered name for the event. */
  var advertiserCustomEventName: js.UndefOr[java.lang.String] = js.undefined
  /** Type of the event. This is a read-only field. */
  var advertiserCustomEventType: js.UndefOr[java.lang.String] = js.undefined
  /** Artwork label column, used to link events in DCM back to events in Studio. This is a required field and should not be modified after insertion. */
  var artworkLabel: js.UndefOr[java.lang.String] = js.undefined
  /** Artwork type used by the creative.This is a read-only field. */
  var artworkType: js.UndefOr[java.lang.String] = js.undefined
  /** Exit URL of the event. This field is used only for exit events. */
  var exitUrl: js.UndefOr[java.lang.String] = js.undefined
  /** ID of this event. This is a required field and should not be modified after insertion. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Properties for rich media popup windows. This field is used only for exit events. */
  var popupWindowProperties: js.UndefOr[PopupWindowProperties] = js.undefined
  /** Target type used by the event. */
  var targetType: js.UndefOr[java.lang.String] = js.undefined
  /** Video reporting ID, used to differentiate multiple videos in a single creative. This is a read-only field. */
  var videoReportingId: js.UndefOr[java.lang.String] = js.undefined
}

