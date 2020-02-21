package typings.duoWebSdk.mod

import typings.std.HTMLElement
import typings.std.HTMLFormElement
import typings.std.HTMLIFrameElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends js.Object {
  var host: String
  var iframe: js.UndefOr[String | HTMLIFrameElement] = js.undefined
  var iframeAttributes: js.UndefOr[js.Object] = js.undefined
  var iframeContainer: js.UndefOr[String | HTMLElement] = js.undefined
  var post_action: js.UndefOr[String] = js.undefined
  var post_argument: js.UndefOr[String] = js.undefined
  var sig_request: String
  var submit_callback: js.UndefOr[js.Function1[/* duo_form */ HTMLFormElement, Unit]] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(
    host: String,
    sig_request: String,
    iframe: String | HTMLIFrameElement = null,
    iframeAttributes: js.Object = null,
    iframeContainer: String | HTMLElement = null,
    post_action: String = null,
    post_argument: String = null,
    submit_callback: /* duo_form */ HTMLFormElement => Unit = null
  ): InitOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], sig_request = sig_request.asInstanceOf[js.Any])
    if (iframe != null) __obj.updateDynamic("iframe")(iframe.asInstanceOf[js.Any])
    if (iframeAttributes != null) __obj.updateDynamic("iframeAttributes")(iframeAttributes.asInstanceOf[js.Any])
    if (iframeContainer != null) __obj.updateDynamic("iframeContainer")(iframeContainer.asInstanceOf[js.Any])
    if (post_action != null) __obj.updateDynamic("post_action")(post_action.asInstanceOf[js.Any])
    if (post_argument != null) __obj.updateDynamic("post_argument")(post_argument.asInstanceOf[js.Any])
    if (submit_callback != null) __obj.updateDynamic("submit_callback")(js.Any.fromFunction1(submit_callback))
    __obj.asInstanceOf[InitOptions]
  }
}

