package typings.firefoxWebextBrowser.browser.downloads

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
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.file
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.url
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.content
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.uncommon
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.host
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unwanted
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.safe
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.accepted
*/
trait DangerType extends js.Object

object DangerType {
  @scala.inline
  def accepted: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.accepted = this.cast("accepted")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def content: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.content = this.cast("content")
  @scala.inline
  def file: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.file = this.cast("file")
  @scala.inline
  def host: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.host = this.cast("host")
  @scala.inline
  def safe: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.safe = this.cast("safe")
  @scala.inline
  def uncommon: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.uncommon = this.cast("uncommon")
  @scala.inline
  def unwanted: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unwanted = this.cast("unwanted")
  @scala.inline
  def url: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.url = this.cast("url")
}

