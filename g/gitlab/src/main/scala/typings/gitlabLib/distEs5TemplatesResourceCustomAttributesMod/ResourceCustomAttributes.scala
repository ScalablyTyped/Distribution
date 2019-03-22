package typings
package gitlabLib.distEs5TemplatesResourceCustomAttributesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceCustomAttributes
  extends gitlabLib.distEs5InfrastructureMod.BaseService {
  def all(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any
  ): js.Promise[_] = js.native
  def remove(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    customAttributeId: CustomAttributeId
  ): js.Promise[_] = js.native
  def set(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    customAttributeId: CustomAttributeId,
    value: java.lang.String
  ): js.Promise[_] = js.native
  def show(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    customAttributeId: CustomAttributeId
  ): js.Promise[_] = js.native
}

