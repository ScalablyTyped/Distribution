package typings.gapiDotClientDotBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SourceWords extends js.Object {
  /** The source, url and attribution for this dictionary data. */
  var source: js.UndefOr[Anon_Attribution] = js.undefined
  var words: js.UndefOr[js.Array[Anon_Derivatives]] = js.undefined
}

object Anon_SourceWords {
  @scala.inline
  def apply(source: Anon_Attribution = null, words: js.Array[Anon_Derivatives] = null): Anon_SourceWords = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source)
    if (words != null) __obj.updateDynamic("words")(words)
    __obj.asInstanceOf[Anon_SourceWords]
  }
}

