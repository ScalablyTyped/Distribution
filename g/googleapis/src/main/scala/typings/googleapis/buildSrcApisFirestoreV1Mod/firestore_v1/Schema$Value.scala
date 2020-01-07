package typings.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message that can hold any of the supported value types.
  */
@js.native
trait Schema$Value extends js.Object {
  /**
    * An array value.  Cannot directly contain another array value, though can
    * contain an map which contains another array.
    */
  var arrayValue: js.UndefOr[Schema$ArrayValue] = js.native
  /**
    * A boolean value.
    */
  var booleanValue: js.UndefOr[Boolean] = js.native
  /**
    * A bytes value.  Must not exceed 1 MiB - 89 bytes. Only the first 1,500
    * bytes are considered by queries.
    */
  var bytesValue: js.UndefOr[String] = js.native
  /**
    * A double value.
    */
  var doubleValue: js.UndefOr[Double] = js.native
  /**
    * A geo point value representing a point on the surface of Earth.
    */
  var geoPointValue: js.UndefOr[Schema$LatLng] = js.native
  /**
    * An integer value.
    */
  var integerValue: js.UndefOr[String] = js.native
  /**
    * A map value.
    */
  var mapValue: js.UndefOr[Schema$MapValue] = js.native
  /**
    * A null value.
    */
  var nullValue: js.UndefOr[String] = js.native
  /**
    * A reference to a document. For example:
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    */
  var referenceValue: js.UndefOr[String] = js.native
  /**
    * A string value.  The string, represented as UTF-8, must not exceed 1 MiB
    * - 89 bytes. Only the first 1,500 bytes of the UTF-8 representation are
    * considered by queries.
    */
  var stringValue: js.UndefOr[String] = js.native
  /**
    * A timestamp value.  Precise only to microseconds. When stored, any
    * additional precision is rounded down.
    */
  var timestampValue: js.UndefOr[String] = js.native
}

object Schema$Value {
  @scala.inline
  def apply(
    arrayValue: Schema$ArrayValue = null,
    booleanValue: js.UndefOr[Boolean] = js.undefined,
    bytesValue: String = null,
    doubleValue: Int | Double = null,
    geoPointValue: Schema$LatLng = null,
    integerValue: String = null,
    mapValue: Schema$MapValue = null,
    nullValue: String = null,
    referenceValue: String = null,
    stringValue: String = null,
    timestampValue: String = null
  ): Schema$Value = {
    val __obj = js.Dynamic.literal()
    if (arrayValue != null) __obj.updateDynamic("arrayValue")(arrayValue.asInstanceOf[js.Any])
    if (!js.isUndefined(booleanValue)) __obj.updateDynamic("booleanValue")(booleanValue.asInstanceOf[js.Any])
    if (bytesValue != null) __obj.updateDynamic("bytesValue")(bytesValue.asInstanceOf[js.Any])
    if (doubleValue != null) __obj.updateDynamic("doubleValue")(doubleValue.asInstanceOf[js.Any])
    if (geoPointValue != null) __obj.updateDynamic("geoPointValue")(geoPointValue.asInstanceOf[js.Any])
    if (integerValue != null) __obj.updateDynamic("integerValue")(integerValue.asInstanceOf[js.Any])
    if (mapValue != null) __obj.updateDynamic("mapValue")(mapValue.asInstanceOf[js.Any])
    if (nullValue != null) __obj.updateDynamic("nullValue")(nullValue.asInstanceOf[js.Any])
    if (referenceValue != null) __obj.updateDynamic("referenceValue")(referenceValue.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    if (timestampValue != null) __obj.updateDynamic("timestampValue")(timestampValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Value]
  }
}

