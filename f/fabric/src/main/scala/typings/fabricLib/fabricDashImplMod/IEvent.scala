package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvent extends js.Object {
  var absolutePointer: js.UndefOr[Point] = js.undefined
  var button: js.UndefOr[scala.Double] = js.undefined
  var e: stdLib.Event
  var isClick: js.UndefOr[scala.Boolean] = js.undefined
  var pointer: js.UndefOr[Point] = js.undefined
  var subTargets: js.UndefOr[js.Array[Object]] = js.undefined
  var target: js.UndefOr[Object] = js.undefined
  var transform: js.UndefOr[fabricLib.Anon_Corner] = js.undefined
}

object IEvent {
  @scala.inline
  def apply(
    e: stdLib.Event,
    absolutePointer: Point = null,
    button: scala.Int | scala.Double = null,
    isClick: js.UndefOr[scala.Boolean] = js.undefined,
    pointer: Point = null,
    subTargets: js.Array[Object] = null,
    target: Object = null,
    transform: fabricLib.Anon_Corner = null
  ): IEvent = {
    val __obj = js.Dynamic.literal(e = e)
    if (absolutePointer != null) __obj.updateDynamic("absolutePointer")(absolutePointer)
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (!js.isUndefined(isClick)) __obj.updateDynamic("isClick")(isClick)
    if (pointer != null) __obj.updateDynamic("pointer")(pointer)
    if (subTargets != null) __obj.updateDynamic("subTargets")(subTargets)
    if (target != null) __obj.updateDynamic("target")(target)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[IEvent]
  }
}

