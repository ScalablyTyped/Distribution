package typings.gitlab.commitsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitSchema extends js.Object {
  var author_email: String
  var author_name: String
  var authored_date: js.UndefOr[Date] = js.undefined
  var committed_date: js.UndefOr[Date] = js.undefined
  var committer_email: js.UndefOr[String] = js.undefined
  var committer_name: js.UndefOr[String] = js.undefined
  var created_at: Date
  var id: String
  var message: String
  var parent_ids: js.UndefOr[js.Array[String]] = js.undefined
  var short_id: String
  var title: String
}

object CommitSchema {
  @scala.inline
  def apply(
    author_email: String,
    author_name: String,
    created_at: Date,
    id: String,
    message: String,
    short_id: String,
    title: String,
    authored_date: Date = null,
    committed_date: Date = null,
    committer_email: String = null,
    committer_name: String = null,
    parent_ids: js.Array[String] = null
  ): CommitSchema = {
    val __obj = js.Dynamic.literal(author_email = author_email.asInstanceOf[js.Any], author_name = author_name.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], short_id = short_id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (authored_date != null) __obj.updateDynamic("authored_date")(authored_date.asInstanceOf[js.Any])
    if (committed_date != null) __obj.updateDynamic("committed_date")(committed_date.asInstanceOf[js.Any])
    if (committer_email != null) __obj.updateDynamic("committer_email")(committer_email.asInstanceOf[js.Any])
    if (committer_name != null) __obj.updateDynamic("committer_name")(committer_name.asInstanceOf[js.Any])
    if (parent_ids != null) __obj.updateDynamic("parent_ids")(parent_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitSchema]
  }
}

