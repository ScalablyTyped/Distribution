package typings.forgeDashDi.distInspectorsRegexInspectorMod

import typings.forgeDashDi.distFrameworkConstructorMod.Constructor
import typings.forgeDashDi.distFrameworkDependencyMod.Dependency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di/dist/inspectors/RegexInspector", JSImport.Default)
@js.native
class default () extends RegexInspector {
  /* CompleteClass */
  override var getParameterNames: js.Any = js.native
  /* CompleteClass */
  override def findConstructor(func: Constructor): Constructor = js.native
  /* CompleteClass */
  override def getDependencies(func: js.Function): js.Array[Dependency] = js.native
}

