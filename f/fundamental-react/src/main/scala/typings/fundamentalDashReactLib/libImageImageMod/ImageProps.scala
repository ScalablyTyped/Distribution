package typings
package fundamentalDashReactLib.libImageImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  /* Picture URL. */
  var photo: java.lang.String
  var size: imageSize
  var `type`: js.UndefOr[imageType] = js.undefined
}

object ImageProps {
  @scala.inline
  def apply(
    photo: java.lang.String,
    size: imageSize,
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    `type`: imageType = null
  ): ImageProps = {
    val __obj = js.Dynamic.literal(photo = photo, size = size)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ImageProps]
  }
}

