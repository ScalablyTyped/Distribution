package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatHelpHelpRecord extends StObject {
  
  var endpoint: String
}
object CatHelpHelpRecord {
  
  inline def apply(endpoint: String): CatHelpHelpRecord = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatHelpHelpRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CatHelpHelpRecord] (val x: Self) extends AnyVal {
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
  }
}
