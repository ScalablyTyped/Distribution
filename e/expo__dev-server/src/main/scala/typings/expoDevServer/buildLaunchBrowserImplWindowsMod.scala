package typings.expoDevServer

import typings.expoDevServer.anon.`01`
import typings.expoDevServer.buildLaunchBrowserDottypesMod.LaunchBrowserImpl
import typings.expoDevServer.buildLaunchBrowserDottypesMod.LaunchBrowserInstance
import typings.expoDevServer.buildLaunchBrowserDottypesMod.LaunchBrowserTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLaunchBrowserImplWindowsMod {
  
  @JSImport("@expo/dev-server/build/LaunchBrowserImplWindows", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with LaunchBrowserImplWindows {
    
    /* CompleteClass */
    var MAP: `01` = js.native
    
    /* private */ /* CompleteClass */
    var _appId: Any = js.native
    
    /**
      * Close current browser instance
      */
    /* InferMemberOverrides */
    override def close(): js.Promise[Unit] = js.native
    
    /**
      * Create temp directory for browser profile
      *
      * @param baseDirName The base directory name for the created directory
      */
    /* CompleteClass */
    override def createTempBrowserDir(baseDirName: String): js.Promise[String] = js.native
    
    /**
      * Return whether the given `browserType` is supported
      */
    /* CompleteClass */
    override def isSupportedBrowser(browserType: LaunchBrowserTypes): js.Promise[Boolean] = js.native
    
    /**
      * Launch the browser
      */
    /* CompleteClass */
    override def launchAsync(browserType: LaunchBrowserTypes, args: js.Array[String]): js.Promise[LaunchBrowserInstance] = js.native
  }
  
  trait LaunchBrowserImplWindows
    extends StObject
       with LaunchBrowserImpl
       with LaunchBrowserInstance {
    
    var MAP: `01`
    
    /* private */ var _appId: Any
    
    /**
      * Close current browser instance
      */
    /* InferMemberOverrides */
    override def close(): js.Promise[Unit]
  }
  object LaunchBrowserImplWindows {
    
    inline def apply(
      MAP: `01`,
      _appId: Any,
      close: () => js.Promise[Unit],
      createTempBrowserDir: String => js.Promise[String],
      isSupportedBrowser: LaunchBrowserTypes => js.Promise[Boolean],
      launchAsync: (LaunchBrowserTypes, js.Array[String]) => js.Promise[LaunchBrowserInstance]
    ): LaunchBrowserImplWindows = {
      val __obj = js.Dynamic.literal(MAP = MAP.asInstanceOf[js.Any], _appId = _appId.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), createTempBrowserDir = js.Any.fromFunction1(createTempBrowserDir), isSupportedBrowser = js.Any.fromFunction1(isSupportedBrowser), launchAsync = js.Any.fromFunction2(launchAsync))
      __obj.asInstanceOf[LaunchBrowserImplWindows]
    }
    
    extension [Self <: LaunchBrowserImplWindows](x: Self) {
      
      inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setMAP(value: `01`): Self = StObject.set(x, "MAP", value.asInstanceOf[js.Any])
      
      inline def set_appId(value: Any): Self = StObject.set(x, "_appId", value.asInstanceOf[js.Any])
    }
  }
}
