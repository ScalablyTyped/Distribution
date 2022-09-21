package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import typings.gitlab.requestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceCustomAttributesMod {
  
  @JSImport("gitlab/dist/types/core/templates/ResourceCustomAttributes", "ResourceCustomAttributes")
  @js.native
  open class ResourceCustomAttributes protected () extends BaseService {
    def this(resourceType: String, options: BaseServiceOptions) = this()
    
    def all(resourceId: String): js.Promise[GetResponse] = js.native
    def all(resourceId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(resourceId: Double): js.Promise[GetResponse] = js.native
    def all(resourceId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def remove(resourceId: String, customAttributeId: Double): js.Promise[js.Object] = js.native
    def remove(resourceId: String, customAttributeId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(resourceId: Double, customAttributeId: Double): js.Promise[js.Object] = js.native
    def remove(resourceId: Double, customAttributeId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def set(resourceId: String, customAttributeId: Double, value: String): js.Promise[js.Object] = js.native
    def set(resourceId: String, customAttributeId: Double, value: String, options: Sudo): js.Promise[js.Object] = js.native
    def set(resourceId: Double, customAttributeId: Double, value: String): js.Promise[js.Object] = js.native
    def set(resourceId: Double, customAttributeId: Double, value: String, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(resourceId: String, customAttributeId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: String, customAttributeId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, customAttributeId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, customAttributeId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
}
