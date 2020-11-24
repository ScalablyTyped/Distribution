package typings.devexpressUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/utils/url", JSImport.Namespace)
@js.native
object urlMod extends js.Object {
  
  @js.native
  class Url () extends js.Object
  /* static members */
  @js.native
  object Url extends js.Object {
    
    def containsClientScript(url: String): Boolean = js.native
    
    var getFrame: js.Any = js.native
    
    def navigate(url: String): Unit = js.native
    def navigate(url: String, target: String): Unit = js.native
    
    var navigateTo: js.Any = js.native
    
    var openInNewWindow: js.Any = js.native
    
    var openInNewWindowViaIframe: js.Any = js.native
  }
}
