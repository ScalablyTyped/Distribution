package typings
package atFrctlFractalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[js.Array[js.Array[java.lang.String]]] = js.undefined
}

object Anon_Description {
  @scala.inline
  def apply(description: java.lang.String = null, options: js.Array[js.Array[java.lang.String]] = null): Anon_Description = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Anon_Description]
  }
}

