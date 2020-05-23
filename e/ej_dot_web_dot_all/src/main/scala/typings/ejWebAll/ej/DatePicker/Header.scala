package typings.ejWebAll.ej.DatePicker

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
  sealed trait Min extends Header
  
  ///Removes day header in DatePicker
  @js.native
  sealed trait None extends Header
  
  ///sets  the short format of day name (like Sun) in header in DatePicker
  @js.native
  sealed trait Short extends Header
  
}

