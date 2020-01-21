package typings.firebaseStorage.mod.firebaseAppTypesAugmentingMod

import typings.firebaseStorage.AnonApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var storage: js.UndefOr[AnonApp] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(storage: AnonApp = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

