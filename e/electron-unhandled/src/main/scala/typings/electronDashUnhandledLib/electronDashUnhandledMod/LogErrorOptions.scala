package typings
package electronDashUnhandledLib.electronDashUnhandledMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogErrorOptions extends js.Object {
  /**
  		Title of the error dialog.
  		@default `${appName} encountered an error`
  		*/
  val title: js.UndefOr[java.lang.String] = js.undefined
}

object LogErrorOptions {
  @scala.inline
  def apply(title: java.lang.String = null): LogErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[LogErrorOptions]
  }
}

