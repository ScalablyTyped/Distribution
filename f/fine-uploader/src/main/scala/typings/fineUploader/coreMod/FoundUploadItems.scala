package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoundUploadItems extends UploadFilter {
  /**
    * the name of the file
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * the size of the file
    */
  var size: js.UndefOr[String] = js.undefined
}

object FoundUploadItems {
  @scala.inline
  def apply(
    id: Double | js.Array[Double] = null,
    name: String = null,
    size: String = null,
    status: String | js.Array[String] = null,
    uuid: Double | js.Array[Double] = null
  ): FoundUploadItems = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoundUploadItems]
  }
}

