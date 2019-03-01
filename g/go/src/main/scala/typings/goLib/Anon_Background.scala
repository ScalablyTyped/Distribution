package typings
package goLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Background extends js.Object {
  var background: js.UndefOr[goLib.goMod.goNs.BrushLike] = js.undefined
  var details: js.UndefOr[js.Any] = js.undefined
  var document: js.UndefOr[stdLib.Document] = js.undefined
  var maxSize: js.UndefOr[goLib.goMod.goNs.Size] = js.undefined
  var padding: js.UndefOr[goLib.goMod.goNs.MarginLike] = js.undefined
  var parts: js.UndefOr[goLib.goMod.goNs.Iterable[goLib.goMod.goNs.Part]] = js.undefined
  var position: js.UndefOr[goLib.goMod.goNs.Point] = js.undefined
  var scale: js.UndefOr[scala.Double] = js.undefined
  var showGrid: js.UndefOr[scala.Boolean] = js.undefined
  var showTemporary: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[goLib.goMod.goNs.Size] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Background {
  @scala.inline
  def apply(
    background: goLib.goMod.goNs.BrushLike = null,
    details: js.Any = null,
    document: stdLib.Document = null,
    maxSize: goLib.goMod.goNs.Size = null,
    padding: goLib.goMod.goNs.MarginLike = null,
    parts: goLib.goMod.goNs.Iterable[goLib.goMod.goNs.Part] = null,
    position: goLib.goMod.goNs.Point = null,
    scale: scala.Int | scala.Double = null,
    showGrid: js.UndefOr[scala.Boolean] = js.undefined,
    showTemporary: js.UndefOr[scala.Boolean] = js.undefined,
    size: goLib.goMod.goNs.Size = null,
    `type`: java.lang.String = null
  ): Anon_Background = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details)
    if (document != null) __obj.updateDynamic("document")(document)
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (parts != null) __obj.updateDynamic("parts")(parts)
    if (position != null) __obj.updateDynamic("position")(position)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid)
    if (!js.isUndefined(showTemporary)) __obj.updateDynamic("showTemporary")(showTemporary)
    if (size != null) __obj.updateDynamic("size")(size)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Background]
  }
}

