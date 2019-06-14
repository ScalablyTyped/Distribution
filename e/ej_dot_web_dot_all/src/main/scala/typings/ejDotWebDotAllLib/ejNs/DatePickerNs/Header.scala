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
  
  /* 2 */ val Min: Min with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val Short: Short with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.DatePickerNs.Header with scala.Double] = js.native
}

