package typings.devtools

import typings.devtools.typesMod.ActiveListener
import typings.puppeteerCore.dialogMod.Dialog
import typings.std.Map
import typings.std.Record
import typings.wdioProtocols.typesMod.CommandEndpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devtoolsdriverMod {
  
  @JSImport("devtools/build/devtoolsdriver", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DevToolsDriver {
    def this(
      browser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Browser */ Any,
      pages: js.Array[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Page */ Any
          ]
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("devtools/build/devtoolsdriver", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * moved into an extra method for testing purposes
      */
    inline def requireCommand(filePath: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("requireCommand")(filePath.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  @js.native
  trait DevToolsDriver extends StObject {
    
    /* private */ var _createWindowHandle: Any = js.native
    
    /* private */ var _targetCreatedHandler: Any = js.native
    
    /* private */ var _targetDestroyedHandler: Any = js.native
    
    var activeDialog: js.UndefOr[Dialog] = js.native
    
    var activeListeners: js.Array[ActiveListener] = js.native
    
    /* private */ var addListener: Any = js.native
    
    var browser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Browser */ Any = js.native
    
    def checkPendingNavigations(): js.Promise[Unit] = js.native
    def checkPendingNavigations(pendingNavigationStart: Double): js.Promise[Unit] = js.native
    
    /* private */ var cleanupListeners: Any = js.native
    
    var commands: Record[String, js.Function] = js.native
    
    var currentFrame: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Page */ Any
      ] = js.native
    
    var currentFrameUrl: js.UndefOr[String] = js.native
    
    var currentWindowHandle: js.UndefOr[String] = js.native
    
    def dialogHandler(dialog: Dialog): Unit = js.native
    
    var elementStore: typings.devtools.elementstoreMod.default = js.native
    
    def framenavigatedHandler(
      frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Frame */ Any
    ): Unit = js.native
    
    def getPageHandle(): Any = js.native
    def getPageHandle(isInFrame: Boolean): Any = js.native
    
    /**
      * Inits browser listeners and sets initial handlers for given pages.
      * Function is also intended to be used while reloading DevTools session.
      * @param browser Puppeteer Browser
      * @param pages Puppeteer page array
      */
    def initBrowser(
      browser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Browser */ Any,
      pages: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Page */ Any
        ]
    ): Unit = js.native
    
    def register(commandInfo: CommandEndpoint): js.ThisFunction1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Browser */ /* this */ Any, 
        /* repeated */ Any, 
        js.Promise[Any]
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
    
    var windows: Map[
        String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Page */ Any
      ] = js.native
  }
}
