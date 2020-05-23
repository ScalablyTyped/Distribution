package typings.fabric.fabricImplMod

import typings.fabric.fabricStrings._empty
import typings.fabric.fabricStrings.`use-credentials`
import typings.fabric.fabricStrings.anonymous
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPatternOptions extends js.Object {
  /**
    * crossOrigin value (one of "", "anonymous", "use-credentials")
    * @see https://developer.mozilla.org/en-US/docs/HTML/CORS_settings_attributes
    * @type String
    */
  var crossOrigin: js.UndefOr[_empty | anonymous | `use-credentials`] = js.undefined
  /**
    * Pattern horizontal offset from object's left/top corner
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  /**
    * Pattern vertical offset from object's left/top corner
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  /**
    * Transform matrix to change the pattern, imported from svgs
    */
  var patternTransform: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Repeat property of a pattern (one of repeat, repeat-x, repeat-y or no-repeat)
    */
  var repeat: js.UndefOr[String] = js.undefined
  /**
    * The source for the pattern
    */
  var source: String | HTMLImageElement
}

object IPatternOptions {
  @scala.inline
  def apply(
    source: String | HTMLImageElement,
    crossOrigin: _empty | anonymous | `use-credentials` = null,
    offsetX: js.UndefOr[Double] = js.undefined,
    offsetY: js.UndefOr[Double] = js.undefined,
    patternTransform: js.Array[Double] = null,
    repeat: String = null
  ): IPatternOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetX)) __obj.updateDynamic("offsetX")(offsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetY)) __obj.updateDynamic("offsetY")(offsetY.get.asInstanceOf[js.Any])
    if (patternTransform != null) __obj.updateDynamic("patternTransform")(patternTransform.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPatternOptions]
  }
}

