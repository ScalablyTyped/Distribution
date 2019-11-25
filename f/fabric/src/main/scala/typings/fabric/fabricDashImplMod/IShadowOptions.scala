package typings.fabric.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShadowOptions extends js.Object {
  /**
  	 * Whether the shadow should affect stroke operations
  	 */
  var affectStroke: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Shadow blur
  	 */
  var blur: js.UndefOr[Double] = js.undefined
  /**
  	 * Shadow color
  	 */
  var color: js.UndefOr[String] = js.undefined
  /**
  	 * Indicates whether toObject should include default values
  	 */
  var includeDefaultValues: js.UndefOr[Boolean] = js.undefined
  /**
  	 * When `false`, the shadow will scale with the object.
  	 * When `true`, the shadow's offsetX, offsetY, and blur will not be affected by the object's scale.
  	 * default to false
  	 * @type Boolean
  	 * @default
  	 */
  var nonScaling: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Shadow horizontal offset
  	 */
  var offsetX: js.UndefOr[Double] = js.undefined
  /**
  	 * Shadow vertical offset
  	 */
  var offsetY: js.UndefOr[Double] = js.undefined
}

object IShadowOptions {
  @scala.inline
  def apply(
    affectStroke: js.UndefOr[Boolean] = js.undefined,
    blur: Int | Double = null,
    color: String = null,
    includeDefaultValues: js.UndefOr[Boolean] = js.undefined,
    nonScaling: js.UndefOr[Boolean] = js.undefined,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null
  ): IShadowOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(affectStroke)) __obj.updateDynamic("affectStroke")(affectStroke.asInstanceOf[js.Any])
    if (blur != null) __obj.updateDynamic("blur")(blur.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDefaultValues)) __obj.updateDynamic("includeDefaultValues")(includeDefaultValues.asInstanceOf[js.Any])
    if (!js.isUndefined(nonScaling)) __obj.updateDynamic("nonScaling")(nonScaling.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShadowOptions]
  }
}

