package typings.easeljs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonHelper extends js.Object {
  // properties
  var downLabel: String | Double
  var enabled: Boolean
  var outLabel: String | Double
  var overLabel: String | Double
  var play: Boolean
  var target: MovieClip | Sprite
  /**
    * @deprecated - use the 'enabled' property instead
    */
  def getEnabled(): Boolean
  // methods
  /**
    * @deprecated - use the 'enabled' property instead
    */
  def setEnabled(value: Boolean): Unit
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
}

