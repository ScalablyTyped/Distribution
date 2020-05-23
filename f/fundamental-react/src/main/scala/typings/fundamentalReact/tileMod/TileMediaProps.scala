package typings.fundamentalReact.tileMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileMediaProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var productTile: js.UndefOr[Boolean] = js.undefined
}

object TileMediaProps {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    className: String = null,
    productTile: js.UndefOr[Boolean] = js.undefined
  ): TileMediaProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(productTile)) __obj.updateDynamic("productTile")(productTile.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileMediaProps]
  }
}

