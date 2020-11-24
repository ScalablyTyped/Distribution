package typings.glaze.ruleManagerMod

import typings.glaze.styleInjectorMod.StyleInjector
import typings.std.Map
import typings.treat.typesMod.ClassRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("glaze/dist-types/RuleManager", "OptimizedRuleManager")
@js.native
class OptimizedRuleManager protected () extends RuleManager {
  def this(injector: StyleInjector, initialRuleIndexesByClassName: Map[ClassRef, Double]) = this()
  
  var injector: js.Any = js.native
  
  var ruleIndexesByClassName: js.Any = js.native
  
  var usageCountsByClassName: js.Any = js.native
}
