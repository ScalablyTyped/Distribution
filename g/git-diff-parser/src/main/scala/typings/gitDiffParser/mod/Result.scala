package typings.gitDiffParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var commits: js.Array[Commit]
  var detailed: Boolean
}

object Result {
  @scala.inline
  def apply(commits: js.Array[Commit], detailed: Boolean): Result = {
    val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], detailed = detailed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
}

