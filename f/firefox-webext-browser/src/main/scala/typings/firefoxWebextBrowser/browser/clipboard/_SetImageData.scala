package typings.firefoxWebextBrowser.browser.clipboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The type of imageData. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.jpeg
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.png
*/
trait _SetImageData extends js.Object

object _SetImageData {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def jpeg: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.jpeg = this.cast("jpeg")
  @scala.inline
  def png: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.png = this.cast("png")
}

