package typings.ejDotWebDotAll.ejNs.DatePickerNs

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
  sealed trait Century extends Level
  
  ///allow  navigation upto decade level in  DatePicker
  @js.native
  sealed trait Decade extends Level
  
  ///allow  navigation upto year level in  DatePicker
  @js.native
  sealed trait Year extends Level
  
  /* 2 */ val Century: typings.ejDotWebDotAll.ejNs.DatePickerNs.Level.Century with Double = js.native
  /* 1 */ val Decade: typings.ejDotWebDotAll.ejNs.DatePickerNs.Level.Decade with Double = js.native
  /* 0 */ val Year: typings.ejDotWebDotAll.ejNs.DatePickerNs.Level.Year with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Level with Double] = js.native
}

