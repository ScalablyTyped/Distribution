package typings.ejWebAll.ej.DatePicker

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
  
}

