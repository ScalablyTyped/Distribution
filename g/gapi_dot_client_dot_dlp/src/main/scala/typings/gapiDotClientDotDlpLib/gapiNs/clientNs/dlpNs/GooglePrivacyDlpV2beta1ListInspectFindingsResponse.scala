package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1ListInspectFindingsResponse extends js.Object {
  /**
    * If not empty, indicates that there may be more results that match the
    * request; this value should be passed in a new `ListInspectFindingsRequest`.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The results. */
  var result: js.UndefOr[GooglePrivacyDlpV2beta1InspectResult] = js.undefined
}

