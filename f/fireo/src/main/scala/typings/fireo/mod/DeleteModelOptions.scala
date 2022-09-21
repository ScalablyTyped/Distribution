package typings.fireo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteModelOptions extends StObject {
  
  var batch: js.UndefOr[Any] = js.undefined
  
  var transaction: js.UndefOr[Any] = js.undefined
}
object DeleteModelOptions {
  
  inline def apply(): DeleteModelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteModelOptions]
  }
  
  extension [Self <: DeleteModelOptions](x: Self) {
    
    inline def setBatch(value: Any): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    inline def setTransaction(value: Any): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
