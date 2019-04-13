package typings
package expressDashFileuploadLib.expressDashFileuploadMod.Global.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var files: js.UndefOr[expressDashFileuploadLib.expressDashFileuploadMod.FileArray] = js.undefined
}

object Request {
  @scala.inline
  def apply(files: expressDashFileuploadLib.expressDashFileuploadMod.FileArray = null): Request = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files)
    __obj.asInstanceOf[Request]
  }
}

