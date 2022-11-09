package typings.expoDevServer

import typings.expoDevServer.buildLaunchBrowserDottypesMod.LaunchBrowserInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLaunchBrowserMod {
  
  @JSImport("@expo/dev-server/build/LaunchBrowser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def launchBrowserAsync(url: String): js.Promise[LaunchBrowserInstance] = ^.asInstanceOf[js.Dynamic].applyDynamic("launchBrowserAsync")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LaunchBrowserInstance]]
}
