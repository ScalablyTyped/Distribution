package typings.electronNotarize

import typings.electronNotarize.mod.NotarizeCredentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateArgsMod {
  
  @JSImport("electron-notarize/lib/validate-args", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isApiKeyCredentials(opts: NotarizeCredentials): /* is electron-notarize.electron-notarize.NotarizeApiKeyCredentials */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isApiKeyCredentials")(opts.asInstanceOf[js.Any]).asInstanceOf[/* is electron-notarize.electron-notarize.NotarizeApiKeyCredentials */ Boolean]
  
  inline def isPasswordCredentials(opts: NotarizeCredentials): /* is electron-notarize.electron-notarize.NotarizePasswordCredentials */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPasswordCredentials")(opts.asInstanceOf[js.Any]).asInstanceOf[/* is electron-notarize.electron-notarize.NotarizePasswordCredentials */ Boolean]
  
  inline def validateAuthorizationArgs(opts: NotarizeCredentials): NotarizeCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("validateAuthorizationArgs")(opts.asInstanceOf[js.Any]).asInstanceOf[NotarizeCredentials]
}
