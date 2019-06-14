package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FitMode extends js.Object

@JSGlobal("ej.datavisualization.Diagram.FitMode")
@js.native
object FitMode extends js.Object {
  //Used to fit the diagram content based on diagram height.
  @js.native
  sealed trait Height
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.FitMode
  
  //Used to fit the diagram content based on page size.
  @js.native
  sealed trait Page
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.FitMode
  
  //Used to fit the diagram content based on diagram width.
  @js.native
  sealed trait Width
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.FitMode
  
  /* 2 */ val Height: Height with scala.Double = js.native
  /* 0 */ val Page: Page with scala.Double = js.native
  /* 1 */ val Width: Width with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.FitMode with scala.Double] = js.native
}

