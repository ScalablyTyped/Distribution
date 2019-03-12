package typings
package atFirebaseStorageLib.atFirebaseStorageMod.atFirebaseAppDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  var storage: js.UndefOr[
    js.Function1[
      /* storageBucket */ js.UndefOr[java.lang.String], 
      atFirebaseStorageDashTypesLib.atFirebaseStorageDashTypesMod.FirebaseStorage
    ]
  ] = js.undefined
}

object FirebaseApp {
  @scala.inline
  def apply(
    storage: /* storageBucket */ js.UndefOr[java.lang.String] => atFirebaseStorageDashTypesLib.atFirebaseStorageDashTypesMod.FirebaseStorage = null
  ): FirebaseApp = {
    val __obj = js.Dynamic.literal()
    if (storage != null) __obj.updateDynamic("storage")(js.Any.fromFunction1(storage))
    __obj.asInstanceOf[FirebaseApp]
  }
}

