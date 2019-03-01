package typings
package gapiDotClientDotStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StorageClass extends js.Object {
  /** Target storage class. Required iff the type of the action is SetStorageClass. */
  var storageClass: js.UndefOr[java.lang.String] = js.undefined
  /** Type of the action. Currently, only Delete and SetStorageClass are supported. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_StorageClass {
  @scala.inline
  def apply(storageClass: java.lang.String = null, `type`: java.lang.String = null): Anon_StorageClass = {
    val __obj = js.Dynamic.literal()
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_StorageClass]
  }
}

