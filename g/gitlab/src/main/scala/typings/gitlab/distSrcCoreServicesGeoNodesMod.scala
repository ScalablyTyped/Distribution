package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesGeoNodesMod.GeoNodes
import typings.gitlab.distSrcCoreServicesMod.GeonodeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/GeoNodes", JSImport.Namespace)
@js.native
object distSrcCoreServicesGeoNodesMod extends js.Object {
  @js.native
  trait GeoNodes extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(geonodeId: GeonodeId): js.Promise[js.Object] = js.native
    def create(geonodeId: GeonodeId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(geonodeId: GeonodeId): js.Promise[js.Object] = js.native
    def edit(geonodeId: GeonodeId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def failures(): js.Promise[js.Object] = js.native
    def failures(options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def repair(geonodeId: GeonodeId): js.Promise[js.Object] = js.native
    def repair(geonodeId: GeonodeId, options: Sudo): js.Promise[js.Object] = js.native
    def show(geonodeId: GeonodeId): js.Promise[GetResponse] = js.native
    def show(geonodeId: GeonodeId, options: Sudo): js.Promise[GetResponse] = js.native
    def status(geonodeId: GeonodeId): js.Promise[GetResponse] = js.native
    def status(geonodeId: GeonodeId, options: Sudo): js.Promise[GetResponse] = js.native
    def statuses(): js.Promise[GetResponse] = js.native
    def statuses(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends GeoNodes
  
}

