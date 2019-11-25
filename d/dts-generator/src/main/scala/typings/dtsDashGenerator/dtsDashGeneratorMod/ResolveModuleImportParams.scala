package typings.dtsDashGenerator.dtsDashGeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveModuleImportParams extends js.Object {
  /** The identifier of the enclosing module currently being declared in the generated d.ts */
  var currentModuleId: String
  /** The identifier of the module currently being imported in the generated d.ts */
  var importedModuleId: String
  /** True if the imported module id is declared as a module in the input files. */
  var isDeclaredExternalModule: Boolean
}

object ResolveModuleImportParams {
  @scala.inline
  def apply(currentModuleId: String, importedModuleId: String, isDeclaredExternalModule: Boolean): ResolveModuleImportParams = {
    val __obj = js.Dynamic.literal(currentModuleId = currentModuleId.asInstanceOf[js.Any], importedModuleId = importedModuleId.asInstanceOf[js.Any], isDeclaredExternalModule = isDeclaredExternalModule.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResolveModuleImportParams]
  }
}

