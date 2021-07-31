package typings.dropboxjs.global.Dropbox

import typings.dropboxjs.Dropbox.QueryParams
import typings.dropboxjs.anon.Cancelable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Util {
  
  @JSGlobal("Dropbox.Util.EventSource")
  @js.native
  class EventSource protected ()
    extends StObject
       with typings.dropboxjs.Dropbox.Util.EventSource {
    def this(options: Cancelable) = this()
    
    /* CompleteClass */
    override def addListener(listener: js.Function1[/* event */ js.Any, Unit]): typings.dropboxjs.Dropbox.Util.EventSource = js.native
    
    /* CompleteClass */
    override def dispatch(event: js.Object): Boolean = js.native
    
    /* CompleteClass */
    override def removeListener(listener: js.Function1[/* event */ js.Any, Unit]): typings.dropboxjs.Dropbox.Util.EventSource = js.native
  }
  
  @JSGlobal("Dropbox.Util.Oauth")
  @js.native
  class Oauth ()
    extends StObject
       with typings.dropboxjs.Dropbox.Util.Oauth {
    
    /* CompleteClass */
    override def checkAuthStateParam(stateParam: String): Boolean = js.native
  }
  object Oauth {
    
    @JSGlobal("Dropbox.Util.Oauth")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def queryParamsFromUrl(url: String): QueryParams = ^.asInstanceOf[js.Dynamic].applyDynamic("queryParamsFromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[QueryParams]
    
    /* static member */
    @scala.inline
    def randomAuthStateParam(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomAuthStateParam")().asInstanceOf[String]
  }
  
  @JSGlobal("Dropbox.Util.Xhr")
  @js.native
  class Xhr protected ()
    extends StObject
       with typings.dropboxjs.Dropbox.Util.Xhr {
    def this(method: String, baseUrl: String) = this()
  }
  object Xhr {
    
    @JSGlobal("Dropbox.Util.Xhr")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def urlDecode(string: js.Object): QueryParams = ^.asInstanceOf[js.Dynamic].applyDynamic("urlDecode")(string.asInstanceOf[js.Any]).asInstanceOf[QueryParams]
    
    /* static member */
    @scala.inline
    def urlEncode(obj: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlEncode")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    @scala.inline
    def urlEncodeValue(obj: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlEncodeValue")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
