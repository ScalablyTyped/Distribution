package typings.atFluentReact.atFluentReactMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizedProps
  extends /* key */ StringDictionary[js.Any] {
  var attrs: js.UndefOr[js.Object] = js.undefined
  var id: String
}

object LocalizedProps {
  @scala.inline
  def apply(id: String, StringDictionary: /* key */ StringDictionary[js.Any] = null, attrs: js.Object = null): LocalizedProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizedProps]
  }
}

