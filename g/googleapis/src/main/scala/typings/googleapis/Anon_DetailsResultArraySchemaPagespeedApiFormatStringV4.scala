package typings.googleapis

import typings.googleapis.buildSrcApisPagespeedonlineV4Mod.pagespeedonline_v4.Schema$PagespeedApiFormatStringV4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DetailsResultArraySchemaPagespeedApiFormatStringV4 extends js.Object {
  var details: js.UndefOr[js.Array[Schema$PagespeedApiFormatStringV4]] = js.native
  var result: js.UndefOr[Schema$PagespeedApiFormatStringV4] = js.native
}

object Anon_DetailsResultArraySchemaPagespeedApiFormatStringV4 {
  @scala.inline
  def apply(
    details: js.Array[Schema$PagespeedApiFormatStringV4] = null,
    result: Schema$PagespeedApiFormatStringV4 = null
  ): Anon_DetailsResultArraySchemaPagespeedApiFormatStringV4 = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DetailsResultArraySchemaPagespeedApiFormatStringV4]
  }
}

