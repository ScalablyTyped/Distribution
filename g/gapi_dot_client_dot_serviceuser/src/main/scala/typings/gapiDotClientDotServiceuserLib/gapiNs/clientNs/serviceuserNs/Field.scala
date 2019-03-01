package typings
package gapiDotClientDotServiceuserLib.gapiNs.clientNs.serviceuserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  /** The field cardinality. */
  var cardinality: js.UndefOr[java.lang.String] = js.undefined
  /** The string value of the default value of this field. Proto2 syntax only. */
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  /** The field JSON name. */
  var jsonName: js.UndefOr[java.lang.String] = js.undefined
  /** The field type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The field name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The field number. */
  var number: js.UndefOr[scala.Double] = js.undefined
  /**
    * The index of the field type in `Type.oneofs`, for message or enumeration
    * types. The first type has index 1; zero means the type is not in the list.
    */
  var oneofIndex: js.UndefOr[scala.Double] = js.undefined
  /** The protocol buffer options. */
  var options: js.UndefOr[js.Array[Option]] = js.undefined
  /** Whether to use alternative packed wire representation. */
  var packed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The field type URL, without the scheme, for message or enumeration
    * types. Example: `"type.googleapis.com/google.protobuf.Timestamp"`.
    */
  var typeUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Field {
  @scala.inline
  def apply(
    cardinality: java.lang.String = null,
    defaultValue: java.lang.String = null,
    jsonName: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    number: scala.Int | scala.Double = null,
    oneofIndex: scala.Int | scala.Double = null,
    options: js.Array[Option] = null,
    packed: js.UndefOr[scala.Boolean] = js.undefined,
    typeUrl: java.lang.String = null
  ): Field = {
    val __obj = js.Dynamic.literal()
    if (cardinality != null) __obj.updateDynamic("cardinality")(cardinality)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (jsonName != null) __obj.updateDynamic("jsonName")(jsonName)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (oneofIndex != null) __obj.updateDynamic("oneofIndex")(oneofIndex.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    if (!js.isUndefined(packed)) __obj.updateDynamic("packed")(packed)
    if (typeUrl != null) __obj.updateDynamic("typeUrl")(typeUrl)
    __obj.asInstanceOf[Field]
  }
}

