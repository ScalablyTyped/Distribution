package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPropsWithRefKey extends js.Object {
  var refKey: js.UndefOr[String] = js.undefined
}

object GetPropsWithRefKey {
  @scala.inline
  def apply(refKey: String = null): GetPropsWithRefKey = {
    val __obj = js.Dynamic.literal()
    if (refKey != null) __obj.updateDynamic("refKey")(refKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPropsWithRefKey]
  }
}

