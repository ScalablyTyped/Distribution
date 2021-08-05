package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatHealthParams
  extends StObject
     with CatCommonParams {
  
  var ts: js.UndefOr[Boolean] = js.undefined
}
object CatHealthParams {
  
  inline def apply(format: String): CatHealthParams = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatHealthParams]
  }
  
  extension [Self <: CatHealthParams](x: Self) {
    
    inline def setTs(value: Boolean): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    inline def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
  }
}
