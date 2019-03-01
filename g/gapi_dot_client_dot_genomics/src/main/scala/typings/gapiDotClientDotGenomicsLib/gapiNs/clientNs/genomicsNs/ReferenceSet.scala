package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceSet extends js.Object {
  /** Public id of this reference set, such as `GRCh37`. */
  var assemblyId: js.UndefOr[java.lang.String] = js.undefined
  /** Free text description of this reference set. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The server-generated reference set ID, unique across all reference sets. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Order-independent MD5 checksum which identifies this reference set. The
    * checksum is computed by sorting all lower case hexidecimal string
    * `reference.md5checksum` (for all reference in this set) in
    * ascending lexicographic order, concatenating, and taking the MD5 of that
    * value. The resulting value is represented in lower case hexadecimal format.
    */
  var md5checksum: js.UndefOr[java.lang.String] = js.undefined
  /**
    * ID from http://www.ncbi.nlm.nih.gov/taxonomy (for example, 9606 for human)
    * indicating the species which this reference set is intended to model. Note
    * that contained references may specify a different `ncbiTaxonId`, as
    * assemblies may contain reference sequences which do not belong to the
    * modeled species, for example EBV in a human reference genome.
    */
  var ncbiTaxonId: js.UndefOr[scala.Double] = js.undefined
  /**
    * The IDs of the reference objects that are part of this set.
    * `Reference.md5checksum` must be unique within this set.
    */
  var referenceIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * All known corresponding accession IDs in INSDC (GenBank/ENA/DDBJ) ideally
    * with a version number, for example `NC_000001.11`.
    */
  var sourceAccessions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The URI from which the references were obtained. */
  var sourceUri: js.UndefOr[java.lang.String] = js.undefined
}

object ReferenceSet {
  @scala.inline
  def apply(
    assemblyId: java.lang.String = null,
    description: java.lang.String = null,
    id: java.lang.String = null,
    md5checksum: java.lang.String = null,
    ncbiTaxonId: scala.Int | scala.Double = null,
    referenceIds: js.Array[java.lang.String] = null,
    sourceAccessions: js.Array[java.lang.String] = null,
    sourceUri: java.lang.String = null
  ): ReferenceSet = {
    val __obj = js.Dynamic.literal()
    if (assemblyId != null) __obj.updateDynamic("assemblyId")(assemblyId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (md5checksum != null) __obj.updateDynamic("md5checksum")(md5checksum)
    if (ncbiTaxonId != null) __obj.updateDynamic("ncbiTaxonId")(ncbiTaxonId.asInstanceOf[js.Any])
    if (referenceIds != null) __obj.updateDynamic("referenceIds")(referenceIds)
    if (sourceAccessions != null) __obj.updateDynamic("sourceAccessions")(sourceAccessions)
    if (sourceUri != null) __obj.updateDynamic("sourceUri")(sourceUri)
    __obj.asInstanceOf[ReferenceSet]
  }
}

