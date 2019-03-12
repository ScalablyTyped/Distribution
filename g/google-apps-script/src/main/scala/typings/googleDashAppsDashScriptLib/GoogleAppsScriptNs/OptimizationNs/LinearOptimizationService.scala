package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.OptimizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearOptimizationService extends js.Object {
  var Status: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Status */ js.Any
  var VariableType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VariableType */ js.Any
  def createEngine(): LinearOptimizationEngine
}

object LinearOptimizationService {
  @scala.inline
  def apply(
    Status: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Status */ js.Any,
    VariableType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VariableType */ js.Any,
    createEngine: () => LinearOptimizationEngine
  ): LinearOptimizationService = {
    val __obj = js.Dynamic.literal(Status = Status, VariableType = VariableType, createEngine = js.Any.fromFunction0(createEngine))
  
    __obj.asInstanceOf[LinearOptimizationService]
  }
}

