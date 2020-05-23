package typings.googleVisualization.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var styles: js.UndefOr[js.Array[_]] = js.undefined
}

object Name {
  @scala.inline
  def apply(name: String = null, styles: js.Array[_] = null): Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

