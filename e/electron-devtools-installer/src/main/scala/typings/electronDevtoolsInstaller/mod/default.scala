package typings.electronDevtoolsInstaller.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron-devtools-installer", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(extensionReference: String): js.Promise[String] = js.native
  def apply(extensionReference: String, forceDownload: Boolean): js.Promise[String] = js.native
  def apply(extensionReference: js.Array[ExtensionReference | String]): js.Promise[String] = js.native
  def apply(extensionReference: js.Array[ExtensionReference | String], forceDownload: Boolean): js.Promise[String] = js.native
  def apply(extensionReference: ExtensionReference): js.Promise[String] = js.native
  def apply(extensionReference: ExtensionReference, forceDownload: Boolean): js.Promise[String] = js.native
}
