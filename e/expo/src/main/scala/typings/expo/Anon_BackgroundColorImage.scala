package typings.expo

import typings.expo.expoMod.ResizeModeContain
import typings.expo.expoMod.ResizeModeCover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColorImage extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var image: js.UndefOr[String] = js.undefined
  var resizeMode: js.UndefOr[ResizeModeContain | ResizeModeCover] = js.undefined
}

object Anon_BackgroundColorImage {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    image: String = null,
    resizeMode: ResizeModeContain | ResizeModeCover = null
  ): Anon_BackgroundColorImage = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (image != null) __obj.updateDynamic("image")(image)
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackgroundColorImage]
  }
}

