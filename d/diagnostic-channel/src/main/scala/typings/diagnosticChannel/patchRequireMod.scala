package typings.diagnosticChannel

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patchRequireMod {
  
  @JSImport("diagnostic-channel/dist/src/patchRequire", "makePatchingRequire")
  @js.native
  def makePatchingRequire(knownPatches: IModulePatchMap): js.Function1[/* moduleId */ String, _] = js.native
  
  type IModulePatchMap = StringDictionary[js.Array[IModulePatcher]]
  
  @js.native
  trait IModulePatcher extends StObject {
    
    def patch(module: js.Any, path: String): js.Any = js.native
    @JSName("patch")
    var patch_Original: PatchFunction = js.native
    
    var versionSpecifier: String = js.native
  }
  
  type PatchFunction = js.Function2[/* module */ js.Any, /* path */ String, js.Any]
}
