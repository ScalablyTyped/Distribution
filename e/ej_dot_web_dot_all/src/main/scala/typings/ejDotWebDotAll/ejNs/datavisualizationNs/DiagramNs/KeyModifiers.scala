package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait Alt extends KeyModifiers
  
  //The CTRL key.
  @js.native
  sealed trait Control extends KeyModifiers
  
  //No modifiers are pressed.
  @js.native
  sealed trait None extends KeyModifiers
  
  //The SHIFT key.
  @js.native
  sealed trait Shift extends KeyModifiers
  
  /* 1 */ val Alt: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.KeyModifiers.Alt with Double = js.native
  /* 2 */ val Control: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.KeyModifiers.Control with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.KeyModifiers.None with Double = js.native
  /* 3 */ val Shift: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.KeyModifiers.Shift with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeyModifiers with Double] = js.native
}

