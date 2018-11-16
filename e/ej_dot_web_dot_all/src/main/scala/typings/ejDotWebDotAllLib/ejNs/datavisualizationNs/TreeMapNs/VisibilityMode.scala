package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VisibilityMode extends js.Object

@JSGlobal("ej.datavisualization.TreeMap.VisibilityMode")
@js.native
object VisibilityMode extends js.Object {
  //specifies the hide on exceeded length mode
  @js.native
  sealed trait Hideonexceededlength
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.VisibilityMode
  
  //specifies the visible mode
  @js.native
  sealed trait Top
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.VisibilityMode
  
  val Hideonexceededlength: Hideonexceededlength with java.lang.String = js.native
  val Top: Top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.VisibilityMode with java.lang.String
  ] = js.native
}

