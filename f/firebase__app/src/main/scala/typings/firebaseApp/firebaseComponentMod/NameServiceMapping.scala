package typings.firebaseApp.firebaseComponentMod

import typings.firebaseAppTypes.mod.VersionService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameServiceMapping extends js.Object {
  var `test-shell`: js.Promise[Unit]
  var vs1: VersionService
  var vs2: VersionService
}

object NameServiceMapping {
  @scala.inline
  def apply(`test-shell`: js.Promise[Unit], vs1: VersionService, vs2: VersionService): NameServiceMapping = {
    val __obj = js.Dynamic.literal(vs1 = vs1.asInstanceOf[js.Any], vs2 = vs2.asInstanceOf[js.Any])
    __obj.updateDynamic("test-shell")(`test-shell`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameServiceMapping]
  }
}

