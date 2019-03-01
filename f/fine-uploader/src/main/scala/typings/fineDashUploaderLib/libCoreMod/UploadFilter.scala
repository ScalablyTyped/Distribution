package typings
package fineDashUploaderLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadFilter extends js.Object {
  /**
    * the id of the file
    */
  var id: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  /**
    * status of the file
    */
  var status: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * the uuid of the file
    */
  var uuid: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
}

object UploadFilter {
  @scala.inline
  def apply(
    id: scala.Double | js.Array[scala.Double] = null,
    status: java.lang.String | js.Array[java.lang.String] = null,
    uuid: scala.Double | js.Array[scala.Double] = null
  ): UploadFilter = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFilter]
  }
}

