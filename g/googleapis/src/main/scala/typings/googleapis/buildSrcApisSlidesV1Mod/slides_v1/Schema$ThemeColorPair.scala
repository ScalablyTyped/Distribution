package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A pair mapping a theme color type to the concrete color it represents.
  */
@js.native
trait Schema$ThemeColorPair extends js.Object {
  /**
    * The concrete color corresponding to the theme color type above.
    */
  var color: js.UndefOr[Schema$RgbColor] = js.native
  /**
    * The type of the theme color.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$ThemeColorPair {
  @scala.inline
  def apply(color: Schema$RgbColor = null, `type`: String = null): Schema$ThemeColorPair = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ThemeColorPair]
  }
}

