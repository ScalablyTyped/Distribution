package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reference extends js.Object {
  /** The server-generated reference ID, unique across all references. */
  var id: js.UndefOr[String] = js.native
  /** The length of this reference's sequence. */
  var length: js.UndefOr[String] = js.native
  /**
    * MD5 of the upper-case sequence excluding all whitespace characters (this
    * is equivalent to SQ:M5 in SAM). This value is represented in lower case
    * hexadecimal format.
    */
  var md5checksum: js.UndefOr[String] = js.native
  /** The name of this reference, for example `22`. */
  var name: js.UndefOr[String] = js.native
  /** ID from http://www.ncbi.nlm.nih.gov/taxonomy. For example, 9606 for human. */
  var ncbiTaxonId: js.UndefOr[Double] = js.native
  /**
    * All known corresponding accession IDs in INSDC (GenBank/ENA/DDBJ) ideally
    * with a version number, for example `GCF_000001405.26`.
    */
  var sourceAccessions: js.UndefOr[js.Array[String]] = js.native
  /**
    * The URI from which the sequence was obtained. Typically specifies a FASTA
    * format file.
    */
  var sourceUri: js.UndefOr[String] = js.native
}

object Reference {
  @scala.inline
  def apply(): Reference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reference]
  }
  @scala.inline
  implicit class ReferenceOps[Self <: Reference] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLength(value: String): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setMd5checksum(value: String): Self = this.set("md5checksum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMd5checksum: Self = this.set("md5checksum", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNcbiTaxonId(value: Double): Self = this.set("ncbiTaxonId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNcbiTaxonId: Self = this.set("ncbiTaxonId", js.undefined)
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

