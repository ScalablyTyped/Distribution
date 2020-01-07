package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A product label represented as a key-value pair.
  */
@js.native
trait Schema$KeyValue extends js.Object {
  /**
    * The key of the label attached to the product. Cannot be empty and cannot
    * exceed 128 bytes.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * The value of the label attached to the product. Cannot be empty and
    * cannot exceed 128 bytes.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$KeyValue {
  @scala.inline
  def apply(key: String = null, value: String = null): Schema$KeyValue = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$KeyValue]
  }
}

