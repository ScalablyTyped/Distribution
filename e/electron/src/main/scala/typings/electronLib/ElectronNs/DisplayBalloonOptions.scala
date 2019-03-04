package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayBalloonOptions extends js.Object {
  var content: java.lang.String
  /**
    * -
    */
  var icon: js.UndefOr[NativeImage | java.lang.String] = js.undefined
  var title: java.lang.String
}

object DisplayBalloonOptions {
  @scala.inline
  def apply(content: java.lang.String, title: java.lang.String, icon: NativeImage | java.lang.String = null): DisplayBalloonOptions = {
    val __obj = js.Dynamic.literal(content = content, title = title)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayBalloonOptions]
  }
}

