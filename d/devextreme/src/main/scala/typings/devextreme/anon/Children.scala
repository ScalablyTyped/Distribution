package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  var children: js.UndefOr[js.Array[_]] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
}

object Children {
  @scala.inline
  def apply(children: js.Array[_] = null, value: String | Double = null): Children = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
}

