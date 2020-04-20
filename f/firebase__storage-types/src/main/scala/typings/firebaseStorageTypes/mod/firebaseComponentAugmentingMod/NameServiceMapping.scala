package typings.firebaseStorageTypes.mod.firebaseComponentAugmentingMod

import typings.firebaseStorageTypes.mod.FirebaseStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameServiceMapping extends js.Object {
  var storage: FirebaseStorage
}

object NameServiceMapping {
  @scala.inline
  def apply(storage: FirebaseStorage): NameServiceMapping = {
    val __obj = js.Dynamic.literal(storage = storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameServiceMapping]
  }
}

