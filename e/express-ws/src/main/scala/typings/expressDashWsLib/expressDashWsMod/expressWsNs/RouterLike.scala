package typings
package expressDashWsLib.expressDashWsMod.expressWsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterLike
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]
     with /* key */ org.scalablytyped.runtime.NumberDictionary[js.Any] {
  var get: expressLib.expressMod.eNs.IRouterMatcher[this.type]
}

object RouterLike {
  @scala.inline
  def apply(
    get: expressLib.expressMod.eNs.IRouterMatcher[RouterLike],
    NumberDictionary: /* key */ org.scalablytyped.runtime.NumberDictionary[js.Any] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): RouterLike = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RouterLike]
  }
}

