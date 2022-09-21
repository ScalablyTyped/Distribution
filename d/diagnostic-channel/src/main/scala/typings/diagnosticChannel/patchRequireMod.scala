package typings.diagnosticChannel

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patchRequireMod {
  
  @JSImport("diagnostic-channel/dist/src/patchRequire", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makePatchingRequire(knownPatches: IModulePatchMap): js.Function1[/* moduleId */ String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makePatchingRequire")(knownPatches.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* moduleId */ String, Any]]
  
  type IModulePatchMap = StringDictionary[js.Array[IModulePatcher]]
  
  trait IModulePatcher extends StObject {
    
    def patch(module: Any, path: String): Any
    @JSName("patch")
    var patch_Original: PatchFunction
    
    var publisherName: js.UndefOr[String] = js.undefined
    
    var versionSpecifier: String
  }
  object IModulePatcher {
    
    inline def apply(patch: (/* module */ Any, /* path */ String) => Any, versionSpecifier: String): IModulePatcher = {
      val __obj = js.Dynamic.literal(patch = js.Any.fromFunction2(patch), versionSpecifier = versionSpecifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[IModulePatcher]
    }
    
    extension [Self <: IModulePatcher](x: Self) {
      
      inline def setPatch(value: (/* module */ Any, /* path */ String) => Any): Self = StObject.set(x, "patch", js.Any.fromFunction2(value))
      
      inline def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
      
      inline def setPublisherNameUndefined: Self = StObject.set(x, "publisherName", js.undefined)
      
      inline def setVersionSpecifier(value: String): Self = StObject.set(x, "versionSpecifier", value.asInstanceOf[js.Any])
    }
  }
  
  type PatchFunction = js.Function2[/* module */ Any, /* path */ String, Any]
}
