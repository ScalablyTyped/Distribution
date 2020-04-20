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
  def event: typings.googleAnalytics.googleAnalyticsStrings.event = "event".asInstanceOf[typings.googleAnalytics.googleAnalyticsStrings.event]
  @scala.inline
  def exception: typings.googleAnalytics.googleAnalyticsStrings.exception = "exception".asInstanceOf[typings.googleAnalytics.googleAnalyticsStrings.exception]
  @scala.inline
  def item: typings.googleAnalytics.googleAnalyticsStrings.item = "item".asInstanceOf[typings.googleAnalytics.googleAnalyticsStrings.item]
  @scala.inline
  def pageview: typings.googleAnalytics.googleAnalyticsStrings.pageview = "pageview".asInstanceOf[typings.googleAnalytics.googleAnalyticsStrings.pageview]
  @scala.inline
  def screenview: typings.googleAnalytics.googleAnalyticsStrings.screenview = "screenview".asInstanceOf[typings.googleAnalytics.googleAnalyticsStrings.screenview]
  @scala.inline
  def social: typings.googleAnalytics.googleAnalyticsStrings.social = "social".asInstanceOf[typings.googleAnalytics.googleAnalyticsStrings.social]
  @scala.inline
  def timing: typings.googleAnalytics.googleAnalyticsStrings.timing = "timing".asInstanceOf[typings.googleAnalytics.googleAnalyticsStrings.timing]
  @scala.inline
  def transaction: typings.googleAnalytics.googleAnalyticsStrings.transaction = "transaction".asInstanceOf[typings.googleAnalytics.googleAnalyticsStrings.transaction]
}

