package typings
package gitlabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProjectIdAny extends js.Object {
  var projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any
  ] = js.undefined
}

object Anon_ProjectIdAny {
  @scala.inline
  def apply(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any = null
  ): Anon_ProjectIdAny = {
    val __obj = js.Dynamic.literal()
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    __obj.asInstanceOf[Anon_ProjectIdAny]
  }
}

