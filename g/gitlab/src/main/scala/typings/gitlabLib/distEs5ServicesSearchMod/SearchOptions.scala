package typings
package gitlabLib.distEs5ServicesSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions extends js.Object {
  var groupId: java.lang.String | scala.Double
  var projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any
}

object SearchOptions {
  @scala.inline
  def apply(
    groupId: java.lang.String | scala.Double,
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any
  ): SearchOptions = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any], projectId = projectId)
  
    __obj.asInstanceOf[SearchOptions]
  }
}

