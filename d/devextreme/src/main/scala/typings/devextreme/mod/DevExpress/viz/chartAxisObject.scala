package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait chartAxisObject extends StObject {
  
  /**
    * Gets the axis&apos; displayed range.
    */
  def visualRange(): VizRange = js.native
  /**
    * Sets the axis&apos;s displayed range.
    */
  def visualRange(visualRange: js.Array[Double | String | js.Date]): Unit = js.native
  def visualRange(visualRange: VizRange): Unit = js.native
}
