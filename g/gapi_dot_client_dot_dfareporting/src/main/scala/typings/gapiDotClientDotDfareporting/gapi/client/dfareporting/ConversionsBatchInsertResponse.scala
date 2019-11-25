package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionsBatchInsertResponse extends js.Object {
  /** Indicates that some or all conversions failed to insert. */
  var hasFailures: js.UndefOr[Boolean] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#conversionsBatchInsertResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** The insert status of each conversion. Statuses are returned in the same order that conversions are inserted. */
  var status: js.UndefOr[js.Array[ConversionStatus]] = js.undefined
}

object ConversionsBatchInsertResponse {
  @scala.inline
  def apply(
    hasFailures: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    status: js.Array[ConversionStatus] = null
  ): ConversionsBatchInsertResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasFailures)) __obj.updateDynamic("hasFailures")(hasFailures.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversionsBatchInsertResponse]
  }
}

