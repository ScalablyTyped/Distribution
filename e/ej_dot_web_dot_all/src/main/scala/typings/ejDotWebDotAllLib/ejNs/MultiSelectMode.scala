package typings
package ejDotWebDotAllLib.ejNs

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
  sealed trait Delimiter
    extends ejDotWebDotAllLib.ejNs.MultiSelectMode
  
  //can select only single item in DropDownList
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.MultiSelectMode
  
  //can select multiple items and it's show's like visual box in textbox
  @js.native
  sealed trait VisualMode
    extends ejDotWebDotAllLib.ejNs.MultiSelectMode
  
  /* 1 */ val Delimiter: Delimiter with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val VisualMode: VisualMode with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.MultiSelectMode with scala.Double] = js.native
}

