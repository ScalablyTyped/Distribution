package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties of inheriting and overriding the default click-through event
  * tag. A campaign may override the event tag defined at the advertiser level,
  * and an ad may also override the campaign&#39;s setting further.
  */
@js.native
trait Schema$DefaultClickThroughEventTagProperties extends js.Object {
  /**
    * ID of the click-through event tag to apply to all ads in this
    * entity&#39;s scope.
    */
  var defaultClickThroughEventTagId: js.UndefOr[String] = js.native
  /**
    * Whether this entity should override the inherited default click-through
    * event tag with its own defined value.
    */
  var overrideInheritedEventTag: js.UndefOr[Boolean] = js.native
}

object Schema$DefaultClickThroughEventTagProperties {
  @scala.inline
  def apply(
    defaultClickThroughEventTagId: String = null,
    overrideInheritedEventTag: js.UndefOr[Boolean] = js.undefined
  ): Schema$DefaultClickThroughEventTagProperties = {
    val __obj = js.Dynamic.literal()
    if (defaultClickThroughEventTagId != null) __obj.updateDynamic("defaultClickThroughEventTagId")(defaultClickThroughEventTagId.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideInheritedEventTag)) __obj.updateDynamic("overrideInheritedEventTag")(overrideInheritedEventTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DefaultClickThroughEventTagProperties]
  }
}

