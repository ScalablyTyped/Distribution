package typings.ejDotWebDotAll.ej

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MultiSelectMode extends js.Object

@JSGlobal("ej.MultiSelectMode")
@js.native
object MultiSelectMode extends js.Object {
  //can select multiple items and it's separated by delimiterChar
  @js.native
  sealed trait Delimiter extends MultiSelectMode
  
  //can select only single item in DropDownList
  @js.native
  sealed trait None extends MultiSelectMode
  
  //can select multiple items and it's show's like visual box in textbox
  @js.native
  sealed trait VisualMode extends MultiSelectMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MultiSelectMode with Double] = js.native
  /* 1 */ @js.native
  object Delimiter extends TopLevel[Delimiter with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object VisualMode extends TopLevel[VisualMode with Double]
  
}

