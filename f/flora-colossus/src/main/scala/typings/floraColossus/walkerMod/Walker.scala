package typings.floraColossus.walkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flora-colossus/lib/Walker", "Walker")
@js.native
class Walker protected () extends js.Object {
  def this(modulePath: String) = this()
  var cache: js.Any = js.native
  var detectNativeModuleType: js.Any = js.native
  var loadPackageJSON: js.Any = js.native
  var modules: js.Any = js.native
  var relativeModule: js.Any = js.native
  var rootModule: js.Any = js.native
  var walkDependenciesForModule: js.Any = js.native
  var walkDependenciesForModuleInModule: js.Any = js.native
  var walkHistory: js.Any = js.native
  def getRootModule(): String = js.native
  def walkTree(): js.Promise[js.Array[Module]] = js.native
}

