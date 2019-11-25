package typings.atGoogleDashCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StorageClass extends js.Object {
  var storageClass: js.UndefOr[String] = js.undefined
  var `type`: String
}

object Anon_StorageClass {
  @scala.inline
  def apply(`type`: String, storageClass: String = null): Anon_StorageClass = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_StorageClass]
  }
}

