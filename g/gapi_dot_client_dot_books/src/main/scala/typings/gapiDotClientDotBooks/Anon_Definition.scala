package typings.gapiDotClientDotBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Definition extends js.Object {
  var definition: js.UndefOr[String] = js.undefined
  var examples: js.UndefOr[js.Array[Anon_Source]] = js.undefined
}

object Anon_Definition {
  @scala.inline
  def apply(definition: String = null, examples: js.Array[Anon_Source] = null): Anon_Definition = {
    val __obj = js.Dynamic.literal()
    if (definition != null) __obj.updateDynamic("definition")(definition)
    if (examples != null) __obj.updateDynamic("examples")(examples)
    __obj.asInstanceOf[Anon_Definition]
  }
}

