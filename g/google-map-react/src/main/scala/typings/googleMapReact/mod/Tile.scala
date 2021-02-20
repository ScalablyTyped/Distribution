package typings.googleMapReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tile extends Point {
  
  var zoom: Double = js.native
}
object Tile {
  
  @scala.inline
  def apply(x: Double, y: Double, zoom: Double): Tile = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tile]
  }
  
  @scala.inline
  implicit class TileMutableBuilder[Self <: Tile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
