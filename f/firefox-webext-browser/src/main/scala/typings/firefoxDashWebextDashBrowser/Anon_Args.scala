package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  /** A list of arguments passed to the call. */
  var args: js.UndefOr[js.Array[_]] = js.undefined
  /** The result of the call. */
  var result: js.UndefOr[js.Object] = js.undefined
  /** The tab associated with this event if it is a tab or content script. */
  var tabId: js.UndefOr[Double] = js.undefined
  /** If the type is content_script, this is the url of the script that was injected. */
  var url: js.UndefOr[String] = js.undefined
}

object Anon_Args {
  @scala.inline
  def apply(args: js.Array[_] = null, result: js.Object = null, tabId: Int | Double = null, url: String = null): Anon_Args = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Args]
  }
}

