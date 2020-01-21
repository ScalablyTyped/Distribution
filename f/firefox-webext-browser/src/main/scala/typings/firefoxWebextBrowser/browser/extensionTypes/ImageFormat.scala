package typings.firefoxWebextBrowser.browser.extensionTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* extensionTypes types */
/** The format of an image. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.jpeg
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.png
*/
trait ImageFormat extends js.Object

object ImageFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def jpeg: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.jpeg = this.cast("jpeg")
  @scala.inline
  def png: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.png = this.cast("png")
}

