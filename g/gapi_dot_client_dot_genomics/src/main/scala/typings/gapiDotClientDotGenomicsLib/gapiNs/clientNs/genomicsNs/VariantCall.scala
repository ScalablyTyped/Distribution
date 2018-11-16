package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VariantCall extends js.Object {
  /** The ID of the call set this variant call belongs to. */
  var callSetId: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the call set this variant call belongs to. */
  var callSetName: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The genotype of this variant call. Each value represents either the value
               * of the `referenceBases` field or a 1-based index into
               * `alternateBases`. If a variant had a `referenceBases`
               * value of `T` and an `alternateBases`
               * value of `["A", "C"]`, and the `genotype` was
               * `[2, 1]`, that would mean the call
               * represented the heterozygous value `CA` for this variant.
               * If the `genotype` was instead `[0, 1]`, the
               * represented value would be `TA`. Ordering of the
               * genotype values is important if the `phaseset` is present.
               * If a genotype is not called (that is, a `.` is present in the
               * GT string) -1 is returned.
               */
  var genotype: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
               * The genotype likelihoods for this variant call. Each array entry
               * represents how likely a specific genotype is for this call. The value
               * ordering is defined by the GL tag in the VCF spec.
               * If Phred-scaled genotype likelihood scores (PL) are available and
               * log10(P) genotype likelihood scores (GL) are not, PL scores are converted
               * to GL scores.  If both are available, PL scores are stored in `info`.
               */
  var genotypeLikelihood: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
               * A map of additional variant call information. This must be of the form
               * map<string, string[]> (string key mapping to a list of string values).
               */
  var info: js.UndefOr[stdLib.Record[java.lang.String, js.Array[_]]] = js.undefined
  /**
               * If this field is present, this variant call's genotype ordering implies
               * the phase of the bases and is consistent with any other variant calls in
               * the same reference sequence which have the same phaseset value.
               * When importing data from VCF, if the genotype data was phased but no
               * phase set was specified this field will be set to `&#42;`.
               */
  var phaseset: js.UndefOr[java.lang.String] = js.undefined
}

