package typings.gapiDotClientDotStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StorageClass extends js.Object {
  /** Target storage class. Required iff the type of the action is SetStorageClass. */
  var storageClass: js.UndefOr[String] = js.undefined
  /** Type of the action. Currently, only Delete and SetStorageClass are supported. */
  var `type`: js.UndefOr[String] = js.undefined
}

object Anon_StorageClass {
  @scala.inline
  def apply(storageClass: String = null, `type`: String = null): Anon_StorageClass = {
    val __obj = js.Dynamic.literal()
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_StorageClass]
  }
}

