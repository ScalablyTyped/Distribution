package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WktGeoBounds
  extends StObject
     with GeoBounds {
  
  var wkt: String
}
object WktGeoBounds {
  
  inline def apply(wkt: String): WktGeoBounds = {
    val __obj = js.Dynamic.literal(wkt = wkt.asInstanceOf[js.Any])
    __obj.asInstanceOf[WktGeoBounds]
  }
  
  extension [Self <: WktGeoBounds](x: Self) {
    
    inline def setWkt(value: String): Self = StObject.set(x, "wkt", value.asInstanceOf[js.Any])
  }
}
