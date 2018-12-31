package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperMetadata extends js.Object {
  /** The location where the metadata is associated. */
  var location: js.UndefOr[DeveloperMetadataLocation] = js.undefined
  /**
    * The spreadsheet-scoped unique ID that identifies the metadata. IDs may be
    * specified when metadata is created, otherwise one will be randomly
    * generated and assigned. Must be positive.
    */
  var metadataId: js.UndefOr[scala.Double] = js.undefined
  /**
    * The metadata key. There may be multiple metadata in a spreadsheet with the
    * same key.  Developer metadata must always have a key specified.
    */
  var metadataKey: js.UndefOr[java.lang.String] = js.undefined
  /** Data associated with the metadata's key. */
  var metadataValue: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The metadata visibility.  Developer metadata must always have a visibility
    * specified.
    */
  var visibility: js.UndefOr[java.lang.String] = js.undefined
}

