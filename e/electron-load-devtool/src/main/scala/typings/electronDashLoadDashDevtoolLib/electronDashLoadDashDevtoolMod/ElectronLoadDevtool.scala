package typings
package electronDashLoadDashDevtoolLib.electronDashLoadDashDevtoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElectronLoadDevtool extends js.Object {
  var ANGULARJS_BATARANG: java.lang.String = js.native
  var BACKBONE_DEBUGGER: java.lang.String = js.native
  var EMBER_INSPECTOR: java.lang.String = js.native
  var JQUERY_DEBUGGER: java.lang.String = js.native
  var REACT_DEVELOPER_TOOLS: java.lang.String = js.native
  var REDUX_DEVTOOLS: java.lang.String = js.native
  var VUEJS_DEVTOOLS: java.lang.String = js.native
  def apply(devtoolId: java.lang.String): scala.Unit = js.native
  def apply(devtoolId: java.lang.String, options: ElectronLoadDevtoolOptions): scala.Unit = js.native
}

