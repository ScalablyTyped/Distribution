package typings.gapiDotClientDotGenomics.gapiNs.clientNs.genomicsNs

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallSet extends js.Object {
  /** The date this call set was created in milliseconds from the epoch. */
  var created: js.UndefOr[String] = js.undefined
  /** The server-generated call set ID, unique across all call sets. */
  var id: js.UndefOr[String] = js.undefined
  /**
    * A map of additional call set information. This must be of the form
    * map<string, string[]> (string key mapping to a list of string values).
    */
  var info: js.UndefOr[Record[String, js.Array[_]]] = js.undefined
  /** The call set name. */
  var name: js.UndefOr[String] = js.undefined
  /** The sample ID this call set corresponds to. */
  var sampleId: js.UndefOr[String] = js.undefined
  /**
    * The IDs of the variant sets this call set belongs to. This field must
    * have exactly length one, as a call set belongs to a single variant set.
    * This field is repeated for compatibility with the
    * [GA4GH 0.5.1
    * API](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/variants.avdl#L76).
    */
  var variantSetIds: js.UndefOr[js.Array[String]] = js.undefined
}

object CallSet {
  @scala.inline
  def apply(
    created: String = null,
    id: String = null,
    info: Record[String, js.Array[_]] = null,
    name: String = null,
    sampleId: String = null,
    variantSetIds: js.Array[String] = null
  ): CallSet = {
    val __obj = js.Dynamic.literal()
    if (created != null) __obj.updateDynamic("created")(created)
    if (id != null) __obj.updateDynamic("id")(id)
    if (info != null) __obj.updateDynamic("info")(info)
    if (name != null) __obj.updateDynamic("name")(name)
    if (sampleId != null) __obj.updateDynamic("sampleId")(sampleId)
    if (variantSetIds != null) __obj.updateDynamic("variantSetIds")(variantSetIds)
    __obj.asInstanceOf[CallSet]
  }
}

