package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var htmlFor: java.lang.String
}

object LabelProps {
  @scala.inline
  def apply(htmlFor: java.lang.String, children: reactLib.reactMod.ReactNs.ReactNode = null): LabelProps = {
    val __obj = js.Dynamic.literal(htmlFor = htmlFor)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelProps]
  }
}

