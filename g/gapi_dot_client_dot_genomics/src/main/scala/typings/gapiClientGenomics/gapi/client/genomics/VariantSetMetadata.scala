package typings.gapiClientGenomics.gapi.client.genomics

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariantSetMetadata extends js.Object {
  /** A textual description of this metadata. */
  var description: js.UndefOr[String] = js.undefined
  /**
    * User-provided ID field, not enforced by this API.
    * Two or more pieces of structured metadata with identical
    * id and key fields are considered equivalent.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Remaining structured metadata key-value pairs. This must be of the form
    * map<string, string[]> (string key mapping to a list of string values).
    */
  var info: js.UndefOr[Record[String, js.Array[_]]] = js.undefined
  /** The top-level key. */
  var key: js.UndefOr[String] = js.undefined
  /**
    * The number of values that can be included in a field described by this
    * metadata.
    */
  var number: js.UndefOr[String] = js.undefined
  /**
    * The type of data. Possible types include: Integer, Float,
    * Flag, Character, and String.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** The value field for simple metadata */
  var value: js.UndefOr[String] = js.undefined
}

object VariantSetMetadata {
  @scala.inline
  def apply(
    description: String = null,
    id: String = null,
    info: Record[String, js.Array[_]] = null,
    key: String = null,
    number: String = null,
    `type`: String = null,
    value: String = null
  ): VariantSetMetadata = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariantSetMetadata]
  }
}

