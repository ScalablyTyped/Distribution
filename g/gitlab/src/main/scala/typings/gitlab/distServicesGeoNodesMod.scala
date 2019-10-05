package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesGeoNodesMod.GeoNodes
import typings.gitlab.distServicesMod.GeonodeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/GeoNodes", JSImport.Namespace)
@js.native
object distServicesGeoNodesMod extends js.Object {
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

