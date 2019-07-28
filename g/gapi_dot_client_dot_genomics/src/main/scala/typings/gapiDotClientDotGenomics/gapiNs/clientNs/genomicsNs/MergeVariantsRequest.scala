package typings.gapiDotClientDotGenomics.gapiNs.clientNs.genomicsNs

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeVariantsRequest extends js.Object {
  /**
    * A mapping between info field keys and the InfoMergeOperations to
    * be performed on them.
    */
  var infoMergeConfig: js.UndefOr[Record[String, String]] = js.undefined
  /** The destination variant set. */
  var variantSetId: js.UndefOr[String] = js.undefined
  /** The variants to be merged with existing variants. */
  var variants: js.UndefOr[js.Array[Variant]] = js.undefined
}

object MergeVariantsRequest {
  @scala.inline
  def apply(
    infoMergeConfig: Record[String, String] = null,
    variantSetId: String = null,
    variants: js.Array[Variant] = null
  ): MergeVariantsRequest = {
    val __obj = js.Dynamic.literal()
    if (infoMergeConfig != null) __obj.updateDynamic("infoMergeConfig")(infoMergeConfig)
    if (variantSetId != null) __obj.updateDynamic("variantSetId")(variantSetId)
    if (variants != null) __obj.updateDynamic("variants")(variants)
    __obj.asInstanceOf[MergeVariantsRequest]
  }
}

