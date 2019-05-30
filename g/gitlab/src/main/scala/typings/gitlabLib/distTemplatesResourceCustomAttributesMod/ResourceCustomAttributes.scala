package typings
package gitlabLib.distTemplatesResourceCustomAttributesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceCustomAttributes
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(resourceId: gitlabLib.ResourceId): js.Promise[gitlabLib.GetResponse] = js.native
  def all(resourceId: gitlabLib.ResourceId, options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def remove(resourceId: gitlabLib.ResourceId, customAttributeId: gitlabLib.CustomAttributeId): js.Promise[js.Object] = js.native
  def remove(
    resourceId: gitlabLib.ResourceId,
    customAttributeId: gitlabLib.CustomAttributeId,
    options: gitlabLib.Sudo
  ): js.Promise[js.Object] = js.native
  def set(
    resourceId: gitlabLib.ResourceId,
    customAttributeId: gitlabLib.CustomAttributeId,
    value: java.lang.String
  ): js.Promise[js.Object] = js.native
  def set(
    resourceId: gitlabLib.ResourceId,
    customAttributeId: gitlabLib.CustomAttributeId,
    value: java.lang.String,
    options: gitlabLib.Sudo
  ): js.Promise[js.Object] = js.native
  def show(resourceId: gitlabLib.ResourceId, customAttributeId: gitlabLib.CustomAttributeId): js.Promise[gitlabLib.GetResponse] = js.native
  def show(
    resourceId: gitlabLib.ResourceId,
    customAttributeId: gitlabLib.CustomAttributeId,
    options: gitlabLib.Sudo
  ): js.Promise[gitlabLib.GetResponse] = js.native
}

