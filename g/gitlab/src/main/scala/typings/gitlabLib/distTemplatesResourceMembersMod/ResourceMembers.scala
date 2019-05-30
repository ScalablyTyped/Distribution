package typings
package gitlabLib.distTemplatesResourceMembersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceMembers
  extends gitlabLib.distInfrastructureMod.BaseService {
  def add(resourceId: gitlabLib.ResourceId, userId: gitlabLib.UserId, accessLevel: gitlabLib.AccessLevel): js.Promise[js.Object] = js.native
  def add(
    resourceId: gitlabLib.ResourceId,
    userId: gitlabLib.UserId,
    accessLevel: gitlabLib.AccessLevel,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def all(resourceId: gitlabLib.ResourceId): js.Promise[gitlabLib.GetResponse] = js.native
  def all(resourceId: gitlabLib.ResourceId, includeInherited: scala.Boolean): js.Promise[gitlabLib.GetResponse] = js.native
  def all(
    resourceId: gitlabLib.ResourceId,
    includeInherited: scala.Boolean,
    options: gitlabLib.PaginatedRequestOptions
  ): js.Promise[gitlabLib.GetResponse] = js.native
  def edit(resourceId: gitlabLib.ResourceId, userId: gitlabLib.UserId, accessLevel: gitlabLib.AccessLevel): js.Promise[js.Object] = js.native
  def edit(
    resourceId: gitlabLib.ResourceId,
    userId: gitlabLib.UserId,
    accessLevel: gitlabLib.AccessLevel,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def remove(resourceId: gitlabLib.ResourceId, userId: gitlabLib.UserId): js.Promise[js.Object] = js.native
  def remove(resourceId: gitlabLib.ResourceId, userId: gitlabLib.UserId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def show(resourceId: gitlabLib.ResourceId, userId: gitlabLib.UserId): js.Promise[gitlabLib.GetResponse] = js.native
  def show(resourceId: gitlabLib.ResourceId, userId: gitlabLib.UserId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
}

