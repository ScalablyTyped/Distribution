package typings.firefoxWebextBrowser.browser.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.cookies.getAllCookieStores")
@js.native
object getAllCookieStores extends js.Object {
  /** Lists all existing cookie stores. */
  def apply(): js.Promise[js.Array[CookieStore]] = js.native
}

