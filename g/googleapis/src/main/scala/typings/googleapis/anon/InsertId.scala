package typings.googleapis.anon

import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaJsonObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertId extends StObject {
  
  var insertId: js.UndefOr[String] = js.undefined
  
  var json: js.UndefOr[SchemaJsonObject] = js.undefined
}
object InsertId {
  
  inline def apply(): InsertId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertId]
  }
  
  extension [Self <: InsertId](x: Self) {
    
    inline def setInsertId(value: String): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
    
    inline def setInsertIdUndefined: Self = StObject.set(x, "insertId", js.undefined)
    
    inline def setJson(value: SchemaJsonObject): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
  }
}
