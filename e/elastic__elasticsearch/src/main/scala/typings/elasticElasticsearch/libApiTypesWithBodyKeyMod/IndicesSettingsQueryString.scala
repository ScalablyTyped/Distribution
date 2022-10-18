package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesSettingsQueryString extends StObject {
  
  var lenient: Boolean
}
object IndicesSettingsQueryString {
  
  inline def apply(lenient: Boolean): IndicesSettingsQueryString = {
    val __obj = js.Dynamic.literal(lenient = lenient.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesSettingsQueryString]
  }
  
  extension [Self <: IndicesSettingsQueryString](x: Self) {
    
    inline def setLenient(value: Boolean): Self = StObject.set(x, "lenient", value.asInstanceOf[js.Any])
  }
}
