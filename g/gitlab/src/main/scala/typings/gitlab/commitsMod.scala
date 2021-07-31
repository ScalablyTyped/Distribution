package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.gitlabStrings.create
import typings.gitlab.gitlabStrings.delete
import typings.gitlab.gitlabStrings.move
import typings.gitlab.gitlabStrings.update
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import typings.gitlab.requestHelperMod.Sudo
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commitsMod {
  
  @JSImport("gitlab/dist/types/core/services/Commits", "Commits")
  @js.native
  class Commits () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(projectId: String): js.Promise[GetResponse] = js.native
    def all(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def cherryPick(projectId: String, sha: String, branch: String): js.Promise[js.Object] = js.native
    def cherryPick(projectId: String, sha: String, branch: String, options: Sudo): js.Promise[js.Object] = js.native
    def cherryPick(projectId: Double, sha: String, branch: String): js.Promise[js.Object] = js.native
    def cherryPick(projectId: Double, sha: String, branch: String, options: Sudo): js.Promise[js.Object] = js.native
    
    def comments(projectId: String, sha: String): js.Promise[GetResponse] = js.native
    def comments(projectId: String, sha: String, options: Sudo): js.Promise[GetResponse] = js.native
    def comments(projectId: Double, sha: String): js.Promise[GetResponse] = js.native
    def comments(projectId: Double, sha: String, options: Sudo): js.Promise[GetResponse] = js.native
    
    def create(projectId: String, branch: String, message: String): js.Promise[js.Object] = js.native
    def create(projectId: String, branch: String, message: String, actions: js.Array[CommitAction]): js.Promise[js.Object] = js.native
    def create(
      projectId: String,
      branch: String,
      message: String,
      actions: js.Array[CommitAction],
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def create(projectId: String, branch: String, message: String, actions: Unit, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(projectId: Double, branch: String, message: String): js.Promise[js.Object] = js.native
    def create(projectId: Double, branch: String, message: String, actions: js.Array[CommitAction]): js.Promise[js.Object] = js.native
    def create(
      projectId: Double,
      branch: String,
      message: String,
      actions: js.Array[CommitAction],
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def create(projectId: Double, branch: String, message: String, actions: Unit, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def createComment(projectId: String, sha: String, note: String): js.Promise[js.Object] = js.native
    def createComment(projectId: String, sha: String, note: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def createComment(projectId: Double, sha: String, note: String): js.Promise[js.Object] = js.native
    def createComment(projectId: Double, sha: String, note: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def diff(projectId: String, sha: String): js.Promise[GetResponse] = js.native
    def diff(projectId: String, sha: String, options: Sudo): js.Promise[GetResponse] = js.native
    def diff(projectId: Double, sha: String): js.Promise[GetResponse] = js.native
    def diff(projectId: Double, sha: String, options: Sudo): js.Promise[GetResponse] = js.native
    
    def editStatus(projectId: String, sha: String): js.Promise[js.Object] = js.native
    def editStatus(projectId: String, sha: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def editStatus(projectId: Double, sha: String): js.Promise[js.Object] = js.native
    def editStatus(projectId: Double, sha: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def mergeRequests(projectId: String, sha: String): js.Promise[GetResponse] = js.native
    def mergeRequests(projectId: String, sha: String, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
    def mergeRequests(projectId: Double, sha: String): js.Promise[GetResponse] = js.native
    def mergeRequests(projectId: Double, sha: String, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
    
    def references(projectId: String, sha: String): js.Promise[GetResponse] = js.native
    def references(projectId: String, sha: String, options: Sudo): js.Promise[GetResponse] = js.native
    def references(projectId: Double, sha: String): js.Promise[GetResponse] = js.native
    def references(projectId: Double, sha: String, options: Sudo): js.Promise[GetResponse] = js.native
    
    def show(projectId: String, sha: String): js.Promise[GetResponse] = js.native
    def show(projectId: String, sha: String, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
    def show(projectId: Double, sha: String): js.Promise[GetResponse] = js.native
    def show(projectId: Double, sha: String, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
    
    def status(projectId: String, sha: String): js.Promise[GetResponse] = js.native
    def status(projectId: String, sha: String, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
    def status(projectId: Double, sha: String): js.Promise[GetResponse] = js.native
    def status(projectId: Double, sha: String, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
  
  trait CommitAction extends StObject {
    
    /** The action to perform */
    var action: create | delete | move | update
    
    /** File content, required for all except delete. Optional for move */
    var content: js.UndefOr[String] = js.undefined
    
    /** text or base64. text is default. */
    var encoding: js.UndefOr[String] = js.undefined
    
    /** Full path to the file. Ex. lib/class.rb */
    var filePath: String
    
    /** Last known file commit id. Will be only considered in update, move and delete actions. */
    var lastCommitId: js.UndefOr[String] = js.undefined
    
    /** Original full path to the file being moved.Ex.lib / class1.rb */
    var previousPath: js.UndefOr[String] = js.undefined
  }
  object CommitAction {
    
    @scala.inline
    def apply(action: create | delete | move | update, filePath: String): CommitAction = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommitAction]
    }
    
    @scala.inline
    implicit class CommitActionMutableBuilder[Self <: CommitAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: create | delete | move | update): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastCommitId(value: String): Self = StObject.set(x, "lastCommitId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastCommitIdUndefined: Self = StObject.set(x, "lastCommitId", js.undefined)
      
      @scala.inline
      def setPreviousPath(value: String): Self = StObject.set(x, "previousPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousPathUndefined: Self = StObject.set(x, "previousPath", js.undefined)
    }
  }
  
  trait CommitSchema extends StObject {
    
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
      title: String
    ): CommitSchema = {
      val __obj = js.Dynamic.literal(author_email = author_email.asInstanceOf[js.Any], author_name = author_name.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], short_id = short_id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommitSchema]
    }
    
    @scala.inline
    implicit class CommitSchemaMutableBuilder[Self <: CommitSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor_email(value: String): Self = StObject.set(x, "author_email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthor_name(value: String): Self = StObject.set(x, "author_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthored_date(value: Date): Self = StObject.set(x, "authored_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthored_dateUndefined: Self = StObject.set(x, "authored_date", js.undefined)
      
      @scala.inline
      def setCommitted_date(value: Date): Self = StObject.set(x, "committed_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitted_dateUndefined: Self = StObject.set(x, "committed_date", js.undefined)
      
      @scala.inline
      def setCommitter_email(value: String): Self = StObject.set(x, "committer_email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitter_emailUndefined: Self = StObject.set(x, "committer_email", js.undefined)
      
      @scala.inline
      def setCommitter_name(value: String): Self = StObject.set(x, "committer_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitter_nameUndefined: Self = StObject.set(x, "committer_name", js.undefined)
      
      @scala.inline
      def setCreated_at(value: Date): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent_ids(value: js.Array[String]): Self = StObject.set(x, "parent_ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent_idsUndefined: Self = StObject.set(x, "parent_ids", js.undefined)
      
      @scala.inline
      def setParent_idsVarargs(value: String*): Self = StObject.set(x, "parent_ids", js.Array(value :_*))
      
      @scala.inline
      def setShort_id(value: String): Self = StObject.set(x, "short_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
