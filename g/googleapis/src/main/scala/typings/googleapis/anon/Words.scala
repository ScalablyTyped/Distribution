package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Words extends js.Object {
  var source: js.UndefOr[Attribution] = js.native
  var words: js.UndefOr[js.Array[Derivatives]] = js.native
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

