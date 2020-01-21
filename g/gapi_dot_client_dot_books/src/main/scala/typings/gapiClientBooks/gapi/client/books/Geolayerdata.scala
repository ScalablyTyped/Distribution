package typings.gapiClientBooks.gapi.client.books

import typings.gapiClientBooks.AnonBoundary
import typings.gapiClientBooks.AnonLang
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geolayerdata extends js.Object {
  var common: js.UndefOr[AnonLang] = js.undefined
  var geo: js.UndefOr[AnonBoundary] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object Geolayerdata {
  @scala.inline
  def apply(common: AnonLang = null, geo: AnonBoundary = null, kind: String = null): Geolayerdata = {
    val __obj = js.Dynamic.literal()
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (geo != null) __obj.updateDynamic("geo")(geo.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geolayerdata]
  }
}

