package typings.gitDiffParser.mod

import typings.gitDiffParser.gitDiffParserBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DryResult extends Result {
  @JSName("detailed")
  var detailed_DryResult: `false` = js.native
}

object DryResult {
  @scala.inline
  def apply(commits: js.Array[Commit], detailed: `false`): DryResult = {
    val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], detailed = detailed.asInstanceOf[js.Any])
    __obj.asInstanceOf[DryResult]
  }
  @scala.inline
  implicit class DryResultOps[Self <: DryResult] (val x: Self) extends AnyVal {
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
    def setDetailed(value: `false`): Self = this.set("detailed", value.asInstanceOf[js.Any])
  }
  
}

