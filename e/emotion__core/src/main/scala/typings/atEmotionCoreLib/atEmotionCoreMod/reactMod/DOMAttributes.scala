package typings
package atEmotionCoreLib.atEmotionCoreMod.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMAttributes[T] extends js.Object {
  var css: js.UndefOr[atEmotionCoreLib.atEmotionCoreMod.InterpolationWithTheme[_]] = js.undefined
}

object DOMAttributes {
  @scala.inline
  def apply[T](css: atEmotionCoreLib.atEmotionCoreMod.InterpolationWithTheme[_] = null): DOMAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMAttributes[T]]
  }
}

