package typings.dropboxjs.global.Dropbox

import typings.dropboxjs.Dropbox.QueryParamsCallback
import typings.dropboxjs.Dropbox.RedirectOptions
import typings.dropboxjs.anon.Port
import typings.dropboxjs.anon.ReceiverPath
import typings.dropboxjs.anon.RedirectFile
import typings.dropboxjs.anon.RememberUser
import typings.dropboxjs.anon.Scope
import typings.std.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Dropbox.AuthDriver")
@js.native
class AuthDriver ()
  extends StObject
     with typings.dropboxjs.Dropbox.AuthDriver {
  
  /* CompleteClass */
  override def authType(): String = js.native
  
  /* CompleteClass */
  override def doAuthorize(
    authUrl: String,
    stateParam: String,
    client: typings.dropboxjs.Dropbox.Client,
    callback: QueryParamsCallback
  ): Unit = js.native
  
  /* CompleteClass */
  override def getStateParam(client: typings.dropboxjs.Dropbox.Client, callback: js.Function1[/* state */ String, Unit]): Unit = js.native
  
  /* CompleteClass */
  override def onAuthStepChange(client: typings.dropboxjs.Dropbox.Client, callback: js.Function0[Unit]): Unit = js.native
  
  /* CompleteClass */
  override def resumeAuthorize(stateParam: String, client: typings.dropboxjs.Dropbox.Client, callback: QueryParamsCallback): Unit = js.native
  
  /* CompleteClass */
  override def url(): String = js.native
}
object AuthDriver {
  
  @JSGlobal("Dropbox.AuthDriver.BrowserBase")
  @js.native
  class BrowserBase protected ()
    extends StObject
       with typings.dropboxjs.Dropbox.AuthDriver.BrowserBase {
    def this(options: RememberUser) = this()
    
    /* CompleteClass */
    override def authType(): String = js.native
    
    /* CompleteClass */
    override def locationStateParam(url: String): String = js.native
    
    /* CompleteClass */
    override def onAuthStepChange(client: typings.dropboxjs.Dropbox.Client, callback: js.Function0[Unit]): Unit = js.native
  }
  object BrowserBase {
    
    @JSGlobal("Dropbox.AuthDriver.BrowserBase")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def cleanupLocation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanupLocation")().asInstanceOf[Unit]
    
    /* static member */
    inline def currentLocation(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("currentLocation")().asInstanceOf[String]
    
    /* static member */
    inline def localStorage(): Storage = ^.asInstanceOf[js.Dynamic].applyDynamic("localStorage")().asInstanceOf[Storage]
  }
  
  @JSGlobal("Dropbox.AuthDriver.ChromeApp")
  @js.native
  class ChromeApp ()
    extends StObject
       with typings.dropboxjs.Dropbox.AuthDriver.IAuthDriver {
    def this(options: Scope) = this()
  }
  
  @JSGlobal("Dropbox.AuthDriver.ChromeExtension")
  @js.native
  class ChromeExtension ()
    extends StObject
       with typings.dropboxjs.Dropbox.AuthDriver.IAuthDriver {
    def this(options: ReceiverPath) = this()
  }
  object ChromeExtension {
    
    @JSGlobal("Dropbox.AuthDriver.ChromeExtension")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def oauthReceiver(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("oauthReceiver")().asInstanceOf[Unit]
  }
  
  @JSGlobal("Dropbox.AuthDriver.Cordova")
  @js.native
  class Cordova ()
    extends StObject
       with typings.dropboxjs.Dropbox.AuthDriver.Cordova {
    def this(options: ReceiverPath) = this()
  }
  object Cordova {
    
    @JSGlobal("Dropbox.AuthDriver.Cordova")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def oauthReceiver(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("oauthReceiver")().asInstanceOf[Unit]
  }
  
  /** Do not use class! TypeScript definition implementation detail : https://github.com/Microsoft/TypeScript/issues/371 */
  @JSGlobal("Dropbox.AuthDriver.IAuthDriver")
  @js.native
  class IAuthDriver ()
    extends StObject
       with typings.dropboxjs.Dropbox.AuthDriver.IAuthDriver
  
  @JSGlobal("Dropbox.AuthDriver.NodeServer")
  @js.native
  class NodeServer ()
    extends StObject
       with typings.dropboxjs.Dropbox.AuthDriver.NodeServer {
    def this(options: Port) = this()
  }
  
  @JSGlobal("Dropbox.AuthDriver.Popup")
  @js.native
  class Popup ()
    extends StObject
       with typings.dropboxjs.Dropbox.AuthDriver.Popup {
    def this(options: RedirectOptions) = this()
  }
  object Popup {
    
    @JSGlobal("Dropbox.AuthDriver.Popup")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def locationOrigin(location: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("locationOrigin")(location.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def oauthReceiver(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("oauthReceiver")().asInstanceOf[Unit]
  }
  
  @JSGlobal("Dropbox.AuthDriver.Redirect")
  @js.native
  class Redirect ()
    extends StObject
       with typings.dropboxjs.Dropbox.AuthDriver.Redirect {
    def this(options: RedirectFile) = this()
    
    /* CompleteClass */
    override def doAuthorize(authUrl: String, stateParam: String, client: typings.dropboxjs.Dropbox.Client): Unit = js.native
    
    /* CompleteClass */
    override def resumeAuthorize(stateParam: String, client: typings.dropboxjs.Dropbox.Client, callback: QueryParamsCallback): Unit = js.native
    
    /* CompleteClass */
    override def url(): String = js.native
  }
}
