package typings.electronDashUnhandled.electronDashUnhandledMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogErrorOptions extends js.Object {
  /**
  		Title of the error dialog.
  		@default `${appName} encountered an error`
  		*/
  val title: js.UndefOr[String] = js.undefined
}

object LogErrorOptions {
  @scala.inline
  def apply(title: String = null): LogErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogErrorOptions]
  }
}

