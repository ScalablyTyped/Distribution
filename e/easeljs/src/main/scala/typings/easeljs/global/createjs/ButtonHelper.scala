package typings.easeljs.global.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.ButtonHelper")
@js.native
class ButtonHelper protected ()
  extends typings.easeljs.createjs.ButtonHelper {
  def this(
    target: typings.easeljs.createjs.MovieClip,
    outLabel: js.UndefOr[String],
    overLabel: js.UndefOr[String],
    downLabel: js.UndefOr[String],
    play: js.UndefOr[Boolean],
    hitArea: js.UndefOr[typings.easeljs.createjs.DisplayObject],
    hitLabel: js.UndefOr[String]
  ) = this()
  def this(
    target: typings.easeljs.createjs.Sprite,
    outLabel: js.UndefOr[String],
    overLabel: js.UndefOr[String],
    downLabel: js.UndefOr[String],
    play: js.UndefOr[Boolean],
    hitArea: js.UndefOr[typings.easeljs.createjs.DisplayObject],
    hitLabel: js.UndefOr[String]
  ) = this()
  // properties
  /* CompleteClass */
  override var downLabel: String | Double = js.native
  /* CompleteClass */
  override var enabled: Boolean = js.native
  /* CompleteClass */
  override var outLabel: String | Double = js.native
  /* CompleteClass */
  override var overLabel: String | Double = js.native
  /* CompleteClass */
  override var play: Boolean = js.native
  /* CompleteClass */
  override var target: typings.easeljs.createjs.MovieClip | typings.easeljs.createjs.Sprite = js.native
  /**
    * @deprecated - use the 'enabled' property instead
    */
  /* CompleteClass */
  override def getEnabled(): Boolean = js.native
  // methods
  /**
    * @deprecated - use the 'enabled' property instead
    */
  /* CompleteClass */
  override def setEnabled(value: Boolean): Unit = js.native
}

