package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeyModifiers extends js.Object

@JSGlobal("ej.datavisualization.Diagram.KeyModifiers")
@js.native
object KeyModifiers extends js.Object {
  //The ALT key.
  @js.native
  sealed trait Alt
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.KeyModifiers
  
  //The CTRL key.
  @js.native
  sealed trait Control
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.KeyModifiers
  
  //No modifiers are pressed.
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.KeyModifiers
  
  //The SHIFT key.
  @js.native
  sealed trait Shift
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.KeyModifiers
  
  val Alt: Alt with java.lang.String = js.native
  val Control: Control with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Shift: Shift with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.KeyModifiers with java.lang.String
  ] = js.native
}

