package typings
package atFirebaseFirestoreLib.atFirebaseFirestoreMod.atFirebaseAppDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var firestore: js.UndefOr[atFirebaseFirestoreLib.Anon_App] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(firestore: atFirebaseFirestoreLib.Anon_App = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (firestore != null) __obj.updateDynamic("firestore")(firestore)
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

