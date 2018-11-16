package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait Content
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Region
  
  //Used to export the page region of the diagram.
  @js.native
  sealed trait PageSettings
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Region
  
  val Content: Content with java.lang.String = js.native
  val PageSettings: PageSettings with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Region with java.lang.String
  ] = js.native
}

