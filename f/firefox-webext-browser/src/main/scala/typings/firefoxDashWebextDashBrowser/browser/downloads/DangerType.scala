package typings.firefoxDashWebextDashBrowser.browser.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * *file*:
  *   The download's filename is suspicious.
  * *url*:
  *   The download's URL is known to be malicious.
  * *content*:
  *   The downloaded file is known to be malicious.
  * *uncommon*:
  *   The download's URL is not commonly downloaded and could be dangerous.
  * *safe*:
  *   The download presents no known danger to the user's computer.
  *
  * These string constants will never change, however the set of DangerTypes may change.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.file
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.url
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.content
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.uncommon
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.host
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.unwanted
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.safe
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.accepted
*/
trait DangerType extends js.Object

object DangerType {
  @scala.inline
  def accepted: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.accepted = this.cast("accepted")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def content: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.content = this.cast("content")
  @scala.inline
  def file: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.file = this.cast("file")
  @scala.inline
  def host: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.host = this.cast("host")
  @scala.inline
  def safe: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.safe = this.cast("safe")
  @scala.inline
  def uncommon: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.uncommon = this.cast("uncommon")
  @scala.inline
  def unwanted: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.unwanted = this.cast("unwanted")
  @scala.inline
  def url: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.url = this.cast("url")
}

