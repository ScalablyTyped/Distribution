package typings.go

import typings.go.mod.BrushLike
import typings.go.mod.Iterable
import typings.go.mod.MarginLike
import typings.go.mod.Part
import typings.go.mod.Point
import typings.go.mod.Size
import typings.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackground extends js.Object {
  var background: js.UndefOr[BrushLike] = js.undefined
  var details: js.UndefOr[js.Any] = js.undefined
  var document: js.UndefOr[Document_] = js.undefined
  var maxSize: js.UndefOr[Size] = js.undefined
  var padding: js.UndefOr[MarginLike] = js.undefined
  var parts: js.UndefOr[Iterable[Part]] = js.undefined
  var position: js.UndefOr[Point] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var showGrid: js.UndefOr[Boolean] = js.undefined
  var showTemporary: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object AnonBackground {
  @scala.inline
  def apply(
    background: BrushLike = null,
    details: js.Any = null,
    document: Document_ = null,
    maxSize: Size = null,
    padding: MarginLike = null,
    parts: Iterable[Part] = null,
    position: Point = null,
    scale: Int | Double = null,
    showGrid: js.UndefOr[Boolean] = js.undefined,
    showTemporary: js.UndefOr[Boolean] = js.undefined,
    size: Size = null,
    `type`: String = null
  ): AnonBackground = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (parts != null) __obj.updateDynamic("parts")(parts.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid.asInstanceOf[js.Any])
    if (!js.isUndefined(showTemporary)) __obj.updateDynamic("showTemporary")(showTemporary.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackground]
  }
}

