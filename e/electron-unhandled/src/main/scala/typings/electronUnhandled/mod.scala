package typings.electronUnhandled

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Catch unhandled errors and promise rejections in your [Electron](https://electronjs.org) app.
  	You probably want to call this both in the main process and any renderer processes to catch all possible errors.
  	*/
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(options: UnhandledOptions): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("electron-unhandled", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Log an error. This does the same as with caught unhandled errors.
  	It will use the same options specified in the `unhandled()` call or the defaults.
  	@param error - Error to log.
  	*/
  inline def logError(error: Error): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logError")(error.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def logError(error: Error, options: LogErrorOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logError")(error.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait LogErrorOptions extends StObject {
    
    /**
    		Title of the error dialog.
    		@default `${appName} encountered an error`
    		*/
    val title: js.UndefOr[String] = js.undefined
  }
  object LogErrorOptions {
    
    inline def apply(): LogErrorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogErrorOptions]
    }
    
    extension [Self <: LogErrorOptions](x: Self) {
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait UnhandledOptions extends StObject {
    
    /**
    		Custom logger that receives the error.
    		Can be useful if you for example integrate with Sentry.
    		@default console.error
    		*/
    val logger: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
    
    /**
    		When specified, the error dialog will include a `Report…` button, which when clicked, executes the given function with the error as the first argument.
    		@default undefined
    		@example
    		```
    		import unhandled = require('electron-unhandled');
    		import {openNewGitHubIssue, debugInfo} = require('electron-util');
    		unhandled({
    			reportButton: error => {
    				openNewGitHubIssue({
    					user: 'sindresorhus',
    					repo: 'electron-unhandled',
    					body: `\`\`\`\n${error.stack}\n\`\`\`\n\n---\n\n${debugInfo()}`
    				});
    			}
    		});
    		// Example of how the GitHub issue will look like: https://github.com/sindresorhus/electron-unhandled/issues/new?body=%60%60%60%0AError%3A+Test%0A++++at+%2FUsers%2Fsindresorhus%2Fdev%2Foss%2Felectron-unhandled%2Fexample.js%3A27%3A21%0A%60%60%60%0A%0A---%0A%0AExample+1.1.0%0AElectron+3.0.8%0Adarwin+18.2.0%0ALocale%3A+en-US
    		```
    		*/
    val reportButton: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
    
    /**
    		Present an error dialog to the user.
    		Default: [Only in production](https://github.com/sindresorhus/electron-is-dev).
    		*/
    val showDialog: js.UndefOr[Boolean] = js.undefined
  }
  object UnhandledOptions {
    
    inline def apply(): UnhandledOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnhandledOptions]
    }
    
    extension [Self <: UnhandledOptions](x: Self) {
      
      inline def setLogger(value: /* error */ Error => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction1(value))
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setReportButton(value: /* error */ Error => Unit): Self = StObject.set(x, "reportButton", js.Any.fromFunction1(value))
      
      inline def setReportButtonUndefined: Self = StObject.set(x, "reportButton", js.undefined)
      
      inline def setShowDialog(value: Boolean): Self = StObject.set(x, "showDialog", value.asInstanceOf[js.Any])
      
      inline def setShowDialogUndefined: Self = StObject.set(x, "showDialog", js.undefined)
    }
  }
}
