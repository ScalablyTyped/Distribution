package typings.ejDotWebDotAll.ej.DatePicker

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.DatePicker.Level.Century
import typings.ejDotWebDotAll.ej.DatePicker.Level.Decade
import typings.ejDotWebDotAll.ej.DatePicker.Level.Year
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Level with Double] = js.native
  /* 2 */ @js.native
  object Century extends TopLevel[Century with Double]
  
  /* 1 */ @js.native
  object Decade extends TopLevel[Decade with Double]
  
  /* 0 */ @js.native
  object Year extends TopLevel[Year with Double]
  
}

