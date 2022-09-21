package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTableCell extends StObject {
  
  var v: js.UndefOr[Any | Null] = js.undefined
}
object SchemaTableCell {
  
  inline def apply(): SchemaTableCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableCell]
  }
  
  extension [Self <: SchemaTableCell](x: Self) {
    
    inline def setV(value: Any): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setVNull: Self = StObject.set(x, "v", null)
    
    inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
  }
}
