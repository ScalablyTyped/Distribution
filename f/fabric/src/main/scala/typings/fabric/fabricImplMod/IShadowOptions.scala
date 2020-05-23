package typings.fabric.fabricImplMod

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
    blur: js.UndefOr[Double] = js.undefined,
    color: String = null,
    includeDefaultValues: js.UndefOr[Boolean] = js.undefined,
    nonScaling: js.UndefOr[Boolean] = js.undefined,
    offsetX: js.UndefOr[Double] = js.undefined,
    offsetY: js.UndefOr[Double] = js.undefined
  ): IShadowOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(affectStroke)) __obj.updateDynamic("affectStroke")(affectStroke.get.asInstanceOf[js.Any])
    if (!js.isUndefined(blur)) __obj.updateDynamic("blur")(blur.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDefaultValues)) __obj.updateDynamic("includeDefaultValues")(includeDefaultValues.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nonScaling)) __obj.updateDynamic("nonScaling")(nonScaling.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetX)) __obj.updateDynamic("offsetX")(offsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetY)) __obj.updateDynamic("offsetY")(offsetY.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShadowOptions]
  }
}

