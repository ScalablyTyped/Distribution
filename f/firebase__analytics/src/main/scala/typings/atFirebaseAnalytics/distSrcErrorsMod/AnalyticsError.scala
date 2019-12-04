package typings.atFirebaseAnalytics.distSrcErrorsMod

import typings.atFirebaseAnalytics.atFirebaseAnalyticsStrings.`already-exists`
import typings.atFirebaseAnalytics.atFirebaseAnalyticsStrings.`already-initialized`
import typings.atFirebaseAnalytics.atFirebaseAnalyticsStrings.`no-ga-id`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atFirebaseAnalytics.atFirebaseAnalyticsStrings.`no-ga-id`
  - typings.atFirebaseAnalytics.atFirebaseAnalyticsStrings.`already-exists`
  - typings.atFirebaseAnalytics.atFirebaseAnalyticsStrings.`already-initialized`
*/
trait AnalyticsError extends js.Object

object AnalyticsError {
  @scala.inline
  def ALREADY_EXISTS: `already-exists` = this.cast("already-exists")
  @scala.inline
  def ALREADY_INITIALIZED: `already-initialized` = this.cast("already-initialized")
  @scala.inline
  def NO_GA_ID: `no-ga-id` = this.cast("no-ga-id")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

