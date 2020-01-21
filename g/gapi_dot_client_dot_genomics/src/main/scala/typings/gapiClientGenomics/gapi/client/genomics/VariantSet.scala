package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariantSet extends js.Object {
  /** The dataset to which this variant set belongs. */
  var datasetId: js.UndefOr[String] = js.undefined
  /** A textual description of this variant set. */
  var description: js.UndefOr[String] = js.undefined
  /** The server-generated variant set ID, unique across all variant sets. */
  var id: js.UndefOr[String] = js.undefined
  /** The metadata associated with this variant set. */
  var metadata: js.UndefOr[js.Array[VariantSetMetadata]] = js.undefined
  /** User-specified, mutable name. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * A list of all references used by the variants in a variant set
    * with associated coordinate upper bounds for each one.
    */
  var referenceBounds: js.UndefOr[js.Array[ReferenceBound]] = js.undefined
  /**
    * The reference set to which the variant set is mapped. The reference set
    * describes the alignment provenance of the variant set, while the
    * `referenceBounds` describe the shape of the actual variant data. The
    * reference set's reference names are a superset of those found in the
    * `referenceBounds`.
    *
    * For example, given a variant set that is mapped to the GRCh38 reference set
    * and contains a single variant on reference 'X', `referenceBounds` would
    * contain only an entry for 'X', while the associated reference set
    * enumerates all possible references: '1', '2', 'X', 'Y', 'MT', etc.
    */
  var referenceSetId: js.UndefOr[String] = js.undefined
}

object VariantSet {
  @scala.inline
  def apply(
    datasetId: String = null,
    description: String = null,
    id: String = null,
    metadata: js.Array[VariantSetMetadata] = null,
    name: String = null,
    referenceBounds: js.Array[ReferenceBound] = null,
    referenceSetId: String = null
  ): VariantSet = {
    val __obj = js.Dynamic.literal()
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (referenceBounds != null) __obj.updateDynamic("referenceBounds")(referenceBounds.asInstanceOf[js.Any])
    if (referenceSetId != null) __obj.updateDynamic("referenceSetId")(referenceSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariantSet]
  }
}

