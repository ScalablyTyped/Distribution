package typings.gitlab

import typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import typings.gitlab.distTypesCoreServicesDeploymentsMod.DeploymentSchema
import typings.gitlab.distTypesCoreServicesProjectsMod.ProjectSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesEnvironmentsMod {
  
  @JSImport("gitlab/dist/types/core/services/Environments", "Environments")
  @js.native
  open class Environments () extends BaseService {
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
    
    inline def apply(id: Double, name: String): EnvironmentDetailSchema = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentDetailSchema]
    }
    
    extension [Self <: EnvironmentDetailSchema](x: Self) {
      
      inline def setDeployable(value: DeploymentSchema): Self = StObject.set(x, "deployable", value.asInstanceOf[js.Any])
      
      inline def setDeployableUndefined: Self = StObject.set(x, "deployable", js.undefined)
      
      inline def setLast_deployment(value: DeploymentSchema): Self = StObject.set(x, "last_deployment", value.asInstanceOf[js.Any])
      
      inline def setLast_deploymentUndefined: Self = StObject.set(x, "last_deployment", js.undefined)
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
    
    inline def apply(id: Double, name: String): EnvironmentSchema = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentSchema]
    }
    
    extension [Self <: EnvironmentSchema](x: Self) {
      
      inline def setExternal_url(value: String): Self = StObject.set(x, "external_url", value.asInstanceOf[js.Any])
      
      inline def setExternal_urlUndefined: Self = StObject.set(x, "external_url", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProject(value: ProjectSchema): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      inline def setSlugUndefined: Self = StObject.set(x, "slug", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
