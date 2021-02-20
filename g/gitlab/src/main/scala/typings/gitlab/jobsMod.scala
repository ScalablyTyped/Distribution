package typings.gitlab

import typings.gitlab.anon.scopeJobScopeundefinedSud
import typings.gitlab.anon.streambooleanundefinedBas
import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.commitsMod.CommitSchema
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.pipelinesMod.PipelineSchema
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import typings.gitlab.requestHelperMod.Sudo
import typings.gitlab.runnersMod.RunnerSchema
import typings.gitlab.usersMod.UserSchema
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jobsMod {
  
  @JSImport("gitlab/dist/types/core/services/Jobs", "Jobs")
  @js.native
  class Jobs () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(projectId: String): js.Promise[GetResponse] = js.native
    def all(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def cancel(projectId: String, jobId: Double): js.Promise[js.Object] = js.native
    def cancel(projectId: String, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def cancel(projectId: Double, jobId: Double): js.Promise[js.Object] = js.native
    def cancel(projectId: Double, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def downloadLatestArtifactFile(projectId: String, ref: String, name: String, hasStreamOptions: streambooleanundefinedBas): js.Any = js.native
    def downloadLatestArtifactFile(projectId: Double, ref: String, name: String, hasStreamOptions: streambooleanundefinedBas): js.Any = js.native
    
    def downloadSingleArtifactFile(
      projectId: String,
      jobId: Double,
      artifactPath: String,
      hasStreamOptions: streambooleanundefinedBas
    ): js.Any = js.native
    def downloadSingleArtifactFile(
      projectId: Double,
      jobId: Double,
      artifactPath: String,
      hasStreamOptions: streambooleanundefinedBas
    ): js.Any = js.native
    
    def downloadSingleArtifactFileFromRef(
      projectId: String,
      ref: String,
      artifactPath: String,
      name: String,
      hasStreamOptions: streambooleanundefinedBas
    ): js.Any = js.native
    def downloadSingleArtifactFileFromRef(
      projectId: Double,
      ref: String,
      artifactPath: String,
      name: String,
      hasStreamOptions: streambooleanundefinedBas
    ): js.Any = js.native
    
    def downloadTraceFile(projectId: String, jobId: Double): js.Promise[GetResponse] = js.native
    def downloadTraceFile(projectId: String, jobId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def downloadTraceFile(projectId: Double, jobId: Double): js.Promise[GetResponse] = js.native
    def downloadTraceFile(projectId: Double, jobId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def erase(projectId: String, jobId: Double): js.Promise[js.Object] = js.native
    def erase(projectId: String, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def erase(projectId: Double, jobId: Double): js.Promise[js.Object] = js.native
    def erase(projectId: Double, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def eraseArtifacts(projectId: String, jobId: Double): js.Promise[js.Object] = js.native
    def eraseArtifacts(projectId: String, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def eraseArtifacts(projectId: Double, jobId: Double): js.Promise[js.Object] = js.native
    def eraseArtifacts(projectId: Double, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def keepArtifacts(projectId: String, jobId: Double): js.Promise[js.Object] = js.native
    def keepArtifacts(projectId: String, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def keepArtifacts(projectId: Double, jobId: Double): js.Promise[js.Object] = js.native
    def keepArtifacts(projectId: Double, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def play(projectId: String, jobId: Double): js.Promise[js.Object] = js.native
    def play(projectId: String, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def play(projectId: Double, jobId: Double): js.Promise[js.Object] = js.native
    def play(projectId: Double, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def retry(projectId: String, jobId: Double): js.Promise[js.Object] = js.native
    def retry(projectId: String, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def retry(projectId: Double, jobId: Double): js.Promise[js.Object] = js.native
    def retry(projectId: Double, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(projectId: String, jobId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: String, jobId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, jobId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: Double, jobId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def showPipelineJobs(projectId: String, pipelineId: Double): js.Promise[GetResponse] = js.native
    def showPipelineJobs(projectId: String, pipelineId: Double, options: scopeJobScopeundefinedSud): js.Promise[GetResponse] = js.native
    def showPipelineJobs(projectId: Double, pipelineId: Double): js.Promise[GetResponse] = js.native
    def showPipelineJobs(projectId: Double, pipelineId: Double, options: scopeJobScopeundefinedSud): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  trait ArtifactSchema extends StObject {
    
    var file_format: js.UndefOr[String] = js.native
    
    var file_type: String = js.native
    
    var filename: String = js.native
    
    var size: Double = js.native
  }
  object ArtifactSchema {
    
    @scala.inline
    def apply(file_type: String, filename: String, size: Double): ArtifactSchema = {
      val __obj = js.Dynamic.literal(file_type = file_type.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArtifactSchema]
    }
    
    @scala.inline
    implicit class ArtifactSchemaMutableBuilder[Self <: ArtifactSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile_format(value: String): Self = StObject.set(x, "file_format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile_formatUndefined: Self = StObject.set(x, "file_format", js.undefined)
      
      @scala.inline
      def setFile_type(value: String): Self = StObject.set(x, "file_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JobSchema extends StObject {
    
    var allow_failure: Boolean = js.native
    
    var artifacts: js.Array[ArtifactSchema] = js.native
    
    var artifacts_expire_at: js.UndefOr[Date] = js.native
    
    var commit: CommitSchema = js.native
    
    var coverage: js.UndefOr[String] = js.native
    
    var created_at: Date = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var finished_at: js.UndefOr[Date] = js.native
    
    var id: Double = js.native
    
    var name: String = js.native
    
    var pipeline: PipelineSchema = js.native
    
    var ref: String = js.native
    
    var runner: RunnerSchema = js.native
    
    var stage: String = js.native
    
    var started_at: js.UndefOr[Date] = js.native
    
    var status: String = js.native
    
    var tag: Boolean = js.native
    
    var user: UserSchema = js.native
    
    var web_url: String = js.native
  }
  object JobSchema {
    
    @scala.inline
    def apply(
      allow_failure: Boolean,
      artifacts: js.Array[ArtifactSchema],
      commit: CommitSchema,
      created_at: Date,
      id: Double,
      name: String,
      pipeline: PipelineSchema,
      ref: String,
      runner: RunnerSchema,
      stage: String,
      status: String,
      tag: Boolean,
      user: UserSchema,
      web_url: String
    ): JobSchema = {
      val __obj = js.Dynamic.literal(allow_failure = allow_failure.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pipeline = pipeline.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], web_url = web_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobSchema]
    }
    
    @scala.inline
    implicit class JobSchemaMutableBuilder[Self <: JobSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllow_failure(value: Boolean): Self = StObject.set(x, "allow_failure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtifacts(value: js.Array[ArtifactSchema]): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtifactsVarargs(value: ArtifactSchema*): Self = StObject.set(x, "artifacts", js.Array(value :_*))
      
      @scala.inline
      def setArtifacts_expire_at(value: Date): Self = StObject.set(x, "artifacts_expire_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtifacts_expire_atUndefined: Self = StObject.set(x, "artifacts_expire_at", js.undefined)
      
      @scala.inline
      def setCommit(value: CommitSchema): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverage(value: String): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverageUndefined: Self = StObject.set(x, "coverage", js.undefined)
      
      @scala.inline
      def setCreated_at(value: Date): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setFinished_at(value: Date): Self = StObject.set(x, "finished_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinished_atUndefined: Self = StObject.set(x, "finished_at", js.undefined)
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPipeline(value: PipelineSchema): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunner(value: RunnerSchema): Self = StObject.set(x, "runner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStarted_at(value: Date): Self = StObject.set(x, "started_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStarted_atUndefined: Self = StObject.set(x, "started_at", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: Boolean): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: UserSchema): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeb_url(value: String): Self = StObject.set(x, "web_url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.gitlab.gitlabStrings.created
    - typings.gitlab.gitlabStrings.pending
    - typings.gitlab.gitlabStrings.running
    - typings.gitlab.gitlabStrings.failed
    - typings.gitlab.gitlabStrings.success
    - typings.gitlab.gitlabStrings.canceled
    - typings.gitlab.gitlabStrings.skipped
    - typings.gitlab.gitlabStrings.manual
  */
  trait JobScope extends StObject
  object JobScope {
    
    @scala.inline
    def canceled: typings.gitlab.gitlabStrings.canceled = "canceled".asInstanceOf[typings.gitlab.gitlabStrings.canceled]
    
    @scala.inline
    def created: typings.gitlab.gitlabStrings.created = "created".asInstanceOf[typings.gitlab.gitlabStrings.created]
    
    @scala.inline
    def failed: typings.gitlab.gitlabStrings.failed = "failed".asInstanceOf[typings.gitlab.gitlabStrings.failed]
    
    @scala.inline
    def manual: typings.gitlab.gitlabStrings.manual = "manual".asInstanceOf[typings.gitlab.gitlabStrings.manual]
    
    @scala.inline
    def pending: typings.gitlab.gitlabStrings.pending = "pending".asInstanceOf[typings.gitlab.gitlabStrings.pending]
    
    @scala.inline
    def running: typings.gitlab.gitlabStrings.running = "running".asInstanceOf[typings.gitlab.gitlabStrings.running]
    
    @scala.inline
    def skipped: typings.gitlab.gitlabStrings.skipped = "skipped".asInstanceOf[typings.gitlab.gitlabStrings.skipped]
    
    @scala.inline
    def success: typings.gitlab.gitlabStrings.success = "success".asInstanceOf[typings.gitlab.gitlabStrings.success]
  }
}
