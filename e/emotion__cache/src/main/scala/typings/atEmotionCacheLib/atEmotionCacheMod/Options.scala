package typings
package atEmotionCacheLib.atEmotionCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var container: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var nonce: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[atEmotionStylisLib.atEmotionStylisMod.Prefix] = js.undefined
  var speedy: js.UndefOr[scala.Boolean] = js.undefined
  var stylisPlugins: js.UndefOr[
    atEmotionStylisLib.atEmotionStylisMod.Plugin | js.Array[atEmotionStylisLib.atEmotionStylisMod.Plugin]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    container: stdLib.HTMLElement = null,
    key: java.lang.String = null,
    nonce: java.lang.String = null,
    prefix: atEmotionStylisLib.atEmotionStylisMod.Prefix = null,
    speedy: js.UndefOr[scala.Boolean] = js.undefined,
    stylisPlugins: atEmotionStylisLib.atEmotionStylisMod.Plugin | js.Array[atEmotionStylisLib.atEmotionStylisMod.Plugin] = null
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

