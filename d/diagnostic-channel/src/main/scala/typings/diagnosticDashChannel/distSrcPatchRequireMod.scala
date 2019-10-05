package typings.diagnosticDashChannel

import org.scalablytyped.runtime.StringDictionary
import typings.diagnosticDashChannel.distSrcPatchRequireMod.IModulePatchMap
import typings.diagnosticDashChannel.distSrcPatchRequireMod.IModulePatcher
import typings.diagnosticDashChannel.distSrcPatchRequireMod.PatchFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diagnostic-channel/dist/src/patchRequire", JSImport.Namespace)
@js.native
object distSrcPatchRequireMod extends js.Object {
  @js.native
  trait IModulePatcher extends js.Object {
    @JSName("patch")
    var patch_Original: PatchFunction = js.native
    var versionSpecifier: String = js.native
    def patch(module: js.Any, path: String): js.Any = js.native
  }
  
  def makePatchingRequire(knownPatches: IModulePatchMap): js.Function1[/* moduleId */ String, _] = js.native
  type IModulePatchMap = StringDictionary[js.Array[IModulePatcher]]
  type PatchFunction = js.Function2[/* module */ js.Any, /* path */ String, js.Any]
}

