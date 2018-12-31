package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.ButtonHelper")
@js.native
class ButtonHelper protected () extends js.Object {
  def this(target: MovieClip, outLabel: js.UndefOr[java.lang.String], overLabel: js.UndefOr[java.lang.String], downLabel: js.UndefOr[java.lang.String], play: js.UndefOr[scala.Boolean], hitArea: js.UndefOr[DisplayObject], hitLabel: js.UndefOr[java.lang.String]) = this()
  def this(target: Sprite, outLabel: js.UndefOr[java.lang.String], overLabel: js.UndefOr[java.lang.String], downLabel: js.UndefOr[java.lang.String], play: js.UndefOr[scala.Boolean], hitArea: js.UndefOr[DisplayObject], hitLabel: js.UndefOr[java.lang.String]) = this()
  // properties
  var downLabel: java.lang.String | scala.Double = js.native
  var enabled: scala.Boolean = js.native
  var outLabel: java.lang.String | scala.Double = js.native
  var overLabel: java.lang.String | scala.Double = js.native
  var play: scala.Boolean = js.native
  var target: MovieClip | Sprite = js.native
  /**
    * @deprecated - use the 'enabled' property instead
    */
  def getEnabled(): scala.Boolean = js.native
  // methods
  /**
    * @deprecated - use the 'enabled' property instead
    */
  def setEnabled(value: scala.Boolean): scala.Unit = js.native
}

