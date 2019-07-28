package typings.expressDashFileupload.expressDashFileuploadMod.Global.ExpressNs

import typings.expressDashFileupload.expressDashFileuploadMod.FileArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var files: js.UndefOr[FileArray] = js.undefined
}

object Request {
  @scala.inline
  def apply(files: FileArray = null): Request = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files)
    __obj.asInstanceOf[Request]
  }
}

