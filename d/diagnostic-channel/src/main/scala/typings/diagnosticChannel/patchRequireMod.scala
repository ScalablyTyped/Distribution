package typings.diagnosticChannel

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("diagnostic-channel/dist/src/patchRequire", JSImport.Namespace)
@js.native
object patchRequireMod extends js.Object {
  
  def makePatchingRequire(knownPatches: IModulePatchMap): js.Function1[/* moduleId */ String, _] = js.native
  
  @js.native
  trait IModulePatcher extends js.Object {
    
    def patch(module: js.Any, path: String): js.Any = js.native
    @JSName("patch")
    var patch_Original: PatchFunction = js.native
    
    var versionSpecifier: String = js.native
  }
  
  type IModulePatchMap = StringDictionary[js.Array[IModulePatcher]]
  
  type PatchFunction = js.Function2[/* module */ js.Any, /* path */ String, js.Any]
}
