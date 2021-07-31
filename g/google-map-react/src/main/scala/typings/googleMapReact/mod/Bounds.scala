package typings.googleMapReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bounds extends StObject {
  
  @JSName("ne")
  var ne_FBounds: Coords
  
  var nw: Coords
  
  var se: Coords
  
  var sw: Coords
}
object Bounds {
  
  @scala.inline
  def apply(ne_ : Coords, nw: Coords, se: Coords, sw: Coords): Bounds = {
    val __obj = js.Dynamic.literal(nw = nw.asInstanceOf[js.Any], se = se.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any])
    __obj.updateDynamic("ne")(ne_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds]
  }
  
  @scala.inline
  implicit class BoundsMutableBuilder[Self <: Bounds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNe_(value: Coords): Self = StObject.set(x, "ne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNw(value: Coords): Self = StObject.set(x, "nw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSe(value: Coords): Self = StObject.set(x, "se", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSw(value: Coords): Self = StObject.set(x, "sw", value.asInstanceOf[js.Any])
  }
}
