package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionalLight
  extends StObject
     with Light {
  
  def copy(source: DirectionalLight): DirectionalLight = js.native
  
  var target: Object3D = js.native
}
