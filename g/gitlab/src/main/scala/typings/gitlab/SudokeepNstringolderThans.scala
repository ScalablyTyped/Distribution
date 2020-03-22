package typings.gitlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined gitlab.gitlab/dist/types/core/infrastructure.Sudo & {  keepN  :string,   olderThan  :string} */
trait SudokeepNstringolderThans extends js.Object {
  var keepN: String
  var olderThan: String
  var sudo: js.UndefOr[String | Double] = js.undefined
}

object SudokeepNstringolderThans {
  @scala.inline
  def apply(keepN: String, olderThan: String, sudo: String | Double = null): SudokeepNstringolderThans = {
    val __obj = js.Dynamic.literal(keepN = keepN.asInstanceOf[js.Any], olderThan = olderThan.asInstanceOf[js.Any])
    if (sudo != null) __obj.updateDynamic("sudo")(sudo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SudokeepNstringolderThans]
  }
}

