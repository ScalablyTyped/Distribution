package typings.diagnosticChannel.mod

import typings.diagnosticChannel.patchRequireMod.IModulePatchMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diagnostic-channel", "makePatchingRequire")
@js.native
object makePatchingRequire extends js.Object {
  def apply(knownPatches: IModulePatchMap): js.Function1[/* moduleId */ String, _] = js.native
}

