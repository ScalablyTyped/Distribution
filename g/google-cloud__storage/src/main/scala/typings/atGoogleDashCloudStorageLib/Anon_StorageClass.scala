package typings
package atGoogleDashCloudStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StorageClass extends js.Object {
  var storageClass: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object Anon_StorageClass {
  @scala.inline
  def apply(`type`: java.lang.String, storageClass: java.lang.String = null): Anon_StorageClass = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass)
    __obj.asInstanceOf[Anon_StorageClass]
  }
}

