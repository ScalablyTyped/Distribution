package typings.atEmberController.atEmberControllerMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.atEmberController.Anon_As
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionHandler * / any */ trait ControllerMixin extends js.Object {
  var model: js.Any
  var queryParams: String | (js.Array[String | StringDictionary[Anon_As]])
  var target: js.Object
  def replaceRoute(name: String, args: js.Any*): Unit
  def transitionToRoute(name: String, args: js.Any*): Unit
}

@JSImport("@ember/controller", "ControllerMixin")
@js.native
object ControllerMixin
  extends TopLevel[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mixin<ControllerMixin> */ js.Any
    ]

