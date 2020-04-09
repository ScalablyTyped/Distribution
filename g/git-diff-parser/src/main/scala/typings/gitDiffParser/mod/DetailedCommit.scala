package typings.gitDiffParser.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailedCommit extends Commit {
  var author: js.UndefOr[String] = js.undefined
  var date: js.UndefOr[Date] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var sha: js.UndefOr[String] = js.undefined
}

object DetailedCommit {
  @scala.inline
  def apply(
    files: js.Array[File],
    author: String = null,
    date: Date = null,
    email: String = null,
    message: String = null,
    sha: String = null
  ): DetailedCommit = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (sha != null) __obj.updateDynamic("sha")(sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedCommit]
  }
}

