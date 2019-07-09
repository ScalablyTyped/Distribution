package typings
package gitlabLib.distServicesGeoNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoNodes
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(geonodeId: gitlabLib.distServicesMod.GeonodeId): js.Promise[js.Object] = js.native
  def create(
    geonodeId: gitlabLib.distServicesMod.GeonodeId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def edit(geonodeId: gitlabLib.distServicesMod.GeonodeId): js.Promise[js.Object] = js.native
  def edit(
    geonodeId: gitlabLib.distServicesMod.GeonodeId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def failures(): js.Promise[js.Object] = js.native
  def failures(options: gitlabLib.distInfrastructureMod.BaseRequestOptions): js.Promise[js.Object] = js.native
  def repair(geonodeId: gitlabLib.distServicesMod.GeonodeId): js.Promise[js.Object] = js.native
  def repair(geonodeId: gitlabLib.distServicesMod.GeonodeId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[js.Object] = js.native
  def show(geonodeId: gitlabLib.distServicesMod.GeonodeId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(geonodeId: gitlabLib.distServicesMod.GeonodeId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def status(geonodeId: gitlabLib.distServicesMod.GeonodeId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def status(geonodeId: gitlabLib.distServicesMod.GeonodeId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def statuses(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def statuses(options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

