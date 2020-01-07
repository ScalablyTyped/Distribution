package typings.googleapis.buildSrcApisVisionV1p2beta1Mod.vision_v1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `Property` consists of a user-supplied name/value pair.
  */
@js.native
trait Schema$GoogleCloudVisionV1p3beta1Property extends js.Object {
  /**
    * Name of the property.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Value of numeric properties.
    */
  var uint64Value: js.UndefOr[String] = js.native
  /**
    * Value of the property.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudVisionV1p3beta1Property {
  @scala.inline
  def apply(name: String = null, uint64Value: String = null, value: String = null): Schema$GoogleCloudVisionV1p3beta1Property = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (uint64Value != null) __obj.updateDynamic("uint64Value")(uint64Value.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p3beta1Property]
  }
}

