package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LetterboxProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var contentAspectRatio: scala.Double
  var height: scala.Double
  var width: scala.Double
}

object LetterboxProps {
  @scala.inline
  def apply(
    contentAspectRatio: scala.Double,
    height: scala.Double,
    width: scala.Double,
    children: reactLib.reactMod.ReactNs.ReactNode = null
  ): LetterboxProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentAspectRatio")(contentAspectRatio)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[LetterboxProps]
  }
}

