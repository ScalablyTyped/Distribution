package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoResizeOptions extends js.Object {
  /**
    * If true, the view's height will grow and shrink together with the window. false
    * by default.
    */
  var height: scala.Boolean
  /**
    * If true, the view's width will grow and shrink together with the window. false
    * by default.
    */
  var width: scala.Boolean
}

object AutoResizeOptions {
  @scala.inline
  def apply(height: scala.Boolean, width: scala.Boolean): AutoResizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[AutoResizeOptions]
  }
}

