package typings
package fluentDashReactLib.fluentDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizedProps
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var attrs: js.UndefOr[js.Object] = js.undefined
  var id: java.lang.String
}

object LocalizedProps {
  @scala.inline
  def apply(
    id: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    attrs: js.Object = null
  ): LocalizedProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    __obj.asInstanceOf[LocalizedProps]
  }
}

