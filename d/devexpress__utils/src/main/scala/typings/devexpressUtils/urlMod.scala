package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlMod {
  
  @JSImport("@devexpress/utils/lib/utils/url", "Url")
  @js.native
  class Url () extends StObject
  /* static members */
  object Url {
    
    @JSImport("@devexpress/utils/lib/utils/url", "Url")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@devexpress/utils/lib/utils/url", "Url.containsClientScript")
    @js.native
    def containsClientScript(url: String): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/url", "Url.getFrame")
    @js.native
    def getFrame: js.Any = js.native
    @scala.inline
    def getFrame_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFrame")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/utils/url", "Url.navigate")
    @js.native
    def navigate(url: String): Unit = js.native
    @JSImport("@devexpress/utils/lib/utils/url", "Url.navigate")
    @js.native
    def navigate(url: String, target: String): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/url", "Url.navigateTo")
    @js.native
    def navigateTo: js.Any = js.native
    @scala.inline
    def navigateTo_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navigateTo")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/utils/url", "Url.openInNewWindow")
    @js.native
    def openInNewWindow: js.Any = js.native
    
    @JSImport("@devexpress/utils/lib/utils/url", "Url.openInNewWindowViaIframe")
    @js.native
    def openInNewWindowViaIframe: js.Any = js.native
    @scala.inline
    def openInNewWindowViaIframe_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openInNewWindowViaIframe")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def openInNewWindow_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openInNewWindow")(x.asInstanceOf[js.Any])
  }
}
