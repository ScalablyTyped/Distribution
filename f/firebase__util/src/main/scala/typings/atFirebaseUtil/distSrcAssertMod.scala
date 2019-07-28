package typings.atFirebaseUtil

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util/dist/src/assert", JSImport.Namespace)
@js.native
object distSrcAssertMod extends js.Object {
  def assert(assertion: js.Any, message: String): Unit = js.native
  def assertionError(message: String): Error = js.native
}

