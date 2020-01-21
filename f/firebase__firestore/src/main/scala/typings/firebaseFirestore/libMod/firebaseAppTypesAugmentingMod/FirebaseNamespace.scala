package typings.firebaseFirestore.libMod.firebaseAppTypesAugmentingMod

import typings.firebaseFirestore.AnonAppBlobCollectionReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var firestore: js.UndefOr[AnonAppBlobCollectionReference] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(firestore: AnonAppBlobCollectionReference = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (firestore != null) __obj.updateDynamic("firestore")(firestore.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

