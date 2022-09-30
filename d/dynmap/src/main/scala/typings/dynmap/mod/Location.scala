package typings.dynmap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dynmap", "Location")
@js.native
open class Location[W, X, Y, Z] protected () extends StObject {
  def this(world: W, x: X, y: Y, z: Z) = this()
  
  var world: js.UndefOr[W] = js.native
  
  var x: X = js.native
  
  var y: Y = js.native
  
  var z: Z = js.native
}
