package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIndexUnusedReason extends StObject {
  
  /**
    * [Output-only] Specifies the base table involved in the reason that no search index was used.
    */
  var base_table: js.UndefOr[SchemaTableReference] = js.undefined
  
  /**
    * [Output-only] Specifies the high-level reason for the scenario when no search index was used.
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] Specifies the name of the unused search index, if available.
    */
  var index_name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] Free form human-readable reason for the scenario when no search index was used.
    */
  var message: js.UndefOr[String | Null] = js.undefined
}
object SchemaIndexUnusedReason {
  
  inline def apply(): SchemaIndexUnusedReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIndexUnusedReason]
  }
  
  extension [Self <: SchemaIndexUnusedReason](x: Self) {
    
    inline def setBase_table(value: SchemaTableReference): Self = StObject.set(x, "base_table", value.asInstanceOf[js.Any])
    
    inline def setBase_tableUndefined: Self = StObject.set(x, "base_table", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setIndex_name(value: String): Self = StObject.set(x, "index_name", value.asInstanceOf[js.Any])
    
    inline def setIndex_nameNull: Self = StObject.set(x, "index_name", null)
    
    inline def setIndex_nameUndefined: Self = StObject.set(x, "index_name", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
