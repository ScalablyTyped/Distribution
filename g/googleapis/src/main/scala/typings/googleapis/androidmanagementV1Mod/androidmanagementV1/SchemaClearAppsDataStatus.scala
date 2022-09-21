package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClearAppsDataStatus extends StObject {
  
  /**
    * The per-app results, a mapping from package names to the respective clearing result.
    */
  var results: js.UndefOr[StringDictionary[SchemaPerAppResult] | Null] = js.undefined
}
object SchemaClearAppsDataStatus {
  
  inline def apply(): SchemaClearAppsDataStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClearAppsDataStatus]
  }
  
  extension [Self <: SchemaClearAppsDataStatus](x: Self) {
    
    inline def setResults(value: StringDictionary[SchemaPerAppResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsNull: Self = StObject.set(x, "results", null)
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
  }
}
