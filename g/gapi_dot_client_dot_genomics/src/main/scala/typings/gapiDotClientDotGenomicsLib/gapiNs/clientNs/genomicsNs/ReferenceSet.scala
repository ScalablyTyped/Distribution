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

