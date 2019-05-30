package typings
package gitlabLib.distTemplatesResourceBadgesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceBadges
  extends gitlabLib.distInfrastructureMod.BaseService {
  def add(resourceId: gitlabLib.ResourceId): js.Promise[js.Object] = js.native
  def add(resourceId: gitlabLib.ResourceId, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def all(resourceId: gitlabLib.ResourceId): js.Promise[gitlabLib.GetResponse] = js.native
  def all(resourceId: gitlabLib.ResourceId, options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def edit(resourceId: gitlabLib.ResourceId, badgeId: gitlabLib.BadgeId): js.Promise[js.Object] = js.native
  def edit(
    resourceId: gitlabLib.ResourceId,
    badgeId: gitlabLib.BadgeId,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def preview(resourceId: gitlabLib.ResourceId, linkUrl: java.lang.String, imageUrl: java.lang.String): js.Promise[gitlabLib.GetResponse] = js.native
  def preview(
    resourceId: gitlabLib.ResourceId,
    linkUrl: java.lang.String,
    imageUrl: java.lang.String,
    options: gitlabLib.Sudo
  ): js.Promise[gitlabLib.GetResponse] = js.native
  def remove(resourceId: gitlabLib.ResourceId, badgeId: gitlabLib.BadgeId): js.Promise[js.Object] = js.native
  def remove(resourceId: gitlabLib.ResourceId, badgeId: gitlabLib.BadgeId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def show(resourceId: gitlabLib.ResourceId, badgeId: gitlabLib.BadgeId): js.Promise[gitlabLib.GetResponse] = js.native
  def show(resourceId: gitlabLib.ResourceId, badgeId: gitlabLib.BadgeId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
}

