package typings.expoDevServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLaunchBrowserDottypesMod {
  
  @js.native
  sealed trait LaunchBrowserTypes extends StObject
  @JSImport("@expo/dev-server/build/LaunchBrowser.types", "LaunchBrowserTypes")
  @js.native
  object LaunchBrowserTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LaunchBrowserTypes & Double] = js.native
    
    @js.native
    sealed trait CHROME
      extends StObject
         with LaunchBrowserTypes
    /* 0 */ val CHROME: typings.expoDevServer.buildLaunchBrowserDottypesMod.LaunchBrowserTypes.CHROME & Double = js.native
    
    @js.native
    sealed trait EDGE
      extends StObject
         with LaunchBrowserTypes
    /* 1 */ val EDGE: typings.expoDevServer.buildLaunchBrowserDottypesMod.LaunchBrowserTypes.EDGE & Double = js.native
  }
  
  trait LaunchBrowserImpl extends StObject {
    
    /**
      * Close current browser instance
      */
    def close(): js.Promise[Unit]
    
    /**
      * Create temp directory for browser profile
      *
      * @param baseDirName The base directory name for the created directory
      */
    def createTempBrowserDir(baseDirName: String): js.Promise[String]
    
    /**
      * Return whether the given `browserType` is supported
      */
    def isSupportedBrowser(browserType: LaunchBrowserTypes): js.Promise[Boolean]
    
    /**
      * Launch the browser
      */
    def launchAsync(browserType: LaunchBrowserTypes, args: js.Array[String]): js.Promise[LaunchBrowserInstance]
  }
  object LaunchBrowserImpl {
    
    inline def apply(
      close: () => js.Promise[Unit],
      createTempBrowserDir: String => js.Promise[String],
      isSupportedBrowser: LaunchBrowserTypes => js.Promise[Boolean],
      launchAsync: (LaunchBrowserTypes, js.Array[String]) => js.Promise[LaunchBrowserInstance]
    ): LaunchBrowserImpl = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), createTempBrowserDir = js.Any.fromFunction1(createTempBrowserDir), isSupportedBrowser = js.Any.fromFunction1(isSupportedBrowser), launchAsync = js.Any.fromFunction2(launchAsync))
      __obj.asInstanceOf[LaunchBrowserImpl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LaunchBrowserImpl] (val x: Self) extends AnyVal {
      
      inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setCreateTempBrowserDir(value: String => js.Promise[String]): Self = StObject.set(x, "createTempBrowserDir", js.Any.fromFunction1(value))
      
      inline def setIsSupportedBrowser(value: LaunchBrowserTypes => js.Promise[Boolean]): Self = StObject.set(x, "isSupportedBrowser", js.Any.fromFunction1(value))
      
      inline def setLaunchAsync(value: (LaunchBrowserTypes, js.Array[String]) => js.Promise[LaunchBrowserInstance]): Self = StObject.set(x, "launchAsync", js.Any.fromFunction2(value))
    }
  }
  
  trait LaunchBrowserInstance extends StObject {
    
    def close(): js.Promise[Unit]
  }
  object LaunchBrowserInstance {
    
    inline def apply(close: () => js.Promise[Unit]): LaunchBrowserInstance = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
      __obj.asInstanceOf[LaunchBrowserInstance]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LaunchBrowserInstance] (val x: Self) extends AnyVal {
      
      inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    }
  }
}
