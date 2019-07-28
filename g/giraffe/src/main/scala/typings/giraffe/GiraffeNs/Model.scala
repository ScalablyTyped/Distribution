package typings.giraffe.GiraffeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.giraffe.GiraffeNs.GiraffeObject because var conflicts: initialize. Inlined app, appEvents, dataEvents, defaultOptions, beforeInitialize, afterInitialize, dispose, beforeDispose, afterDispose */ @JSGlobal("Giraffe.Model")
@js.native
class Model ()
  extends typings.backbone.backboneMod.Model {
  var afterDispose: js.UndefOr[js.Function0[js.Any]] = js.native
  var afterInitialize: js.UndefOr[js.Function0[js.Any]] = js.native
  var app: App = js.native
  var appEvents: js.UndefOr[StringMap] = js.native
  var beforeDispose: js.UndefOr[js.Function0[js.Any]] = js.native
  var beforeInitialize: js.UndefOr[js.Function0[js.Any]] = js.native
  var dataEvents: js.UndefOr[StringMap] = js.native
  var defaultOptions: js.UndefOr[DefaultOptions] = js.native
  var dispose: js.UndefOr[js.Function0[js.Any]] = js.native
}

