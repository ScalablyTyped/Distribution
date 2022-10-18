package typings.ethersprojectWeb

import typings.ethersprojectWeb.libTypesMod.GetUrlResponse
import typings.ethersprojectWeb.libTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBrowserGeturlMod {
  
  @JSImport("@ethersproject/web/lib/browser-geturl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getUrl(href: String): js.Promise[GetUrlResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(href.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetUrlResponse]]
  inline def getUrl(href: String, options: Options): js.Promise[GetUrlResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(href.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetUrlResponse]]
}
