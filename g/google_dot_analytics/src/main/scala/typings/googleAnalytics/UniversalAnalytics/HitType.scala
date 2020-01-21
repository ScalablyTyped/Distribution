package typings.googleAnalytics.UniversalAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developers.google.com/analytics/devguides/collection/analyticsjs/method-reference
// https://developers.google.com/analytics/devguides/collection/analyticsjs/field-reference#hitType
/* Rewritten from type alias, can be one of: 
  - typings.googleAnalytics.googleAnalyticsStrings.pageview
  - typings.googleAnalytics.googleAnalyticsStrings.screenview
  - typings.googleAnalytics.googleAnalyticsStrings.event
  - typings.googleAnalytics.googleAnalyticsStrings.transaction
  - typings.googleAnalytics.googleAnalyticsStrings.item
  - typings.googleAnalytics.googleAnalyticsStrings.social
  - typings.googleAnalytics.googleAnalyticsStrings.exception
  - typings.googleAnalytics.googleAnalyticsStrings.timing
*/
trait HitType extends js.Object

object HitType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def event: typings.googleAnalytics.googleAnalyticsStrings.event = this.cast("event")
  @scala.inline
  def exception: typings.googleAnalytics.googleAnalyticsStrings.exception = this.cast("exception")
  @scala.inline
  def item: typings.googleAnalytics.googleAnalyticsStrings.item = this.cast("item")
  @scala.inline
  def pageview: typings.googleAnalytics.googleAnalyticsStrings.pageview = this.cast("pageview")
  @scala.inline
  def screenview: typings.googleAnalytics.googleAnalyticsStrings.screenview = this.cast("screenview")
  @scala.inline
  def social: typings.googleAnalytics.googleAnalyticsStrings.social = this.cast("social")
  @scala.inline
  def timing: typings.googleAnalytics.googleAnalyticsStrings.timing = this.cast("timing")
  @scala.inline
  def transaction: typings.googleAnalytics.googleAnalyticsStrings.transaction = this.cast("transaction")
}

