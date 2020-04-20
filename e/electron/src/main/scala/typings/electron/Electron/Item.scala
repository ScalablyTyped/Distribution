package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  /**
    * The path(s) to the file(s) being dragged.
    */
  var file: js.Array[String] | String
  /**
    * The image must be non-empty on macOS.
    */
  var icon: NativeImage_ | String
}

object Item {
  @scala.inline
  def apply(file: js.Array[String] | String, icon: NativeImage_ | String): Item = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

