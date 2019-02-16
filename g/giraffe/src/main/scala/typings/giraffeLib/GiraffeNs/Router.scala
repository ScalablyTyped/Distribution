package typings
package giraffeLib.GiraffeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Giraffe.Router")
@js.native
class Router ()
  extends backboneLib.backboneMod.Router
     with GiraffeObject {
  /* CompleteClass */
  override var app: App = js.native
  var namespace: java.lang.String = js.native
  var triggers: StringMap = js.native
  def cause(appEvent: java.lang.String, args: js.Any*): js.Any = js.native
  def getRoute(appEvent: java.lang.String, args: js.Any*): java.lang.String = js.native
  def isCaused(appEvent: java.lang.String, args: js.Any*): scala.Boolean = js.native
  def reload(url: java.lang.String): js.Any = js.native
}

