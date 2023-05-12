package typings.falWorksEsbuildPluginGlobalExternals

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleInfoMod {
  
  @JSImport("@fal-works/esbuild-plugin-global-externals/lib/module-info", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizeModuleInfo(value: String): NormalizedModuleInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeModuleInfo")(value.asInstanceOf[js.Any]).asInstanceOf[NormalizedModuleInfo]
  inline def normalizeModuleInfo(value: ModuleInfo): NormalizedModuleInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeModuleInfo")(value.asInstanceOf[js.Any]).asInstanceOf[NormalizedModuleInfo]
  
  trait ModuleInfo extends StObject {
    
    /**
      * Set to `false` to prevent emitting code for default import/export
      * (which you won't need to unless you are finicky).
      * Defaults to `true`. No effect if `type` is `"cjs"`.
      */
    var defaultExport: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Names of variables that are exported from the module and may be imported
      * from another module.
      * No effect if `type` is `"cjs"`.
      */
    var namedExports: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Type (either `"esm"` or `"cjs"`) that determines the internal behavior of
      * this plugin. Defaults to `"esm"`.
      */
    var `type`: js.UndefOr[ModuleType] = js.undefined
    
    /**
      * Global variable name with which the import statements of the module
      * should be replaced.
      */
    var varName: String
  }
  object ModuleInfo {
    
    inline def apply(varName: String): ModuleInfo = {
      val __obj = js.Dynamic.literal(varName = varName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModuleInfo] (val x: Self) extends AnyVal {
      
      inline def setDefaultExport(value: Boolean): Self = StObject.set(x, "defaultExport", value.asInstanceOf[js.Any])
      
      inline def setDefaultExportUndefined: Self = StObject.set(x, "defaultExport", js.undefined)
      
      inline def setNamedExports(value: js.Array[String]): Self = StObject.set(x, "namedExports", value.asInstanceOf[js.Any])
      
      inline def setNamedExportsUndefined: Self = StObject.set(x, "namedExports", js.undefined)
      
      inline def setNamedExportsVarargs(value: String*): Self = StObject.set(x, "namedExports", js.Array(value*))
      
      inline def setType(value: ModuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVarName(value: String): Self = StObject.set(x, "varName", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.falWorksEsbuildPluginGlobalExternals.falWorksEsbuildPluginGlobalExternalsStrings.esm
    - typings.falWorksEsbuildPluginGlobalExternals.falWorksEsbuildPluginGlobalExternalsStrings.cjs
  */
  trait ModuleType extends StObject
  object ModuleType {
    
    inline def cjs: typings.falWorksEsbuildPluginGlobalExternals.falWorksEsbuildPluginGlobalExternalsStrings.cjs = "cjs".asInstanceOf[typings.falWorksEsbuildPluginGlobalExternals.falWorksEsbuildPluginGlobalExternalsStrings.cjs]
    
    inline def esm: typings.falWorksEsbuildPluginGlobalExternals.falWorksEsbuildPluginGlobalExternalsStrings.esm = "esm".asInstanceOf[typings.falWorksEsbuildPluginGlobalExternals.falWorksEsbuildPluginGlobalExternalsStrings.esm]
  }
  
  trait NormalizedModuleInfo extends StObject {
    
    var defaultExport: Boolean
    
    var namedExports: js.Array[String] | Null
    
    var `type`: ModuleType
    
    var varName: String
  }
  object NormalizedModuleInfo {
    
    inline def apply(defaultExport: Boolean, `type`: ModuleType, varName: String): NormalizedModuleInfo = {
      val __obj = js.Dynamic.literal(defaultExport = defaultExport.asInstanceOf[js.Any], varName = varName.asInstanceOf[js.Any], namedExports = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedModuleInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NormalizedModuleInfo] (val x: Self) extends AnyVal {
      
      inline def setDefaultExport(value: Boolean): Self = StObject.set(x, "defaultExport", value.asInstanceOf[js.Any])
      
      inline def setNamedExports(value: js.Array[String]): Self = StObject.set(x, "namedExports", value.asInstanceOf[js.Any])
      
      inline def setNamedExportsNull: Self = StObject.set(x, "namedExports", null)
      
      inline def setNamedExportsVarargs(value: String*): Self = StObject.set(x, "namedExports", js.Array(value*))
      
      inline def setType(value: ModuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVarName(value: String): Self = StObject.set(x, "varName", value.asInstanceOf[js.Any])
    }
  }
}
