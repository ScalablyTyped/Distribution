package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedStatus extends js.Object {
  /** The country for which the status is reported, represented as a  CLDR territory code. */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the feed for which the status is reported. */
  var datafeedId: js.UndefOr[java.lang.String] = js.undefined
  /** The list of errors occurring in the feed. */
  var errors: js.UndefOr[js.Array[DatafeedStatusError]] = js.undefined
  /** The number of items in the feed that were processed. */
  var itemsTotal: js.UndefOr[java.lang.String] = js.undefined
  /** The number of items in the feed that were valid. */
  var itemsValid: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#datafeedStatus". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The two-letter ISO 639-1 language for which the status is reported. */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /** The last date at which the feed was uploaded. */
  var lastUploadDate: js.UndefOr[java.lang.String] = js.undefined
  /** The processing status of the feed. */
  var processingStatus: js.UndefOr[java.lang.String] = js.undefined
  /** The list of errors occurring in the feed. */
  var warnings: js.UndefOr[js.Array[DatafeedStatusError]] = js.undefined
}

