package typings.ejDotWebDotAll.ejNs

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
  
  /* 1 */ val Delimiter: typings.ejDotWebDotAll.ejNs.MultiSelectMode.Delimiter with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ejNs.MultiSelectMode.None with Double = js.native
  /* 2 */ val VisualMode: typings.ejDotWebDotAll.ejNs.MultiSelectMode.VisualMode with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MultiSelectMode with Double] = js.native
}

