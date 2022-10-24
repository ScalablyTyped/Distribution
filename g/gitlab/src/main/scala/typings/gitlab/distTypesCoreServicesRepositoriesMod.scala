package typings.gitlab

import typings.gitlab.anon.shastringSudo
import typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesRepositoriesMod {
  
  @JSImport("gitlab/dist/types/core/services/Repositories", "Repositories")
  @js.native
  open class Repositories () extends BaseService {
    def this(param0: BaseServiceOptions) = this()
    
    def compare(projectId: String, from: String, to: String): js.Promise[GetResponse] = js.native
    def compare(projectId: String, from: String, to: String, options: Sudo): js.Promise[GetResponse] = js.native
    def compare(projectId: Double, from: String, to: String): js.Promise[GetResponse] = js.native
    def compare(projectId: Double, from: String, to: String, options: Sudo): js.Promise[GetResponse] = js.native
    
    def contributors(projectId: String): js.Promise[GetResponse] = js.native
    def contributors(projectId: String, options: Sudo): js.Promise[GetResponse] = js.native
    def contributors(projectId: Double): js.Promise[GetResponse] = js.native
    def contributors(projectId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def mergeBase(projectId: String, refs: js.Array[String]): js.Promise[GetResponse] = js.native
    def mergeBase(projectId: String, refs: js.Array[String], options: Sudo): js.Promise[GetResponse] = js.native
    def mergeBase(projectId: Double, refs: js.Array[String]): js.Promise[GetResponse] = js.native
    def mergeBase(projectId: Double, refs: js.Array[String], options: Sudo): js.Promise[GetResponse] = js.native
    
    def showArchive(projectId: String): js.Promise[GetResponse] = js.native
    def showArchive(projectId: String, options: shastringSudo): js.Promise[GetResponse] = js.native
    def showArchive(projectId: Double): js.Promise[GetResponse] = js.native
    def showArchive(projectId: Double, options: shastringSudo): js.Promise[GetResponse] = js.native
    
    def showBlob(projectId: String, sha: String): js.Promise[GetResponse] = js.native
    def showBlob(projectId: String, sha: String, options: Sudo): js.Promise[GetResponse] = js.native
    def showBlob(projectId: Double, sha: String): js.Promise[GetResponse] = js.native
    def showBlob(projectId: Double, sha: String, options: Sudo): js.Promise[GetResponse] = js.native
    
    def showBlobRaw(projectId: String, sha: String): js.Promise[GetResponse] = js.native
    def showBlobRaw(projectId: String, sha: String, options: Sudo): js.Promise[GetResponse] = js.native
    def showBlobRaw(projectId: Double, sha: String): js.Promise[GetResponse] = js.native
    def showBlobRaw(projectId: Double, sha: String, options: Sudo): js.Promise[GetResponse] = js.native
    
    def tree(projectId: String): js.Promise[GetResponse] = js.native
    def tree(projectId: String, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
    def tree(projectId: Double): js.Promise[GetResponse] = js.native
    def tree(projectId: Double, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
}
