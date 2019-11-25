package typings.firefoxDashWebextDashBrowser.browser.extensionTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The origin of the CSS to inject, this affects the cascading order (priority) of the stylesheet. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.user
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.author
*/
trait CSSOrigin extends js.Object

object CSSOrigin {
  @scala.inline
  def author: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.author = this.cast("author")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def user: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.user = this.cast("user")
}

