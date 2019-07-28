package typings.atFirebaseFirestore.atFirebaseFirestoreMod.atFirebaseAppDashTypesMod

import typings.atFirebaseFirestore.Anon_App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var firestore: js.UndefOr[Anon_App] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(firestore: Anon_App = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (firestore != null) __obj.updateDynamic("firestore")(firestore)
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

