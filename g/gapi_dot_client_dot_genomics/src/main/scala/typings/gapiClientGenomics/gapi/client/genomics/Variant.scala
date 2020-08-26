package typings.gapiClientGenomics.gapi.client.genomics

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Variant extends js.Object {
  /** The bases that appear instead of the reference bases. */
  var alternateBases: js.UndefOr[js.Array[String]] = js.native
  /**
    * The variant calls for this particular variant. Each one represents the
    * determination of genotype with respect to this variant.
    */
  var calls: js.UndefOr[js.Array[VariantCall]] = js.native
  /** The date this variant was created, in milliseconds from the epoch. */
  var created: js.UndefOr[String] = js.native
  /**
    * The end position (0-based) of this variant. This corresponds to the first
    * base after the last base in the reference allele. So, the length of
    * the reference allele is (end - start). This is useful for variants
    * that don't explicitly give alternate bases, for example large deletions.
    */
  var end: js.UndefOr[String] = js.native
  /**
    * A list of filters (normally quality filters) this variant has failed.
    * `PASS` indicates this variant has passed all filters.
    */
  var filter: js.UndefOr[js.Array[String]] = js.native
  /** The server-generated variant ID, unique across all variants. */
  var id: js.UndefOr[String] = js.native
  /**
    * A map of additional variant information. This must be of the form
    * map<string, string[]> (string key mapping to a list of string values).
    */
  var info: js.UndefOr[Record[String, js.Array[_]]] = js.native
  /** Names for the variant, for example a RefSNP ID. */
  var names: js.UndefOr[js.Array[String]] = js.native
  /**
    * A measure of how likely this variant is to be real.
    * A higher value is better.
    */
  var quality: js.UndefOr[Double] = js.native
  /**
    * The reference bases for this variant. They start at the given
    * position.
    */
  var referenceBases: js.UndefOr[String] = js.native
  /**
    * The reference on which this variant occurs.
    * (such as `chr20` or `X`)
    */
  var referenceName: js.UndefOr[String] = js.native
  /**
    * The position at which this variant occurs (0-based).
    * This corresponds to the first base of the string of reference bases.
    */
  var start: js.UndefOr[String] = js.native
  /** The ID of the variant set this variant belongs to. */
  var variantSetId: js.UndefOr[String] = js.native
}

object Variant {
  @scala.inline
  def apply(): Variant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Variant]
  }
  @scala.inline
  implicit class VariantOps[Self <: Variant] (val x: Self) extends AnyVal {
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
    def setAlternateBasesVarargs(value: String*): Self = this.set("alternateBases", js.Array(value :_*))
    @scala.inline
    def setAlternateBases(value: js.Array[String]): Self = this.set("alternateBases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternateBases: Self = this.set("alternateBases", js.undefined)
    @scala.inline
    def setCallsVarargs(value: VariantCall*): Self = this.set("calls", js.Array(value :_*))
    @scala.inline
    def setCalls(value: js.Array[VariantCall]): Self = this.set("calls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalls: Self = this.set("calls", js.undefined)
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setFilterVarargs(value: String*): Self = this.set("filter", js.Array(value :_*))
    @scala.inline
    def setFilter(value: js.Array[String]): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInfo(value: Record[String, js.Array[_]]): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("names", js.Array(value :_*))
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("names", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNames: Self = this.set("names", js.undefined)
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    @scala.inline
    def setReferenceBases(value: String): Self = this.set("referenceBases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceBases: Self = this.set("referenceBases", js.undefined)
    @scala.inline
    def setReferenceName(value: String): Self = this.set("referenceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceName: Self = this.set("referenceName", js.undefined)
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setVariantSetId(value: String): Self = this.set("variantSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariantSetId: Self = this.set("variantSetId", js.undefined)
  }
  
}

