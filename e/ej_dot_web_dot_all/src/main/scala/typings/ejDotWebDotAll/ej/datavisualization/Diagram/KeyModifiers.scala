package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.KeyModifiers.Alt
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.KeyModifiers.Control
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.KeyModifiers.None
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.KeyModifiers.Shift
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeyModifiers with Double] = js.native
  /* 1 */ @js.native
  object Alt extends TopLevel[Alt with Double]
  
  /* 2 */ @js.native
  object Control extends TopLevel[Control with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 3 */ @js.native
  object Shift extends TopLevel[Shift with Double]
  
}

