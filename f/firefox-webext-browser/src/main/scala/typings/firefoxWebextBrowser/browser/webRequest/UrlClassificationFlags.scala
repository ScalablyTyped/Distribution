package typings.firefoxWebextBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Tracking flags that match our internal tracking classification */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.fingerprinting
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.fingerprinting_content
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.cryptomining
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.cryptomining_content
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking_ad
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking_analytics
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking_social
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking_content
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.any_basic_tracking
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.any_strict_tracking
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.any_social_tracking
*/
trait UrlClassificationFlags extends js.Object

object UrlClassificationFlags {
  @scala.inline
  def any_basic_tracking: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.any_basic_tracking = this.cast("any_basic_tracking")
  @scala.inline
  def any_social_tracking: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.any_social_tracking = this.cast("any_social_tracking")
  @scala.inline
  def any_strict_tracking: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.any_strict_tracking = this.cast("any_strict_tracking")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cryptomining: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.cryptomining = this.cast("cryptomining")
  @scala.inline
  def cryptomining_content: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.cryptomining_content = this.cast("cryptomining_content")
  @scala.inline
  def fingerprinting: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.fingerprinting = this.cast("fingerprinting")
  @scala.inline
  def fingerprinting_content: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.fingerprinting_content = this.cast("fingerprinting_content")
  @scala.inline
  def tracking: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking = this.cast("tracking")
  @scala.inline
  def tracking_ad: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking_ad = this.cast("tracking_ad")
  @scala.inline
  def tracking_analytics: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking_analytics = this.cast("tracking_analytics")
  @scala.inline
  def tracking_content: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking_content = this.cast("tracking_content")
  @scala.inline
  def tracking_social: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking_social = this.cast("tracking_social")
}

