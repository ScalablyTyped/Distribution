package typings.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWords extends js.Object {
  /** The source, url and attribution for this dictionary data. */
  var source: js.UndefOr[AnonAttribution] = js.undefined
  var words: js.UndefOr[js.Array[AnonDerivatives]] = js.undefined
}

object AnonWords {
  @scala.inline
  def apply(source: AnonAttribution = null, words: js.Array[AnonDerivatives] = null): AnonWords = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (words != null) __obj.updateDynamic("words")(words.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWords]
  }
}

