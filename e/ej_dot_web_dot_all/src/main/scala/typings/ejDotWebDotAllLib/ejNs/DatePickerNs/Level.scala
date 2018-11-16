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
  
  val Century: Century with java.lang.String = js.native
  val Decade: Decade with java.lang.String = js.native
  val Year: Year with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.DatePickerNs.Level with java.lang.String] = js.native
}

