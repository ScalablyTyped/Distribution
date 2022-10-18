package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatHealthRequest
  extends StObject
     with CatCatRequestBase {
  
  var ts: js.UndefOr[Boolean] = js.undefined
}
object CatHealthRequest {
  
  inline def apply(): CatHealthRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatHealthRequest]
  }
  
  extension [Self <: CatHealthRequest](x: Self) {
    
    inline def setTs(value: Boolean): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    inline def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
  }
}
