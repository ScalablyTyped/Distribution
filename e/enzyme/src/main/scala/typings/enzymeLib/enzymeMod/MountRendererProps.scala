package typings
package enzymeLib.enzymeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MountRendererProps extends js.Object {
  /**
    * DOM Element to attach the component to
    */
  var attachTo: js.UndefOr[stdLib.HTMLElement | scala.Null] = js.undefined
  /**
    * Merged contextTypes for all children of the wrapper
    */
  var childContextTypes: js.UndefOr[js.Object] = js.undefined
  /**
    * Context to be passed into the component
    */
  var context: js.UndefOr[js.Object] = js.undefined
}

object MountRendererProps {
  @scala.inline
  def apply(
    attachTo: stdLib.HTMLElement = null,
    childContextTypes: js.Object = null,
    context: js.Object = null
  ): MountRendererProps = {
    val __obj = js.Dynamic.literal()
    if (attachTo != null) __obj.updateDynamic("attachTo")(attachTo)
    if (childContextTypes != null) __obj.updateDynamic("childContextTypes")(childContextTypes)
    if (context != null) __obj.updateDynamic("context")(context)
    __obj.asInstanceOf[MountRendererProps]
  }
}

