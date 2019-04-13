package typings
package goLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundDocument extends js.Object {
  var background: js.UndefOr[goLib.goMod.BrushLike] = js.undefined
  var document: js.UndefOr[stdLib.Document] = js.undefined
  var elementFinished: js.UndefOr[
    js.Function2[/* obj */ goLib.goMod.GraphObject, /* elt */ stdLib.SVGElement, scala.Unit]
  ] = js.undefined
  var maxSize: js.UndefOr[goLib.goMod.Size] = js.undefined
  var padding: js.UndefOr[goLib.goMod.MarginLike] = js.undefined
  var parts: js.UndefOr[goLib.goMod.Iterable[goLib.goMod.Part]] = js.undefined
  var position: js.UndefOr[goLib.goMod.Point] = js.undefined
  var scale: js.UndefOr[scala.Double] = js.undefined
  var showGrid: js.UndefOr[scala.Boolean] = js.undefined
  var showTemporary: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[goLib.goMod.Size] = js.undefined
}

object Anon_BackgroundDocument {
  @scala.inline
  def apply(
    background: goLib.goMod.BrushLike = null,
    document: stdLib.Document = null,
    elementFinished: (/* obj */ goLib.goMod.GraphObject, /* elt */ stdLib.SVGElement) => scala.Unit = null,
    maxSize: goLib.goMod.Size = null,
    padding: goLib.goMod.MarginLike = null,
    parts: goLib.goMod.Iterable[goLib.goMod.Part] = null,
    position: goLib.goMod.Point = null,
    scale: scala.Int | scala.Double = null,
    showGrid: js.UndefOr[scala.Boolean] = js.undefined,
    showTemporary: js.UndefOr[scala.Boolean] = js.undefined,
    size: goLib.goMod.Size = null
  ): Anon_BackgroundDocument = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (document != null) __obj.updateDynamic("document")(document)
    if (elementFinished != null) __obj.updateDynamic("elementFinished")(js.Any.fromFunction2(elementFinished))
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (parts != null) __obj.updateDynamic("parts")(parts)
    if (position != null) __obj.updateDynamic("position")(position)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid)
    if (!js.isUndefined(showTemporary)) __obj.updateDynamic("showTemporary")(showTemporary)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_BackgroundDocument]
  }
}

