package typings.devtools

import typings.puppeteerCore.browserMod.Browser
import typings.puppeteerCore.dialogMod.Dialog
import typings.puppeteerCore.pageMod.Page
import typings.std.Map
import typings.std.Record
import typings.wdioProtocols.WDIOProtocols.CommandEndpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devtoolsdriverMod {
  
  @JSImport("devtools/build/devtoolsdriver", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with DevToolsDriver {
    def this(browser: Browser, pages: js.Array[Page]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("devtools/build/devtoolsdriver", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def requireCommand(filePath: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("requireCommand")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  @js.native
  trait DevToolsDriver extends StObject {
    
    var activeDialog: js.UndefOr[Dialog] = js.native
    
    var browser: Browser = js.native
    
    def checkPendingNavigations(): js.Promise[Unit] = js.native
    def checkPendingNavigations(pendingNavigationStart: Double): js.Promise[Unit] = js.native
    
    var commands: Record[String, js.Function] = js.native
    
    var currentFrame: js.UndefOr[Page] = js.native
    
    var currentFrameUrl: js.UndefOr[String] = js.native
    
    var currentWindowHandle: js.UndefOr[String] = js.native
    
    def dialogHandler(dialog: Dialog): Unit = js.native
    
    var elementStore: typings.devtools.elementstoreMod.default = js.native
    
    def framenavigatedHandler(frame: Page): Unit = js.native
    
    def getPageHandle(): Page = js.native
    def getPageHandle(isInFrame: Boolean): Page = js.native
    
    def register(commandInfo: CommandEndpoint): js.ThisFunction1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.BrowserObject */ /* this */ js.Any, 
        /* repeated */ js.Any, 
        js.Promise[js.Any]
      ] = js.native
    
    def setTimeouts(): Unit = js.native
    def setTimeouts(`implicit`: Double): Unit = js.native
    def setTimeouts(`implicit`: Double, pageLoad: Double): Unit = js.native
    def setTimeouts(`implicit`: Double, pageLoad: Double, script: Double): Unit = js.native
    def setTimeouts(`implicit`: Double, pageLoad: Unit, script: Double): Unit = js.native
    def setTimeouts(`implicit`: Unit, pageLoad: Double): Unit = js.native
    def setTimeouts(`implicit`: Unit, pageLoad: Double, script: Double): Unit = js.native
    def setTimeouts(`implicit`: Unit, pageLoad: Unit, script: Double): Unit = js.native
    
    var timeouts: Map[String, Double] = js.native
    
    var windows: Map[String, Page] = js.native
  }
}
