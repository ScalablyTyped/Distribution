package typings.firefoxWebextBrowser.browser.experiments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.addon_parent
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.content_parent
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_parent
*/
trait APIParentScope extends js.Object

object APIParentScope {
  @scala.inline
  def addon_parent: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.addon_parent = this.cast("addon_parent")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def content_parent: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.content_parent = this.cast("content_parent")
  @scala.inline
  def devtools_parent: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_parent = this.cast("devtools_parent")
}

