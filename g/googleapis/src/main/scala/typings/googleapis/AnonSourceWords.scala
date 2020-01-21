package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSourceWords extends js.Object {
  var source: js.UndefOr[AnonAttribution] = js.native
  var words: js.UndefOr[js.Array[AnonDerivatives]] = js.native
}

object AnonSourceWords {
  @scala.inline
  def apply(source: AnonAttribution = null, words: js.Array[AnonDerivatives] = null): AnonSourceWords = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (words != null) __obj.updateDynamic("words")(words.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSourceWords]
  }
}

