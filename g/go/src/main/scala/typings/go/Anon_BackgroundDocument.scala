package typings.go

import typings.go.goMod.BrushLike
import typings.go.goMod.GraphObject
import typings.go.goMod.Iterable
import typings.go.goMod.MarginLike
import typings.go.goMod.Part
import typings.go.goMod.Point
import typings.go.goMod.Size
import typings.std.Document
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundDocument extends js.Object {
  var background: js.UndefOr[BrushLike] = js.undefined
  var document: js.UndefOr[Document] = js.undefined
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

object Anon_BackgroundDocument {
  @scala.inline
  def apply(
    background: BrushLike = null,
    document: Document = null,
    elementFinished: (/* obj */ GraphObject, /* elt */ SVGElement) => Unit = null,
    maxSize: Size = null,
    padding: MarginLike = null,
    parts: Iterable[Part] = null,
    position: Point = null,
    scale: Int | Double = null,
    showGrid: js.UndefOr[Boolean] = js.undefined,
    showTemporary: js.UndefOr[Boolean] = js.undefined,
    size: Size = null
  ): Anon_BackgroundDocument = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (elementFinished != null) __obj.updateDynamic("elementFinished")(js.Any.fromFunction2(elementFinished))
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (parts != null) __obj.updateDynamic("parts")(parts.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid.asInstanceOf[js.Any])
    if (!js.isUndefined(showTemporary)) __obj.updateDynamic("showTemporary")(showTemporary.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackgroundDocument]
  }
}

