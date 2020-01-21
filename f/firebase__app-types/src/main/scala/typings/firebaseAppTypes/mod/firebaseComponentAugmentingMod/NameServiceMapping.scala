package typings.firebaseAppTypes.mod.firebaseComponentAugmentingMod

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseAppTypes.mod.VersionService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameServiceMapping extends js.Object {
  var app: FirebaseApp
  var `app-version`: VersionService
  var `platform-identifier`: VersionService
}

object NameServiceMapping {
  @scala.inline
  def apply(app: FirebaseApp, `app-version`: VersionService, `platform-identifier`: VersionService): NameServiceMapping = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.updateDynamic("app-version")(`app-version`.asInstanceOf[js.Any])
    __obj.updateDynamic("platform-identifier")(`platform-identifier`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameServiceMapping]
  }
}

