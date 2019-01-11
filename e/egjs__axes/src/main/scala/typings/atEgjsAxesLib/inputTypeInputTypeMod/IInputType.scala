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

