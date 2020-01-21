package typings.firebasePerformance.errorsMod

import typings.firebasePerformance.firebasePerformanceStrings.`FB not default`
import typings.firebasePerformance.firebasePerformanceStrings.`RC response not ok`
import typings.firebasePerformance.firebasePerformanceStrings.`invalid attribute name`
import typings.firebasePerformance.firebasePerformanceStrings.`invalid attribute value`
import typings.firebasePerformance.firebasePerformanceStrings.`invalid cc log`
import typings.firebasePerformance.firebasePerformanceStrings.`invalide custom metric name`
import typings.firebasePerformance.firebasePerformanceStrings.`no api key`
import typings.firebasePerformance.firebasePerformanceStrings.`no app id`
import typings.firebasePerformance.firebasePerformanceStrings.`no project id`
import typings.firebasePerformance.firebasePerformanceStrings.`no window`
import typings.firebasePerformance.firebasePerformanceStrings.`trace started`
import typings.firebasePerformance.firebasePerformanceStrings.`trace stopped`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebasePerformance.firebasePerformanceStrings.`trace started`
  - typings.firebasePerformance.firebasePerformanceStrings.`trace stopped`
  - typings.firebasePerformance.firebasePerformanceStrings.`no window`
  - typings.firebasePerformance.firebasePerformanceStrings.`no app id`
  - typings.firebasePerformance.firebasePerformanceStrings.`no project id`
  - typings.firebasePerformance.firebasePerformanceStrings.`no api key`
  - typings.firebasePerformance.firebasePerformanceStrings.`invalid cc log`
  - typings.firebasePerformance.firebasePerformanceStrings.`FB not default`
  - typings.firebasePerformance.firebasePerformanceStrings.`RC response not ok`
  - typings.firebasePerformance.firebasePerformanceStrings.`invalid attribute name`
  - typings.firebasePerformance.firebasePerformanceStrings.`invalid attribute value`
  - typings.firebasePerformance.firebasePerformanceStrings.`invalide custom metric name`
*/
trait ErrorCode extends js.Object

object ErrorCode {
  @scala.inline
  def FB_NOT_DEFAULT: `FB not default` = this.cast("FB not default")
  @scala.inline
  def INVALID_ATTRIBUTE_NAME: `invalid attribute name` = this.cast("invalid attribute name")
  @scala.inline
  def INVALID_ATTRIBUTE_VALUE: `invalid attribute value` = this.cast("invalid attribute value")
  @scala.inline
  def INVALID_CC_LOG: `invalid cc log` = this.cast("invalid cc log")
  @scala.inline
  def INVALID_CUSTOM_METRIC_NAME: `invalide custom metric name` = this.cast("invalide custom metric name")
  @scala.inline
  def NO_API_KEY: `no api key` = this.cast("no api key")
  @scala.inline
  def NO_APP_ID: `no app id` = this.cast("no app id")
  @scala.inline
  def NO_PROJECT_ID: `no project id` = this.cast("no project id")
  @scala.inline
  def NO_WINDOW: `no window` = this.cast("no window")
  @scala.inline
  def RC_NOT_OK: `RC response not ok` = this.cast("RC response not ok")
  @scala.inline
  def TRACE_STARTED_BEFORE: `trace started` = this.cast("trace started")
  @scala.inline
  def TRACE_STOPPED_BEFORE: `trace stopped` = this.cast("trace stopped")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

