package typings
package expressDashSessionLib.expressDashSessionMod.Global.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionData
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var cookie: SessionCookieData
}

object SessionData {
  @scala.inline
  def apply(
    cookie: SessionCookieData,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): SessionData = {
    val __obj = js.Dynamic.literal(cookie = cookie)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SessionData]
  }
}

