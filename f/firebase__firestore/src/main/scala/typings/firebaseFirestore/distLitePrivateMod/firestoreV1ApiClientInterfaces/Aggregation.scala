package typings.firebaseFirestore.distLitePrivateMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aggregation extends StObject {
  
  var alias: js.UndefOr[String] = js.undefined
  
  var avg: js.UndefOr[Avg] = js.undefined
  
  var count: js.UndefOr[Count] = js.undefined
  
  var sum: js.UndefOr[Sum] = js.undefined
}
object Aggregation {
  
  inline def apply(): Aggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Aggregation] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setAvg(value: Avg): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
    
    inline def setAvgUndefined: Self = StObject.set(x, "avg", js.undefined)
    
    inline def setCount(value: Count): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setSum(value: Sum): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    inline def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
  }
}
