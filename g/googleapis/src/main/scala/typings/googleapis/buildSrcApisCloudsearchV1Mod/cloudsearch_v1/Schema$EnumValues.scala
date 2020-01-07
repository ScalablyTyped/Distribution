package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of enum values.
  */
@js.native
trait Schema$EnumValues extends js.Object {
  /**
    * The maximum allowable length for string values is 32 characters.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object Schema$EnumValues {
  @scala.inline
  def apply(values: js.Array[String] = null): Schema$EnumValues = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EnumValues]
  }
}

