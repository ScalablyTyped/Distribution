package typings.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadStatus extends js.Object {
  /** Reasons why upload can't be completed. */
  var errors: js.UndefOr[js.Array[String]] = js.undefined
  /** Per-row upload status. */
  var rowStatus: js.UndefOr[js.Array[RowStatus]] = js.undefined
}

object UploadStatus {
  @scala.inline
  def apply(errors: js.Array[String] = null, rowStatus: js.Array[RowStatus] = null): UploadStatus = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (rowStatus != null) __obj.updateDynamic("rowStatus")(rowStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadStatus]
  }
}

