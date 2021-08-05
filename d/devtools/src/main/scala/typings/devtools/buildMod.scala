package typings.devtools

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("devtools/build", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with typings.devtools.buildMod.DevTools
  /* static members */
  object default {
    
    @JSImport("devtools/build", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachToSession(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")().asInstanceOf[Unit]
    
    inline def newSession(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("newSession")().asInstanceOf[js.Promise[js.Any]]
    inline def newSession(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Options */ js.Any
    ): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
    inline def newSession(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Options */ js.Any,
      modifier: js.Function
    ): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    inline def newSession(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Options */ js.Any,
      modifier: js.Function,
      userPrototype: js.Object
    ): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    inline def newSession(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Options */ js.Any,
      modifier: js.Function,
      userPrototype: js.Object,
      customCommandWrapper: js.Function
    ): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    inline def newSession(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Options */ js.Any,
      modifier: js.Function,
      userPrototype: Unit,
      customCommandWrapper: js.Function
    ): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    inline def newSession(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Options */ js.Any,
      modifier: Unit,
      userPrototype: js.Object
    ): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    inline def newSession(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Options */ js.Any,
      modifier: Unit,
      userPrototype: js.Object,
      customCommandWrapper: js.Function
    ): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    inline def newSession(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Options */ js.Any,
      modifier: Unit,
      userPrototype: Unit,
      customCommandWrapper: js.Function
    ): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    inline def newSession(options: Unit, modifier: js.Function): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    inline def newSession(options: Unit, modifier: js.Function, userPrototype: js.Object): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    inline def newSession(options: Unit, modifier: js.Function, userPrototype: js.Object, customCommandWrapper: js.Function): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    inline def newSession(options: Unit, modifier: js.Function, userPrototype: Unit, customCommandWrapper: js.Function): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    inline def newSession(options: Unit, modifier: Unit, userPrototype: js.Object): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    inline def newSession(options: Unit, modifier: Unit, userPrototype: js.Object, customCommandWrapper: js.Function): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    inline def newSession(options: Unit, modifier: Unit, userPrototype: Unit, customCommandWrapper: js.Function): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    
    inline def reloadSession(
      instance: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.BrowserObject */ js.Any
    ): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("reloadSession")(instance.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  }
  
  @JSImport("devtools/build", "SUPPORTED_BROWSER")
  @js.native
  val SUPPORTED_BROWSER: js.Array[String] = js.native
  
  @JSImport("devtools/build", "sessionMap")
  @js.native
  val sessionMap: Map[js.Any, js.Any] = js.native
  
  trait DevTools extends StObject
}
