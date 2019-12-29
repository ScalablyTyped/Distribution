package typings.ejDotWebDotAll.ej.Tooltip

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Trigger with Double] = js.native
  /* 0 */ @js.native
  object Click extends TopLevel[Click with Double]
  
  /* 2 */ @js.native
  object Focus extends TopLevel[Focus with Double]
  
  /* 1 */ @js.native
  object Hover extends TopLevel[Hover with Double]
  
}

