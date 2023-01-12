package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesRecoveryRecoveryFiles extends StObject {
  
  var details: js.UndefOr[js.Array[IndicesRecoveryFileDetails]] = js.undefined
  
  var percent: Percentage
  
  var recovered: long
  
  var reused: long
  
  var total: long
}
object IndicesRecoveryRecoveryFiles {
  
  inline def apply(percent: Percentage, recovered: long, reused: long, total: long): IndicesRecoveryRecoveryFiles = {
    val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any], recovered = recovered.asInstanceOf[js.Any], reused = reused.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesRecoveryRecoveryFiles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesRecoveryRecoveryFiles] (val x: Self) extends AnyVal {
    
    inline def setDetails(value: js.Array[IndicesRecoveryFileDetails]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDetailsVarargs(value: IndicesRecoveryFileDetails*): Self = StObject.set(x, "details", js.Array(value*))
    
    inline def setPercent(value: Percentage): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setRecovered(value: long): Self = StObject.set(x, "recovered", value.asInstanceOf[js.Any])
    
    inline def setReused(value: long): Self = StObject.set(x, "reused", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: long): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
