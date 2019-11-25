package typings.forgeDashDi.distInspectorsRegexInspectorMod

import typings.forgeDashDi.distFrameworkConstructorMod.Constructor
import typings.forgeDashDi.distFrameworkDependencyMod.Dependency
import typings.forgeDashDi.distInspectorsInspectorMod.Inspector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegexInspector extends Inspector {
  var getParameterNames: js.Any
}

object RegexInspector {
  @scala.inline
  def apply(
    findConstructor: Constructor => Constructor,
    getDependencies: js.Function => js.Array[Dependency],
    getParameterNames: js.Any
  ): RegexInspector = {
    val __obj = js.Dynamic.literal(findConstructor = js.Any.fromFunction1(findConstructor), getDependencies = js.Any.fromFunction1(getDependencies), getParameterNames = getParameterNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RegexInspector]
  }
}

