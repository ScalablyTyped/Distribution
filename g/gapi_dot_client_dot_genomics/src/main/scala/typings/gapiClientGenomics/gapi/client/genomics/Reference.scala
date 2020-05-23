package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reference extends js.Object {
  /** The server-generated reference ID, unique across all references. */
  var id: js.UndefOr[String] = js.undefined
  /** The length of this reference's sequence. */
  var length: js.UndefOr[String] = js.undefined
  /**
    * MD5 of the upper-case sequence excluding all whitespace characters (this
    * is equivalent to SQ:M5 in SAM). This value is represented in lower case
    * hexadecimal format.
    */
  var md5checksum: js.UndefOr[String] = js.undefined
  /** The name of this reference, for example `22`. */
  var name: js.UndefOr[String] = js.undefined
  /** ID from http://www.ncbi.nlm.nih.gov/taxonomy. For example, 9606 for human. */
  var ncbiTaxonId: js.UndefOr[Double] = js.undefined
  /**
    * All known corresponding accession IDs in INSDC (GenBank/ENA/DDBJ) ideally
    * with a version number, for example `GCF_000001405.26`.
    */
  var sourceAccessions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The URI from which the sequence was obtained. Typically specifies a FASTA
    * format file.
    */
  var sourceUri: js.UndefOr[String] = js.undefined
}

object Reference {
  @scala.inline
  def apply(
    id: String = null,
    length: String = null,
    md5checksum: String = null,
    name: String = null,
    ncbiTaxonId: js.UndefOr[Double] = js.undefined,
    sourceAccessions: js.Array[String] = null,
    sourceUri: String = null
  ): Reference = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (md5checksum != null) __obj.updateDynamic("md5checksum")(md5checksum.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(ncbiTaxonId)) __obj.updateDynamic("ncbiTaxonId")(ncbiTaxonId.get.asInstanceOf[js.Any])
    if (sourceAccessions != null) __obj.updateDynamic("sourceAccessions")(sourceAccessions.asInstanceOf[js.Any])
    if (sourceUri != null) __obj.updateDynamic("sourceUri")(sourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
}

