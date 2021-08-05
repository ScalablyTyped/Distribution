package typings.googleapis.anon

import typings.googleapis.v3Mod.analyticsV3.SchemaIncludeConditions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludeConditions extends StObject {
  
  var excludeConditions: js.UndefOr[ExclusionDuration] = js.undefined
  
  var includeConditions: js.UndefOr[SchemaIncludeConditions] = js.undefined
}
object ExcludeConditions {
  
  inline def apply(): ExcludeConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcludeConditions]
  }
  
  extension [Self <: ExcludeConditions](x: Self) {
    
    inline def setExcludeConditions(value: ExclusionDuration): Self = StObject.set(x, "excludeConditions", value.asInstanceOf[js.Any])
    
    inline def setExcludeConditionsUndefined: Self = StObject.set(x, "excludeConditions", js.undefined)
    
    inline def setIncludeConditions(value: SchemaIncludeConditions): Self = StObject.set(x, "includeConditions", value.asInstanceOf[js.Any])
    
    inline def setIncludeConditionsUndefined: Self = StObject.set(x, "includeConditions", js.undefined)
  }
}
