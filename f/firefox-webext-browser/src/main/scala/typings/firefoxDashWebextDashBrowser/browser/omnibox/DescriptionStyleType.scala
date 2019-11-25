package typings.firefoxDashWebextDashBrowser.browser.omnibox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* omnibox types */
/** The style type. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.url
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.`match`
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.dim
*/
trait DescriptionStyleType extends js.Object

object DescriptionStyleType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dim: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.dim = this.cast("dim")
  @scala.inline
  def `match`: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.`match` = this.cast("match")
  @scala.inline
  def url: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.url = this.cast("url")
}

