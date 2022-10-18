package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatTemplatesRequest
  extends StObject
     with CatCatRequestBase {
  
  var name: js.UndefOr[Name] = js.undefined
}
object CatTemplatesRequest {
  
  inline def apply(): CatTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatTemplatesRequest]
  }
  
  extension [Self <: CatTemplatesRequest](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
