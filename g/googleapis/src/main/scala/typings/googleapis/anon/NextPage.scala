package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NextPage extends StObject {
  
  var nextPage: js.UndefOr[js.Array[Cr]] = js.undefined
  
  var previousPage: js.UndefOr[js.Array[Cr]] = js.undefined
  
  var request: js.UndefOr[js.Array[Cr]] = js.undefined
}
object NextPage {
  
  inline def apply(): NextPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NextPage]
  }
  
  extension [Self <: NextPage](x: Self) {
    
    inline def setNextPage(value: js.Array[Cr]): Self = StObject.set(x, "nextPage", value.asInstanceOf[js.Any])
    
    inline def setNextPageUndefined: Self = StObject.set(x, "nextPage", js.undefined)
    
    inline def setNextPageVarargs(value: Cr*): Self = StObject.set(x, "nextPage", js.Array(value*))
    
    inline def setPreviousPage(value: js.Array[Cr]): Self = StObject.set(x, "previousPage", value.asInstanceOf[js.Any])
    
    inline def setPreviousPageUndefined: Self = StObject.set(x, "previousPage", js.undefined)
    
    inline def setPreviousPageVarargs(value: Cr*): Self = StObject.set(x, "previousPage", js.Array(value*))
    
    inline def setRequest(value: js.Array[Cr]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setRequestVarargs(value: Cr*): Self = StObject.set(x, "request", js.Array(value*))
  }
}
