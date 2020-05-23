package typings.emotionSheet.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var container: HTMLElement
  var key: String
  var nonce: js.UndefOr[String] = js.undefined
  var speedy: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    container: HTMLElement,
    key: String,
    nonce: String = null,
    speedy: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (!js.isUndefined(speedy)) __obj.updateDynamic("speedy")(speedy.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

