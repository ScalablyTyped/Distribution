package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args extends js.Object {
  /** A list of arguments passed to the call. */
  var args: js.UndefOr[js.Array[_]] = js.undefined
  /** The result of the call. */
  var result: js.UndefOr[js.Object] = js.undefined
  /** The tab associated with this event if it is a tab or content script. */
  var tabId: js.UndefOr[Double] = js.undefined
  /** If the type is content_script, this is the url of the script that was injected. */
  var url: js.UndefOr[String] = js.undefined
}

object Args {
  @scala.inline
  def apply(
    args: js.Array[_] = null,
    result: js.Object = null,
    tabId: js.UndefOr[Double] = js.undefined,
    url: String = null
  ): Args = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (!js.isUndefined(tabId)) __obj.updateDynamic("tabId")(tabId.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
}

