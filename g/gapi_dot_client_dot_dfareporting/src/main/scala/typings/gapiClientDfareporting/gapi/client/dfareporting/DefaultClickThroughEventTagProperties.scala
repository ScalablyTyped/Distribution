package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultClickThroughEventTagProperties extends js.Object {
  /** ID of the click-through event tag to apply to all ads in this entity's scope. */
  var defaultClickThroughEventTagId: js.UndefOr[String] = js.undefined
  /** Whether this entity should override the inherited default click-through event tag with its own defined value. */
  var overrideInheritedEventTag: js.UndefOr[Boolean] = js.undefined
}

object DefaultClickThroughEventTagProperties {
  @scala.inline
  def apply(
    defaultClickThroughEventTagId: String = null,
    overrideInheritedEventTag: js.UndefOr[Boolean] = js.undefined
  ): DefaultClickThroughEventTagProperties = {
    val __obj = js.Dynamic.literal()
    if (defaultClickThroughEventTagId != null) __obj.updateDynamic("defaultClickThroughEventTagId")(defaultClickThroughEventTagId.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideInheritedEventTag)) __obj.updateDynamic("overrideInheritedEventTag")(overrideInheritedEventTag.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultClickThroughEventTagProperties]
  }
}

