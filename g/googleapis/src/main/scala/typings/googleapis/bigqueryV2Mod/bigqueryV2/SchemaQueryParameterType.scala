package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapis.AnonDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaQueryParameterType extends js.Object {
  /**
    * [Optional] The type of the array&#39;s elements, if this is an array.
    */
  var arrayType: js.UndefOr[SchemaQueryParameterType] = js.native
  /**
    * [Optional] The types of the fields of this struct, in order, if this is a
    * struct.
    */
  var structTypes: js.UndefOr[js.Array[AnonDescription]] = js.native
  /**
    * [Required] The top level type of this field.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaQueryParameterType {
  @scala.inline
  def apply(
    arrayType: SchemaQueryParameterType = null,
    structTypes: js.Array[AnonDescription] = null,
    `type`: String = null
  ): SchemaQueryParameterType = {
    val __obj = js.Dynamic.literal()
    if (arrayType != null) __obj.updateDynamic("arrayType")(arrayType.asInstanceOf[js.Any])
    if (structTypes != null) __obj.updateDynamic("structTypes")(structTypes.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQueryParameterType]
  }
}

