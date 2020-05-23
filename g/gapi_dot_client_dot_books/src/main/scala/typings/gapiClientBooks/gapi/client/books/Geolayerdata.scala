package typings.gapiClientBooks.gapi.client.books

import typings.gapiClientBooks.anon.Boundary
import typings.gapiClientBooks.anon.Lang
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geolayerdata extends js.Object {
  var common: js.UndefOr[Lang] = js.undefined
  var geo: js.UndefOr[Boundary] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object Geolayerdata {
  @scala.inline
  def apply(common: Lang = null, geo: Boundary = null, kind: String = null): Geolayerdata = {
    val __obj = js.Dynamic.literal()
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (geo != null) __obj.updateDynamic("geo")(geo.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geolayerdata]
  }
}

