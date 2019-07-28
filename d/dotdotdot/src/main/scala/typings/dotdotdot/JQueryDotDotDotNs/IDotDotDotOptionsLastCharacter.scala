package typings.dotdotdot.JQueryDotDotDotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDotDotDotOptionsLastCharacter extends js.Object {
  /** Don't add an ellipsis if this array contains
    * the last character of the truncated text.
    * Default:  []
    */
  var noEllipsis: js.UndefOr[js.Array[String]] = js.undefined
  /** Remove these characters from the end of the truncated text.
    * Default: [' ', ',', ';', '.', '!', '?']
    */
  var remove: js.UndefOr[js.Array[String]] = js.undefined
}

object IDotDotDotOptionsLastCharacter {
  @scala.inline
  def apply(noEllipsis: js.Array[String] = null, remove: js.Array[String] = null): IDotDotDotOptionsLastCharacter = {
    val __obj = js.Dynamic.literal()
    if (noEllipsis != null) __obj.updateDynamic("noEllipsis")(noEllipsis)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[IDotDotDotOptionsLastCharacter]
  }
}

