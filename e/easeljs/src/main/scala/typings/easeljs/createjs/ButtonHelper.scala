package typings.easeljs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonHelper extends js.Object {
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

object ButtonHelper {
  @scala.inline
  def apply(
    downLabel: String | Double,
    enabled: Boolean,
    getEnabled: () => Boolean,
    outLabel: String | Double,
    overLabel: String | Double,
    play: Boolean,
    setEnabled: Boolean => Unit,
    target: MovieClip | Sprite
  ): ButtonHelper = {
    val __obj = js.Dynamic.literal(downLabel = downLabel.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], getEnabled = js.Any.fromFunction0(getEnabled), outLabel = outLabel.asInstanceOf[js.Any], overLabel = overLabel.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], setEnabled = js.Any.fromFunction1(setEnabled), target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonHelper]
  }
  @scala.inline
  implicit class ButtonHelperOps[Self <: ButtonHelper] (val x: Self) extends AnyVal {
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
    def setDownLabel(value: String | Double): Self = this.set("downLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetEnabled(value: () => Boolean): Self = this.set("getEnabled", js.Any.fromFunction0(value))
    @scala.inline
    def setOutLabel(value: String | Double): Self = this.set("outLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverLabel(value: String | Double): Self = this.set("overLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlay(value: Boolean): Self = this.set("play", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetEnabled(value: Boolean => Unit): Self = this.set("setEnabled", js.Any.fromFunction1(value))
    @scala.inline
    def setTarget(value: MovieClip | Sprite): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

