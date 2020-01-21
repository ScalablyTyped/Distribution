package typings.firebaseInstallations

import typings.firebaseInstallations.firebaseInstallationsStrings._empty
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/helpers/generate-fid", JSImport.Namespace)
@js.native
object generateFidMod extends js.Object {
  val INVALID_FID: _empty = js.native
  val VALID_FID_PATTERN: RegExp = js.native
  def generateFid(): String = js.native
}

