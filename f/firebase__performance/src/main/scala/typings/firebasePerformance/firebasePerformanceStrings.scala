package typings.firebasePerformance

import typings.firebasePerformance.apiServiceMod.EntryType
import typings.firebasePerformance.errorsMod.ErrorCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object firebasePerformanceStrings {
  @js.native
  sealed trait `FB not default` extends ErrorCode
  
  @js.native
  sealed trait `RC response not ok` extends ErrorCode
  
  @js.native
  sealed trait frame extends EntryType
  
  @js.native
  sealed trait `invalid String merger input` extends ErrorCode
  
  @js.native
  sealed trait `invalid attribute name` extends ErrorCode
  
  @js.native
  sealed trait `invalid attribute value` extends ErrorCode
  
  @js.native
  sealed trait `invalid cc log` extends ErrorCode
  
  @js.native
  sealed trait `invalid custom metric name` extends ErrorCode
  
  @js.native
  sealed trait mark extends EntryType
  
  @js.native
  sealed trait measure extends EntryType
  
  @js.native
  sealed trait navigation extends EntryType
  
  @js.native
  sealed trait `no api key` extends ErrorCode
  
  @js.native
  sealed trait `no app id` extends ErrorCode
  
  @js.native
  sealed trait `no project id` extends ErrorCode
  
  @js.native
  sealed trait `no window` extends ErrorCode
  
  @js.native
  sealed trait paint extends EntryType
  
  @js.native
  sealed trait resource extends EntryType
  
  @js.native
  sealed trait `trace started` extends ErrorCode
  
  @js.native
  sealed trait `trace stopped` extends ErrorCode
  
  @scala.inline
  def `FB not default`: `FB not default` = ("FB not default").asInstanceOf[`FB not default`]
  @scala.inline
  def `RC response not ok`: `RC response not ok` = ("RC response not ok").asInstanceOf[`RC response not ok`]
  @scala.inline
  def frame: frame = "frame".asInstanceOf[frame]
  @scala.inline
  def `invalid String merger input`: `invalid String merger input` = ("invalid String merger input").asInstanceOf[`invalid String merger input`]
  @scala.inline
  def `invalid attribute name`: `invalid attribute name` = ("invalid attribute name").asInstanceOf[`invalid attribute name`]
  @scala.inline
  def `invalid attribute value`: `invalid attribute value` = ("invalid attribute value").asInstanceOf[`invalid attribute value`]
  @scala.inline
  def `invalid cc log`: `invalid cc log` = ("invalid cc log").asInstanceOf[`invalid cc log`]
  @scala.inline
  def `invalid custom metric name`: `invalid custom metric name` = ("invalid custom metric name").asInstanceOf[`invalid custom metric name`]
  @scala.inline
  def mark: mark = "mark".asInstanceOf[mark]
  @scala.inline
  def measure: measure = "measure".asInstanceOf[measure]
  @scala.inline
  def navigation: navigation = "navigation".asInstanceOf[navigation]
  @scala.inline
  def `no api key`: `no api key` = ("no api key").asInstanceOf[`no api key`]
  @scala.inline
  def `no app id`: `no app id` = ("no app id").asInstanceOf[`no app id`]
  @scala.inline
  def `no project id`: `no project id` = ("no project id").asInstanceOf[`no project id`]
  @scala.inline
  def `no window`: `no window` = ("no window").asInstanceOf[`no window`]
  @scala.inline
  def paint: paint = "paint".asInstanceOf[paint]
  @scala.inline
  def resource: resource = "resource".asInstanceOf[resource]
  @scala.inline
  def `trace started`: `trace started` = ("trace started").asInstanceOf[`trace started`]
  @scala.inline
  def `trace stopped`: `trace stopped` = ("trace stopped").asInstanceOf[`trace stopped`]
}

