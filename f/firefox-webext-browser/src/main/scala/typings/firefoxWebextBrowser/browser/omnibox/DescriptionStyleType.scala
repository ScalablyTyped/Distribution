package typings.firefoxWebextBrowser.browser.omnibox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* omnibox types */
/** The style type. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.url
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.`match`
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.dim
*/
trait DescriptionStyleType extends js.Object

object DescriptionStyleType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dim: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.dim = this.cast("dim")
  @scala.inline
  def `match`: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.`match` = this.cast("match")
  @scala.inline
  def url: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.url = this.cast("url")
}

