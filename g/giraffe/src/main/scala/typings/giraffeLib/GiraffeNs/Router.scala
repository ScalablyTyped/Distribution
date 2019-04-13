package typings
package giraffeLib.GiraffeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- giraffeLib.GiraffeNs.GiraffeObject because var conflicts: initialize. Inlined app, appEvents, dataEvents, defaultOptions, beforeInitialize, afterInitialize, dispose, beforeDispose, afterDispose */ @JSGlobal("Giraffe.Router")
@js.native
class Router ()
  extends backboneLib.backboneMod.Router {
  var afterDispose: js.UndefOr[js.Function0[js.Any]] = js.native
  var afterInitialize: js.UndefOr[js.Function0[js.Any]] = js.native
  var app: App = js.native
  var appEvents: js.UndefOr[StringMap] = js.native
  var beforeDispose: js.UndefOr[js.Function0[js.Any]] = js.native
  var beforeInitialize: js.UndefOr[js.Function0[js.Any]] = js.native
  var dataEvents: js.UndefOr[StringMap] = js.native
  var defaultOptions: js.UndefOr[DefaultOptions] = js.native
  var dispose: js.UndefOr[js.Function0[js.Any]] = js.native
  var namespace: java.lang.String = js.native
  var triggers: StringMap = js.native
  def cause(appEvent: java.lang.String, args: js.Any*): js.Any = js.native
  def getRoute(appEvent: java.lang.String, args: js.Any*): java.lang.String = js.native
  def isCaused(appEvent: java.lang.String, args: js.Any*): scala.Boolean = js.native
  def reload(url: java.lang.String): js.Any = js.native
}

