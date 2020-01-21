package typings.firefoxWebextBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Protocol version if state is "secure" */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot1
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot2
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot3
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown
*/
trait SecurityInfoProtocolVersion extends js.Object

object SecurityInfoProtocolVersion {
  @scala.inline
  def TLSv1: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1 = this.cast("TLSv1")
  @scala.inline
  def TLSv1Dot1: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot1 = this.cast("TLSv1.1")
  @scala.inline
  def TLSv1Dot2: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot2 = this.cast("TLSv1.2")
  @scala.inline
  def TLSv1Dot3: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot3 = this.cast("TLSv1.3")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def unknown: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown = this.cast("unknown")
}

