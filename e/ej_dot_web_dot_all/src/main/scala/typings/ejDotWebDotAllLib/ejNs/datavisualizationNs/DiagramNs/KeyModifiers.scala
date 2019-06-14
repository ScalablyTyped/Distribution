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
  
  /* 1 */ val Alt: Alt with scala.Double = js.native
  /* 2 */ val Control: Control with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 3 */ val Shift: Shift with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.KeyModifiers with scala.Double
  ] = js.native
}

