package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformControls extends StObject {
  
  def attach(`object`: Any): Unit = js.native
  
  def detach(`object`: Any): Unit = js.native
  
  def onPointerDown(event: Any): Boolean = js.native
  
  def onPointerHover(event: Any): Boolean = js.native
  
  def onPointerMove(event: Any): Boolean = js.native
  
  def onPointerUp(event: Any): Boolean = js.native
  
  def update(): Unit = js.native
  def update(highlight: Boolean): Unit = js.native
  
  var visible: Boolean = js.native
}
