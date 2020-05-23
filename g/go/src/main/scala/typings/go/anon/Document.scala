package typings.go.anon

import typings.go.mod.BrushLike
import typings.go.mod.GraphObject
import typings.go.mod.Iterable
import typings.go.mod.MarginLike
import typings.go.mod.Part
import typings.go.mod.Point
import typings.go.mod.Size
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  var background: js.UndefOr[BrushLike] = js.undefined
  var document: js.UndefOr[typings.std.Document] = js.undefined
  var elementFinished: js.UndefOr[js.Function2[/* obj */ GraphObject, /* elt */ SVGElement, Unit]] = js.undefined
  var maxSize: js.UndefOr[Size] = js.undefined
  var padding: js.UndefOr[MarginLike] = js.undefined
  var parts: js.UndefOr[Iterable[Part]] = js.undefined
  var position: js.UndefOr[Point] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var showGrid: js.UndefOr[Boolean] = js.undefined
  var showTemporary: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
}

object Document {
  @scala.inline
  def apply(
    background: BrushLike = null,
    document: typings.std.Document = null,
    elementFinished: (/* obj */ GraphObject, /* elt */ SVGElement) => Unit = null,
    maxSize: Size = null,
    padding: MarginLike = null,
    parts: Iterable[Part] = null,
    position: Point = null,
    scale: js.UndefOr[Double] = js.undefined,
    showGrid: js.UndefOr[Boolean] = js.undefined,
    showTemporary: js.UndefOr[Boolean] = js.undefined,
    size: Size = null
  ): Document = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (elementFinished != null) __obj.updateDynamic("elementFinished")(js.Any.fromFunction2(elementFinished))
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (parts != null) __obj.updateDynamic("parts")(parts.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTemporary)) __obj.updateDynamic("showTemporary")(showTemporary.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
}

