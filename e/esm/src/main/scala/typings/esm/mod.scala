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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("esm", JSImport.Namespace)
  @js.native
  def apply(mod: NodeModule): NodeRequire = js.native
  @JSImport("esm", JSImport.Namespace)
  @js.native
  def apply(mod: NodeModule, options: PartialOptions): NodeRequire = js.native
  
  object Options {
    
    @js.native
    trait Esm extends StObject {
      
      var cache: Boolean = js.native
      
      var dedefault: Boolean = js.native
      
      var esModule: Boolean = js.native
      
      var extensions: Boolean = js.native
      
      var mutableNamespace: Boolean = js.native
      
      var namedExports: Boolean = js.native
      
      var paths: Boolean = js.native
      
      var topLevelReturn: Boolean = js.native
      
      var vars: Boolean = js.native
    }
    object Esm {
      
      @scala.inline
      def apply(
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
      
      @scala.inline
      implicit class EsmMutableBuilder[Self <: Esm] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDedefault(value: Boolean): Self = StObject.set(x, "dedefault", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEsModule(value: Boolean): Self = StObject.set(x, "esModule", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExtensions(value: Boolean): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMutableNamespace(value: Boolean): Self = StObject.set(x, "mutableNamespace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamedExports(value: Boolean): Self = StObject.set(x, "namedExports", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPaths(value: Boolean): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTopLevelReturn(value: Boolean): Self = StObject.set(x, "topLevelReturn", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVars(value: Boolean): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Options extends StObject {
      
      var await: Boolean = js.native
      
      var cjs: Boolean | PartialEsm = js.native
      
      var force: Boolean = js.native
      
      var mainFields: js.Array[String] = js.native
      
      var mode: auto | all | strict = js.native
      
      var wasm: Boolean = js.native
    }
    object Options {
      
      @scala.inline
      def apply(
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
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: typings.esm.mod.Options.Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAwait(value: Boolean): Self = StObject.set(x, "await", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCjs(value: Boolean | PartialEsm): Self = StObject.set(x, "cjs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMainFields(value: js.Array[String]): Self = StObject.set(x, "mainFields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMainFieldsVarargs(value: String*): Self = StObject.set(x, "mainFields", js.Array(value :_*))
        
        @scala.inline
        def setMode(value: auto | all | strict): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWasm(value: Boolean): Self = StObject.set(x, "wasm", value.asInstanceOf[js.Any])
      }
    }
  }
}
