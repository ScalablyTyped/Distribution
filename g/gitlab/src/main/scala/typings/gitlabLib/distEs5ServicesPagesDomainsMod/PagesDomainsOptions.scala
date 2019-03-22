package typings
package gitlabLib.distEs5ServicesPagesDomainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagesDomainsOptions extends js.Object {
  var projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any
  ] = js.undefined
}

object PagesDomainsOptions {
  @scala.inline
  def apply(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any = null
  ): PagesDomainsOptions = {
    val __obj = js.Dynamic.literal()
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    __obj.asInstanceOf[PagesDomainsOptions]
  }
}

