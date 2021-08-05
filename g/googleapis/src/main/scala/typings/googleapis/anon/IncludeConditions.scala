package typings.googleapis.anon

import typings.googleapis.v3Mod.analyticsV3.SchemaIncludeConditions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeConditions extends StObject {
  
  var includeConditions: js.UndefOr[SchemaIncludeConditions] = js.undefined
}
object IncludeConditions {
  
  inline def apply(): IncludeConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeConditions]
  }
  
  extension [Self <: IncludeConditions](x: Self) {
    
    inline def setIncludeConditions(value: SchemaIncludeConditions): Self = StObject.set(x, "includeConditions", value.asInstanceOf[js.Any])
    
    inline def setIncludeConditionsUndefined: Self = StObject.set(x, "includeConditions", js.undefined)
  }
}
