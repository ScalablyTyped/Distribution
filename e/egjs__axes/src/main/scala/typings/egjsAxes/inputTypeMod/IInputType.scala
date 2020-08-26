package typings.egjsAxes.inputTypeMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInputType extends js.Object {
  var axes: js.Array[String] = js.native
  var disable: js.UndefOr[js.Function0[_]] = js.native
  var element: HTMLElement = js.native
  var enable: js.UndefOr[js.Function0[_]] = js.native
  var hammer: js.UndefOr[js.Any] = js.native
  var isEnable: js.UndefOr[js.Function0[Boolean]] = js.native
  def connect(observer: IInputTypeObserver): IInputType = js.native
  def destroy(): js.Any = js.native
  def disconnect(): js.Any = js.native
  def mapAxes(axes: js.Array[String]): js.Any = js.native
}

object IInputType {
  @scala.inline
  def apply(
    axes: js.Array[String],
    connect: IInputTypeObserver => IInputType,
    destroy: () => js.Any,
    disconnect: () => js.Any,
    element: HTMLElement,
    mapAxes: js.Array[String] => js.Any
  ): IInputType = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], connect = js.Any.fromFunction1(connect), destroy = js.Any.fromFunction0(destroy), disconnect = js.Any.fromFunction0(disconnect), element = element.asInstanceOf[js.Any], mapAxes = js.Any.fromFunction1(mapAxes))
    __obj.asInstanceOf[IInputType]
  }
  @scala.inline
  implicit class IInputTypeOps[Self <: IInputType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAxesVarargs(value: String*): Self = this.set("axes", js.Array(value :_*))
    @scala.inline
    def setAxes(value: js.Array[String]): Self = this.set("axes", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnect(value: IInputTypeObserver => IInputType): Self = this.set("connect", js.Any.fromFunction1(value))
    @scala.inline
    def setDestroy(value: () => js.Any): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setDisconnect(value: () => js.Any): Self = this.set("disconnect", js.Any.fromFunction0(value))
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapAxes(value: js.Array[String] => js.Any): Self = this.set("mapAxes", js.Any.fromFunction1(value))
    @scala.inline
    def setDisable(value: () => _): Self = this.set("disable", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    @scala.inline
    def setEnable(value: () => _): Self = this.set("enable", js.Any.fromFunction0(value))
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setHammer(value: js.Any): Self = this.set("hammer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHammer: Self = this.set("hammer", js.undefined)
    @scala.inline
    def setIsEnable(value: () => Boolean): Self = this.set("isEnable", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsEnable: Self = this.set("isEnable", js.undefined)
  }
  
}

