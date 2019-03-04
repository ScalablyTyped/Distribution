package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupAvatarProps extends js.Object {
  var collaborators: js.Array[gestaltLib.Anon_Name]
  var outline: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[
    gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg
  ] = js.undefined
}

object GroupAvatarProps {
  @scala.inline
  def apply(
    collaborators: js.Array[gestaltLib.Anon_Name],
    outline: js.UndefOr[scala.Boolean] = js.undefined,
    size: gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg = null
  ): GroupAvatarProps = {
    val __obj = js.Dynamic.literal(collaborators = collaborators)
    if (!js.isUndefined(outline)) __obj.updateDynamic("outline")(outline)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupAvatarProps]
  }
}

