package typings.firebaseRemoteConfig

import typings.std.NavigatorLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/remote-config/dist/src/language", JSImport.Namespace)
@js.native
object languageMod extends js.Object {
  
  def getUserLanguage(): String = js.native
  def getUserLanguage(navigatorLanguage: NavigatorLanguage): String = js.native
}
