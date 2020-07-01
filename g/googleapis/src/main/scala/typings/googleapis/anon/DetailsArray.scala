package typings.googleapis.anon

import typings.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4.SchemaPagespeedApiFormatStringV4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetailsArray extends js.Object {
  var details: js.UndefOr[js.Array[SchemaPagespeedApiFormatStringV4]] = js.native
  var result: js.UndefOr[SchemaPagespeedApiFormatStringV4] = js.native
}

object DetailsArray {
  @scala.inline
  def apply(
    details: js.Array[SchemaPagespeedApiFormatStringV4] = null,
    result: SchemaPagespeedApiFormatStringV4 = null
  ): DetailsArray = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailsArray]
  }
}

