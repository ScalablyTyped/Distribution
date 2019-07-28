package typings.gapiDotClientDotFirestore.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  /**
    * An array value.
    *
    * Cannot contain another array value.
    */
  var arrayValue: js.UndefOr[ArrayValue] = js.undefined
  /** A boolean value. */
  var booleanValue: js.UndefOr[Boolean] = js.undefined
  /**
    * A bytes value.
    *
    * Must not exceed 1 MiB - 89 bytes.
    * Only the first 1,500 bytes are considered by queries.
    */
  var bytesValue: js.UndefOr[String] = js.undefined
  /** A double value. */
  var doubleValue: js.UndefOr[Double] = js.undefined
  /** A geo point value representing a point on the surface of Earth. */
  var geoPointValue: js.UndefOr[LatLng] = js.undefined
  /** An integer value. */
  var integerValue: js.UndefOr[String] = js.undefined
  /** A map value. */
  var mapValue: js.UndefOr[MapValue] = js.undefined
  /** A null value. */
  var nullValue: js.UndefOr[String] = js.undefined
  /**
    * A reference to a document. For example:
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    */
  var referenceValue: js.UndefOr[String] = js.undefined
  /**
    * A string value.
    *
    * The string, represented as UTF-8, must not exceed 1 MiB - 89 bytes.
    * Only the first 1,500 bytes of the UTF-8 representation are considered by
    * queries.
    */
  var stringValue: js.UndefOr[String] = js.undefined
  /**
    * A timestamp value.
    *
    * Precise only to microseconds. When stored, any additional precision is
    * rounded down.
    */
  var timestampValue: js.UndefOr[String] = js.undefined
}

object Value {
  @scala.inline
  def apply(
    arrayValue: ArrayValue = null,
    booleanValue: js.UndefOr[Boolean] = js.undefined,
    bytesValue: String = null,
    doubleValue: Int | Double = null,
    geoPointValue: LatLng = null,
    integerValue: String = null,
    mapValue: MapValue = null,
    nullValue: String = null,
    referenceValue: String = null,
    stringValue: String = null,
    timestampValue: String = null
  ): Value = {
    val __obj = js.Dynamic.literal()
    if (arrayValue != null) __obj.updateDynamic("arrayValue")(arrayValue)
    if (!js.isUndefined(booleanValue)) __obj.updateDynamic("booleanValue")(booleanValue)
    if (bytesValue != null) __obj.updateDynamic("bytesValue")(bytesValue)
    if (doubleValue != null) __obj.updateDynamic("doubleValue")(doubleValue.asInstanceOf[js.Any])
    if (geoPointValue != null) __obj.updateDynamic("geoPointValue")(geoPointValue)
    if (integerValue != null) __obj.updateDynamic("integerValue")(integerValue)
    if (mapValue != null) __obj.updateDynamic("mapValue")(mapValue)
    if (nullValue != null) __obj.updateDynamic("nullValue")(nullValue)
    if (referenceValue != null) __obj.updateDynamic("referenceValue")(referenceValue)
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue)
    if (timestampValue != null) __obj.updateDynamic("timestampValue")(timestampValue)
    __obj.asInstanceOf[Value]
  }
}

