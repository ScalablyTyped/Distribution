package typings.esm

import typings.esm.esmStrings.all
import typings.esm.esmStrings.auto
import typings.esm.esmStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<esm.esm.Options.Esm> */
  trait PartialEsm extends StObject {
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var dedefault: js.UndefOr[Boolean] = js.undefined
    
    var esModule: js.UndefOr[Boolean] = js.undefined
    
    var extensions: js.UndefOr[Boolean] = js.undefined
    
    var mutableNamespace: js.UndefOr[Boolean] = js.undefined
    
    var namedExports: js.UndefOr[Boolean] = js.undefined
    
    var paths: js.UndefOr[Boolean] = js.undefined
    
    var topLevelReturn: js.UndefOr[Boolean] = js.undefined
    
    var vars: js.UndefOr[Boolean] = js.undefined
  }
  object PartialEsm {
    
    @scala.inline
    def apply(): PartialEsm = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialEsm]
    }
    
    @scala.inline
    implicit class PartialEsmMutableBuilder[Self <: PartialEsm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setDedefault(value: Boolean): Self = StObject.set(x, "dedefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDedefaultUndefined: Self = StObject.set(x, "dedefault", js.undefined)
      
      @scala.inline
      def setEsModule(value: Boolean): Self = StObject.set(x, "esModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEsModuleUndefined: Self = StObject.set(x, "esModule", js.undefined)
      
      @scala.inline
      def setExtensions(value: Boolean): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setMutableNamespace(value: Boolean): Self = StObject.set(x, "mutableNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutableNamespaceUndefined: Self = StObject.set(x, "mutableNamespace", js.undefined)
      
      @scala.inline
      def setNamedExports(value: Boolean): Self = StObject.set(x, "namedExports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamedExportsUndefined: Self = StObject.set(x, "namedExports", js.undefined)
      
      @scala.inline
      def setPaths(value: Boolean): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      @scala.inline
      def setTopLevelReturn(value: Boolean): Self = StObject.set(x, "topLevelReturn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLevelReturnUndefined: Self = StObject.set(x, "topLevelReturn", js.undefined)
      
      @scala.inline
      def setVars(value: Boolean): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVarsUndefined: Self = StObject.set(x, "vars", js.undefined)
    }
  }
  
  /* Inlined std.Partial<esm.esm.Options.Options> */
  trait PartialOptions extends StObject {
    
    var await: js.UndefOr[Boolean] = js.undefined
    
    var cjs: js.UndefOr[Boolean | PartialEsm] = js.undefined
    
    var force: js.UndefOr[Boolean] = js.undefined
    
    var mainFields: js.UndefOr[js.Array[String]] = js.undefined
    
    var mode: js.UndefOr[auto | all | strict] = js.undefined
    
    var wasm: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAwait(value: Boolean): Self = StObject.set(x, "await", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwaitUndefined: Self = StObject.set(x, "await", js.undefined)
      
      @scala.inline
      def setCjs(value: Boolean | PartialEsm): Self = StObject.set(x, "cjs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCjsUndefined: Self = StObject.set(x, "cjs", js.undefined)
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setMainFields(value: js.Array[String]): Self = StObject.set(x, "mainFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainFieldsUndefined: Self = StObject.set(x, "mainFields", js.undefined)
      
      @scala.inline
      def setMainFieldsVarargs(value: String*): Self = StObject.set(x, "mainFields", js.Array(value :_*))
      
      @scala.inline
      def setMode(value: auto | all | strict): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setWasm(value: Boolean): Self = StObject.set(x, "wasm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWasmUndefined: Self = StObject.set(x, "wasm", js.undefined)
    }
  }
}
