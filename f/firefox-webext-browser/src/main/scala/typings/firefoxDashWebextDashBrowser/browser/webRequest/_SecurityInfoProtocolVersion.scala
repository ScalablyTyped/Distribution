package typings.firefoxDashWebextDashBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Protocol version if state is "secure" */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.TLSv1
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.TLSv1Dot1
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.TLSv1Dot2
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.TLSv1Dot3
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.unknown
*/
trait _SecurityInfoProtocolVersion extends js.Object

object _SecurityInfoProtocolVersion {
  @scala.inline
  def TLSv1: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.TLSv1 = this.cast("TLSv1")
  @scala.inline
  def TLSv1Dot1: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.TLSv1Dot1 = this.cast("TLSv1.1")
  @scala.inline
  def TLSv1Dot2: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.TLSv1Dot2 = this.cast("TLSv1.2")
  @scala.inline
  def TLSv1Dot3: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.TLSv1Dot3 = this.cast("TLSv1.3")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def unknown: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.unknown = this.cast("unknown")
}

