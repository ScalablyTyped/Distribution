package typings
package atFirebaseStorageLib.storageMod.appDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FirebaseApp extends js.Object {
  var storage: js.UndefOr[
    js.Function1[
      /* storageBucket */ js.UndefOr[java.lang.String], 
      atFirebaseStorageDashTypesLib.storageDashTypesMod.FirebaseStorage
    ]
  ] = js.undefined
}

