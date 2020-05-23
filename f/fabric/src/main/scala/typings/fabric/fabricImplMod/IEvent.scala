package typings.fabric.fabricImplMod

import typings.fabric.anon.Corner
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvent extends js.Object {
  var absolutePointer: js.UndefOr[Point] = js.undefined
  var button: js.UndefOr[Double] = js.undefined
  var e: Event
  var isClick: js.UndefOr[Boolean] = js.undefined
  var pointer: js.UndefOr[Point] = js.undefined
  var subTargets: js.UndefOr[js.Array[Object]] = js.undefined
  var target: js.UndefOr[Object] = js.undefined
  var transform: js.UndefOr[Corner] = js.undefined
}

object IEvent {
  @scala.inline
  def apply(
    e: Event,
    absolutePointer: Point = null,
    button: js.UndefOr[Double] = js.undefined,
    isClick: js.UndefOr[Boolean] = js.undefined,
    pointer: Point = null,
    subTargets: js.Array[Object] = null,
    target: Object = null,
    transform: Corner = null
  ): IEvent = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any])
    if (absolutePointer != null) __obj.updateDynamic("absolutePointer")(absolutePointer.asInstanceOf[js.Any])
    if (!js.isUndefined(button)) __obj.updateDynamic("button")(button.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isClick)) __obj.updateDynamic("isClick")(isClick.get.asInstanceOf[js.Any])
    if (pointer != null) __obj.updateDynamic("pointer")(pointer.asInstanceOf[js.Any])
    if (subTargets != null) __obj.updateDynamic("subTargets")(subTargets.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEvent]
  }
}

