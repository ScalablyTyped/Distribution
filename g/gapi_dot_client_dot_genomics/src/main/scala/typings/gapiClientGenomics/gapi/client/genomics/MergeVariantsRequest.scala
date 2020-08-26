package typings.gapiClientGenomics.gapi.client.genomics

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeVariantsRequest extends js.Object {
  /**
    * A mapping between info field keys and the InfoMergeOperations to
    * be performed on them.
    */
  var infoMergeConfig: js.UndefOr[Record[String, String]] = js.native
  /** The destination variant set. */
  var variantSetId: js.UndefOr[String] = js.native
  /** The variants to be merged with existing variants. */
  var variants: js.UndefOr[js.Array[Variant]] = js.native
}

object MergeVariantsRequest {
  @scala.inline
  def apply(): MergeVariantsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeVariantsRequest]
  }
  @scala.inline
  implicit class MergeVariantsRequestOps[Self <: MergeVariantsRequest] (val x: Self) extends AnyVal {
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
    def setInfoMergeConfig(value: Record[String, String]): Self = this.set("infoMergeConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoMergeConfig: Self = this.set("infoMergeConfig", js.undefined)
    @scala.inline
    def setVariantSetId(value: String): Self = this.set("variantSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariantSetId: Self = this.set("variantSetId", js.undefined)
    @scala.inline
    def setVariantsVarargs(value: Variant*): Self = this.set("variants", js.Array(value :_*))
    @scala.inline
    def setVariants(value: js.Array[Variant]): Self = this.set("variants", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariants: Self = this.set("variants", js.undefined)
  }
  
}

