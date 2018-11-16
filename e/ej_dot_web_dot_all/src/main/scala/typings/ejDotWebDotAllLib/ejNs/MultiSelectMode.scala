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
  
  val Delimiter: Delimiter with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val VisualMode: VisualMode with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.MultiSelectMode with java.lang.String] = js.native
}

