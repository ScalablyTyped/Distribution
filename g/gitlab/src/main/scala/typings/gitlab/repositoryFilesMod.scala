package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repositoryFilesMod {
  
  @JSImport("gitlab/dist/types/core/services/RepositoryFiles", "RepositoryFiles")
  @js.native
  class RepositoryFiles () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def create(projectId: String, filePath: String, branch: String, content: String, commitMessage: String): js.Promise[js.Object] = js.native
    def create(
      projectId: String,
      filePath: String,
      branch: String,
      content: String,
      commitMessage: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def create(projectId: Double, filePath: String, branch: String, content: String, commitMessage: String): js.Promise[js.Object] = js.native
    def create(
      projectId: Double,
      filePath: String,
      branch: String,
      content: String,
      commitMessage: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    
    def edit(projectId: String, filePath: String, branch: String, content: String, commitMessage: String): js.Promise[js.Object] = js.native
    def edit(
      projectId: String,
      filePath: String,
      branch: String,
      content: String,
      commitMessage: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def edit(projectId: Double, filePath: String, branch: String, content: String, commitMessage: String): js.Promise[js.Object] = js.native
    def edit(
      projectId: Double,
      filePath: String,
      branch: String,
      content: String,
      commitMessage: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    
    def remove(projectId: String, filePath: String, branch: String, commitMessage: String): js.Promise[js.Object] = js.native
    def remove(
      projectId: String,
      filePath: String,
      branch: String,
      commitMessage: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def remove(projectId: Double, filePath: String, branch: String, commitMessage: String): js.Promise[js.Object] = js.native
    def remove(
      projectId: Double,
      filePath: String,
      branch: String,
      commitMessage: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    
    def show(projectId: String, filePath: String, ref: String): js.Promise[RepositoryFileSchema] = js.native
    def show(projectId: String, filePath: String, ref: String, options: Sudo): js.Promise[RepositoryFileSchema] = js.native
    def show(projectId: Double, filePath: String, ref: String): js.Promise[RepositoryFileSchema] = js.native
    def show(projectId: Double, filePath: String, ref: String, options: Sudo): js.Promise[RepositoryFileSchema] = js.native
    
    def showBlame(projectId: String, filePath: String): js.Promise[GetResponse] = js.native
    def showBlame(projectId: String, filePath: String, options: Sudo): js.Promise[GetResponse] = js.native
    def showBlame(projectId: Double, filePath: String): js.Promise[GetResponse] = js.native
    def showBlame(projectId: Double, filePath: String, options: Sudo): js.Promise[GetResponse] = js.native
    
    def showRaw(projectId: String, filePath: String, ref: String): js.Promise[GetResponse] = js.native
    def showRaw(projectId: String, filePath: String, ref: String, options: Sudo): js.Promise[GetResponse] = js.native
    def showRaw(projectId: Double, filePath: String, ref: String): js.Promise[GetResponse] = js.native
    def showRaw(projectId: Double, filePath: String, ref: String, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  trait RepositoryFileSchema extends StObject {
    
    var blob_id: String = js.native
    
    var commit_id: String = js.native
    
    var content: String = js.native
    
    var content_sha256: String = js.native
    
    var encoding: String = js.native
    
    var file_name: String = js.native
    
    var file_path: String = js.native
    
    var last_commit_id: String = js.native
    
    var ref: String = js.native
    
    var size: Double = js.native
  }
  object RepositoryFileSchema {
    
    @scala.inline
    def apply(
      blob_id: String,
      commit_id: String,
      content: String,
      content_sha256: String,
      encoding: String,
      file_name: String,
      file_path: String,
      last_commit_id: String,
      ref: String,
      size: Double
    ): RepositoryFileSchema = {
      val __obj = js.Dynamic.literal(blob_id = blob_id.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], content_sha256 = content_sha256.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], file_name = file_name.asInstanceOf[js.Any], file_path = file_path.asInstanceOf[js.Any], last_commit_id = last_commit_id.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepositoryFileSchema]
    }
    
    @scala.inline
    implicit class RepositoryFileSchemaMutableBuilder[Self <: RepositoryFileSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlob_id(value: String): Self = StObject.set(x, "blob_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommit_id(value: String): Self = StObject.set(x, "commit_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent_sha256(value: String): Self = StObject.set(x, "content_sha256", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile_name(value: String): Self = StObject.set(x, "file_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile_path(value: String): Self = StObject.set(x, "file_path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_commit_id(value: String): Self = StObject.set(x, "last_commit_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
