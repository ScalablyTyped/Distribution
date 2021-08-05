package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nw extends StObject {
  
  var nw: typings.googleMapReact.mod.Coords
  
  var se: typings.googleMapReact.mod.Coords
}
object Nw {
  
  inline def apply(nw: typings.googleMapReact.mod.Coords, se: typings.googleMapReact.mod.Coords): Nw = {
    val __obj = js.Dynamic.literal(nw = nw.asInstanceOf[js.Any], se = se.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nw]
  }
  
  extension [Self <: Nw](x: Self) {
    
    inline def setNw(value: typings.googleMapReact.mod.Coords): Self = StObject.set(x, "nw", value.asInstanceOf[js.Any])
    
    inline def setSe(value: typings.googleMapReact.mod.Coords): Self = StObject.set(x, "se", value.asInstanceOf[js.Any])
  }
}
