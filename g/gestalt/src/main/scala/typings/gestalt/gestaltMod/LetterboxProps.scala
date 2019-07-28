package typings.gestalt.gestaltMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LetterboxProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var contentAspectRatio: Double
  var height: Double
  var width: Double
}

object LetterboxProps {
  @scala.inline
  def apply(contentAspectRatio: Double, height: Double, width: Double, children: ReactNode = null): LetterboxProps = {
    val __obj = js.Dynamic.literal(contentAspectRatio = contentAspectRatio, height = height, width = width)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[LetterboxProps]
  }
}

