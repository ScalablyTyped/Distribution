package typings.atEmotionCache.atEmotionCacheMod

import typings.atEmotionStylis.atEmotionStylisMod.Plugin
import typings.atEmotionStylis.atEmotionStylisMod.Prefix
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var container: js.UndefOr[HTMLElement] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[Prefix] = js.undefined
  var speedy: js.UndefOr[Boolean] = js.undefined
  var stylisPlugins: js.UndefOr[Plugin | js.Array[Plugin]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    container: HTMLElement = null,
    key: String = null,
    nonce: String = null,
    prefix: Prefix = null,
    speedy: js.UndefOr[Boolean] = js.undefined,
    stylisPlugins: Plugin | js.Array[Plugin] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container)
    if (key != null) __obj.updateDynamic("key")(key)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(speedy)) __obj.updateDynamic("speedy")(speedy)
    if (stylisPlugins != null) __obj.updateDynamic("stylisPlugins")(stylisPlugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

