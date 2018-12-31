package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariantSetMetadata extends js.Object {
  /** A textual description of this metadata. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * User-provided ID field, not enforced by this API.
    * Two or more pieces of structured metadata with identical
    * id and key fields are considered equivalent.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Remaining structured metadata key-value pairs. This must be of the form
    * map<string, string[]> (string key mapping to a list of string values).
    */
  var info: js.UndefOr[stdLib.Record[java.lang.String, js.Array[_]]] = js.undefined
  /** The top-level key. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The number of values that can be included in a field described by this
    * metadata.
    */
  var number: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of data. Possible types include: Integer, Float,
    * Flag, Character, and String.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** The value field for simple metadata */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

