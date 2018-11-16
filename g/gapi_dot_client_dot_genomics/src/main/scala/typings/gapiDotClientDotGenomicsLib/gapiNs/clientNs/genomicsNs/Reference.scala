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

