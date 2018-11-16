package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait groupSelectionMode extends js.Object

@JSGlobal("ej.datavisualization.TreeMap.groupSelectionMode")
@js.native
object groupSelectionMode extends js.Object {
  //specifies the default mode
  @js.native
  sealed trait Default
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.groupSelectionMode
  
  //specifies the multiple mode
  @js.native
  sealed trait Multiple
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.groupSelectionMode
  
  val Default: Default with java.lang.String = js.native
  val Multiple: Multiple with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs.groupSelectionMode with java.lang.String
  ] = js.native
}

