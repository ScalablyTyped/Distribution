package typings.gfc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contents extends js.Object {
  var contents: js.UndefOr[String] = js.undefined
  var path: String
}

object Contents {
  @scala.inline
  def apply(path: String, contents: String = null): Contents = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contents]
  }
}

