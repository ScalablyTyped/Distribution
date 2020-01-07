package typings.googleapis.buildSrcApisLoggingV2Mod.logging_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of a label.
  */
@js.native
trait Schema$LabelDescriptor extends js.Object {
  /**
    * A human-readable description for the label.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The label key.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * The type of data that can be assigned to the label.
    */
  var valueType: js.UndefOr[String] = js.native
}

object Schema$LabelDescriptor {
  @scala.inline
  def apply(description: String = null, key: String = null, valueType: String = null): Schema$LabelDescriptor = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (valueType != null) __obj.updateDynamic("valueType")(valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LabelDescriptor]
  }
}

