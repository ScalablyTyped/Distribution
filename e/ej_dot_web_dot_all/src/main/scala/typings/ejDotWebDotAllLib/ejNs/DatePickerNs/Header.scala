package typings
package ejDotWebDotAllLib.ejNs.DatePickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Header extends js.Object

@JSGlobal("ej.DatePicker.Header")
@js.native
object Header extends js.Object {
  ///sets  the Min format of day name (like su) in header format DatePicker
  @js.native
  sealed trait Min
    extends ejDotWebDotAllLib.ejNs.DatePickerNs.Header
  
  ///Removes day header in DatePicker
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.DatePickerNs.Header
  
  ///sets  the short format of day name (like Sun) in header in DatePicker
  @js.native
  sealed trait Short
    extends ejDotWebDotAllLib.ejNs.DatePickerNs.Header
  
  val Min: Min with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Short: Short with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.DatePickerNs.Header with java.lang.String] = js.native
}

