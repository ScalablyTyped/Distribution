package typings.firebaseStorage.mod.firebaseAppTypesAugmentingMod

import typings.firebaseStorage.AnonCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var storage: js.UndefOr[AnonCall] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(storage: AnonCall = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

