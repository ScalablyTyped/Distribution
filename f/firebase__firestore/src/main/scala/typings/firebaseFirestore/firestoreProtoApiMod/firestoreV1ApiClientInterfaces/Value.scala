package typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.firestoreProtoApiMod.Timestamp
import typings.firebaseFirestore.firestoreProtoApiMod.ValueNullValue
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var arrayValue: js.UndefOr[ArrayValue] = js.undefined
  var booleanValue: js.UndefOr[Boolean] = js.undefined
  var bytesValue: js.UndefOr[String | Uint8Array] = js.undefined
  var doubleValue: js.UndefOr[String | Double] = js.undefined
  var geoPointValue: js.UndefOr[LatLng] = js.undefined
  var integerValue: js.UndefOr[String | Double] = js.undefined
  var mapValue: js.UndefOr[MapValue] = js.undefined
  var nullValue: js.UndefOr[ValueNullValue] = js.undefined
  var referenceValue: js.UndefOr[String] = js.undefined
  var stringValue: js.UndefOr[String] = js.undefined
  var timestampValue: js.UndefOr[Timestamp] = js.undefined
}

object Value {
  @scala.inline
  def apply(
    arrayValue: ArrayValue = null,
    booleanValue: js.UndefOr[Boolean] = js.undefined,
    bytesValue: String | Uint8Array = null,
    doubleValue: String | Double = null,
    geoPointValue: LatLng = null,
    integerValue: String | Double = null,
    mapValue: MapValue = null,
    nullValue: ValueNullValue = null,
    referenceValue: String = null,
    stringValue: String = null,
    timestampValue: Timestamp = null
  ): Value = {
    val __obj = js.Dynamic.literal()
    if (arrayValue != null) __obj.updateDynamic("arrayValue")(arrayValue.asInstanceOf[js.Any])
    if (!js.isUndefined(booleanValue)) __obj.updateDynamic("booleanValue")(booleanValue.get.asInstanceOf[js.Any])
    if (bytesValue != null) __obj.updateDynamic("bytesValue")(bytesValue.asInstanceOf[js.Any])
    if (doubleValue != null) __obj.updateDynamic("doubleValue")(doubleValue.asInstanceOf[js.Any])
    if (geoPointValue != null) __obj.updateDynamic("geoPointValue")(geoPointValue.asInstanceOf[js.Any])
    if (integerValue != null) __obj.updateDynamic("integerValue")(integerValue.asInstanceOf[js.Any])
    if (mapValue != null) __obj.updateDynamic("mapValue")(mapValue.asInstanceOf[js.Any])
    if (nullValue != null) __obj.updateDynamic("nullValue")(nullValue.asInstanceOf[js.Any])
    if (referenceValue != null) __obj.updateDynamic("referenceValue")(referenceValue.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    if (timestampValue != null) __obj.updateDynamic("timestampValue")(timestampValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

