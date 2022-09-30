package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ResultSetMetadata. */
trait IResultSetMetadata extends StObject {
  
  /** ResultSetMetadata rowType */
  var rowType: js.UndefOr[IStructType | Null] = js.undefined
  
  /** ResultSetMetadata transaction */
  var transaction: js.UndefOr[ITransaction | Null] = js.undefined
}
object IResultSetMetadata {
  
  inline def apply(): IResultSetMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResultSetMetadata]
  }
  
  extension [Self <: IResultSetMetadata](x: Self) {
    
    inline def setRowType(value: IStructType): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
    
    inline def setRowTypeNull: Self = StObject.set(x, "rowType", null)
    
    inline def setRowTypeUndefined: Self = StObject.set(x, "rowType", js.undefined)
    
    inline def setTransaction(value: ITransaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionNull: Self = StObject.set(x, "transaction", null)
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
