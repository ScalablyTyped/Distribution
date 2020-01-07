package typings.googleapis

import typings.googleapis.buildSrcApisPagespeedonlineV4Mod.pagespeedonline_v4.Schema$PagespeedApiFormatStringV4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_HeaderUrlsAnonDetailsResultArraySchemaPagespeedApiFormatStringV4 extends js.Object {
  var header: js.UndefOr[Schema$PagespeedApiFormatStringV4] = js.native
  var urls: js.UndefOr[js.Array[Anon_DetailsResultArraySchemaPagespeedApiFormatStringV4]] = js.native
}

object Anon_HeaderUrlsAnonDetailsResultArraySchemaPagespeedApiFormatStringV4 {
  @scala.inline
  def apply(
    header: Schema$PagespeedApiFormatStringV4 = null,
    urls: js.Array[Anon_DetailsResultArraySchemaPagespeedApiFormatStringV4] = null
  ): Anon_HeaderUrlsAnonDetailsResultArraySchemaPagespeedApiFormatStringV4 = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeaderUrlsAnonDetailsResultArraySchemaPagespeedApiFormatStringV4]
  }
}

