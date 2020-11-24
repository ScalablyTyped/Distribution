package typings.gitlab.commitsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommitSchema extends js.Object {
  
  var author_email: String = js.native
  
  var author_name: String = js.native
  
  var authored_date: js.UndefOr[Date] = js.native
  
  var committed_date: js.UndefOr[Date] = js.native
  
  var committer_email: js.UndefOr[String] = js.native
  
  var committer_name: js.UndefOr[String] = js.native
  
  var created_at: Date = js.native
  
  var id: String = js.native
  
  var message: String = js.native
  
  var parent_ids: js.UndefOr[js.Array[String]] = js.native
  
  var short_id: String = js.native
  
  var title: String = js.native
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
    title: String
  ): CommitSchema = {
    val __obj = js.Dynamic.literal(author_email = author_email.asInstanceOf[js.Any], author_name = author_name.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], short_id = short_id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitSchema]
  }
  
  @scala.inline
  implicit class CommitSchemaOps[Self <: CommitSchema] (val x: Self) extends AnyVal {
    
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
    def setAuthor_email(value: String): Self = this.set("author_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor_name(value: String): Self = this.set("author_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: Date): Self = this.set("created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort_id(value: String): Self = this.set("short_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthored_date(value: Date): Self = this.set("authored_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthored_date: Self = this.set("authored_date", js.undefined)
    
    @scala.inline
    def setCommitted_date(value: Date): Self = this.set("committed_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitted_date: Self = this.set("committed_date", js.undefined)
    
    @scala.inline
    def setCommitter_email(value: String): Self = this.set("committer_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitter_email: Self = this.set("committer_email", js.undefined)
    
    @scala.inline
    def setCommitter_name(value: String): Self = this.set("committer_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitter_name: Self = this.set("committer_name", js.undefined)
    
    @scala.inline
    def setParent_idsVarargs(value: String*): Self = this.set("parent_ids", js.Array(value :_*))
    
    @scala.inline
    def setParent_ids(value: js.Array[String]): Self = this.set("parent_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent_ids: Self = this.set("parent_ids", js.undefined)
  }
}
