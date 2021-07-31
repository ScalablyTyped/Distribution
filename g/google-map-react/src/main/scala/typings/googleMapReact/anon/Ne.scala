package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ne extends StObject {
  
  @JSName("ne")
  var ne_FNe: typings.googleMapReact.mod.Coords
  
  var sw: typings.googleMapReact.mod.Coords
}
object Ne {
  
  @scala.inline
  def apply(ne_ : typings.googleMapReact.mod.Coords, sw: typings.googleMapReact.mod.Coords): Ne = {
    val __obj = js.Dynamic.literal(sw = sw.asInstanceOf[js.Any])
    __obj.updateDynamic("ne")(ne_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ne]
  }
  
  @scala.inline
  implicit class NeMutableBuilder[Self <: Ne] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNe_(value: typings.googleMapReact.mod.Coords): Self = StObject.set(x, "ne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSw(value: typings.googleMapReact.mod.Coords): Self = StObject.set(x, "sw", value.asInstanceOf[js.Any])
  }
}
