package typings.gitDiffParser.mod

import typings.gitDiffParser.gitDiffParserBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetailedResult extends Result {
  @JSName("commits")
  var commits_DetailedResult: js.Array[DetailedCommit] = js.native
  @JSName("detailed")
  var detailed_DetailedResult: `true` = js.native
}

object DetailedResult {
  @scala.inline
  def apply(commits: js.Array[DetailedCommit], detailed: `true`): DetailedResult = {
    val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], detailed = detailed.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedResult]
  }
  @scala.inline
  implicit class DetailedResultOps[Self <: DetailedResult] (val x: Self) extends AnyVal {
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
    def setCommitsVarargs(value: DetailedCommit*): Self = this.set("commits", js.Array(value :_*))
    @scala.inline
    def setCommits(value: js.Array[DetailedCommit]): Self = this.set("commits", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetailed(value: `true`): Self = this.set("detailed", value.asInstanceOf[js.Any])
  }
  
}

