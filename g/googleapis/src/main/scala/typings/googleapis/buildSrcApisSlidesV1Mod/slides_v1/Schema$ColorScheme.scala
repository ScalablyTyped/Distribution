package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The palette of predefined colors for a page.
  */
@js.native
trait Schema$ColorScheme extends js.Object {
  /**
    * The ThemeColorType and corresponding concrete color pairs.
    */
  var colors: js.UndefOr[js.Array[Schema$ThemeColorPair]] = js.native
}

object Schema$ColorScheme {
  @scala.inline
  def apply(colors: js.Array[Schema$ThemeColorPair] = null): Schema$ColorScheme = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ColorScheme]
  }
}

