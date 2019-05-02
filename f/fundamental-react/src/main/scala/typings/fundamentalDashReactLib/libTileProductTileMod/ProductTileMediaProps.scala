package typings
package fundamentalDashReactLib.libTileProductTileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductTileMediaProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  /* URL of the image. */
  var image: java.lang.String
}

object ProductTileMediaProps {
  @scala.inline
  def apply(
    image: java.lang.String,
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null
  ): ProductTileMediaProps = {
    val __obj = js.Dynamic.literal(image = image)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[ProductTileMediaProps]
  }
}

