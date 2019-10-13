package typings.atEmotionCore.atEmotionCoreMod._Global_.JSX

import typings.atEmotionCore.atEmotionCoreMod.InterpolationWithTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Do we need to modify `LibraryManagedAttributes` too,
  * to make `className` props optional when `css` props is specified?
  */
trait IntrinsicAttributes extends js.Object {
  var css: js.UndefOr[InterpolationWithTheme[_]] = js.undefined
}

object IntrinsicAttributes {
  @scala.inline
  def apply(css: InterpolationWithTheme[_] = null): IntrinsicAttributes = {
    val __obj = js.Dynamic.literal()
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrinsicAttributes]
  }
}

