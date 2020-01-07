package typings.googleapis

import typings.googleapis.buildSrcApisPagespeedonlineV2Mod.pagespeedonline_v2.Schema$PagespeedApiFormatStringV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DetailsResultArray extends js.Object {
  var details: js.UndefOr[js.Array[Schema$PagespeedApiFormatStringV2]] = js.native
  var result: js.UndefOr[Schema$PagespeedApiFormatStringV2] = js.native
}

object Anon_DetailsResultArray {
  @scala.inline
  def apply(
    details: js.Array[Schema$PagespeedApiFormatStringV2] = null,
    result: Schema$PagespeedApiFormatStringV2 = null
  ): Anon_DetailsResultArray = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DetailsResultArray]
  }
}

