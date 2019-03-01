package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variant extends js.Object {
  /** The bases that appear instead of the reference bases. */
  var alternateBases: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The variant calls for this particular variant. Each one represents the
    * determination of genotype with respect to this variant.
    */
  var calls: js.UndefOr[js.Array[VariantCall]] = js.undefined
  /** The date this variant was created, in milliseconds from the epoch. */
  var created: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The end position (0-based) of this variant. This corresponds to the first
    * base after the last base in the reference allele. So, the length of
    * the reference allele is (end - start). This is useful for variants
    * that don't explicitly give alternate bases, for example large deletions.
    */
  var end: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of filters (normally quality filters) this variant has failed.
    * `PASS` indicates this variant has passed all filters.
    */
  var filter: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The server-generated variant ID, unique across all variants. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A map of additional variant information. This must be of the form
    * map<string, string[]> (string key mapping to a list of string values).
    */
  var info: js.UndefOr[stdLib.Record[java.lang.String, js.Array[_]]] = js.undefined
  /** Names for the variant, for example a RefSNP ID. */
  var names: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A measure of how likely this variant is to be real.
    * A higher value is better.
    */
  var quality: js.UndefOr[scala.Double] = js.undefined
  /**
    * The reference bases for this variant. They start at the given
    * position.
    */
  var referenceBases: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The reference on which this variant occurs.
    * (such as `chr20` or `X`)
    */
  var referenceName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The position at which this variant occurs (0-based).
    * This corresponds to the first base of the string of reference bases.
    */
  var start: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the variant set this variant belongs to. */
  var variantSetId: js.UndefOr[java.lang.String] = js.undefined
}

object Variant {
  @scala.inline
  def apply(
    alternateBases: js.Array[java.lang.String] = null,
    calls: js.Array[VariantCall] = null,
    created: java.lang.String = null,
    end: java.lang.String = null,
    filter: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    info: stdLib.Record[java.lang.String, js.Array[_]] = null,
    names: js.Array[java.lang.String] = null,
    quality: scala.Int | scala.Double = null,
    referenceBases: java.lang.String = null,
    referenceName: java.lang.String = null,
    start: java.lang.String = null,
    variantSetId: java.lang.String = null
  ): Variant = {
    val __obj = js.Dynamic.literal()
    if (alternateBases != null) __obj.updateDynamic("alternateBases")(alternateBases)
    if (calls != null) __obj.updateDynamic("calls")(calls)
    if (created != null) __obj.updateDynamic("created")(created)
    if (end != null) __obj.updateDynamic("end")(end)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (id != null) __obj.updateDynamic("id")(id)
    if (info != null) __obj.updateDynamic("info")(info)
    if (names != null) __obj.updateDynamic("names")(names)
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (referenceBases != null) __obj.updateDynamic("referenceBases")(referenceBases)
    if (referenceName != null) __obj.updateDynamic("referenceName")(referenceName)
    if (start != null) __obj.updateDynamic("start")(start)
    if (variantSetId != null) __obj.updateDynamic("variantSetId")(variantSetId)
    __obj.asInstanceOf[Variant]
  }
}

