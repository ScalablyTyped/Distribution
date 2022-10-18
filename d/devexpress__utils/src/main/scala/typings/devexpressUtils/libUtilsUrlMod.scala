package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsUrlMod {
  
  @JSImport("@devexpress/utils/lib/utils/url", "Url")
  @js.native
  open class Url () extends StObject
  /* static members */
  object Url {
    
    @JSImport("@devexpress/utils/lib/utils/url", "Url")
    @js.native
    val ^ : js.Any = js.native
    
    inline def containsClientScript(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsClientScript")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("@devexpress/utils/lib/utils/url", "Url.getFrame")
    @js.native
    def getFrame: Any = js.native
    inline def getFrame_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFrame")(x.asInstanceOf[js.Any])
    
    inline def navigate(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def navigate(url: String, target: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(url.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("@devexpress/utils/lib/utils/url", "Url.navigateTo")
    @js.native
    def navigateTo: Any = js.native
    inline def navigateTo_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navigateTo")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/utils/url", "Url.openInNewWindow")
    @js.native
    def openInNewWindow: Any = js.native
    
    @JSImport("@devexpress/utils/lib/utils/url", "Url.openInNewWindowViaIframe")
    @js.native
    def openInNewWindowViaIframe: Any = js.native
    inline def openInNewWindowViaIframe_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openInNewWindowViaIframe")(x.asInstanceOf[js.Any])
    
    inline def openInNewWindow_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openInNewWindow")(x.asInstanceOf[js.Any])
  }
}
