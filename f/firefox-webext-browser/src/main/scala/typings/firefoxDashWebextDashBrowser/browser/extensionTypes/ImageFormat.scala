package typings.firefoxDashWebextDashBrowser.browser.extensionTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* extensionTypes types */
/** The format of an image. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.jpeg
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.png
*/
trait ImageFormat extends js.Object

object ImageFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def jpeg: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.jpeg = this.cast("jpeg")
  @scala.inline
  def png: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.png = this.cast("png")
}

