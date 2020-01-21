package typings.ejWebAll.ej.Autocomplete

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MultiSelectMode extends js.Object

@JSGlobal("ej.Autocomplete.MultiSelectMode")
@js.native
object MultiSelectMode extends js.Object {
  ///Multiple values are separated using a given special character.
  @js.native
  sealed trait Delimiter extends MultiSelectMode
  
  ///Each values are displayed in separate box with close button.
  @js.native
  sealed trait VisualMode extends MultiSelectMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MultiSelectMode with Double] = js.native
  /* 0 */ @js.native
  object Delimiter extends TopLevel[Delimiter with Double]
  
  /* 1 */ @js.native
  object VisualMode extends TopLevel[VisualMode with Double]
  
}

