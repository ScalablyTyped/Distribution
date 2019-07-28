package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoResizeOptions extends js.Object {
  /**
    * If true, the view's height will grow and shrink together with the window. false
    * by default.
    */
  var height: Boolean
  /**
    * If true, the view's width will grow and shrink together with the window. false
    * by default.
    */
  var width: Boolean
}

object AutoResizeOptions {
  @scala.inline
  def apply(height: Boolean, width: Boolean): AutoResizeOptions = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[AutoResizeOptions]
  }
}

