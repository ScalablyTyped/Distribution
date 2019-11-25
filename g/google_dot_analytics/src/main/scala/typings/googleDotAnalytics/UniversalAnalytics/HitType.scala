package typings.googleDotAnalytics.UniversalAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developers.google.com/analytics/devguides/collection/analyticsjs/method-reference
// https://developers.google.com/analytics/devguides/collection/analyticsjs/field-reference#hitType
/* Rewritten from type alias, can be one of: 
  - typings.googleDotAnalytics.googleDotAnalyticsStrings.pageview
  - typings.googleDotAnalytics.googleDotAnalyticsStrings.screenview
  - typings.googleDotAnalytics.googleDotAnalyticsStrings.event
  - typings.googleDotAnalytics.googleDotAnalyticsStrings.transaction
  - typings.googleDotAnalytics.googleDotAnalyticsStrings.item
  - typings.googleDotAnalytics.googleDotAnalyticsStrings.social
  - typings.googleDotAnalytics.googleDotAnalyticsStrings.exception
  - typings.googleDotAnalytics.googleDotAnalyticsStrings.timing
*/
trait HitType extends js.Object

object HitType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def event: typings.googleDotAnalytics.googleDotAnalyticsStrings.event = this.cast("event")
  @scala.inline
  def exception: typings.googleDotAnalytics.googleDotAnalyticsStrings.exception = this.cast("exception")
  @scala.inline
  def item: typings.googleDotAnalytics.googleDotAnalyticsStrings.item = this.cast("item")
  @scala.inline
  def pageview: typings.googleDotAnalytics.googleDotAnalyticsStrings.pageview = this.cast("pageview")
  @scala.inline
  def screenview: typings.googleDotAnalytics.googleDotAnalyticsStrings.screenview = this.cast("screenview")
  @scala.inline
  def social: typings.googleDotAnalytics.googleDotAnalyticsStrings.social = this.cast("social")
  @scala.inline
  def timing: typings.googleDotAnalytics.googleDotAnalyticsStrings.timing = this.cast("timing")
  @scala.inline
  def transaction: typings.googleDotAnalytics.googleDotAnalyticsStrings.transaction = this.cast("transaction")
}

