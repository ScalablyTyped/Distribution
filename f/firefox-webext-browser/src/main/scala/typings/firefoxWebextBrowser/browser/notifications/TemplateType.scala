package typings.firefoxWebextBrowser.browser.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* notifications types */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.basic
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.image
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.list
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.progress
*/
trait TemplateType extends js.Object

object TemplateType {
  @scala.inline
  def basic: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.basic = this.cast("basic")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def image: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.image = this.cast("image")
  @scala.inline
  def list: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.list = this.cast("list")
  @scala.inline
  def progress: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.progress = this.cast("progress")
}

