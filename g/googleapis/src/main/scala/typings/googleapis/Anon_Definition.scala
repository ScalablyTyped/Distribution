package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Definition extends js.Object {
  var definition: js.UndefOr[String] = js.native
  var examples: js.UndefOr[js.Array[Anon_Source]] = js.native
}

object Anon_Definition {
  @scala.inline
  def apply(definition: String = null, examples: js.Array[Anon_Source] = null): Anon_Definition = {
    val __obj = js.Dynamic.literal()
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (examples != null) __obj.updateDynamic("examples")(examples.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Definition]
  }
}

