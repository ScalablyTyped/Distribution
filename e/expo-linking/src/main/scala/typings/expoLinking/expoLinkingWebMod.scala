package typings.expoLinking

import typings.expoLinking.expoLinkingStrings.url
import typings.expoLinking.linkingTypesMod.URLListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoLinkingWebMod {
  
  object default {
    
    @JSImport("expo-linking/build/ExpoLinking.web", "default.addEventListener")
    @js.native
    def addEventListener_url(`type`: url, listener: URLListener): Unit = js.native
    
    @JSImport("expo-linking/build/ExpoLinking.web", "default.canOpenURL")
    @js.native
    def canOpenURL(url: String): js.Promise[Boolean] = js.native
    
    @JSImport("expo-linking/build/ExpoLinking.web", "default.getInitialURL")
    @js.native
    def getInitialURL(): js.Promise[String] = js.native
    
    @JSImport("expo-linking/build/ExpoLinking.web", "default.openURL")
    @js.native
    def openURL(url: String): js.Promise[Unit] = js.native
    
    @JSImport("expo-linking/build/ExpoLinking.web", "default.removeEventListener")
    @js.native
    def removeEventListener_url(`type`: url, listener: URLListener): Unit = js.native
  }
}
