package typings.gapiClientBooks.gapi.client.books

import typings.gapiClientBooks.anon.BannerImageUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Series extends js.Object {
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  var series: js.UndefOr[js.Array[BannerImageUrl]] = js.undefined
}

object Series {
  @scala.inline
  def apply(kind: String = null, series: js.Array[BannerImageUrl] = null): Series = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    __obj.asInstanceOf[Series]
  }
}

