package typings.fundamentalDashReact.libTileProductTileMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductTileMediaProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  /* URL of the image. */
  var image: String
}

object ProductTileMediaProps {
  @scala.inline
  def apply(image: String, StringDictionary: /* x */ StringDictionary[js.Any] = null, className: String = null): ProductTileMediaProps = {
    val __obj = js.Dynamic.literal(image = image)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[ProductTileMediaProps]
  }
}

