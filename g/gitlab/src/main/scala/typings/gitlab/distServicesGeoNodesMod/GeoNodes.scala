package typings.gitlab.distServicesGeoNodesMod

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.GeonodeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoNodes extends BaseService {
  def all(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(options: PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(geonodeId: GeonodeId): js.Promise[js.Object] = js.native
  def create(geonodeId: GeonodeId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(geonodeId: GeonodeId): js.Promise[js.Object] = js.native
  def edit(geonodeId: GeonodeId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def failures(): js.Promise[js.Object] = js.native
  def failures(options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def repair(geonodeId: GeonodeId): js.Promise[js.Object] = js.native
  def repair(geonodeId: GeonodeId, options: Sudo): js.Promise[js.Object] = js.native
  def show(geonodeId: GeonodeId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(geonodeId: GeonodeId, options: Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def status(geonodeId: GeonodeId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def status(geonodeId: GeonodeId, options: Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def statuses(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def statuses(options: PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

