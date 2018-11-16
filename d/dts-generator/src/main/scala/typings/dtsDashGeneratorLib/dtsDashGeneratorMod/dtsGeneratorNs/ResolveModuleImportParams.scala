package typings
package dtsDashGeneratorLib.dtsDashGeneratorMod.dtsGeneratorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ResolveModuleImportParams extends js.Object {
  /** The identifier of the enclosing module currently being declared in the generated d.ts */
  var currentModuleId: java.lang.String
  /** The identifier of the module currently being imported in the generated d.ts */
  var importedModuleId: java.lang.String
  /** True if the imported module id is declared as a module in the input files. */
  var isDeclaredExternalModule: scala.Boolean
}

