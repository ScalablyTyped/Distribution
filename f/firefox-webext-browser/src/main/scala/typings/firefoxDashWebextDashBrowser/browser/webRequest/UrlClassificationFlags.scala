package typings.firefoxDashWebextDashBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Tracking flags that match our internal tracking classification */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.fingerprinting
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.fingerprinting_content
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.cryptomining
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.cryptomining_content
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.tracking
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.tracking_ad
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.tracking_analytics
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.tracking_social
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.tracking_content
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.any_basic_tracking
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.any_strict_tracking
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.any_social_tracking
*/
trait UrlClassificationFlags extends js.Object

object UrlClassificationFlags {
  @scala.inline
  def any_basic_tracking: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.any_basic_tracking = this.cast("any_basic_tracking")
  @scala.inline
  def any_social_tracking: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.any_social_tracking = this.cast("any_social_tracking")
  @scala.inline
  def any_strict_tracking: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.any_strict_tracking = this.cast("any_strict_tracking")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cryptomining: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.cryptomining = this.cast("cryptomining")
  @scala.inline
  def cryptomining_content: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.cryptomining_content = this.cast("cryptomining_content")
  @scala.inline
  def fingerprinting: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.fingerprinting = this.cast("fingerprinting")
  @scala.inline
  def fingerprinting_content: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.fingerprinting_content = this.cast("fingerprinting_content")
  @scala.inline
  def tracking: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.tracking = this.cast("tracking")
  @scala.inline
  def tracking_ad: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.tracking_ad = this.cast("tracking_ad")
  @scala.inline
  def tracking_analytics: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.tracking_analytics = this.cast("tracking_analytics")
  @scala.inline
  def tracking_content: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.tracking_content = this.cast("tracking_content")
  @scala.inline
  def tracking_social: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.tracking_social = this.cast("tracking_social")
}

