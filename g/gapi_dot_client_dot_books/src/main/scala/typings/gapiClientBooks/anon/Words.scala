package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Words extends js.Object {
  /** The source, url and attribution for this dictionary data. */
  var source: js.UndefOr[Attribution] = js.undefined
  var words: js.UndefOr[js.Array[Derivatives]] = js.undefined
}

object Words {
  @scala.inline
  def apply(source: Attribution = null, words: js.Array[Derivatives] = null): Words = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (words != null) __obj.updateDynamic("words")(words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Words]
  }
}

