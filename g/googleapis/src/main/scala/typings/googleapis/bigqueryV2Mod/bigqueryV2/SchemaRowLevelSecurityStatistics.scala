package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRowLevelSecurityStatistics extends StObject {
  
  /**
    * [Output-only] [Preview] Whether any accessed data was protected by row access policies.
    */
  var rowLevelSecurityApplied: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaRowLevelSecurityStatistics {
  
  inline def apply(): SchemaRowLevelSecurityStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRowLevelSecurityStatistics]
  }
  
  extension [Self <: SchemaRowLevelSecurityStatistics](x: Self) {
    
    inline def setRowLevelSecurityApplied(value: Boolean): Self = StObject.set(x, "rowLevelSecurityApplied", value.asInstanceOf[js.Any])
    
    inline def setRowLevelSecurityAppliedNull: Self = StObject.set(x, "rowLevelSecurityApplied", null)
    
    inline def setRowLevelSecurityAppliedUndefined: Self = StObject.set(x, "rowLevelSecurityApplied", js.undefined)
  }
}
