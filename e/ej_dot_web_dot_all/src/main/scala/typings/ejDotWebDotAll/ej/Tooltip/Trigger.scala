package typings.ejDotWebDotAll.ej.Tooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Trigger extends js.Object

@JSGlobal("ej.Tooltip.Trigger")
@js.native
object Trigger extends js.Object {
  ///The Tooltip to be shown when the target element is clicked.
  @js.native
  sealed trait Click extends Trigger
  
  ///Enables the Tooltip when focus is set to target element.
  @js.native
  sealed trait Focus extends Trigger
  
  ///Enables the Tooltip when hover on the target element.
  @js.native
  sealed trait Hover extends Trigger
  
  /* 0 */ val Click: typings.ejDotWebDotAll.ej.Tooltip.Trigger.Click with Double = js.native
  /* 2 */ val Focus: typings.ejDotWebDotAll.ej.Tooltip.Trigger.Focus with Double = js.native
  /* 1 */ val Hover: typings.ejDotWebDotAll.ej.Tooltip.Trigger.Hover with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Trigger with Double] = js.native
}

