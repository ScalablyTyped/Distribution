package typings.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDerivatives extends js.Object {
  var derivatives: js.UndefOr[js.Array[AnonSource]] = js.undefined
  var examples: js.UndefOr[js.Array[AnonSource]] = js.undefined
  var senses: js.UndefOr[js.Array[AnonConjugations]] = js.undefined
  /** The words with different meanings but not related words, e.g. "go" (game) and "go" (verb). */
  var source: js.UndefOr[AnonAttribution] = js.undefined
}

object AnonDerivatives {
  @scala.inline
  def apply(
    derivatives: js.Array[AnonSource] = null,
    examples: js.Array[AnonSource] = null,
    senses: js.Array[AnonConjugations] = null,
    source: AnonAttribution = null
  ): AnonDerivatives = {
    val __obj = js.Dynamic.literal()
    if (derivatives != null) __obj.updateDynamic("derivatives")(derivatives.asInstanceOf[js.Any])
    if (examples != null) __obj.updateDynamic("examples")(examples.asInstanceOf[js.Any])
    if (senses != null) __obj.updateDynamic("senses")(senses.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDerivatives]
  }
}

