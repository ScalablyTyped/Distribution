package typings.atFirebaseInstallations

import typings.atFirebaseInstallations.atFirebaseInstallationsStrings.Empty
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/helpers/generate-fid", JSImport.Namespace)
@js.native
object distSrcHelpersGenerateDashFidMod extends js.Object {
  val INVALID_FID: Empty = js.native
  val VALID_FID_PATTERN: RegExp = js.native
  def generateFid(): String = js.native
}

