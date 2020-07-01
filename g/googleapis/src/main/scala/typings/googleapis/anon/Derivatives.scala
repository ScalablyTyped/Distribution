package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Derivatives extends js.Object {
  var derivatives: js.UndefOr[js.Array[Source]] = js.native
  var examples: js.UndefOr[js.Array[Source]] = js.native
  var senses: js.UndefOr[js.Array[Conjugations]] = js.native
  var source: js.UndefOr[Attribution] = js.native
}

object Derivatives {
  @scala.inline
  def apply(
    derivatives: js.Array[Source] = null,
    examples: js.Array[Source] = null,
    senses: js.Array[Conjugations] = null,
    source: Attribution = null
  ): Derivatives = {
    val __obj = js.Dynamic.literal()
    if (derivatives != null) __obj.updateDynamic("derivatives")(derivatives.asInstanceOf[js.Any])
    if (examples != null) __obj.updateDynamic("examples")(examples.asInstanceOf[js.Any])
    if (senses != null) __obj.updateDynamic("senses")(senses.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Derivatives]
  }
}

