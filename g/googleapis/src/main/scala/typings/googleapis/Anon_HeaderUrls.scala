package typings.googleapis

import typings.googleapis.buildSrcApisPagespeedonlineV2Mod.pagespeedonline_v2.Schema$PagespeedApiFormatStringV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_HeaderUrls extends js.Object {
  var header: js.UndefOr[Schema$PagespeedApiFormatStringV2] = js.native
  var urls: js.UndefOr[js.Array[Anon_DetailsResultArray]] = js.native
}

object Anon_HeaderUrls {
  @scala.inline
  def apply(header: Schema$PagespeedApiFormatStringV2 = null, urls: js.Array[Anon_DetailsResultArray] = null): Anon_HeaderUrls = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeaderUrls]
  }
}

