package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitOptions extends js.Object {
  var rootFlags: js.UndefOr[ContextFlags] = js.undefined
  var singleLineJsDocComments: js.UndefOr[scala.Boolean] = js.undefined
  var tripleSlashDirectives: js.UndefOr[js.Array[TripleSlashDirective]] = js.undefined
}

object EmitOptions {
  @scala.inline
  def apply(
    rootFlags: ContextFlags = null,
    singleLineJsDocComments: js.UndefOr[scala.Boolean] = js.undefined,
    tripleSlashDirectives: js.Array[TripleSlashDirective] = null
  ): EmitOptions = {
    val __obj = js.Dynamic.literal()
    if (rootFlags != null) __obj.updateDynamic("rootFlags")(rootFlags)
    if (!js.isUndefined(singleLineJsDocComments)) __obj.updateDynamic("singleLineJsDocComments")(singleLineJsDocComments)
    if (tripleSlashDirectives != null) __obj.updateDynamic("tripleSlashDirectives")(tripleSlashDirectives)
    __obj.asInstanceOf[EmitOptions]
  }
}

