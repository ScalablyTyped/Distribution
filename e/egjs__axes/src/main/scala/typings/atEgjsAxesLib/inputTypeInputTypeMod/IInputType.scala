package typings
package atEgjsAxesLib.inputTypeInputTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInputType extends js.Object {
  var axes: js.Array[java.lang.String]
  var disable: js.UndefOr[js.Function0[_]] = js.undefined
  var element: stdLib.HTMLElement
  var enable: js.UndefOr[js.Function0[_]] = js.undefined
  var hammer: js.UndefOr[js.Any] = js.undefined
  var isEnable: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  def connect(observer: IInputTypeObserver): IInputType
  def destroy(): js.Any
  def disconnect(): js.Any
  def mapAxes(axes: js.Array[java.lang.String]): js.Any
}

object IInputType {
  @scala.inline
  def apply(
    axes: js.Array[java.lang.String],
    connect: IInputTypeObserver => IInputType,
    destroy: () => js.Any,
    disconnect: () => js.Any,
    element: stdLib.HTMLElement,
    mapAxes: js.Array[java.lang.String] => js.Any,
    disable: () => _ = null,
    enable: () => _ = null,
    hammer: js.Any = null,
    isEnable: () => scala.Boolean = null
  ): IInputType = {
    val __obj = js.Dynamic.literal(axes = axes, connect = js.Any.fromFunction1(connect), destroy = js.Any.fromFunction0(destroy), disconnect = js.Any.fromFunction0(disconnect), element = element, mapAxes = js.Any.fromFunction1(mapAxes))
    if (disable != null) __obj.updateDynamic("disable")(js.Any.fromFunction0(disable))
    if (enable != null) __obj.updateDynamic("enable")(js.Any.fromFunction0(enable))
    if (hammer != null) __obj.updateDynamic("hammer")(hammer)
    if (isEnable != null) __obj.updateDynamic("isEnable")(js.Any.fromFunction0(isEnable))
    __obj.asInstanceOf[IInputType]
  }
}

