package typings.firebaseInstallationsTypes.mod.firebaseComponentAugmentingMod

import typings.firebaseInstallationsTypes.mod.FirebaseInstallations
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

