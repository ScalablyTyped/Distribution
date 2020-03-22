package typings.googleapis

import typings.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.SchemaPagespeedApiFormatStringV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUrls extends js.Object {
  var header: js.UndefOr[SchemaPagespeedApiFormatStringV2] = js.native
  var urls: js.UndefOr[js.Array[AnonDetailsResult]] = js.native
}

object AnonUrls {
  @scala.inline
  def apply(header: SchemaPagespeedApiFormatStringV2 = null, urls: js.Array[AnonDetailsResult] = null): AnonUrls = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUrls]
  }
}

