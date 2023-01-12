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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapTypeId] (val x: Self) extends AnyVal {
    
    inline def setMapTypeId(value: Name): Self = StObject.set(x, "mapTypeId", value.asInstanceOf[js.Any])
  }
}
