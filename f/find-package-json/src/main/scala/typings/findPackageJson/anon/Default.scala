package typings.findPackageJson.anon

import org.scalablytyped.runtime.StringDictionary
import typings.findPackageJson.packageJsonMod.PackageExportsEntry
import typings.findPackageJson.packageJsonMod.PackageExportsFallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default
  extends StObject
     with /**
  * The module path that is resolved when this environment matches the property name.
  *
  * This interface was referenced by `PackageExportsEntryObject`'s JSON-Schema definition
  * via the `patternProperty` "^(?![\.0-9]).".
  *
  * This interface was referenced by `undefined`'s JSON-Schema definition
  * via the `patternProperty` "^(?![\.0-9]).".
  */
/* k */ StringDictionary[js.UndefOr[PackageExportsEntry | PackageExportsFallback]] {
  
  /**
    * The module path that is resolved when no other export type matches.
    */
  var default: js.UndefOr[PackageExportsEntry | PackageExportsFallback] = js.undefined
  
  /**
    * The module path that is resolved when this specifier is imported as an ECMAScript module using an `import` declaration or the dynamic `import(...)` function.
    */
  var `import`: js.UndefOr[PackageExportsEntry | PackageExportsFallback] = js.undefined
  
  /**
    * The module path that is resolved when this environment is Node.js.
    */
  var node: js.UndefOr[PackageExportsEntry | PackageExportsFallback] = js.undefined
  
  /**
    * The module path that is resolved when this specifier is imported as a CommonJS module using the `require(...)` function.
    */
  var require: js.UndefOr[PackageExportsEntry | PackageExportsFallback] = js.undefined
}
object Default {
  
  inline def apply(): Default = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Default]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: PackageExportsEntry | PackageExportsFallback): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultNull: Self = StObject.set(x, "default", null)
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDefaultVarargs(value: PackageExportsEntry*): Self = StObject.set(x, "default", js.Array(value*))
    
    inline def setImport(value: PackageExportsEntry | PackageExportsFallback): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
    
    inline def setImportNull: Self = StObject.set(x, "import", null)
    
    inline def setImportUndefined: Self = StObject.set(x, "import", js.undefined)
    
    inline def setImportVarargs(value: PackageExportsEntry*): Self = StObject.set(x, "import", js.Array(value*))
    
    inline def setNode(value: PackageExportsEntry | PackageExportsFallback): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeNull: Self = StObject.set(x, "node", null)
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setNodeVarargs(value: PackageExportsEntry*): Self = StObject.set(x, "node", js.Array(value*))
    
    inline def setRequire(value: PackageExportsEntry | PackageExportsFallback): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    
    inline def setRequireNull: Self = StObject.set(x, "require", null)
    
    inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
    
    inline def setRequireVarargs(value: PackageExportsEntry*): Self = StObject.set(x, "require", js.Array(value*))
  }
}
