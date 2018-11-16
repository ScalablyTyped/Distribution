package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait selectionMode extends js.Object

@JSGlobal("ej.datavisualization.TreeMap.selectionMode")
@js.native
object selectionMode extends js.Object {
  //specifies the default mode
  @js.native
  sealed trait Default
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.selectionMode
  
  //specifies the multiple mode
  @js.native
  sealed trait Multiple
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.selectionMode
  
  val Default: Default with java.lang.String = js.native
  val Multiple: Multiple with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.selectionMode with java.lang.String
  ] = js.native
}

