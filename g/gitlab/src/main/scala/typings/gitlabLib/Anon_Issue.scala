package typings
package gitlabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Issue extends js.Object {
  var issue: java.lang.String
  var merge_request: java.lang.String
  var milestone: java.lang.String
  var note: java.lang.String
  var project: java.lang.String
  var snippet: java.lang.String
  var user: java.lang.String
}

object Anon_Issue {
  @scala.inline
  def apply(
    issue: java.lang.String,
    merge_request: java.lang.String,
    milestone: java.lang.String,
    note: java.lang.String,
    project: java.lang.String,
    snippet: java.lang.String,
    user: java.lang.String
  ): Anon_Issue = {
    val __obj = js.Dynamic.literal(issue = issue, merge_request = merge_request, milestone = milestone, note = note, project = project, snippet = snippet, user = user)
  
    __obj.asInstanceOf[Anon_Issue]
  }
}

