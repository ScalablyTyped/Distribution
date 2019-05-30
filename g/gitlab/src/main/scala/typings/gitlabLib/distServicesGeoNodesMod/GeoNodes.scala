package typings
package gitlabLib.distServicesGeoNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoNodes
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(): js.Promise[gitlabLib.GetResponse] = js.native
  def all(options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def create(geonodeId: gitlabLib.GeonodeId): js.Promise[js.Object] = js.native
  def create(geonodeId: gitlabLib.GeonodeId, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(geonodeId: gitlabLib.GeonodeId): js.Promise[js.Object] = js.native
  def edit(geonodeId: gitlabLib.GeonodeId, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def failures(): js.Promise[js.Object] = js.native
  def failures(options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def repair(geonodeId: gitlabLib.GeonodeId): js.Promise[js.Object] = js.native
  def repair(geonodeId: gitlabLib.GeonodeId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def show(geonodeId: gitlabLib.GeonodeId): js.Promise[gitlabLib.GetResponse] = js.native
  def show(geonodeId: gitlabLib.GeonodeId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def status(geonodeId: gitlabLib.GeonodeId): js.Promise[gitlabLib.GetResponse] = js.native
  def status(geonodeId: gitlabLib.GeonodeId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def statuses(): js.Promise[gitlabLib.GetResponse] = js.native
  def statuses(options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
}

