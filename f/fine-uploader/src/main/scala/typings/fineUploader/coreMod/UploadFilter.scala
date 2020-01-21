package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadFilter extends js.Object {
  /**
    * the id of the file
    */
  var id: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /**
    * status of the file
    */
  var status: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * the uuid of the file
    */
  var uuid: js.UndefOr[Double | js.Array[Double]] = js.undefined
}

object UploadFilter {
  @scala.inline
  def apply(
    id: Double | js.Array[Double] = null,
    status: String | js.Array[String] = null,
    uuid: Double | js.Array[Double] = null
  ): UploadFilter = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFilter]
  }
}

