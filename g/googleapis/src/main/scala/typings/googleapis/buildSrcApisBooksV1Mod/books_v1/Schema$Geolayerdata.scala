package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.googleapis.Anon_Boundary
import typings.googleapis.Anon_Lang
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Geolayerdata extends js.Object {
  var common: js.UndefOr[Anon_Lang] = js.native
  var geo: js.UndefOr[Anon_Boundary] = js.native
  var kind: js.UndefOr[String] = js.native
}

object Schema$Geolayerdata {
  @scala.inline
  def apply(common: Anon_Lang = null, geo: Anon_Boundary = null, kind: String = null): Schema$Geolayerdata = {
    val __obj = js.Dynamic.literal()
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (geo != null) __obj.updateDynamic("geo")(geo.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Geolayerdata]
  }
}

