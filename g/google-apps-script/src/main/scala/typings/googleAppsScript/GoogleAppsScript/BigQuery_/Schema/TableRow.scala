package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableRow extends StObject {
  
  var f: js.UndefOr[js.Array[TableCell]] = js.undefined
}
object TableRow {
  
  inline def apply(): TableRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRow]
  }
  
  extension [Self <: TableRow](x: Self) {
    
    inline def setF(value: js.Array[TableCell]): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    inline def setFUndefined: Self = StObject.set(x, "f", js.undefined)
    
    inline def setFVarargs(value: TableCell*): Self = StObject.set(x, "f", js.Array(value :_*))
  }
}
