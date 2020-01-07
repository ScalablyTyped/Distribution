package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dynamic Tag
  */
@js.native
trait Schema$FloodlightActivityDynamicTag extends js.Object {
  /**
    * ID of this dynamic tag. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Name of this tag.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Tag code.
    */
  var tag: js.UndefOr[String] = js.native
}

object Schema$FloodlightActivityDynamicTag {
  @scala.inline
  def apply(id: String = null, name: String = null, tag: String = null): Schema$FloodlightActivityDynamicTag = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FloodlightActivityDynamicTag]
  }
}

