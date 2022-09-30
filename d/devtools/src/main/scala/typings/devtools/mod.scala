package typings.devtools

import typings.devtools.typesMod.AttachOptions
import typings.devtools.typesMod.Client
import typings.std.Map
import typings.wdioTypes.optionsMod.WebDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("devtools", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with DevTools
  /* static members */
  object default {
    
    @JSImport("devtools", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * allows user to attach to existing sessions
      */
    inline def attachToSession(options: AttachOptions): js.Promise[Client] = ^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Client]]
    inline def attachToSession(options: AttachOptions, modifier: js.Function): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def attachToSession(options: AttachOptions, modifier: js.Function, userPrototype: js.Object): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def attachToSession(
      options: AttachOptions,
      modifier: js.Function,
      userPrototype: js.Object,
      customCommandWrapper: js.Function
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def attachToSession(
      options: AttachOptions,
      modifier: js.Function,
      userPrototype: Unit,
      customCommandWrapper: js.Function
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def attachToSession(options: AttachOptions, modifier: Unit, userPrototype: js.Object): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def attachToSession(
      options: AttachOptions,
      modifier: Unit,
      userPrototype: js.Object,
      customCommandWrapper: js.Function
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def attachToSession(options: AttachOptions, modifier: Unit, userPrototype: Unit, customCommandWrapper: js.Function): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    
    inline def newSession(options: WebDriver): js.Promise[Client] = ^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Client]]
    inline def newSession(options: WebDriver, modifier: js.Function): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def newSession(options: WebDriver, modifier: js.Function, userPrototype: js.Object): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def newSession(
      options: WebDriver,
      modifier: js.Function,
      userPrototype: js.Object,
      customCommandWrapper: js.Function
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def newSession(options: WebDriver, modifier: js.Function, userPrototype: Unit, customCommandWrapper: js.Function): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def newSession(options: WebDriver, modifier: Unit, userPrototype: js.Object): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def newSession(options: WebDriver, modifier: Unit, userPrototype: js.Object, customCommandWrapper: js.Function): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def newSession(options: WebDriver, modifier: Unit, userPrototype: Unit, customCommandWrapper: js.Function): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    
    inline def reloadSession(instance: Any): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("reloadSession")(instance.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  }
  
  @JSImport("devtools", "SUPPORTED_BROWSER")
  @js.native
  val SUPPORTED_BROWSER: js.Array[String] = js.native
  
  @JSImport("devtools", "sessionMap")
  @js.native
  val sessionMap: Map[Any, Any] = js.native
  
  trait DevTools extends StObject
  
  object global {
    
    object WebdriverIO {
      
      type WDIODevtoolsOptions = typings.devtools.typesMod.WDIODevtoolsOptions
    }
  }
}
