package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionsBatchInsertResponse extends js.Object {
  var hasFailures: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
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
    if (!js.isUndefined(hasFailures)) __obj.updateDynamic("hasFailures")(hasFailures.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversionsBatchInsertResponse]
  }
}

