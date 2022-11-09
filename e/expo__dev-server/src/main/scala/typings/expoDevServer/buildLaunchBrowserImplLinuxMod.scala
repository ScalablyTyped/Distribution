package typings.expoDevServer

import typings.expoDevServer.anon.`0`
import typings.expoDevServer.buildLaunchBrowserDottypesMod.LaunchBrowserImpl
import typings.expoDevServer.buildLaunchBrowserDottypesMod.LaunchBrowserInstance
import typings.expoDevServer.buildLaunchBrowserDottypesMod.LaunchBrowserTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLaunchBrowserImplLinuxMod {
  
  @JSImport("@expo/dev-server/build/LaunchBrowserImplLinux", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with LaunchBrowserImplLinux {
    
    /* CompleteClass */
    var MAP: `0` = js.native
    
    /* private */ /* CompleteClass */
    var _appId: Any = js.native
    
    /* private */ /* CompleteClass */
    var _process: Any = js.native
    
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
      * On Linux, the supported appId is an array, this function finds the available appId and caches it
      */
    /* private */ /* CompleteClass */
    var getAppId: Any = js.native
    
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
  
  trait LaunchBrowserImplLinux
    extends StObject
       with LaunchBrowserImpl
       with LaunchBrowserInstance {
    
    var MAP: `0`
    
    /* private */ var _appId: Any
    
    /* private */ var _process: Any
    
    /**
      * Close current browser instance
      */
    /* InferMemberOverrides */
    override def close(): js.Promise[Unit]
    
    /**
      * On Linux, the supported appId is an array, this function finds the available appId and caches it
      */
    /* private */ var getAppId: Any
  }
  object LaunchBrowserImplLinux {
    
    inline def apply(
      MAP: `0`,
      _appId: Any,
      _process: Any,
      close: () => js.Promise[Unit],
      createTempBrowserDir: String => js.Promise[String],
      getAppId: Any,
      isSupportedBrowser: LaunchBrowserTypes => js.Promise[Boolean],
      launchAsync: (LaunchBrowserTypes, js.Array[String]) => js.Promise[LaunchBrowserInstance]
    ): LaunchBrowserImplLinux = {
      val __obj = js.Dynamic.literal(MAP = MAP.asInstanceOf[js.Any], _appId = _appId.asInstanceOf[js.Any], _process = _process.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), createTempBrowserDir = js.Any.fromFunction1(createTempBrowserDir), getAppId = getAppId.asInstanceOf[js.Any], isSupportedBrowser = js.Any.fromFunction1(isSupportedBrowser), launchAsync = js.Any.fromFunction2(launchAsync))
      __obj.asInstanceOf[LaunchBrowserImplLinux]
    }
    
    extension [Self <: LaunchBrowserImplLinux](x: Self) {
      
      inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setGetAppId(value: Any): Self = StObject.set(x, "getAppId", value.asInstanceOf[js.Any])
      
      inline def setMAP(value: `0`): Self = StObject.set(x, "MAP", value.asInstanceOf[js.Any])
      
      inline def set_appId(value: Any): Self = StObject.set(x, "_appId", value.asInstanceOf[js.Any])
      
      inline def set_process(value: Any): Self = StObject.set(x, "_process", value.asInstanceOf[js.Any])
    }
  }
}
