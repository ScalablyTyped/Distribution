package typings.firebaseInstallations.mod.firebaseAppTypesAugmentingMod

import typings.firebaseInstallationsTypes.mod.FirebaseInstallations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  def installations(): FirebaseInstallations
}

object FirebaseApp {
  @scala.inline
  def apply(installations: () => FirebaseInstallations): FirebaseApp = {
    val __obj = js.Dynamic.literal(installations = js.Any.fromFunction0(installations))
  
    __obj.asInstanceOf[FirebaseApp]
  }
}

