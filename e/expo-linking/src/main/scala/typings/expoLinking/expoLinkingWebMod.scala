package typings.expoLinking

import typings.expoLinking.expoLinkingStrings.url
import typings.expoLinking.linkingTypesMod.URLListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoLinkingWebMod {
  
  object default {
    
    @JSImport("expo-linking/build/ExpoLinking.web", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def addEventListener_url(`type`: url, listener: URLListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def canOpenURL(url: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("canOpenURL")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    inline def getInitialURL(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialURL")().asInstanceOf[js.Promise[String]]
    
    inline def openURL(url: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def removeEventListener_url(`type`: url, listener: URLListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
