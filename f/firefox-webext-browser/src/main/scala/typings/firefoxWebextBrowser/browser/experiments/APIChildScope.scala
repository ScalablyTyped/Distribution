package typings.firefoxWebextBrowser.browser.experiments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.addon_child
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.content_child
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_child
*/
trait APIChildScope extends js.Object

object APIChildScope {
  @scala.inline
  def addon_child: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.addon_child = this.cast("addon_child")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def content_child: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.content_child = this.cast("content_child")
  @scala.inline
  def devtools_child: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_child = this.cast("devtools_child")
}

