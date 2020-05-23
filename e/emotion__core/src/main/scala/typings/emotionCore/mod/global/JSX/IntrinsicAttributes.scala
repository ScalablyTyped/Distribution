package typings.emotionCore.mod.global.JSX

import typings.emotionCore.mod.InterpolationWithTheme
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
  def apply(css: js.UndefOr[Null | InterpolationWithTheme[_]] = js.undefined): IntrinsicAttributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(css)) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrinsicAttributes]
  }
}

