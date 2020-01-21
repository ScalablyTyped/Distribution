package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePartitioning extends js.Object {
  var expirationMs: js.UndefOr[String] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var requirePartitionFilter: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object TimePartitioning {
  @scala.inline
  def apply(
    expirationMs: String = null,
    field: String = null,
    requirePartitionFilter: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): TimePartitioning = {
    val __obj = js.Dynamic.literal()
    if (expirationMs != null) __obj.updateDynamic("expirationMs")(expirationMs.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(requirePartitionFilter)) __obj.updateDynamic("requirePartitionFilter")(requirePartitionFilter.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePartitioning]
  }
}

