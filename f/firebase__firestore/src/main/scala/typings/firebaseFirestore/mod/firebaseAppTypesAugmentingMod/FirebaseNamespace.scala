package typings.firebaseFirestore.mod.firebaseAppTypesAugmentingMod

import typings.firebaseFirestore.AnonApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var firestore: js.UndefOr[AnonApp] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(firestore: AnonApp = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (firestore != null) __obj.updateDynamic("firestore")(firestore.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

