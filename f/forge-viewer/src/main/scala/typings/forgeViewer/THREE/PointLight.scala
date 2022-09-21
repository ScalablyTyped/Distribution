package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointLight
  extends StObject
     with Light {
  
  def copy(source: PointLight): PointLight = js.native
  
  var decay: Double = js.native
  
  var distance: Double = js.native
  
  var power: Double = js.native
}
