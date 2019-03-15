package typings
package atGoogleDashCloudPromisifyLib.atGoogleDashCloudPromisifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackifyAllOptions extends js.Object {
  /**
    * Array of methods to ignore when callbackifying.
    */
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object CallbackifyAllOptions {
  @scala.inline
  def apply(exclude: js.Array[java.lang.String] = null): CallbackifyAllOptions = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    __obj.asInstanceOf[CallbackifyAllOptions]
  }
}

