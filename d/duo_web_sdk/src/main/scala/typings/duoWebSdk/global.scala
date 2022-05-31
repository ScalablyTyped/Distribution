package typings.duoWebSdk

import typings.duoWebSdk.mod.InitOptions
import typings.duoWebSdk.mod.ParsedSig
import typings.std.MessageEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Duo {
    
    @JSGlobal("Duo")
    @js.native
    val ^ : js.Any = js.native
    
    inline def doPostBack(response: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_doPostBack")(response.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def init(options: InitOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def isDuoMessage(event: MessageEvent[js.Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isDuoMessage")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def onReady(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_onReady")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def parseSigRequest(sig: String): ParsedSig = ^.asInstanceOf[js.Dynamic].applyDynamic("_parseSigRequest")(sig.asInstanceOf[js.Any]).asInstanceOf[ParsedSig]
  }
}
