package typings.electronUnhandled.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnhandledOptions extends js.Object {
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
  @scala.inline
  def apply(
    logger: /* error */ Error => Unit = null,
    reportButton: /* error */ Error => Unit = null,
    showDialog: js.UndefOr[Boolean] = js.undefined
  ): UnhandledOptions = {
    val __obj = js.Dynamic.literal()
    if (logger != null) __obj.updateDynamic("logger")(js.Any.fromFunction1(logger))
    if (reportButton != null) __obj.updateDynamic("reportButton")(js.Any.fromFunction1(reportButton))
    if (!js.isUndefined(showDialog)) __obj.updateDynamic("showDialog")(showDialog.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnhandledOptions]
  }
}

