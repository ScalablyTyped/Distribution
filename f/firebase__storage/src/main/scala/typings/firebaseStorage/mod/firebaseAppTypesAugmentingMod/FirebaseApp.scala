package typings.firebaseStorage.mod.firebaseAppTypesAugmentingMod

import typings.firebaseStorageTypes.mod.FirebaseStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseApp extends js.Object {
  var storage: js.UndefOr[js.Function1[/* storageBucket */ js.UndefOr[String], FirebaseStorage]] = js.native
}

object FirebaseApp {
  @scala.inline
  def apply(): FirebaseApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirebaseApp]
  }
  @scala.inline
  implicit class FirebaseAppOps[Self <: FirebaseApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStorage(value: /* storageBucket */ js.UndefOr[String] => FirebaseStorage): Self = this.set("storage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
  }
  
}

