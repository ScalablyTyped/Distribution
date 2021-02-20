package typings.eventHooksWebpackPlugin

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("event-hooks-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ () extends Plugin {
    def this(options: Options) = this()
  }
  
  type EventHooksPlugin = Plugin
  
  @js.native
  trait Options extends StObject {
    
    var additionalPass: js.UndefOr[js.Function0[Unit]] = js.native
    
    var afterCompile: js.UndefOr[js.Function0[Unit]] = js.native
    
    var afterEmit: js.UndefOr[js.Function0[Unit]] = js.native
    
    var afterEnvironment: js.UndefOr[js.Function0[Unit]] = js.native
    
    var afterPlugins: js.UndefOr[js.Function0[Unit]] = js.native
    
    var afterResolvers: js.UndefOr[js.Function0[Unit]] = js.native
    
    var beforeCompile: js.UndefOr[js.Function0[Unit]] = js.native
    
    var beforeRun: js.UndefOr[js.Function0[Unit]] = js.native
    
    var compilation: js.UndefOr[js.Function0[Unit]] = js.native
    
    var compile: js.UndefOr[js.Function0[Unit]] = js.native
    
    var contextModuleFactory: js.UndefOr[js.Function0[Unit]] = js.native
    
    var done: js.UndefOr[js.Function0[Unit]] = js.native
    
    var emit: js.UndefOr[js.Function0[Unit]] = js.native
    
    var entryOption: js.UndefOr[js.Function0[Unit]] = js.native
    
    var environment: js.UndefOr[js.Function0[Unit]] = js.native
    
    var failed: js.UndefOr[js.Function0[Unit]] = js.native
    
    var invalid: js.UndefOr[js.Function0[Unit]] = js.native
    
    var make: js.UndefOr[js.Function0[Unit]] = js.native
    
    var normalModuleFactory: js.UndefOr[js.Function0[Unit]] = js.native
    
    var run: js.UndefOr[js.Function0[Unit]] = js.native
    
    var shouldEmit: js.UndefOr[js.Function0[Unit]] = js.native
    
    var thisCompilation: js.UndefOr[js.Function0[Unit]] = js.native
    
    var watchClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var watchRun: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalPass(value: () => Unit): Self = StObject.set(x, "additionalPass", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAdditionalPassUndefined: Self = StObject.set(x, "additionalPass", js.undefined)
      
      @scala.inline
      def setAfterCompile(value: () => Unit): Self = StObject.set(x, "afterCompile", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterCompileUndefined: Self = StObject.set(x, "afterCompile", js.undefined)
      
      @scala.inline
      def setAfterEmit(value: () => Unit): Self = StObject.set(x, "afterEmit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterEmitUndefined: Self = StObject.set(x, "afterEmit", js.undefined)
      
      @scala.inline
      def setAfterEnvironment(value: () => Unit): Self = StObject.set(x, "afterEnvironment", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterEnvironmentUndefined: Self = StObject.set(x, "afterEnvironment", js.undefined)
      
      @scala.inline
      def setAfterPlugins(value: () => Unit): Self = StObject.set(x, "afterPlugins", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterPluginsUndefined: Self = StObject.set(x, "afterPlugins", js.undefined)
      
      @scala.inline
      def setAfterResolvers(value: () => Unit): Self = StObject.set(x, "afterResolvers", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterResolversUndefined: Self = StObject.set(x, "afterResolvers", js.undefined)
      
      @scala.inline
      def setBeforeCompile(value: () => Unit): Self = StObject.set(x, "beforeCompile", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeCompileUndefined: Self = StObject.set(x, "beforeCompile", js.undefined)
      
      @scala.inline
      def setBeforeRun(value: () => Unit): Self = StObject.set(x, "beforeRun", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeRunUndefined: Self = StObject.set(x, "beforeRun", js.undefined)
      
      @scala.inline
      def setCompilation(value: () => Unit): Self = StObject.set(x, "compilation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCompilationUndefined: Self = StObject.set(x, "compilation", js.undefined)
      
      @scala.inline
      def setCompile(value: () => Unit): Self = StObject.set(x, "compile", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCompileUndefined: Self = StObject.set(x, "compile", js.undefined)
      
      @scala.inline
      def setContextModuleFactory(value: () => Unit): Self = StObject.set(x, "contextModuleFactory", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContextModuleFactoryUndefined: Self = StObject.set(x, "contextModuleFactory", js.undefined)
      
      @scala.inline
      def setDone(value: () => Unit): Self = StObject.set(x, "done", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      @scala.inline
      def setEmit(value: () => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEmitUndefined: Self = StObject.set(x, "emit", js.undefined)
      
      @scala.inline
      def setEntryOption(value: () => Unit): Self = StObject.set(x, "entryOption", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEntryOptionUndefined: Self = StObject.set(x, "entryOption", js.undefined)
      
      @scala.inline
      def setEnvironment(value: () => Unit): Self = StObject.set(x, "environment", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      @scala.inline
      def setFailed(value: () => Unit): Self = StObject.set(x, "failed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
      
      @scala.inline
      def setInvalid(value: () => Unit): Self = StObject.set(x, "invalid", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      @scala.inline
      def setMake(value: () => Unit): Self = StObject.set(x, "make", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMakeUndefined: Self = StObject.set(x, "make", js.undefined)
      
      @scala.inline
      def setNormalModuleFactory(value: () => Unit): Self = StObject.set(x, "normalModuleFactory", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNormalModuleFactoryUndefined: Self = StObject.set(x, "normalModuleFactory", js.undefined)
      
      @scala.inline
      def setRun(value: () => Unit): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
      
      @scala.inline
      def setShouldEmit(value: () => Unit): Self = StObject.set(x, "shouldEmit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShouldEmitUndefined: Self = StObject.set(x, "shouldEmit", js.undefined)
      
      @scala.inline
      def setThisCompilation(value: () => Unit): Self = StObject.set(x, "thisCompilation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setThisCompilationUndefined: Self = StObject.set(x, "thisCompilation", js.undefined)
      
      @scala.inline
      def setWatchClose(value: () => Unit): Self = StObject.set(x, "watchClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWatchCloseUndefined: Self = StObject.set(x, "watchClose", js.undefined)
      
      @scala.inline
      def setWatchRun(value: () => Unit): Self = StObject.set(x, "watchRun", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWatchRunUndefined: Self = StObject.set(x, "watchRun", js.undefined)
    }
  }
}
