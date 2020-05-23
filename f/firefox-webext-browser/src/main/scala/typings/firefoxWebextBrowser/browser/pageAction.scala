package typings.firefoxWebextBrowser.browser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Use the `browser.pageAction` API to put icons inside the address bar. Page actions represent actions that can be
  * taken on the current page, but that aren't applicable to all pages.
  *
  * Manifest keys: `page_action`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.pageAction")
@js.native
object pageAction extends js.Object {
  /* pageAction types */
  /** Pixel data for an image. Must be an ImageData object (for example, from a `canvas` element). */
  type ImageDataType = js.Object
}

