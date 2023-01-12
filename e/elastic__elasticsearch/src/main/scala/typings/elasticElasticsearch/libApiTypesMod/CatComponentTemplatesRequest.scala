package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatComponentTemplatesRequest
  extends StObject
     with CatCatRequestBase {
  
  var name: js.UndefOr[String] = js.undefined
}
object CatComponentTemplatesRequest {
  
  inline def apply(): CatComponentTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatComponentTemplatesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CatComponentTemplatesRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
