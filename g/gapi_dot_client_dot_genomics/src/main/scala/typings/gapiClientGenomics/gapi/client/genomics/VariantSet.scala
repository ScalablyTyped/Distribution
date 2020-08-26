package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariantSet extends js.Object {
  /** The dataset to which this variant set belongs. */
  var datasetId: js.UndefOr[String] = js.native
  /** A textual description of this variant set. */
  var description: js.UndefOr[String] = js.native
  /** The server-generated variant set ID, unique across all variant sets. */
  var id: js.UndefOr[String] = js.native
  /** The metadata associated with this variant set. */
  var metadata: js.UndefOr[js.Array[VariantSetMetadata]] = js.native
  /** User-specified, mutable name. */
  var name: js.UndefOr[String] = js.native
  /**
    * A list of all references used by the variants in a variant set
    * with associated coordinate upper bounds for each one.
    */
  var referenceBounds: js.UndefOr[js.Array[ReferenceBound]] = js.native
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
  var referenceSetId: js.UndefOr[String] = js.native
}

object VariantSet {
  @scala.inline
  def apply(): VariantSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VariantSet]
  }
  @scala.inline
  implicit class VariantSetOps[Self <: VariantSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDatasetId(value: String): Self = this.set("datasetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetId: Self = this.set("datasetId", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMetadataVarargs(value: VariantSetMetadata*): Self = this.set("metadata", js.Array(value :_*))
    @scala.inline
    def setMetadata(value: js.Array[VariantSetMetadata]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setReferenceBoundsVarargs(value: ReferenceBound*): Self = this.set("referenceBounds", js.Array(value :_*))
    @scala.inline
    def setReferenceBounds(value: js.Array[ReferenceBound]): Self = this.set("referenceBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceBounds: Self = this.set("referenceBounds", js.undefined)
    @scala.inline
    def setReferenceSetId(value: String): Self = this.set("referenceSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceSetId: Self = this.set("referenceSetId", js.undefined)
  }
  
}

