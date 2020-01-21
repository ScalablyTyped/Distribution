package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.AnonBannerImageUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSeries extends js.Object {
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  var series: js.UndefOr[js.Array[AnonBannerImageUrl]] = js.native
}

object SchemaSeries {
  @scala.inline
  def apply(kind: String = null, series: js.Array[AnonBannerImageUrl] = null): SchemaSeries = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSeries]
  }
}

