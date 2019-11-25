package typings.firefoxDashWebextDashBrowser.browser.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The machine's processor architecture. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.arm
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.`x86-32`
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.`x86-64`
*/
trait PlatformArch extends js.Object

object PlatformArch {
  @scala.inline
  def arm: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.arm = this.cast("arm")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `x86-32`: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.`x86-32` = this.cast("x86-32")
  @scala.inline
  def `x86-64`: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.`x86-64` = this.cast("x86-64")
}

