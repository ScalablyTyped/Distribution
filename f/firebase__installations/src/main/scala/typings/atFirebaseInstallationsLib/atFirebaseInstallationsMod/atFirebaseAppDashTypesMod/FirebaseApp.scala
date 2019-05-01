package typings
package atFirebaseInstallationsLib.atFirebaseInstallationsMod.atFirebaseAppDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  def installations(): atFirebaseInstallationsDashTypesLib.atFirebaseInstallationsDashTypesMod.FirebaseInstallations
}

object FirebaseApp {
  @scala.inline
  def apply(
    installations: () => atFirebaseInstallationsDashTypesLib.atFirebaseInstallationsDashTypesMod.FirebaseInstallations
  ): FirebaseApp = {
    val __obj = js.Dynamic.literal(installations = js.Any.fromFunction0(installations))
  
    __obj.asInstanceOf[FirebaseApp]
  }
}

