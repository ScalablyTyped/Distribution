package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelOrientation extends js.Object

@JSGlobal("ej.datavisualization.Map.LabelOrientation")
@js.native
object LabelOrientation extends js.Object {
  //specifies the horizontal position
  @js.native
  sealed trait Horizontal
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.LabelOrientation
  
  //specifies the vertical position
  @js.native
  sealed trait Vertical
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.LabelOrientation
  
  val Horizontal: Horizontal with java.lang.String = js.native
  val Vertical: Vertical with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.LabelOrientation with java.lang.String
  ] = js.native
}

