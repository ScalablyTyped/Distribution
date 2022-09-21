package typings.googleVisualization.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapTypeId extends StObject {
  
  var mapTypeId: Name
}
object MapTypeId {
  
  inline def apply(mapTypeId: Name): MapTypeId = {
    val __obj = js.Dynamic.literal(mapTypeId = mapTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapTypeId]
  }
  
  extension [Self <: MapTypeId](x: Self) {
    
    inline def setMapTypeId(value: Name): Self = StObject.set(x, "mapTypeId", value.asInstanceOf[js.Any])
  }
}
