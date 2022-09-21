package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClearAppsDataParams extends StObject {
  
  /**
    * The package names of the apps whose data will be cleared when the command is executed.
    */
  var packageNames: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaClearAppsDataParams {
  
  inline def apply(): SchemaClearAppsDataParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClearAppsDataParams]
  }
  
  extension [Self <: SchemaClearAppsDataParams](x: Self) {
    
    inline def setPackageNames(value: js.Array[String]): Self = StObject.set(x, "packageNames", value.asInstanceOf[js.Any])
    
    inline def setPackageNamesNull: Self = StObject.set(x, "packageNames", null)
    
    inline def setPackageNamesUndefined: Self = StObject.set(x, "packageNames", js.undefined)
    
    inline def setPackageNamesVarargs(value: String*): Self = StObject.set(x, "packageNames", js.Array(value*))
  }
}
