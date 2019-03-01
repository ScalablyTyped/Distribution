package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reference extends js.Object {
  /** The server-generated reference ID, unique across all references. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The length of this reference's sequence. */
  var length: js.UndefOr[java.lang.String] = js.undefined
  /**
    * MD5 of the upper-case sequence excluding all whitespace characters (this
    * is equivalent to SQ:M5 in SAM). This value is represented in lower case
    * hexadecimal format.
    */
  var md5checksum: js.UndefOr[java.lang.String] = js.undefined
  /** The name of this reference, for example `22`. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** ID from http://www.ncbi.nlm.nih.gov/taxonomy. For example, 9606 for human. */
  var ncbiTaxonId: js.UndefOr[scala.Double] = js.undefined
  /**
    * All known corresponding accession IDs in INSDC (GenBank/ENA/DDBJ) ideally
    * with a version number, for example `GCF_000001405.26`.
    */
  var sourceAccessions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The URI from which the sequence was obtained. Typically specifies a FASTA
    * format file.
    */
  var sourceUri: js.UndefOr[java.lang.String] = js.undefined
}

object Reference {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    length: java.lang.String = null,
    md5checksum: java.lang.String = null,
    name: java.lang.String = null,
    ncbiTaxonId: scala.Int | scala.Double = null,
    sourceAccessions: js.Array[java.lang.String] = null,
    sourceUri: java.lang.String = null
  ): Reference = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (length != null) __obj.updateDynamic("length")(length)
    if (md5checksum != null) __obj.updateDynamic("md5checksum")(md5checksum)
    if (name != null) __obj.updateDynamic("name")(name)
    if (ncbiTaxonId != null) __obj.updateDynamic("ncbiTaxonId")(ncbiTaxonId.asInstanceOf[js.Any])
    if (sourceAccessions != null) __obj.updateDynamic("sourceAccessions")(sourceAccessions)
    if (sourceUri != null) __obj.updateDynamic("sourceUri")(sourceUri)
    __obj.asInstanceOf[Reference]
  }
}

