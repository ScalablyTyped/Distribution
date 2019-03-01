package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultClickThroughEventTagProperties extends js.Object {
  /** ID of the click-through event tag to apply to all ads in this entity's scope. */
  var defaultClickThroughEventTagId: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this entity should override the inherited default click-through event tag with its own defined value. */
  var overrideInheritedEventTag: js.UndefOr[scala.Boolean] = js.undefined
}

object DefaultClickThroughEventTagProperties {
  @scala.inline
  def apply(
    defaultClickThroughEventTagId: java.lang.String = null,
    overrideInheritedEventTag: js.UndefOr[scala.Boolean] = js.undefined
  ): DefaultClickThroughEventTagProperties = {
    val __obj = js.Dynamic.literal()
    if (defaultClickThroughEventTagId != null) __obj.updateDynamic("defaultClickThroughEventTagId")(defaultClickThroughEventTagId)
    if (!js.isUndefined(overrideInheritedEventTag)) __obj.updateDynamic("overrideInheritedEventTag")(overrideInheritedEventTag)
    __obj.asInstanceOf[DefaultClickThroughEventTagProperties]
  }
}

