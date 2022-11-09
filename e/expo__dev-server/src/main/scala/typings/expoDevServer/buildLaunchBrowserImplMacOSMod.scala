package typings.expoDevServer

import typings.expoDevServer.anon.`1`
import typings.expoDevServer.buildLaunchBrowserDottypesMod.LaunchBrowserImpl
import typings.expoDevServer.buildLaunchBrowserDottypesMod.LaunchBrowserInstance
import typings.expoDevServer.buildLaunchBrowserDottypesMod.LaunchBrowserTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLaunchBrowserImplMacOSMod {
  
  @JSImport("@expo/dev-server/build/LaunchBrowserImplMacOS", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with LaunchBrowserImplMacOS {
    
    /* CompleteClass */
    var MAP: `1` = js.native
    
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
  
  trait LaunchBrowserImplMacOS
    extends StObject
       with LaunchBrowserImpl
       with LaunchBrowserInstance {
    
    var MAP: `1`
    
    /* private */ var _process: Any
    
    /**
      * Close current browser instance
      */
    /* InferMemberOverrides */
    override def close(): js.Promise[Unit]
  }
  object LaunchBrowserImplMacOS {
    
    inline def apply(
      MAP: `1`,
      _process: Any,
      close: () => js.Promise[Unit],
      createTempBrowserDir: String => js.Promise[String],
      isSupportedBrowser: LaunchBrowserTypes => js.Promise[Boolean],
      launchAsync: (LaunchBrowserTypes, js.Array[String]) => js.Promise[LaunchBrowserInstance]
    ): LaunchBrowserImplMacOS = {
      val __obj = js.Dynamic.literal(MAP = MAP.asInstanceOf[js.Any], _process = _process.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), createTempBrowserDir = js.Any.fromFunction1(createTempBrowserDir), isSupportedBrowser = js.Any.fromFunction1(isSupportedBrowser), launchAsync = js.Any.fromFunction2(launchAsync))
      __obj.asInstanceOf[LaunchBrowserImplMacOS]
    }
    
    extension [Self <: LaunchBrowserImplMacOS](x: Self) {
      
      inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setMAP(value: `1`): Self = StObject.set(x, "MAP", value.asInstanceOf[js.Any])
      
      inline def set_process(value: Any): Self = StObject.set(x, "_process", value.asInstanceOf[js.Any])
    }
  }
}
