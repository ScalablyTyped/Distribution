package typings.gapiDotClientDotDatastore.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  /**
    * An array value.
    * Cannot contain another array value.
    * A `Value` instance that sets field `array_value` must not set fields
    * `meaning` or `exclude_from_indexes`.
    */
  var arrayValue: js.UndefOr[ArrayValue] = js.undefined
  /**
    * A blob value.
    * May have at most 1,000,000 bytes.
    * When `exclude_from_indexes` is false, may have at most 1500 bytes.
    * In JSON requests, must be base64-encoded.
    */
  var blobValue: js.UndefOr[String] = js.undefined
  /** A boolean value. */
  var booleanValue: js.UndefOr[Boolean] = js.undefined
  /** A double value. */
  var doubleValue: js.UndefOr[Double] = js.undefined
  /**
    * An entity value.
    *
    * - May have no key.
    * - May have a key with an incomplete key path.
    * - May have a reserved/read-only key.
    */
  var entityValue: js.UndefOr[Entity] = js.undefined
  /**
    * If the value should be excluded from all indexes including those defined
    * explicitly.
    */
  var excludeFromIndexes: js.UndefOr[Boolean] = js.undefined
  /** A geo point value representing a point on the surface of Earth. */
  var geoPointValue: js.UndefOr[LatLng] = js.undefined
  /** An integer value. */
  var integerValue: js.UndefOr[String] = js.undefined
  /** A key value. */
  var keyValue: js.UndefOr[Key] = js.undefined
  /** The `meaning` field should only be populated for backwards compatibility. */
  var meaning: js.UndefOr[Double] = js.undefined
  /** A null value. */
  var nullValue: js.UndefOr[String] = js.undefined
  /**
    * A UTF-8 encoded string value.
    * When `exclude_from_indexes` is false (it is indexed) , may have at most 1500 bytes.
    * Otherwise, may be set to at least 1,000,000 bytes.
    */
  var stringValue: js.UndefOr[String] = js.undefined
  /**
    * A timestamp value.
    * When stored in the Datastore, precise only to microseconds;
    * any additional precision is rounded down.
    */
  var timestampValue: js.UndefOr[String] = js.undefined
}

object Value {
  @scala.inline
  def apply(
    arrayValue: ArrayValue = null,
    blobValue: String = null,
    booleanValue: js.UndefOr[Boolean] = js.undefined,
    doubleValue: Int | Double = null,
    entityValue: Entity = null,
    excludeFromIndexes: js.UndefOr[Boolean] = js.undefined,
    geoPointValue: LatLng = null,
    integerValue: String = null,
    keyValue: Key = null,
    meaning: Int | Double = null,
    nullValue: String = null,
    stringValue: String = null,
    timestampValue: String = null
  ): Value = {
    val __obj = js.Dynamic.literal()
    if (arrayValue != null) __obj.updateDynamic("arrayValue")(arrayValue)
    if (blobValue != null) __obj.updateDynamic("blobValue")(blobValue)
    if (!js.isUndefined(booleanValue)) __obj.updateDynamic("booleanValue")(booleanValue)
    if (doubleValue != null) __obj.updateDynamic("doubleValue")(doubleValue.asInstanceOf[js.Any])
    if (entityValue != null) __obj.updateDynamic("entityValue")(entityValue)
    if (!js.isUndefined(excludeFromIndexes)) __obj.updateDynamic("excludeFromIndexes")(excludeFromIndexes)
    if (geoPointValue != null) __obj.updateDynamic("geoPointValue")(geoPointValue)
    if (integerValue != null) __obj.updateDynamic("integerValue")(integerValue)
    if (keyValue != null) __obj.updateDynamic("keyValue")(keyValue)
    if (meaning != null) __obj.updateDynamic("meaning")(meaning.asInstanceOf[js.Any])
    if (nullValue != null) __obj.updateDynamic("nullValue")(nullValue)
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue)
    if (timestampValue != null) __obj.updateDynamic("timestampValue")(timestampValue)
    __obj.asInstanceOf[Value]
  }
}

