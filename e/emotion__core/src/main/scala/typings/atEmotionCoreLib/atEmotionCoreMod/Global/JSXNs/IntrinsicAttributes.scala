package typings
package atEmotionCoreLib.atEmotionCoreMod.Global.JSXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Do we need to modify `LibraryManagedAttributes` too,
  * to make `className` props optional when `css` props is specified?
  */
trait IntrinsicAttributes extends js.Object {
  var css: js.UndefOr[atEmotionCoreLib.atEmotionCoreMod.InterpolationWithTheme[_]] = js.undefined
}

object IntrinsicAttributes {
  @scala.inline
  def apply(css: atEmotionCoreLib.atEmotionCoreMod.InterpolationWithTheme[_] = null): IntrinsicAttributes = {
    val __obj = js.Dynamic.literal()
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrinsicAttributes]
  }
}

