package typings
package atEmotionSheetLib.atEmotionSheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var container: stdLib.HTMLElement
  var key: java.lang.String
  var nonce: js.UndefOr[java.lang.String] = js.undefined
  var speedy: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    container: stdLib.HTMLElement,
    key: java.lang.String,
    nonce: java.lang.String = null,
    speedy: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("container")(container)
    __obj.updateDynamic("key")(key)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (!js.isUndefined(speedy)) __obj.updateDynamic("speedy")(speedy)
    __obj.asInstanceOf[Options]
  }
}

