package typings.esm

import typings.esm.anon.PartialEsm
import typings.esm.anon.PartialOptions
import typings.esm.esmStrings.all
import typings.esm.esmStrings.auto
import typings.esm.esmStrings.strict
import typings.node.NodeModule
import typings.node.NodeRequire
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(mod: NodeModule): NodeRequire = ^.asInstanceOf[js.Dynamic].apply(mod.asInstanceOf[js.Any]).asInstanceOf[NodeRequire]
  inline def apply(mod: NodeModule, options: PartialOptions): NodeRequire = (^.asInstanceOf[js.Dynamic].apply(mod.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NodeRequire]
  
  @JSImport("esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Options {
    
    trait Esm extends StObject {
      
      var cache: Boolean
      
      var dedefault: Boolean
      
      var esModule: Boolean
      
      var extensions: Boolean
      
      var mutableNamespace: Boolean
      
      var namedExports: Boolean
      
      var paths: Boolean
      
      var topLevelReturn: Boolean
      
      var vars: Boolean
    }
    object Esm {
      
      inline def apply(
        cache: Boolean,
        dedefault: Boolean,
        esModule: Boolean,
        extensions: Boolean,
        mutableNamespace: Boolean,
        namedExports: Boolean,
        paths: Boolean,
        topLevelReturn: Boolean,
        vars: Boolean
      ): Esm = {
        val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], dedefault = dedefault.asInstanceOf[js.Any], esModule = esModule.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], mutableNamespace = mutableNamespace.asInstanceOf[js.Any], namedExports = namedExports.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], topLevelReturn = topLevelReturn.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
        __obj.asInstanceOf[Esm]
      }
      
      extension [Self <: Esm](x: Self) {
        
        inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
        
        inline def setDedefault(value: Boolean): Self = StObject.set(x, "dedefault", value.asInstanceOf[js.Any])
        
        inline def setEsModule(value: Boolean): Self = StObject.set(x, "esModule", value.asInstanceOf[js.Any])
        
        inline def setExtensions(value: Boolean): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
        
        inline def setMutableNamespace(value: Boolean): Self = StObject.set(x, "mutableNamespace", value.asInstanceOf[js.Any])
        
        inline def setNamedExports(value: Boolean): Self = StObject.set(x, "namedExports", value.asInstanceOf[js.Any])
        
        inline def setPaths(value: Boolean): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
        
        inline def setTopLevelReturn(value: Boolean): Self = StObject.set(x, "topLevelReturn", value.asInstanceOf[js.Any])
        
        inline def setVars(value: Boolean): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
      }
    }
    
    trait Options extends StObject {
      
      var await: Boolean
      
      var cjs: Boolean | PartialEsm
      
      var force: Boolean
      
      var mainFields: js.Array[String]
      
      var mode: auto | all | strict
      
      var wasm: Boolean
    }
    object Options {
      
      inline def apply(
        await: Boolean,
        cjs: Boolean | PartialEsm,
        force: Boolean,
        mainFields: js.Array[String],
        mode: auto | all | strict,
        wasm: Boolean
      ): typings.esm.mod.Options.Options = {
        val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], cjs = cjs.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], mainFields = mainFields.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], wasm = wasm.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.esm.mod.Options.Options]
      }
      
      extension [Self <: typings.esm.mod.Options.Options](x: Self) {
        
        inline def setAwait(value: Boolean): Self = StObject.set(x, "await", value.asInstanceOf[js.Any])
        
        inline def setCjs(value: Boolean | PartialEsm): Self = StObject.set(x, "cjs", value.asInstanceOf[js.Any])
        
        inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
        
        inline def setMainFields(value: js.Array[String]): Self = StObject.set(x, "mainFields", value.asInstanceOf[js.Any])
        
        inline def setMainFieldsVarargs(value: String*): Self = StObject.set(x, "mainFields", js.Array(value*))
        
        inline def setMode(value: auto | all | strict): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        inline def setWasm(value: Boolean): Self = StObject.set(x, "wasm", value.asInstanceOf[js.Any])
      }
    }
  }
}
