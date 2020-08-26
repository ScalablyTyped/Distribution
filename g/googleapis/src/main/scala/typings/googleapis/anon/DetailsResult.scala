package typings.googleapis.anon

import typings.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.SchemaPagespeedApiFormatStringV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetailsResult extends js.Object {
  var details: js.UndefOr[js.Array[SchemaPagespeedApiFormatStringV2]] = js.native
  var result: js.UndefOr[SchemaPagespeedApiFormatStringV2] = js.native
}

object DetailsResult {
  @scala.inline
  def apply(): DetailsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetailsResult]
  }
  @scala.inline
  implicit class DetailsResultOps[Self <: DetailsResult] (val x: Self) extends AnyVal {
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
    def setDetailsVarargs(value: SchemaPagespeedApiFormatStringV2*): Self = this.set("details", js.Array(value :_*))
    @scala.inline
    def setDetails(value: js.Array[SchemaPagespeedApiFormatStringV2]): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    @scala.inline
    def setResult(value: SchemaPagespeedApiFormatStringV2): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
  
}

