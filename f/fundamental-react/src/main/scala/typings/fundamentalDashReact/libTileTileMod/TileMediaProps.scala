package typings.fundamentalDashReact.libTileTileMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileMediaProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
}

object TileMediaProps {
  @scala.inline
  def apply(StringDictionary: /* x */ StringDictionary[js.Any] = null, className: String = null): TileMediaProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[TileMediaProps]
  }
}

