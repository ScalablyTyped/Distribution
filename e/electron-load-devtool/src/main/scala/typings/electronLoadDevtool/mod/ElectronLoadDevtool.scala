package typings.electronLoadDevtool.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElectronLoadDevtool extends js.Object {
  var ANGULARJS_BATARANG: String = js.native
  var BACKBONE_DEBUGGER: String = js.native
  var EMBER_INSPECTOR: String = js.native
  var JQUERY_DEBUGGER: String = js.native
  var REACT_DEVELOPER_TOOLS: String = js.native
  var REDUX_DEVTOOLS: String = js.native
  var VUEJS_DEVTOOLS: String = js.native
  var VUEJS_DEVTOOLS_BETA: String = js.native
  def apply(devtoolId: String): Unit = js.native
  def apply(devtoolId: String, options: ElectronLoadDevtoolOptions): Unit = js.native
}

