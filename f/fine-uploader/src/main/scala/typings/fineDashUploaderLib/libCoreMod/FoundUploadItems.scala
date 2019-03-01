package typings
package fineDashUploaderLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoundUploadItems extends UploadFilter {
  /**
    * the name of the file
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * the size of the file
    */
  var size: js.UndefOr[java.lang.String] = js.undefined
}

object FoundUploadItems {
  @scala.inline
  def apply(
    id: scala.Double | js.Array[scala.Double] = null,
    name: java.lang.String = null,
    size: java.lang.String = null,
    status: java.lang.String | js.Array[java.lang.String] = null,
    uuid: scala.Double | js.Array[scala.Double] = null
  ): FoundUploadItems = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (size != null) __obj.updateDynamic("size")(size)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoundUploadItems]
  }
}

