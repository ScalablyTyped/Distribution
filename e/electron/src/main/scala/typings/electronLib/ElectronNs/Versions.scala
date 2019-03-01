package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Versions extends js.Object {
  /**
    * A String representing Chrome's version string.
    */
  var chrome: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A String representing Electron's version string.
    */
  var electron: js.UndefOr[java.lang.String] = js.undefined
}

object Versions {
  @scala.inline
  def apply(chrome: java.lang.String = null, electron: java.lang.String = null): Versions = {
    val __obj = js.Dynamic.literal()
    if (chrome != null) __obj.updateDynamic("chrome")(chrome)
    if (electron != null) __obj.updateDynamic("electron")(electron)
    __obj.asInstanceOf[Versions]
  }
}

