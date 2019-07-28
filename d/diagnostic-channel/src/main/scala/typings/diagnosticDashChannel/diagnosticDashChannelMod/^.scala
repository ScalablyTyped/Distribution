package typings.diagnosticDashChannel.diagnosticDashChannelMod

import typings.diagnosticDashChannel.distSrcPatchRequireMod.IModulePatchMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diagnostic-channel", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val channel: IChannel = js.native
  def makePatchingRequire(knownPatches: IModulePatchMap): js.Function1[/* moduleId */ String, _] = js.native
}

