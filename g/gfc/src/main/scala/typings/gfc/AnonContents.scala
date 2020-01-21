package typings.gfc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContents extends js.Object {
  var contents: js.UndefOr[String] = js.undefined
  var path: String
}

object AnonContents {
  @scala.inline
  def apply(path: String, contents: String = null): AnonContents = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContents]
  }
}

