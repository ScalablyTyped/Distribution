package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$CustomGroup extends js.Object {
  /**
    * The sub-attributes.
    */
  var attributes: js.UndefOr[js.Array[Schema$CustomAttribute]] = js.native
  /**
    * The name of the group. Underscores will be replaced by spaces upon
    * insertion.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$CustomGroup {
  @scala.inline
  def apply(attributes: js.Array[Schema$CustomAttribute] = null, name: String = null): Schema$CustomGroup = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomGroup]
  }
}

