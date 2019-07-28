package typings.atFirebaseStorage.atFirebaseStorageMod.atFirebaseAppDashTypesMod

import typings.atFirebaseStorageDashTypes.atFirebaseStorageDashTypesMod.FirebaseStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  var storage: js.UndefOr[js.Function1[/* storageBucket */ js.UndefOr[String], FirebaseStorage]] = js.undefined
}

object FirebaseApp {
  @scala.inline
  def apply(storage: /* storageBucket */ js.UndefOr[String] => FirebaseStorage = null): FirebaseApp = {
    val __obj = js.Dynamic.literal()
    if (storage != null) __obj.updateDynamic("storage")(js.Any.fromFunction1(storage))
    __obj.asInstanceOf[FirebaseApp]
  }
}

