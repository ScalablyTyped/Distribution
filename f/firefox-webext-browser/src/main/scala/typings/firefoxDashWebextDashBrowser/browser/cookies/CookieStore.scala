package typings.firefoxDashWebextDashBrowser.browser.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a cookie store in the browser. An incognito mode window, for instance, uses a separate cookie store
  * from a non-incognito window.
  */
trait CookieStore extends js.Object {
  /** The unique identifier for the cookie store. */
  var id: String
  /** Indicates if this is an incognito cookie store */
  var incognito: Boolean
  /** Identifiers of all the browser tabs that share this cookie store. */
  var tabIds: js.Array[Double]
}

object CookieStore {
  @scala.inline
  def apply(id: String, incognito: Boolean, tabIds: js.Array[Double]): CookieStore = {
    val __obj = js.Dynamic.literal(id = id, incognito = incognito, tabIds = tabIds)
  
    __obj.asInstanceOf[CookieStore]
  }
}

