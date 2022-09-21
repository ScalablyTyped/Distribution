package typings.fireo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveModelOptions extends StObject {
  
  var batch: js.UndefOr[Any] = js.undefined
  
  var merge: js.UndefOr[Boolean] = js.undefined
  
  var transaction: js.UndefOr[Any] = js.undefined
}
object SaveModelOptions {
  
  inline def apply(): SaveModelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveModelOptions]
  }
  
  extension [Self <: SaveModelOptions](x: Self) {
    
    inline def setBatch(value: Any): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    inline def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
    
    inline def setTransaction(value: Any): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
