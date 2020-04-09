package typings.gitDiffParser.mod

import typings.gitDiffParser.gitDiffParserBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailedResult extends Result {
  @JSName("commits")
  var commits_DetailedResult: js.Array[DetailedCommit]
  @JSName("detailed")
  var detailed_DetailedResult: `true`
}

object DetailedResult {
  @scala.inline
  def apply(commits: js.Array[DetailedCommit], detailed: `true`): DetailedResult = {
    val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], detailed = detailed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DetailedResult]
  }
}

