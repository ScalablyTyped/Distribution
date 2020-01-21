package typings.dtsGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveModuleIdParams extends js.Object {
  /** The identifier of the module being declared in the generated d.ts */
  var currentModuleId: String
}

object ResolveModuleIdParams {
  @scala.inline
  def apply(currentModuleId: String): ResolveModuleIdParams = {
    val __obj = js.Dynamic.literal(currentModuleId = currentModuleId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResolveModuleIdParams]
  }
}

