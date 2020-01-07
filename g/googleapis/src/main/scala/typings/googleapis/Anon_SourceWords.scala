package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_SourceWords extends js.Object {
  var source: js.UndefOr[Anon_Attribution] = js.native
  var words: js.UndefOr[js.Array[Anon_Derivatives]] = js.native
}

object Anon_SourceWords {
  @scala.inline
  def apply(source: Anon_Attribution = null, words: js.Array[Anon_Derivatives] = null): Anon_SourceWords = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (words != null) __obj.updateDynamic("words")(words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SourceWords]
  }
}

