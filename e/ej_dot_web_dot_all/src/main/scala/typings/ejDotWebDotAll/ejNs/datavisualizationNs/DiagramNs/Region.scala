package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Region extends js.Object

@JSGlobal("ej.datavisualization.Diagram.Region")
@js.native
object Region extends js.Object {
  //Used to export the content of the diagram only.
  @js.native
  sealed trait Content extends Region
  
  //Used to export the page region of the diagram.
  @js.native
  sealed trait PageSettings extends Region
  
  /* 0 */ val Content: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.Region.Content with Double = js.native
  /* 1 */ val PageSettings: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.Region.PageSettings with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Region with Double] = js.native
}

