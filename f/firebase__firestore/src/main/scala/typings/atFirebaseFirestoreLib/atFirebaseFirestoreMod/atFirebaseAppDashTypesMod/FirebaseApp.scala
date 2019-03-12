package typings
package atFirebaseFirestoreLib.atFirebaseFirestoreMod.atFirebaseAppDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  var firestore: js.UndefOr[
    js.Function0[
      atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod.FirebaseFirestore
    ]
  ] = js.undefined
}

object FirebaseApp {
  @scala.inline
  def apply(
    firestore: () => atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod.FirebaseFirestore = null
  ): FirebaseApp = {
    val __obj = js.Dynamic.literal()
    if (firestore != null) __obj.updateDynamic("firestore")(js.Any.fromFunction0(firestore))
    __obj.asInstanceOf[FirebaseApp]
  }
}

