package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Definition extends js.Object {
  var definition: js.UndefOr[String] = js.native
  var examples: js.UndefOr[js.Array[Source]] = js.native
}

object Definition {
  @scala.inline
  def apply(definition: String = null, examples: js.Array[Source] = null): Definition = {
    val __obj = js.Dynamic.literal()
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (examples != null) __obj.updateDynamic("examples")(examples.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
}

