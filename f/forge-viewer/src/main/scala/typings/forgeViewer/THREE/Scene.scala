package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scene
  extends StObject
     with Object3D {
  
  var autoUpdate: Boolean = js.native
  
  var background: Any = js.native
  
  def copy(source: Scene): Scene = js.native
  def copy(source: Scene, recursive: Boolean): Scene = js.native
  
  var fog: Fog = js.native
  
  var overrideMaterial: Material = js.native
}
