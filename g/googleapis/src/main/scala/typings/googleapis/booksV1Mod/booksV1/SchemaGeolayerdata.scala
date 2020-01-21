package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.AnonBoundary
import typings.googleapis.AnonLang
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGeolayerdata extends js.Object {
  var common: js.UndefOr[AnonLang] = js.native
  var geo: js.UndefOr[AnonBoundary] = js.native
  var kind: js.UndefOr[String] = js.native
}

object SchemaGeolayerdata {
  @scala.inline
  def apply(common: AnonLang = null, geo: AnonBoundary = null, kind: String = null): SchemaGeolayerdata = {
    val __obj = js.Dynamic.literal()
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (geo != null) __obj.updateDynamic("geo")(geo.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGeolayerdata]
  }
}

