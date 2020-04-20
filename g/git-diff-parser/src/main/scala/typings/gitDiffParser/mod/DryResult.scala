package typings.gitDiffParser.mod

import typings.gitDiffParser.gitDiffParserBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DryResult extends Result {
  @JSName("detailed")
  var detailed_DryResult: `false`
}

object DryResult {
  @scala.inline
  def apply(commits: js.Array[Commit], detailed: `false`): DryResult = {
    val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], detailed = detailed.asInstanceOf[js.Any])
    __obj.asInstanceOf[DryResult]
  }
}

