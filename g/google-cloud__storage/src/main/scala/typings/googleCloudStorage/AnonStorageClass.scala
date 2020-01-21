package typings.googleCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStorageClass extends js.Object {
  var storageClass: js.UndefOr[String] = js.undefined
  var `type`: String
}

object AnonStorageClass {
  @scala.inline
  def apply(`type`: String, storageClass: String = null): AnonStorageClass = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStorageClass]
  }
}

