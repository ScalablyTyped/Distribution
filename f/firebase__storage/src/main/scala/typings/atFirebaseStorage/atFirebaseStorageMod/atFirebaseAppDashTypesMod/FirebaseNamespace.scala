package typings.atFirebaseStorage.atFirebaseStorageMod.atFirebaseAppDashTypesMod

import typings.atFirebaseStorage.Anon_App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var storage: js.UndefOr[Anon_App] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(storage: Anon_App = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (storage != null) __obj.updateDynamic("storage")(storage)
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

