package typings
package gitlabLib.distLatestServicesGeoNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoNodes
  extends gitlabLib.distLatestInfrastructureMod.BaseService {
  def all(options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def create(geonodeId: GeonodeId, options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def edit(geonodeId: GeonodeId, options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def failures(options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def repair(geonodeId: GeonodeId, options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def show(geonodeId: GeonodeId, options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def status(geonodeId: GeonodeId, options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def statuses(options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
}

