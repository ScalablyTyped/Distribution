package typings.electronDashDevtoolsDashInstaller.electronDashDevtoolsDashInstallerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-devtools-installer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ANGULARJS_BATARANG: ExtensionReference = js.native
  val APOLLO_DEVELOPER_TOOLS: ExtensionReference = js.native
  val BACKBONE_DEBUGGER: ExtensionReference = js.native
  val CYCLEJS_DEVTOOL: ExtensionReference = js.native
  val EMBER_INSPECTOR: ExtensionReference = js.native
  val JQUERY_DEBUGGER: ExtensionReference = js.native
  val MOBX_DEVTOOLS: ExtensionReference = js.native
  val REACT_DEVELOPER_TOOLS: ExtensionReference = js.native
  val REACT_PERF: ExtensionReference = js.native
  val REDUX_DEVTOOLS: ExtensionReference = js.native
  val VUEJS_DEVTOOLS: ExtensionReference = js.native
  def default(extensionReference: String): js.Promise[String] = js.native
  def default(extensionReference: String, forceDownload: Boolean): js.Promise[String] = js.native
  def default(extensionReference: js.Array[ExtensionReference | String]): js.Promise[String] = js.native
  def default(extensionReference: js.Array[ExtensionReference | String], forceDownload: Boolean): js.Promise[String] = js.native
  def default(extensionReference: ExtensionReference): js.Promise[String] = js.native
  def default(extensionReference: ExtensionReference, forceDownload: Boolean): js.Promise[String] = js.native
}

