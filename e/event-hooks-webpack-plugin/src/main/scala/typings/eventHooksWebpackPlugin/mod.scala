package typings.eventHooksWebpackPlugin

import typings.webpack.mod.Compiler
import typings.webpack.mod.WebpackPluginInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * This webpack plugin is similar to `webpack-shell-plugin`
    * but this allows you to execute arbitrary JavaScriptinstead of commands on any event hook that is exposed by the Webpack compile
    */
  @JSImport("event-hooks-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with EventHooksPlugin {
    def this(options: Options) = this()
    
    /**
    	 * The run point of the plugin, required method.
    	 */
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
  }
  
  /**
    * This webpack plugin is similar to `webpack-shell-plugin`
    * but this allows you to execute arbitrary JavaScriptinstead of commands on any event hook that is exposed by the Webpack compile
    */
  trait EventHooksPlugin
    extends StObject
       with WebpackPluginInstance
  object EventHooksPlugin {
    
    inline def apply(apply: Compiler => Unit): EventHooksPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[EventHooksPlugin]
    }
  }
  
  trait Options extends StObject {
    
    var additionalPass: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterCompile: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterEmit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterEnvironment: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterPlugins: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterResolvers: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var beforeCompile: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var beforeRun: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var compilation: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var compile: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var contextModuleFactory: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var done: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var emit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var entryOption: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var environment: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var failed: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var invalid: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var make: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var normalModuleFactory: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var run: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var shouldEmit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var thisCompilation: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var watchClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var watchRun: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAdditionalPass(value: () => Unit): Self = StObject.set(x, "additionalPass", js.Any.fromFunction0(value))
      
      inline def setAdditionalPassUndefined: Self = StObject.set(x, "additionalPass", js.undefined)
      
      inline def setAfterCompile(value: () => Unit): Self = StObject.set(x, "afterCompile", js.Any.fromFunction0(value))
      
      inline def setAfterCompileUndefined: Self = StObject.set(x, "afterCompile", js.undefined)
      
      inline def setAfterEmit(value: () => Unit): Self = StObject.set(x, "afterEmit", js.Any.fromFunction0(value))
      
      inline def setAfterEmitUndefined: Self = StObject.set(x, "afterEmit", js.undefined)
      
      inline def setAfterEnvironment(value: () => Unit): Self = StObject.set(x, "afterEnvironment", js.Any.fromFunction0(value))
      
      inline def setAfterEnvironmentUndefined: Self = StObject.set(x, "afterEnvironment", js.undefined)
      
      inline def setAfterPlugins(value: () => Unit): Self = StObject.set(x, "afterPlugins", js.Any.fromFunction0(value))
      
      inline def setAfterPluginsUndefined: Self = StObject.set(x, "afterPlugins", js.undefined)
      
      inline def setAfterResolvers(value: () => Unit): Self = StObject.set(x, "afterResolvers", js.Any.fromFunction0(value))
      
      inline def setAfterResolversUndefined: Self = StObject.set(x, "afterResolvers", js.undefined)
      
      inline def setBeforeCompile(value: () => Unit): Self = StObject.set(x, "beforeCompile", js.Any.fromFunction0(value))
      
      inline def setBeforeCompileUndefined: Self = StObject.set(x, "beforeCompile", js.undefined)
      
      inline def setBeforeRun(value: () => Unit): Self = StObject.set(x, "beforeRun", js.Any.fromFunction0(value))
      
      inline def setBeforeRunUndefined: Self = StObject.set(x, "beforeRun", js.undefined)
      
      inline def setCompilation(value: () => Unit): Self = StObject.set(x, "compilation", js.Any.fromFunction0(value))
      
      inline def setCompilationUndefined: Self = StObject.set(x, "compilation", js.undefined)
      
      inline def setCompile(value: () => Unit): Self = StObject.set(x, "compile", js.Any.fromFunction0(value))
      
      inline def setCompileUndefined: Self = StObject.set(x, "compile", js.undefined)
      
      inline def setContextModuleFactory(value: () => Unit): Self = StObject.set(x, "contextModuleFactory", js.Any.fromFunction0(value))
      
      inline def setContextModuleFactoryUndefined: Self = StObject.set(x, "contextModuleFactory", js.undefined)
      
      inline def setDone(value: () => Unit): Self = StObject.set(x, "done", js.Any.fromFunction0(value))
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setEmit(value: () => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction0(value))
      
      inline def setEmitUndefined: Self = StObject.set(x, "emit", js.undefined)
      
      inline def setEntryOption(value: () => Unit): Self = StObject.set(x, "entryOption", js.Any.fromFunction0(value))
      
      inline def setEntryOptionUndefined: Self = StObject.set(x, "entryOption", js.undefined)
      
      inline def setEnvironment(value: () => Unit): Self = StObject.set(x, "environment", js.Any.fromFunction0(value))
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setFailed(value: () => Unit): Self = StObject.set(x, "failed", js.Any.fromFunction0(value))
      
      inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
      
      inline def setInvalid(value: () => Unit): Self = StObject.set(x, "invalid", js.Any.fromFunction0(value))
      
      inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      inline def setMake(value: () => Unit): Self = StObject.set(x, "make", js.Any.fromFunction0(value))
      
      inline def setMakeUndefined: Self = StObject.set(x, "make", js.undefined)
      
      inline def setNormalModuleFactory(value: () => Unit): Self = StObject.set(x, "normalModuleFactory", js.Any.fromFunction0(value))
      
      inline def setNormalModuleFactoryUndefined: Self = StObject.set(x, "normalModuleFactory", js.undefined)
      
      inline def setRun(value: () => Unit): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
      
      inline def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
      
      inline def setShouldEmit(value: () => Unit): Self = StObject.set(x, "shouldEmit", js.Any.fromFunction0(value))
      
      inline def setShouldEmitUndefined: Self = StObject.set(x, "shouldEmit", js.undefined)
      
      inline def setThisCompilation(value: () => Unit): Self = StObject.set(x, "thisCompilation", js.Any.fromFunction0(value))
      
      inline def setThisCompilationUndefined: Self = StObject.set(x, "thisCompilation", js.undefined)
      
      inline def setWatchClose(value: () => Unit): Self = StObject.set(x, "watchClose", js.Any.fromFunction0(value))
      
      inline def setWatchCloseUndefined: Self = StObject.set(x, "watchClose", js.undefined)
      
      inline def setWatchRun(value: () => Unit): Self = StObject.set(x, "watchRun", js.Any.fromFunction0(value))
      
      inline def setWatchRunUndefined: Self = StObject.set(x, "watchRun", js.undefined)
    }
  }
}
