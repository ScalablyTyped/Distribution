package typings.forgeViewer.Autodesk.Viewing.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControlGroup
  extends StObject
     with Control {
  
  def addControl(control: Control): Boolean = js.native
  def addControl(control: Control, options: AddControlOptions): Boolean = js.native
  
  var container: HTMLElement = js.native
  
  def getControl(controlId: String): Control = js.native
  
  def getControlId(index: Double): String = js.native
  
  def getNumberOfControls(): Double = js.native
  
  def indexOf(control: String): Double = js.native
  def indexOf(control: Control): Double = js.native
  
  def removeControl(control: String): Boolean = js.native
  def removeControl(control: Control): Boolean = js.native
}
