package typings.googleMapReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NESWBounds extends StObject {
  
  @JSName("ne")
  var ne_FNESWBounds: Coords
  
  var nw: js.UndefOr[Coords] = js.undefined
  
  var se: js.UndefOr[Coords] = js.undefined
  
  var sw: Coords
}
object NESWBounds {
  
  @scala.inline
  def apply(ne_ : Coords, sw: Coords): NESWBounds = {
    val __obj = js.Dynamic.literal(sw = sw.asInstanceOf[js.Any])
    __obj.updateDynamic("ne")(ne_.asInstanceOf[js.Any])
    __obj.asInstanceOf[NESWBounds]
  }
  
  @scala.inline
  implicit class NESWBoundsMutableBuilder[Self <: NESWBounds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNe_(value: Coords): Self = StObject.set(x, "ne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNw(value: Coords): Self = StObject.set(x, "nw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNwUndefined: Self = StObject.set(x, "nw", js.undefined)
    
    @scala.inline
    def setSe(value: Coords): Self = StObject.set(x, "se", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeUndefined: Self = StObject.set(x, "se", js.undefined)
    
    @scala.inline
    def setSw(value: Coords): Self = StObject.set(x, "sw", value.asInstanceOf[js.Any])
  }
}
