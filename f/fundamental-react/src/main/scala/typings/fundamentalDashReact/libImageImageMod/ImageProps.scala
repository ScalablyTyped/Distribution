package typings.fundamentalDashReact.libImageImageMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  /* Picture URL. */
  var photo: String
  var size: imageSize
  var `type`: js.UndefOr[imageType] = js.undefined
}

object ImageProps {
  @scala.inline
  def apply(
    photo: String,
    size: imageSize,
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    `type`: imageType = null
  ): ImageProps = {
    val __obj = js.Dynamic.literal(photo = photo, size = size)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ImageProps]
  }
}

