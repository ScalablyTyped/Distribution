package typings.frappeGantt

import typings.frappeGantt.mod.viewMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object frappeGanttStrings {
  @js.native
  sealed trait Day extends viewMode
  
  @js.native
  sealed trait `Half Day` extends viewMode
  
  @js.native
  sealed trait Month extends viewMode
  
  @js.native
  sealed trait `Quarter Day` extends viewMode
  
  @js.native
  sealed trait Week extends viewMode
  
  @scala.inline
  def Day: Day = "Day".asInstanceOf[Day]
  @scala.inline
  def `Half Day`: `Half Day` = ("Half Day").asInstanceOf[`Half Day`]
  @scala.inline
  def Month: Month = "Month".asInstanceOf[Month]
  @scala.inline
  def `Quarter Day`: `Quarter Day` = ("Quarter Day").asInstanceOf[`Quarter Day`]
  @scala.inline
  def Week: Week = "Week".asInstanceOf[Week]
}

