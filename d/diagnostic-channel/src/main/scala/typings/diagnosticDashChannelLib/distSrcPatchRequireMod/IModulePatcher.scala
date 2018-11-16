package typings
package diagnosticDashChannelLib.distSrcPatchRequireMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModulePatcher extends js.Object {
  @JSName("patch")
  var patch_Original: PatchFunction = js.native
  var versionSpecifier: java.lang.String = js.native
  def patch(module: js.Any, path: java.lang.String): js.Any = js.native
}

