package typings.firebaseFirestore.indexDotnodeMod.firebaseAppTypesAugmentingMod

import typings.firebaseFirestoreTypes.mod.FirebaseFirestore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  var firestore: js.UndefOr[js.Function0[FirebaseFirestore]] = js.undefined
}

object FirebaseApp {
  @scala.inline
  def apply(firestore: () => FirebaseFirestore = null): FirebaseApp = {
    val __obj = js.Dynamic.literal()
    if (firestore != null) __obj.updateDynamic("firestore")(js.Any.fromFunction0(firestore))
    __obj.asInstanceOf[FirebaseApp]
  }
}

