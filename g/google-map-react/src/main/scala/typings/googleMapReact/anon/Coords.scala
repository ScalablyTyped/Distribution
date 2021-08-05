package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Coords extends StObject {
  
  var coords: typings.googleMapReact.mod.Coords
}
object Coords {
  
  inline def apply(coords: typings.googleMapReact.mod.Coords): Coords = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coords]
  }
  
  extension [Self <: Coords](x: Self) {
    
    inline def setCoords(value: typings.googleMapReact.mod.Coords): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
  }
}
