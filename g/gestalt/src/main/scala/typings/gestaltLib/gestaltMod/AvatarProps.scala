package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarProps extends js.Object {
  var name: java.lang.String
  var outline: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[
    gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg
  ] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
  var verified: js.UndefOr[scala.Boolean] = js.undefined
}

object AvatarProps {
  @scala.inline
  def apply(
    name: java.lang.String,
    outline: js.UndefOr[scala.Boolean] = js.undefined,
    size: gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg = null,
    src: java.lang.String = null,
    verified: js.UndefOr[scala.Boolean] = js.undefined
  ): AvatarProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (!js.isUndefined(outline)) __obj.updateDynamic("outline")(outline)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src)
    if (!js.isUndefined(verified)) __obj.updateDynamic("verified")(verified)
    __obj.asInstanceOf[AvatarProps]
  }
}

