package typings.atFirebaseInstallationsDashTypes.atFirebaseInstallationsDashTypesMod.atFirebaseComponentMod

import typings.atFirebaseInstallationsDashTypes.atFirebaseInstallationsDashTypesMod.FirebaseInstallations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameServiceMapping extends js.Object {
  var installations: FirebaseInstallations
}

object NameServiceMapping {
  @scala.inline
  def apply(installations: FirebaseInstallations): NameServiceMapping = {
    val __obj = js.Dynamic.literal(installations = installations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NameServiceMapping]
  }
}

