package typings.easeljs.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.ButtonHelper")
@js.native
class ButtonHelper protected () extends js.Object {
  def this(
    target: MovieClip,
    outLabel: js.UndefOr[String],
    overLabel: js.UndefOr[String],
    downLabel: js.UndefOr[String],
    play: js.UndefOr[Boolean],
    hitArea: js.UndefOr[DisplayObject],
    hitLabel: js.UndefOr[String]
  ) = this()
  def this(
    target: Sprite,
    outLabel: js.UndefOr[String],
    overLabel: js.UndefOr[String],
    downLabel: js.UndefOr[String],
    play: js.UndefOr[Boolean],
    hitArea: js.UndefOr[DisplayObject],
    hitLabel: js.UndefOr[String]
  ) = this()
  // properties
  var downLabel: String | Double = js.native
  var enabled: Boolean = js.native
  var outLabel: String | Double = js.native
  var overLabel: String | Double = js.native
  var play: Boolean = js.native
  var target: MovieClip | Sprite = js.native
  /**
    * @deprecated - use the 'enabled' property instead
    */
  def getEnabled(): Boolean = js.native
  // methods
  /**
    * @deprecated - use the 'enabled' property instead
    */
  def setEnabled(value: Boolean): Unit = js.native
}

