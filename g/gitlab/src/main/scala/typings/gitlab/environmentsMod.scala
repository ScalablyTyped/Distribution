package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.deploymentsMod.DeploymentSchema
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.projectsMod.ProjectSchema
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import typings.gitlab.requestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object environmentsMod {
  
  @JSImport("gitlab/dist/types/core/services/Environments", "Environments")
  @js.native
  class Environments () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(projectId: String): js.Promise[js.Array[EnvironmentSchema]] = js.native
    def all(projectId: String, options: PaginatedRequestOptions): js.Promise[js.Array[EnvironmentSchema]] = js.native
    def all(projectId: Double): js.Promise[js.Array[EnvironmentSchema]] = js.native
    def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[js.Array[EnvironmentSchema]] = js.native
    
    def create(projectId: String): js.Promise[js.Object] = js.native
    def create(projectId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(projectId: Double): js.Promise[js.Object] = js.native
    def create(projectId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def edit(projectId: String, environmentId: Double): js.Promise[js.Object] = js.native
    def edit(projectId: String, environmentId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: Double, environmentId: Double): js.Promise[js.Object] = js.native
    def edit(projectId: Double, environmentId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(projectId: String, environmentId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: String, environmentId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, environmentId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: Double, environmentId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(projectId: String, environmentId: Double): js.Promise[EnvironmentDetailSchema] = js.native
    def show(projectId: String, environmentId: Double, options: Sudo): js.Promise[EnvironmentDetailSchema] = js.native
    def show(projectId: Double, environmentId: Double): js.Promise[EnvironmentDetailSchema] = js.native
    def show(projectId: Double, environmentId: Double, options: Sudo): js.Promise[EnvironmentDetailSchema] = js.native
    
    def stop(projectId: String, environmentId: Double): js.Promise[js.Object] = js.native
    def stop(projectId: String, environmentId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def stop(projectId: Double, environmentId: Double): js.Promise[js.Object] = js.native
    def stop(projectId: Double, environmentId: Double, options: Sudo): js.Promise[js.Object] = js.native
  }
  
  trait EnvironmentDetailSchema
    extends StObject
       with EnvironmentSchema {
    
    var deployable: js.UndefOr[DeploymentSchema] = js.undefined
    
    var last_deployment: js.UndefOr[DeploymentSchema] = js.undefined
  }
  object EnvironmentDetailSchema {
    
    @scala.inline
    def apply(id: Double, name: String): EnvironmentDetailSchema = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentDetailSchema]
    }
    
    @scala.inline
    implicit class EnvironmentDetailSchemaMutableBuilder[Self <: EnvironmentDetailSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeployable(value: DeploymentSchema): Self = StObject.set(x, "deployable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeployableUndefined: Self = StObject.set(x, "deployable", js.undefined)
      
      @scala.inline
      def setLast_deployment(value: DeploymentSchema): Self = StObject.set(x, "last_deployment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_deploymentUndefined: Self = StObject.set(x, "last_deployment", js.undefined)
    }
  }
  
  trait EnvironmentSchema extends StObject {
    
    var external_url: js.UndefOr[String] = js.undefined
    
    var id: Double
    
    var name: String
    
    var project: js.UndefOr[ProjectSchema] = js.undefined
    
    var slug: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
  }
  object EnvironmentSchema {
    
    @scala.inline
    def apply(id: Double, name: String): EnvironmentSchema = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentSchema]
    }
    
    @scala.inline
    implicit class EnvironmentSchemaMutableBuilder[Self <: EnvironmentSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExternal_url(value: String): Self = StObject.set(x, "external_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_urlUndefined: Self = StObject.set(x, "external_url", js.undefined)
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProject(value: ProjectSchema): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      @scala.inline
      def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlugUndefined: Self = StObject.set(x, "slug", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
