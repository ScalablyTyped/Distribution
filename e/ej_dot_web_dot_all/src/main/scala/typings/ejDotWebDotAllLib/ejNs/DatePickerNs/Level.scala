package typings
package ejDotWebDotAllLib.ejNs.DatePickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Level extends js.Object

@JSGlobal("ej.DatePicker.Level")
@js.native
object Level extends js.Object {
  ///allow  navigation upto Century level in  DatePicker
  @js.native
  sealed trait Century
    extends ejDotWebDotAllLib.ejNs.DatePickerNs.Level
  
  ///allow  navigation upto decade level in  DatePicker
  @js.native
  sealed trait Decade
    extends ejDotWebDotAllLib.ejNs.DatePickerNs.Level
  
  ///allow  navigation upto year level in  DatePicker
  @js.native
  sealed trait Year
    extends ejDotWebDotAllLib.ejNs.DatePickerNs.Level
  
  /* 2 */ val Century: Century with scala.Double = js.native
  /* 1 */ val Decade: Decade with scala.Double = js.native
  /* 0 */ val Year: Year with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.DatePickerNs.Level with scala.Double] = js.native
}

