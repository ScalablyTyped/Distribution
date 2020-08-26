package typings.gitlab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined gitlab.gitlab/dist/types/core/infrastructure.Sudo & {  keepN :string,   olderThan :string} */
@js.native
trait SudokeepNstringolderThans extends js.Object {
  var keepN: String = js.native
  var olderThan: String = js.native
  var sudo: js.UndefOr[String | Double] = js.native
}

object SudokeepNstringolderThans {
  @scala.inline
  def apply(keepN: String, olderThan: String): SudokeepNstringolderThans = {
    val __obj = js.Dynamic.literal(keepN = keepN.asInstanceOf[js.Any], olderThan = olderThan.asInstanceOf[js.Any])
    __obj.asInstanceOf[SudokeepNstringolderThans]
  }
  @scala.inline
  implicit class SudokeepNstringolderThansOps[Self <: SudokeepNstringolderThans] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKeepN(value: String): Self = this.set("keepN", value.asInstanceOf[js.Any])
    @scala.inline
    def setOlderThan(value: String): Self = this.set("olderThan", value.asInstanceOf[js.Any])
    @scala.inline
    def setSudo(value: String | Double): Self = this.set("sudo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSudo: Self = this.set("sudo", js.undefined)
  }
  
}

