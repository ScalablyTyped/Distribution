package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of enum values.
  */
@js.native
trait SchemaEnumValues extends js.Object {
  /**
    * The maximum allowable length for string values is 32 characters.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object SchemaEnumValues {
  @scala.inline
  def apply(values: js.Array[String] = null): SchemaEnumValues = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEnumValues]
  }
}

