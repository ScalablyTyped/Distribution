package typings.expressDashSession.expressDashSessionMod._Global_.Express

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionData
  extends /* key */ StringDictionary[js.Any] {
  var cookie: SessionCookieData
}

object SessionData {
  @scala.inline
  def apply(cookie: SessionCookieData, StringDictionary: /* key */ StringDictionary[js.Any] = null): SessionData = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SessionData]
  }
}

