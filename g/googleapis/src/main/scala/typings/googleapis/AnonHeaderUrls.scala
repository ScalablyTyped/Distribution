package typings.googleapis

import typings.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.SchemaPagespeedApiFormatStringV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHeaderUrls extends js.Object {
  var header: js.UndefOr[SchemaPagespeedApiFormatStringV2] = js.native
  var urls: js.UndefOr[js.Array[AnonDetailsResultArray]] = js.native
}

object AnonHeaderUrls {
  @scala.inline
  def apply(header: SchemaPagespeedApiFormatStringV2 = null, urls: js.Array[AnonDetailsResultArray] = null): AnonHeaderUrls = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeaderUrls]
  }
}

