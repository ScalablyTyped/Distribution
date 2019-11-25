package typings.gapiDotClientDotBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Derivatives extends js.Object {
  var derivatives: js.UndefOr[js.Array[Anon_Source]] = js.undefined
  var examples: js.UndefOr[js.Array[Anon_Source]] = js.undefined
  var senses: js.UndefOr[js.Array[Anon_Conjugations]] = js.undefined
  /** The words with different meanings but not related words, e.g. "go" (game) and "go" (verb). */
  var source: js.UndefOr[Anon_Attribution] = js.undefined
}

object Anon_Derivatives {
  @scala.inline
  def apply(
    derivatives: js.Array[Anon_Source] = null,
    examples: js.Array[Anon_Source] = null,
    senses: js.Array[Anon_Conjugations] = null,
    source: Anon_Attribution = null
  ): Anon_Derivatives = {
    val __obj = js.Dynamic.literal()
    if (derivatives != null) __obj.updateDynamic("derivatives")(derivatives.asInstanceOf[js.Any])
    if (examples != null) __obj.updateDynamic("examples")(examples.asInstanceOf[js.Any])
    if (senses != null) __obj.updateDynamic("senses")(senses.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Derivatives]
  }
}

