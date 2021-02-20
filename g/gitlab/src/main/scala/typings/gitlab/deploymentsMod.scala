package typings.gitlab

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

object deploymentsMod {
  
  @JSImport("gitlab/dist/types/core/services/Deployments", "Deployments")
  @js.native
  class Deployments () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(projectId: String): js.Promise[GetResponse] = js.native
    def all(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def mergeRequests(projectId: String, deploymentId: Double): js.Promise[GetResponse] = js.native
    def mergeRequests(projectId: String, deploymentId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def mergeRequests(projectId: Double, deploymentId: Double): js.Promise[GetResponse] = js.native
    def mergeRequests(projectId: Double, deploymentId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def show(projectId: String, deploymentId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: String, deploymentId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, deploymentId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: Double, deploymentId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  trait Deployable extends StObject {
    
    var commit: js.UndefOr[CommitSchema] = js.native
    
    var coverage: js.UndefOr[String] = js.native
    
    var created_at: js.UndefOr[Date] = js.native
    
    var finished_at: js.UndefOr[Date] = js.native
    
    var id: Double = js.native
    
    var name: String = js.native
    
    var pipeline: js.UndefOr[PipelineSchema] = js.native
    
    var ref: String = js.native
    
    var runner: js.UndefOr[RunnerSchema] = js.native
    
    var stage: js.UndefOr[String] = js.native
    
    var started_at: js.UndefOr[Date] = js.native
    
    var status: js.UndefOr[DeploymentStatus] = js.native
    
    var tag: Boolean = js.native
    
    var user: js.UndefOr[UserSchema] = js.native
  }
  object Deployable {
    
    @scala.inline
    def apply(id: Double, name: String, ref: String, tag: Boolean): Deployable = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Deployable]
    }
    
    @scala.inline
    implicit class DeployableMutableBuilder[Self <: Deployable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommit(value: CommitSchema): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
      
      @scala.inline
      def setCoverage(value: String): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverageUndefined: Self = StObject.set(x, "coverage", js.undefined)
      
      @scala.inline
      def setCreated_at(value: Date): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
      
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
      def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
      
      @scala.inline
      def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunner(value: RunnerSchema): Self = StObject.set(x, "runner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunnerUndefined: Self = StObject.set(x, "runner", js.undefined)
      
      @scala.inline
      def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
      
      @scala.inline
      def setStarted_at(value: Date): Self = StObject.set(x, "started_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStarted_atUndefined: Self = StObject.set(x, "started_at", js.undefined)
      
      @scala.inline
      def setStatus(value: DeploymentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTag(value: Boolean): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: UserSchema): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  @js.native
  trait DeploymentSchema extends StObject {
    
    var id: Double = js.native
    
    var iid: Double = js.native
    
    var ref: String = js.native
    
    var sha: String = js.native
    
    var user: UserSchema = js.native
  }
  object DeploymentSchema {
    
    @scala.inline
    def apply(id: Double, iid: Double, ref: String, sha: String, user: UserSchema): DeploymentSchema = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], iid = iid.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeploymentSchema]
    }
    
    @scala.inline
    implicit class DeploymentSchemaMutableBuilder[Self <: DeploymentSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIid(value: Double): Self = StObject.set(x, "iid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: UserSchema): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.gitlab.gitlabStrings.created
    - typings.gitlab.gitlabStrings.running
    - typings.gitlab.gitlabStrings.success
    - typings.gitlab.gitlabStrings.failed
    - typings.gitlab.gitlabStrings.canceled
  */
  trait DeploymentStatus extends StObject
  object DeploymentStatus {
    
    @scala.inline
    def canceled: typings.gitlab.gitlabStrings.canceled = "canceled".asInstanceOf[typings.gitlab.gitlabStrings.canceled]
    
    @scala.inline
    def created: typings.gitlab.gitlabStrings.created = "created".asInstanceOf[typings.gitlab.gitlabStrings.created]
    
    @scala.inline
    def failed: typings.gitlab.gitlabStrings.failed = "failed".asInstanceOf[typings.gitlab.gitlabStrings.failed]
    
    @scala.inline
    def running: typings.gitlab.gitlabStrings.running = "running".asInstanceOf[typings.gitlab.gitlabStrings.running]
    
    @scala.inline
    def success: typings.gitlab.gitlabStrings.success = "success".asInstanceOf[typings.gitlab.gitlabStrings.success]
  }
}
