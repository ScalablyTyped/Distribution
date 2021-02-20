package typings.electronNotarize

import typings.electronNotarize.mod.NotarizeCredentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateArgsMod {
  
  @JSImport("electron-notarize/lib/validate-args", "isApiKeyCredentials")
  @js.native
  def isApiKeyCredentials(opts: NotarizeCredentials): /* is electron-notarize.electron-notarize.NotarizeApiKeyCredentials */ Boolean = js.native
  
  @JSImport("electron-notarize/lib/validate-args", "isPasswordCredentials")
  @js.native
  def isPasswordCredentials(opts: NotarizeCredentials): /* is electron-notarize.electron-notarize.NotarizePasswordCredentials */ Boolean = js.native
  
  @JSImport("electron-notarize/lib/validate-args", "validateAuthorizationArgs")
  @js.native
  def validateAuthorizationArgs(opts: NotarizeCredentials): NotarizeCredentials = js.native
}
