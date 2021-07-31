package typings.diagnosticChannel

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patchRequireMod {
  
  @JSImport("diagnostic-channel/dist/src/patchRequire", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def makePatchingRequire(knownPatches: IModulePatchMap): js.Function1[/* moduleId */ String, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makePatchingRequire")(knownPatches.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* moduleId */ String, js.Any]]
  
  type IModulePatchMap = StringDictionary[js.Array[IModulePatcher]]
  
  trait IModulePatcher extends StObject {
    
    def patch(module: js.Any, path: String): js.Any
    @JSName("patch")
    var patch_Original: PatchFunction
    
    var versionSpecifier: String
  }
  object IModulePatcher {
    
    @scala.inline
    def apply(patch: (/* module */ js.Any, /* path */ String) => js.Any, versionSpecifier: String): IModulePatcher = {
      val __obj = js.Dynamic.literal(patch = js.Any.fromFunction2(patch), versionSpecifier = versionSpecifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[IModulePatcher]
    }
    
    @scala.inline
    implicit class IModulePatcherMutableBuilder[Self <: IModulePatcher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPatch(value: (/* module */ js.Any, /* path */ String) => js.Any): Self = StObject.set(x, "patch", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVersionSpecifier(value: String): Self = StObject.set(x, "versionSpecifier", value.asInstanceOf[js.Any])
    }
  }
  
  type PatchFunction = js.Function2[/* module */ js.Any, /* path */ String, js.Any]
}
