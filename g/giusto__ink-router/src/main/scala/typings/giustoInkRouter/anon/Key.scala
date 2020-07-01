package typings.giustoInkRouter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var pathname: js.UndefOr[String] = js.undefined
}

object Key {
  @scala.inline
  def apply(key: String = null, pathname: String = null): Key = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (pathname != null) __obj.updateDynamic("pathname")(pathname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

