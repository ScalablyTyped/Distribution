package typings
package atEmotionCacheLib.atEmotionCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var container: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var nonce: js.UndefOr[java.lang.String] = js.undefined
  var prefix: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Prefix */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Prefix */ js.Any
  ] = js.undefined
  var speedy: js.UndefOr[scala.Boolean] = js.undefined
  var stylisPlugins: js.UndefOr[
    (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StylisPlugin */ js.Any) | (js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StylisPlugin */ _
    ])
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    container: stdLib.HTMLElement = null,
    key: java.lang.String = null,
    nonce: java.lang.String = null,
    prefix: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Prefix */ js.Any = null,
    speedy: js.UndefOr[scala.Boolean] = js.undefined,
    stylisPlugins: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StylisPlugin */ js.Any) | (js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StylisPlugin */ _
    ]) = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container)
    if (key != null) __obj.updateDynamic("key")(key)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (!js.isUndefined(speedy)) __obj.updateDynamic("speedy")(speedy)
    if (stylisPlugins != null) __obj.updateDynamic("stylisPlugins")(stylisPlugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

