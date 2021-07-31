package typings.envhandlebars

import typings.envhandlebars.anon.TypeofH
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A simple templating utility, akin to envsubst, but using Handlebars for more complex logic.
    */
  @scala.inline
  def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  @scala.inline
  def apply(cb: EnvHandlebarsCallback): Unit = ^.asInstanceOf[js.Dynamic].apply(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def apply(opts: Unit, cb: EnvHandlebarsCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(opts: Options): Unit = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def apply(opts: Options, cb: EnvHandlebarsCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("envhandlebars", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type EnvHandlebarsCallback = js.Function1[/* err */ js.UndefOr[Error], Unit]
  
  type ExtendHandlebarsFunc = js.Function1[/* Handlebars */ TypeofH, Unit]
  
  trait Options extends StObject {
    
    /** @default true */
    var arrayEnabled: js.UndefOr[Boolean] = js.undefined
    
    /** @default false */
    var arrayVarPrefix: js.UndefOr[Boolean] = js.undefined
    
    /** @default process.env */
    var env: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof process.env */ js.Any
      ] = js.undefined
    
    /** @default process.exit */
    var exit: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof process.exit */ js.Any
      ] = js.undefined
    
    /**
      * Custom Mustache helpers and partials can be implemented by extending the envhandlebars module
      * with your own Node.js wrapper script
      */
    var extendHandlebars: js.UndefOr[ExtendHandlebarsFunc] = js.undefined
    
    /** @default process.stderr */
    var stderr: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof process.stderr */ js.Any
      ] = js.undefined
    
    /** @default process.stdin */
    var stdin: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof process.stdin */ js.Any
      ] = js.undefined
    
    /** @default process.stdout */
    var stout: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof process.stdout */ js.Any
      ] = js.undefined
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
      def setArrayEnabled(value: Boolean): Self = StObject.set(x, "arrayEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayEnabledUndefined: Self = StObject.set(x, "arrayEnabled", js.undefined)
      
      @scala.inline
      def setArrayVarPrefix(value: Boolean): Self = StObject.set(x, "arrayVarPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayVarPrefixUndefined: Self = StObject.set(x, "arrayVarPrefix", js.undefined)
      
      @scala.inline
      def setEnv(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof process.env */ js.Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setExit(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof process.exit */ js.Any
      ): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
      
      @scala.inline
      def setExtendHandlebars(value: /* Handlebars */ TypeofH => Unit): Self = StObject.set(x, "extendHandlebars", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExtendHandlebarsUndefined: Self = StObject.set(x, "extendHandlebars", js.undefined)
      
      @scala.inline
      def setStderr(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof process.stderr */ js.Any
      ): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      @scala.inline
      def setStdin(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof process.stdin */ js.Any
      ): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
      
      @scala.inline
      def setStout(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof process.stdout */ js.Any
      ): Self = StObject.set(x, "stout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoutUndefined: Self = StObject.set(x, "stout", js.undefined)
    }
  }
}
