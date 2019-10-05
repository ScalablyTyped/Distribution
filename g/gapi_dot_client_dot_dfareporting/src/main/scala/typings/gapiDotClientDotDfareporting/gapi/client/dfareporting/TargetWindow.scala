package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetWindow extends js.Object {
  /** User-entered value. */
  var customHtml: js.UndefOr[String] = js.undefined
  /** Type of browser window for which the backup image of the flash creative can be displayed. */
  var targetWindowOption: js.UndefOr[String] = js.undefined
}

object TargetWindow {
  @scala.inline
  def apply(customHtml: String = null, targetWindowOption: String = null): TargetWindow = {
    val __obj = js.Dynamic.literal()
    if (customHtml != null) __obj.updateDynamic("customHtml")(customHtml)
    if (targetWindowOption != null) __obj.updateDynamic("targetWindowOption")(targetWindowOption)
    __obj.asInstanceOf[TargetWindow]
  }
}

