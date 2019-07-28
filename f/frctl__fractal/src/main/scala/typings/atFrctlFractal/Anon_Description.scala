package typings.atFrctlFractal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
}

object Anon_Description {
  @scala.inline
  def apply(description: String = null, options: js.Array[js.Array[String]] = null): Anon_Description = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Anon_Description]
  }
}

