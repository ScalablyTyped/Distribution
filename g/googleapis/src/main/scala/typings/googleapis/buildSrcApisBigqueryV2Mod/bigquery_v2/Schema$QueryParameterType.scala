package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import typings.googleapis.Anon_Description
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$QueryParameterType extends js.Object {
  /**
    * [Optional] The type of the array&#39;s elements, if this is an array.
    */
  var arrayType: js.UndefOr[Schema$QueryParameterType] = js.native
  /**
    * [Optional] The types of the fields of this struct, in order, if this is a
    * struct.
    */
  var structTypes: js.UndefOr[js.Array[Anon_Description]] = js.native
  /**
    * [Required] The top level type of this field.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$QueryParameterType {
  @scala.inline
  def apply(
    arrayType: Schema$QueryParameterType = null,
    structTypes: js.Array[Anon_Description] = null,
    `type`: String = null
  ): Schema$QueryParameterType = {
    val __obj = js.Dynamic.literal()
    if (arrayType != null) __obj.updateDynamic("arrayType")(arrayType.asInstanceOf[js.Any])
    if (structTypes != null) __obj.updateDynamic("structTypes")(structTypes.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$QueryParameterType]
  }
}

