package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$CustomAttribute extends js.Object {
  /**
    * Subattributes within this attribute group. Exactly one of value or
    * groupValues must be provided.
    */
  var groupValues: js.UndefOr[js.Array[Schema$CustomAttribute]] = js.native
  /**
    * The name of the attribute. Underscores will be replaced by spaces upon
    * insertion.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The value of the attribute.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$CustomAttribute {
  @scala.inline
  def apply(groupValues: js.Array[Schema$CustomAttribute] = null, name: String = null, value: String = null): Schema$CustomAttribute = {
    val __obj = js.Dynamic.literal()
    if (groupValues != null) __obj.updateDynamic("groupValues")(groupValues.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomAttribute]
  }
}

