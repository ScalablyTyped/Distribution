package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColorImage extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var image: js.UndefOr[java.lang.String] = js.undefined
  var resizeMode: js.UndefOr[expoLib.expoMod.ResizeModeContain | expoLib.expoMod.ResizeModeCover] = js.undefined
}

object Anon_BackgroundColorImage {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    image: java.lang.String = null,
    resizeMode: expoLib.expoMod.ResizeModeContain | expoLib.expoMod.ResizeModeCover = null
  ): Anon_BackgroundColorImage = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (image != null) __obj.updateDynamic("image")(image)
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackgroundColorImage]
  }
}

