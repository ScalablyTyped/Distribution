package typings.figma.mod.global

import typings.figma.figmaStrings.CROP
import typings.figma.figmaStrings.FILL
import typings.figma.figmaStrings.FIT
import typings.figma.figmaStrings.IMAGE
import typings.figma.figmaStrings.TILE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagePaint extends Paint {
  val blendMode: js.UndefOr[BlendMode] = js.undefined
   // setting for "TILE"
  val filters: js.UndefOr[ImageFilters] = js.undefined
  val imageHash: String | Null
  val imageTransform: js.UndefOr[Transform] = js.undefined
  val opacity: js.UndefOr[Double] = js.undefined
  val scaleMode: FILL | FIT | CROP | TILE
   // setting for "CROP"
  val scalingFactor: js.UndefOr[Double] = js.undefined
  val `type`: IMAGE
  val visible: js.UndefOr[Boolean] = js.undefined
}

object ImagePaint {
  @scala.inline
  def apply(
    scaleMode: FILL | FIT | CROP | TILE,
    `type`: IMAGE,
    blendMode: BlendMode = null,
    filters: ImageFilters = null,
    imageHash: String = null,
    imageTransform: Transform = null,
    opacity: js.UndefOr[Double] = js.undefined,
    scalingFactor: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ImagePaint = {
    val __obj = js.Dynamic.literal(scaleMode = scaleMode.asInstanceOf[js.Any], imageHash = imageHash.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (blendMode != null) __obj.updateDynamic("blendMode")(blendMode.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (imageTransform != null) __obj.updateDynamic("imageTransform")(imageTransform.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scalingFactor)) __obj.updateDynamic("scalingFactor")(scalingFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePaint]
  }
}

