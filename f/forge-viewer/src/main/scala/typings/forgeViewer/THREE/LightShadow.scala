package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LightShadow extends StObject {
  
  var bias: Double = js.native
  
  var camera: Camera = js.native
  
  def clone(recursive: Boolean): LightShadow = js.native
  
  def copy(source: LightShadow): LightShadow = js.native
  
  var map: Any = js.native
  
  var mapSize: Vector2 = js.native
  
  var matrix: Matrix4 = js.native
  
  var radius: Double = js.native
}
