package typings.googleCloudStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageClass extends js.Object {
  var storageClass: js.UndefOr[String] = js.undefined
  var `type`: String
}

object StorageClass {
  @scala.inline
  def apply(`type`: String, storageClass: String = null): StorageClass = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageClass]
  }
}

