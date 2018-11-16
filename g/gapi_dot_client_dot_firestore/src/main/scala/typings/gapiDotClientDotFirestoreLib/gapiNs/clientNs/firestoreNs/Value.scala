package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

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
  var booleanValue: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * A bytes value.
               *
               * Must not exceed 1 MiB - 89 bytes.
               * Only the first 1,500 bytes are considered by queries.
               */
  var bytesValue: js.UndefOr[java.lang.String] = js.undefined
  /** A double value. */
  var doubleValue: js.UndefOr[scala.Double] = js.undefined
  /** A geo point value representing a point on the surface of Earth. */
  var geoPointValue: js.UndefOr[LatLng] = js.undefined
  /** An integer value. */
  var integerValue: js.UndefOr[java.lang.String] = js.undefined
  /** A map value. */
  var mapValue: js.UndefOr[MapValue] = js.undefined
  /** A null value. */
  var nullValue: js.UndefOr[java.lang.String] = js.undefined
  /**
               * A reference to a document. For example:
               * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
               */
  var referenceValue: js.UndefOr[java.lang.String] = js.undefined
  /**
               * A string value.
               *
               * The string, represented as UTF-8, must not exceed 1 MiB - 89 bytes.
               * Only the first 1,500 bytes of the UTF-8 representation are considered by
               * queries.
               */
  var stringValue: js.UndefOr[java.lang.String] = js.undefined
  /**
               * A timestamp value.
               *
               * Precise only to microseconds. When stored, any additional precision is
               * rounded down.
               */
  var timestampValue: js.UndefOr[java.lang.String] = js.undefined
}

