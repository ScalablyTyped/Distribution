package typings.googleVisualization.google.visualization

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartBase extends StObject {
  
  def getContainer(): Element = js.native
  
  def getSelection(): js.Array[ChartSelection] = js.native
  
  def setSelection(): Unit = js.native
  def setSelection(selection: js.Array[ChartSelection]): Unit = js.native
}
