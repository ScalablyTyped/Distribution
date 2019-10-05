package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.undefined
  /**
    * The original request is prevented from being sent or completed and is instead
    * redirected to the given URL.
    */
  var redirectURL: js.UndefOr[String] = js.undefined
}

object Response {
  @scala.inline
  def apply(cancel: js.UndefOr[Boolean] = js.undefined, redirectURL: String = null): Response = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (redirectURL != null) __obj.updateDynamic("redirectURL")(redirectURL)
    __obj.asInstanceOf[Response]
  }
}

