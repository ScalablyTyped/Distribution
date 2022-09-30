package typings.dynmap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dynmap", "LatLng")
@js.native
open class LatLng[W, L, F] protected () extends StObject {
  def this(world: W, lat: L, lng: F) = this()
  
  var lat: L = js.native
  
  var lng: F = js.native
  
  var world: js.UndefOr[W] = js.native
}
