package typings
package gitlabLib.distLatestServicesRunnersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunnersOptions extends js.Object {
  var projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any
  ] = js.undefined
}

object RunnersOptions {
  @scala.inline
  def apply(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any = null
  ): RunnersOptions = {
    val __obj = js.Dynamic.literal()
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    __obj.asInstanceOf[RunnersOptions]
  }
}

