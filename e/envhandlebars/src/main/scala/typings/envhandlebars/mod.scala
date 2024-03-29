package typings.envhandlebars

import typings.envhandlebars.anon.FnCall
import typings.envhandlebars.anon.TypeofH
import typings.node.anon.Fd
import typings.node.anon.`5`
import typings.node.anon.`6`
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.processMod.global.NodeJS.ReadStream
import typings.node.processMod.global.NodeJS.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A simple templating utility, akin to envsubst, but using Handlebars for more complex logic.
    */
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(cb: EnvHandlebarsCallback): Unit = ^.asInstanceOf[js.Dynamic].apply(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(opts: Unit, cb: EnvHandlebarsCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(opts: Options): Unit = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(opts: Options, cb: EnvHandlebarsCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("envhandlebars", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type EnvHandlebarsCallback = js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  
  type ExtendHandlebarsFunc = js.Function1[/* Handlebars */ TypeofH, Unit]
  
  trait Options extends StObject {
    
    /** @default false */
    var arrayVarPrefix: js.UndefOr[Boolean] = js.undefined
    
    /** @default true */
    var arraysEnabled: js.UndefOr[Boolean] = js.undefined
    
    /** @default process.env */
    var env: js.UndefOr[ProcessEnv] = js.undefined
    
    /** @default process.exit */
    var exit: js.UndefOr[FnCall] = js.undefined
    
    /**
      * Custom Mustache helpers and partials can be implemented by extending the envhandlebars module
      * with your own Node.js wrapper script
      */
    var extendHandlebars: js.UndefOr[ExtendHandlebarsFunc] = js.undefined
    
    /** @default process.stderr */
    var stderr: js.UndefOr[WriteStream & `5`] = js.undefined
    
    /** @default process.stdin */
    var stdin: js.UndefOr[ReadStream & `6`] = js.undefined
    
    /** @default process.stdout */
    var stout: js.UndefOr[WriteStream & Fd] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setArrayVarPrefix(value: Boolean): Self = StObject.set(x, "arrayVarPrefix", value.asInstanceOf[js.Any])
      
      inline def setArrayVarPrefixUndefined: Self = StObject.set(x, "arrayVarPrefix", js.undefined)
      
      inline def setArraysEnabled(value: Boolean): Self = StObject.set(x, "arraysEnabled", value.asInstanceOf[js.Any])
      
      inline def setArraysEnabledUndefined: Self = StObject.set(x, "arraysEnabled", js.undefined)
      
      inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setExit(value: FnCall): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
      
      inline def setExtendHandlebars(value: /* Handlebars */ TypeofH => Unit): Self = StObject.set(x, "extendHandlebars", js.Any.fromFunction1(value))
      
      inline def setExtendHandlebarsUndefined: Self = StObject.set(x, "extendHandlebars", js.undefined)
      
      inline def setStderr(value: WriteStream & `5`): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      inline def setStdin(value: ReadStream & `6`): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      inline def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
      
      inline def setStout(value: WriteStream & Fd): Self = StObject.set(x, "stout", value.asInstanceOf[js.Any])
      
      inline def setStoutUndefined: Self = StObject.set(x, "stout", js.undefined)
    }
  }
}
