package typings.findPackageJson.anon

import org.scalablytyped.runtime.StringDictionary
import typings.findPackageJson.packageJsonMod.PackageExportsEntry
import typings.findPackageJson.packageJsonMod.PackageExportsFallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _empty
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
    * The module path that is resolved when the module specifier matches "name", shadows the "main" field.
    */
  @JSName(".")
  var Dot: js.UndefOr[PackageExportsEntry | PackageExportsFallback] = js.undefined
}
object _empty {
  
  inline def apply(): _empty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_empty]
  }
  
  extension [Self <: _empty](x: Self) {
    
    inline def setDot(value: PackageExportsEntry | PackageExportsFallback): Self = StObject.set(x, ".", value.asInstanceOf[js.Any])
    
    inline def setDotNull: Self = StObject.set(x, ".", null)
    
    inline def setDotUndefined: Self = StObject.set(x, ".", js.undefined)
    
    inline def setDotVarargs(value: PackageExportsEntry*): Self = StObject.set(x, ".", js.Array(value*))
  }
}
