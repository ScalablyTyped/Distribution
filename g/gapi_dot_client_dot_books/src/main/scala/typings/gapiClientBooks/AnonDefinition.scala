package typings.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefinition extends js.Object {
  var definition: js.UndefOr[String] = js.undefined
  var examples: js.UndefOr[js.Array[AnonSource]] = js.undefined
}

object AnonDefinition {
  @scala.inline
  def apply(definition: String = null, examples: js.Array[AnonSource] = null): AnonDefinition = {
    val __obj = js.Dynamic.literal()
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (examples != null) __obj.updateDynamic("examples")(examples.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefinition]
  }
}

