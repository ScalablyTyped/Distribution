package typings
package expressDashFormidableLib.expressDashFormidableMod.Global.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var fields: js.UndefOr[formidableLib.formidableMod.Fields] = js.undefined
  var files: js.UndefOr[formidableLib.formidableMod.Files] = js.undefined
}

object Request {
  @scala.inline
  def apply(fields: formidableLib.formidableMod.Fields = null, files: formidableLib.formidableMod.Files = null): Request = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (files != null) __obj.updateDynamic("files")(files)
    __obj.asInstanceOf[Request]
  }
}

