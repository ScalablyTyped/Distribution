package typings
package dtsDashGeneratorLib.dtsDashGeneratorMod.dtsGeneratorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveModuleIdParams extends js.Object {
  /** The identifier of the module being declared in the generated d.ts */
  var currentModuleId: java.lang.String
}

object ResolveModuleIdParams {
  @scala.inline
  def apply(currentModuleId: java.lang.String): ResolveModuleIdParams = {
    val __obj = js.Dynamic.literal(currentModuleId = currentModuleId)
  
    __obj.asInstanceOf[ResolveModuleIdParams]
  }
}

