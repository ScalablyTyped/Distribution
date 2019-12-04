package typings.atFirebaseFirestore.distIndexDotNodeMod.atFirebaseAppDashTypesMod

import typings.atFirebaseFirestore.Anon_AppBlob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var firestore: js.UndefOr[Anon_AppBlob] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(firestore: Anon_AppBlob = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (firestore != null) __obj.updateDynamic("firestore")(firestore.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

