package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageClass extends js.Object {
  var storageClass: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object StorageClass {
  @scala.inline
  def apply(storageClass: String = null, `type`: String = null): StorageClass = {
    val __obj = js.Dynamic.literal()
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageClass]
  }
}

