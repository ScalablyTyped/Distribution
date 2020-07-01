package typings.electronNotarize

import typings.electronNotarize.mod.NotarizeCredentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-notarize/lib/validate-args", JSImport.Namespace)
@js.native
object validateArgsMod extends js.Object {
  def isApiKeyCredentials(opts: NotarizeCredentials): /* is electron-notarize.electron-notarize.NotarizeApiKeyCredentials */ Boolean = js.native
  def isPasswordCredentials(opts: NotarizeCredentials): /* is electron-notarize.electron-notarize.NotarizePasswordCredentials */ Boolean = js.native
  def validateAuthorizationArgs(opts: NotarizeCredentials): NotarizeCredentials = js.native
}

