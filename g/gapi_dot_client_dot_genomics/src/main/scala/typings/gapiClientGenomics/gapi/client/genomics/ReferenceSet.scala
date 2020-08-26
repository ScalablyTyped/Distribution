package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceSet extends js.Object {
  /** Public id of this reference set, such as `GRCh37`. */
  var assemblyId: js.UndefOr[String] = js.native
  /** Free text description of this reference set. */
  var description: js.UndefOr[String] = js.native
  /** The server-generated reference set ID, unique across all reference sets. */
  var id: js.UndefOr[String] = js.native
  /**
    * Order-independent MD5 checksum which identifies this reference set. The
    * checksum is computed by sorting all lower case hexidecimal string
    * `reference.md5checksum` (for all reference in this set) in
    * ascending lexicographic order, concatenating, and taking the MD5 of that
    * value. The resulting value is represented in lower case hexadecimal format.
    */
  var md5checksum: js.UndefOr[String] = js.native
  /**
    * ID from http://www.ncbi.nlm.nih.gov/taxonomy (for example, 9606 for human)
    * indicating the species which this reference set is intended to model. Note
    * that contained references may specify a different `ncbiTaxonId`, as
    * assemblies may contain reference sequences which do not belong to the
    * modeled species, for example EBV in a human reference genome.
    */
  var ncbiTaxonId: js.UndefOr[Double] = js.native
  /**
    * The IDs of the reference objects that are part of this set.
    * `Reference.md5checksum` must be unique within this set.
    */
  var referenceIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * All known corresponding accession IDs in INSDC (GenBank/ENA/DDBJ) ideally
    * with a version number, for example `NC_000001.11`.
    */
  var sourceAccessions: js.UndefOr[js.Array[String]] = js.native
  /** The URI from which the references were obtained. */
  var sourceUri: js.UndefOr[String] = js.native
}

object ReferenceSet {
  @scala.inline
  def apply(): ReferenceSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferenceSet]
  }
  @scala.inline
  implicit class ReferenceSetOps[Self <: ReferenceSet] (val x: Self) extends AnyVal {
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
    def setAssemblyId(value: String): Self = this.set("assemblyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssemblyId: Self = this.set("assemblyId", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMd5checksum(value: String): Self = this.set("md5checksum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMd5checksum: Self = this.set("md5checksum", js.undefined)
    @scala.inline
    def setNcbiTaxonId(value: Double): Self = this.set("ncbiTaxonId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNcbiTaxonId: Self = this.set("ncbiTaxonId", js.undefined)
    @scala.inline
    def setReferenceIdsVarargs(value: String*): Self = this.set("referenceIds", js.Array(value :_*))
    @scala.inline
    def setReferenceIds(value: js.Array[String]): Self = this.set("referenceIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceIds: Self = this.set("referenceIds", js.undefined)
    @scala.inline
    def setSourceAccessionsVarargs(value: String*): Self = this.set("sourceAccessions", js.Array(value :_*))
    @scala.inline
    def setSourceAccessions(value: js.Array[String]): Self = this.set("sourceAccessions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceAccessions: Self = this.set("sourceAccessions", js.undefined)
    @scala.inline
    def setSourceUri(value: String): Self = this.set("sourceUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceUri: Self = this.set("sourceUri", js.undefined)
  }
  
}

