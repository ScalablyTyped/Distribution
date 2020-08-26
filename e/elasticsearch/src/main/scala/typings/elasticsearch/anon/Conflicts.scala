package typings.elasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Conflicts extends js.Object {
  var conflicts: js.UndefOr[String] = js.native
  var dest: Optype = js.native
  var script: js.UndefOr[Inline] = js.native
  var source: Index = js.native
}

object Conflicts {
  @scala.inline
  def apply(dest: Optype, source: Index): Conflicts = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conflicts]
  }
  @scala.inline
  implicit class ConflictsOps[Self <: Conflicts] (val x: Self) extends AnyVal {
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
    def setDest(value: Optype): Self = this.set("dest", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: Index): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setConflicts(value: String): Self = this.set("conflicts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConflicts: Self = this.set("conflicts", js.undefined)
    @scala.inline
    def setScript(value: Inline): Self = this.set("script", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScript: Self = this.set("script", js.undefined)
  }
  
}

