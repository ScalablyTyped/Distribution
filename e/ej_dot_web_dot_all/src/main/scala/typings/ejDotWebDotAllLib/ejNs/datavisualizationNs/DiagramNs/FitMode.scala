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
  
  val Height: Height with java.lang.String = js.native
  val Page: Page with java.lang.String = js.native
  val Width: Width with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.FitMode with java.lang.String
  ] = js.native
}

